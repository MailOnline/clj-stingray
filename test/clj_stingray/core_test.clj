(ns clj-stingray.core-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.core :refer :all]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))

(defn stub [s]
  (edn/read-string (slurp (io/resource (str (name s) ".edn")))))

(facts "pools"
       (fact "it should list all active pools"
             (count (:children (pools))) => 71
             (provided (clj-http.client/get anything anything) => (stub :pools))))
