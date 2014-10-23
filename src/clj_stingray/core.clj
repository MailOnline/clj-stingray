(ns clj-stingray.core
  (:require [clj-http.client :as client]
            [clj-stingray.config :refer [opts-default url]]))

(defn pools []
  "Retrieves all pools"
  (get-in (client/get (url "api/tm/1.0/config/active/pools") opts-default) [:body :children]))

(defn pool [name]
  "Retrieves pool data by name"
  (get-in (client/get (url (str "api/tm/1.0/config/active/pools/" name)) opts-default) [:body :properties]))

(defn enabled-nodes [name]
  "Retrieves all enabled nodes in the named pool."
  (let [pool (pool name)]
        (get-in pool [:basic :nodes])))

(defn disabled-nodes [name]
  "Retrieves all disabled nodes in the named pool."
  (let [pool (pool name)]
        (get-in pool [:basic :disabled])))

(defn nodes [name]
  "Retrieves all nodes in the named pool."
  (let [pool (pool name)
        disabled (disabled-nodes name)
        enabled (enabled-nodes name)]
  (into enabled disabled)))
