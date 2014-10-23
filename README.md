# clj-stingray

clj-stingray is a Clojure client for the [Riverbed Stingray Traffic Manager](http://www.riverbed.com) load-balancer application. The API version this client wraps is 3.2 which comes with Stingray Traffic Manager 9.8 release.

At the moment clj-stingray implements a few basic APIs to access pools and enabled nodes in read-only mode. More support for advanced operation will come in the future.

## Configuration

clj-stingray integrates with leiningen environment map through [environ](https://github.com/weavejester/environ) for all local development needs. It also accepts overrides as environment properties or JVM properties for production environment.

### development

A file called sample_profiles.clj is provided to you in the main clj-stingray project directory:

* Copy sample_profiles.clj into your project root
* Rename sample_profiles.clj to profiles.clj
* Change the relevant values inside it to point to your Stingray development environment
* Add the following lines inside your project.clj so clj-stingray can pick up envirnment variables when running lein repl:

```clojure
:aliases {"repl" ["with-profile" "+dev-cfg" "repl"]}
```

* Create similar aliases for other lein tasks (e.g. test) as needed
* Alternatively, the same variables can be added to ~/.lein/profiles.clj or the project.clj in your project:

```clojure
:stingray-host "https://stingrayhost"   ; stingray host
:stingray-port "port-as-string"         ; and port
:stingray-basic-auth-enabled? true      ; or false
:stingray-basic-auth-user "user"        ; if above is true
:stingray-basic-auth-pwd "pwd"          ; if auth-enabled
:stingray-insecure? true                ; don't check ssl server certificate
```

### production

Just make sure the same variables in profile.clj above are exported as shell environment variables when your application is run, for example:

```bash
STINGRAY_HOST=https://stingrayhost STINGRAY_PORT=port-as-string STINGRAY_BASIC_AUTH_ENABLED?=true STINGRAY_BASIC_AUTH_USER=user STINGRAY_BASIC_AUTH_PWD=pwd STINGRAY_INSECURE?=true java -jar yourproject.jar
```

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
