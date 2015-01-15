(ns clj-stingray.soap
  (:require [clj-stingray.config :refer [opts-default url]])
  (:import com.zeus.soap.zxtm._1_0.VirtualServerLocator
           com.zeus.soap.zxtm._1_0.PoolLocator
           com.zeus.soap.zxtm._1_0.SystemLogLocator
           java.security.Security
           MyProvider))

(defn array? [x] (-> x class .isArray))

(defn see [x]
  (if (array? x) (map see x) x))

(def soap-url (.substring (url "") 0 (dec (count (url "")))))

(defn- init []
  (Security/addProvider (MyProvider.))
  (Security/setProperty "ssl.TrustManagerFactory.algorithm", "TrustAllCertificates"))

(init)

(defn virtual-servers
  "Lists virtual server names"
  []
  (let [l (doto (VirtualServerLocator.)
            (.setVirtualServerPortEndpointAddress soap-url))
        vsp (.getVirtualServerPort l)
        vsnames (.getVirtualServerNames vsp)]
    (see vsnames)))

(defn pool-names
  "Lists pool names"
  []
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        pool-names (.getPoolNames pp)]
    (see pool-names)))

(defn draining-nodes
  "Lists draining nodes"
  [pool-names]
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        draining-nodes (.getDrainingNodes pp pool-names)]
    draining-nodes))

(defn disabled-nodes
  "Lists disabled nodes in a pool"
  [pool]
  (println "### url" soap-url)
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        disabled-nodes (.getDisabledNodes pp (doto (make-array String 1) (aset 0 pool)))]
    (see disabled-nodes)))

(defn draining
  "Lists draining nodes from single node"
  [pool-name]
  (see (draining-nodes (into-array String [pool-name]))))

(defn add-nodes
  "Adds nodes to the pool. Usage: add-node pool [nodes]"
  [pool nodes]
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        pool-name (into-array String [pool])
        pool-nodes (into-array (map (partial into-array String) [nodes]))]

    (.addNodes pp pool-name pool-nodes)))

(defn add-node
  "Adds a node to the pool. Usage: add-node pool node"
  [pool node]
  (add-nodes (str pool) [(str node)]))

(defn get-nodes
  "Gets the nodes from a pool. Usage: get-nodes pool"
  [pool]
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        pool-name (into-array String [pool])]
    (see (.getNodes pp pool-name))))

(defn remove-nodes
  "Removes nodes from a pool. Usage: remove-nodes pool [nodes]"
  [pool nodes]
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        pool-name (into-array String [pool])
        pool-nodes (into-array (map (partial into-array String) [nodes]))]

    (.removeNodes pp pool-name pool-nodes)))

(defn remove-node
  "Removes a node from a pool. Usage: remove-nodes pool node"
  [pool node]
  (remove-nodes pool [node]))

(defn drain-nodes
  "Drains nodes in a pool. Usage: drain-nodes pool [nodes]"
  [pool nodes]
  (let [l (doto (PoolLocator.)
            (.setPoolPortEndpointAddress soap-url))
        pp (.getPoolPort l)
        pool-name (into-array String [pool])
        pool-nodes (into-array (map (partial into-array String) [nodes]))]

    (.setDrainingNodes pp pool-name pool-nodes)))

(defn drain-node
  "Drains a node in a pool. Usage: drain-node pool node"
  [pool node]
  (drain-nodes pool [node]))

(defn error-log
  "Prints the error log"
  []
  (let [l (doto (SystemLogLocator.)
            (.setSystemLogPortEndpointAddress soap-url))
        slp (.getSystemLogPort l)
        error (.getErrorLogString slp)]
    error))
