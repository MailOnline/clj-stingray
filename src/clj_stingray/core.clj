(ns clj-stingray.core
  (:require [clj-http.client :as client]
            [environ.core :refer [env]]))

(defn- with-basic-auth [opts]
  (if (env :stingray-basic-auth-enabled?)
    (assoc opts :basic-auth [(env :stingray-basic-auth-user) (env :stingray-basic-auth-pwd)])
    opts))

(defn- insecure? [opts]
  (assoc opts :insecure? (env :stingray-insecure?)))

(defn- url [endpoint]
  (format "%s:%s/%s" (env :stingray-host) (env :stingray-port) endpoint))

(def opts-default (-> {:as :json} (with-basic-auth) (insecure?)))

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
