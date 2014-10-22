# clj-stingray

clj-stingray is a Clojure client for the [Riverbed Stingray Traffic Manager](http://www.riverbed.com) load-balancer application. The API version this client wraps is 3.2 which comes with Stingray Traffic Manager 9.8 release.

At the moment clj-stingray implements a few basic APIs to access pools and enabled nodes in read-only mode. More support for advanced operation will come in the future.

## Configuration

clj-stingray integrates with leiningen environment map and through [environ]() it accepts overrides as environment properties or JVM properties. A sample profiles.clj file is provided to you in the main project directory. Change the relevant values inside to point to the Stingray development environment (for testing in your project) and use correspondent environment vartiables when starting your application in production. Alternatively, for testing, add the following to ./project.clj in your project:

              :stingray-host "https://stingrayhost"   ; stingray host
              :stingray-port "port-as-string"         ; and port
              :stingray-basic-auth-enabled? true      ; or false
              :stingray-basic-auth-user "user"        ; if above is true
              :stingray-basic-auth-pwd "pwd"          ; if auth-enabled
              :stingray-insecure? true                ; don't check ssl server certificate

## How to use

Add:

        [clj-stingray "0.0.1"]

to your project.clj. Here's an example snippet:

```clojure
    (ns your-prj
      (:require [clj-stingray.core :as stingray]))

    ; retrieve all pools
    (stingray/pools)

    ; retrieve pool data by name
    (stingray/pool "yourpool")
```

## How to run the tests

`lein midje` will run all tests.

## TODO

* Travis-CI integration
* CLI interface
