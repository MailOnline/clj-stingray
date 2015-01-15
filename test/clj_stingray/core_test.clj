(ns clj-stingray.core-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.core :refer :all]
            [clojure.java.io :as io]
            [clj-stingray.config :refer [*env*]]
            [clojure.edn :as edn]))

(def rest-sample-config
  {:stingray {:protocol :rest
              :rest {}
              :soap {}}})

(defn stub [s]
  (edn/read-string (slurp (io/resource (str (name s) ".edn")))))

(facts "pools"
       (fact "it should list all active pools"
             (binding [*env* rest-sample-config]
               (count (pools))) => 71
             (provided (clj-http.client/get anything anything) => (stub :pools))))

(facts "enabled or disabled nodes"
       (fact "it should list nodes in a pool"
             (binding [*env* rest-sample-config]
               (count (nodes "pool"))) => 6
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool")))))
       (fact "it should list only enabled nodes"
             (binding [*env* rest-sample-config]
               (count (enabled-nodes "pool"))) => 1
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool")))))
       (fact "it should list only disabled nodes"
             (binding [*env* rest-sample-config]
               (count (disabled-nodes "pool"))) => 5
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool"))))))

; (require '[clj-stingray.core :as core])
; (import 'clj_stingray.core.StingraySoap)
; (core/enabled-nodes* (StingraySoap.) "and-hsk-smtpint app pool")
;
