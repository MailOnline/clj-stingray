(ns clj-stingray.config
  (:require [environ.core :refer [env]]))

(defn with-basic-auth [opts]
  (if (env :stingray-basic-auth-enabled?)
    (assoc opts :basic-auth [(env :stingray-basic-auth-user) (env :stingray-basic-auth-pwd)])
    opts))

(defn insecure? [opts]
  (assoc opts :insecure? (env :stingray-insecure?)))

(defn url [endpoint]
  (format "%s:%s/%s" (env :stingray-host) (env :stingray-port) endpoint))

(def opts-default (-> {:as :json} (with-basic-auth) (insecure?)))
