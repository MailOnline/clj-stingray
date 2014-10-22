(ns clj-stingray.core-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.core :refer :all]
            [clojure.java.io :as io]
            [clojure.edn :as edn]))

(defn stub [s]
  (edn/read-string (slurp (io/resource (str (name s) ".edn")))))

(facts "pools"
       (fact "it should list all active pools"
             (count (pools)) => 71
             (provided (clj-http.client/get anything anything) => (stub :pools))))

(facts "enabled or disabled nodes"
       (fact "it should list nodes in a pool"
             (count (nodes "pool")) => 6
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool")))))
       (fact "it should list only enabled nodes"
             (count (enabled-nodes "pool")) => 1
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool")))))
       (fact "it should list only disabled nodes"
             (count (disabled-nodes "pool")) => 5
             (provided (clj-http.client/get anything anything) => (stub (keyword (munge "pool"))))))
