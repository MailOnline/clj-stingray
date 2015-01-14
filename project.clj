(defproject clj-stingray "0.0.2"
  :description "Clojure client for Riverbed Stingray load balancer REST API"
  :dependencies [
                 [org.clojure/clojure "1.7.0-alpha5"]
                 [clj-http "1.0.0"]
                 [environ "1.0.0"]
                 [axis/axis "1.4"]
                 [javax.mail/mail "1.4.7"]
                 ]
  :repl-options {:init (do (require 'midje.repl) (midje.repl/autotest))}
  :resource-paths ["lib/stingray-1.2.jar"]
  :java-source-paths ["java"]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-environ "1.0.0"]]}})
