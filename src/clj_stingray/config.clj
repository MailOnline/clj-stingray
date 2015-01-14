(ns clj-stingray.config
  (:require [environ.core :as environ]))

(def ^:dynamic *env* environ/env)

(defn protocol [] (:protocol (:stingray *env*)))

(defn- env [key]
  "Keys are the same by protocol used. So first getting
  the protocol out, the using as a secondary key to extract the currently active one"
  (let [config-by-protocol ((protocol) (:stingray *env*))]
    (config-by-protocol key)))

(defn with-basic-auth [opts]
  (if (env :basic-auth-enabled?)
    (assoc opts :basic-auth [(env :basic-auth-user) (env :basic-auth-pwd)])
    opts))

(defn insecure? [opts]
  (assoc opts :insecure? (env :insecure?)))

(defn url [endpoint]
  (format "%s:%s/%s" (env :host) (env :port) endpoint))

(def soap-url
  (url "soap"))

(def opts-default (-> {:as :json} (with-basic-auth) (insecure?)))
