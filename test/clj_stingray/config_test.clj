(ns clj-stingray.config-test
  (:require [midje.sweet :refer :all]
            [clj-stingray.config :refer :all]))

(facts "rebindable configuration"
       (fact "it should list all active pools"
             (binding [*env* {:stingray-host "host1" :stingray-port 999}]
               (url "endpoint") => "host1:999/endpoint")))
