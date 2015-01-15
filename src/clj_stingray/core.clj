(ns clj-stingray.core
  (:require [clj-http.client :as client]
            [clj-stingray.soap :as soap]
            [clj-stingray.config :refer [opts-default url protocol]]))

(defprotocol Stingray
  (pools* [this])
  (pool* [this name])
  (enabled-nodes* [this name])
  (disabled-nodes* [this name])
  (nodes* [this name]))

(deftype StingrayRest []
  Stingray
  (pools* [this]
    (get-in (client/get (url "api/tm/2.0/config/active/pools") opts-default) [:body :children]))
  (pool* [this name]
    (get-in (client/get (url (str "api/tm/2.0/config/active/pools/" name)) opts-default) [:body :properties]))
  (enabled-nodes* [this name]
    (let [pool (pool* this name)]
      (get-in pool [:basic :nodes])))
  (disabled-nodes* [this name]
    (let [pool (pool* this name)]
      (get-in pool [:basic :disabled])))
  (nodes* [this name]
    (let [pool (pool* this name)
          disabled (disabled-nodes* this name)
          enabled (enabled-nodes* this name)]
      (into enabled disabled))))

(deftype StingraySoap []
  Stingray
  (pools* [this]
    (soap/pool-names))
  (pool* [this name]
    (soap/pool-names))
  (enabled-nodes* [this name]
    (first (soap/get-nodes name)))
  (disabled-nodes* [this name]
    (first (soap/disabled-nodes name)))
  (nodes* [this name]
    (concat (disabled-nodes* this name) (enabled-nodes* this name))))

(def protocols {:rest (StingrayRest.) :soap (StingraySoap.)})

;; macro-ize me
(defn pools []
  (pools* ((protocol) protocols)))
(defn pool [name]
  (pool* ((protocol) protocols) name))
(defn enabled-nodes [name]
  (enabled-nodes* ((protocol) protocols) name))
(defn disabled-nodes [name]
  (disabled-nodes* ((protocol) protocols) name))
(defn nodes [name]
  (nodes* ((protocol) protocols) name))

;user=> (rest/disabled-nodes* (StingrayRest.) "and-hsk-smtpint app pool")
;["172.30.10.24:25" "172.30.10.25:25" "172.30.10.26:25" "and-hsk-smtpint2:25"]
;user=> (rest/enabled-nodes* (StingrayRest.) "and-hsk-smtpint app pool")
;["and-hsk-smtpint1:25"]
