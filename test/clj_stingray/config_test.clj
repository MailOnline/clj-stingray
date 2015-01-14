(ns clj-stingray.config-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.config :refer :all]))

(def rest-sample-config
  {:stingray {:host "host1"
              :protocol :rest
              :rest {:port "999"}
              :soap {:port "888"}}})

(facts "rebindable configuration"
       (fact "it should list all active pools"
             (binding [*env* rest-sample-config]
               (url "endpoint") => "host1:999/endpoint")))

(facts "active protocol"
       (fact "config changes based on selected protocol"
             (binding [*env* (assoc-in rest-sample-config [:stingray :protocol] :soap)]
               (url "endpoint") => "host1:888/endpoint")))
