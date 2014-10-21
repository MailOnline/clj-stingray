(ns clj-stingray.core
  (:require [clj-http.client :as client]))

(defn pools []
  (:body (client/get "https://and-hsk-zeusappint1.andintweb.dmgt.net:9070/api/tm/1.0/config/active/pools" {:basic-auth ["rest" "rest"] :insecure? true :as :json})))
