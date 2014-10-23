(defproject clj-stingray "0.0.2"
  :description "Clojure client for Riverbed Stingray load balancer REST API"
  :dependencies [[org.clojure/clojure "1.7.0-alpha2"]
                 [clj-http "1.0.0"]
                 [environ "1.0.0"]]
  :repl-options {:init (do (require 'midje.repl) (midje.repl/autotest))}
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-environ "1.0.0"]]}})
