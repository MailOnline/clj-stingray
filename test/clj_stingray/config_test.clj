(ns clj-stingray.config-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.config :refer :all]))

(def rest-sample-config
  {:stingray {:protocol :rest
              :rest {:port "111" :host "host1" :endpoint "api/1.1"}
              :soap {:port "222" :host "host2" :endpoint "api/2.2"}}})

(facts "rebindable configuration"
       (fact "it should list all active pools"
             (binding [*env* rest-sample-config]
               (url "pools") => "host1:111/api/1.1/pools")))

(facts "active protocol"
       (fact "config changes based on selected protocol"
             (binding [*env* (assoc-in rest-sample-config [:stingray :protocol] :soap)]
               (url "pools") => "host2:222/api/2.2/pools")))
