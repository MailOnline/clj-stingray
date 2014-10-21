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
  (:body (client/get (url "api/tm/1.0/config/active/pools") opts-default)))
