(ns clj-stingray.config-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.config :refer :all]))

(def rest-sample-config
  {:stingray {:protocol :rest
              :rest {:port "999" :host "host1"}
              :soap {:port "888" :host "host2"}}})

(facts "rebindable configuration"
       (fact "it should list all active pools"
             (binding [*env* rest-sample-config]
               (url "endpoint") => "host1:999/endpoint")))

(facts "active protocol"
       (fact "config changes based on selected protocol"
             (binding [*env* (assoc-in rest-sample-config [:stingray :protocol] :soap)]
               (url "endpoint") => "host2:888/endpoint")))
