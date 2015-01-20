/**
 * PoolPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface PoolPort extends java.rmi.Remote {

    /**
     * Add each of the named auto-scaled pools, using the node lists
     * for each. The node lists can be empty
     */
    public void addAutoScaledPool(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Add nodes to the lists of draining nodes, for each of the named
     * pools.
     */
    public void addDrainingNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add nodes to the lists of draining nodes, for each of the named
     * pools. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void addDrainingNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add monitors to each of the named pools.
     */
    public void addMonitors(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add monitors to each of the named pools. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void addMonitorsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add nodes to each of the named pools.
     */
    public void addNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add nodes to each of the named pools. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add each of the named pools, using the node lists for each.
     */
    public void addPool(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy each of the named pools.
     */
    public void copyPool(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete each of the named pools.
     */
    public void deletePool(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * For each of the named pools, disable the specified nodes in
     * the pool.
     */
    public void disableNodes(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, disable the specified nodes in
     * the pool. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void disableNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, enable the specified nodes that
     * are disabled in the pool.
     */
    public void enableNodes(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, enable the specified nodes that
     * are disabled in the pool. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void enableNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the cloud credentials for this auto-scaled pool
     */
    public java.lang.String[] getAutoscaleCloudcredentials(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the cloud credentials for this auto-scaled pool This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[] getAutoscaleCloudcredentialsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The ESX host or ESX cluster name to put the new virtual
     * machine instances on.
     */
    public java.lang.String[] getAutoscaleCluster(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The ESX host or ESX cluster name to put the new virtual
     * machine instances on. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getAutoscaleClusterByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The name of the logical datacenter on the vCenter server
     */
    public java.lang.String[] getAutoscaleDatacenter(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The name of the logical datacenter on the vCenter server
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getAutoscaleDatacenterByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The name of the datastore to be used by the newly created
     * virtual machine.
     */
    public java.lang.String[] getAutoscaleDatastore(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get The name of the datastore to be used by the newly created
     * virtual machine. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getAutoscaleDatastoreByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether this pool uses auto-scaling.
     */
    public boolean[] getAutoscaleEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether this pool uses auto-scaling. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getAutoscaleEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether autoscaling is handled externally or internally
     */
    public boolean[] getAutoscaleExternal(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether autoscaling is handled externally or internally
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getAutoscaleExternalByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the hysteresis period for an auto-scaled pool
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleHysteresis(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the hysteresis period for an auto-scaled pool This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleHysteresisByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the image identifier
     */
    public java.lang.String[] getAutoscaleImageid(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the image identifier This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getAutoscaleImageidByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to use the public or private IPs
     */
    public com.zeus.soap.zxtm._1_0.PoolAutoscaleIpstouse[] getAutoscaleIpstouse(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to use the public or private IPs This is a location
     * specific function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolAutoscaleIpstouse[] getAutoscaleIpstouseByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the idle time of the last node in an autoscaled pool before
     * it can be destroyed
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleLastnodeIdletime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the idle time of the last node in an autoscaled pool before
     * it can be destroyed This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleLastnodeIdletimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of nodes in an auto-scaled pool
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleMaxNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of nodes in an auto-scaled pool This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleMaxNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum number of nodes in an auto-scaled pool
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleMinNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum number of nodes in an auto-scaled pool This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleMinNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the node name prefix for this auto-scaled pool
     */
    public java.lang.String[] getAutoscaleName(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the node name prefix for this auto-scaled pool This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[] getAutoscaleNameByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port number for this auto-scaled pool
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscalePort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port number for this auto-scaled pool This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscalePortByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the refractory period for an auto-scaled pool
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleRefractory(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the refractory period for an auto-scaled pool This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleRefractoryByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the expected node response time in milliseconds
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleResponseTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the expected node response time in milliseconds This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleResponseTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the threshold of conforming requests for scaling down
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleScaledownLevel(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the threshold of conforming requests for scaling down This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleScaledownLevelByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the acceptable lower percentage of conforming requests
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleScaleupLevel(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the acceptable lower percentage of conforming requests
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getAutoscaleScaleupLevelByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size identifier
     */
    public java.lang.String[] getAutoscaleSizeid(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size identifier This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getAutoscaleSizeidByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Bandwidth Classes that each of the named pools uses.
     */
    public java.lang.String[] getBandwidthClass(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Bandwidth Classes that each of the named pools uses.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getBandwidthClassByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the disabled nodes in the
     * pool.
     */
    public java.lang.String[][] getDisabledNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the disabled nodes in the
     * pool. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[][] getDisabledNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the lists of draining nodes for each of the named pools.
     */
    public java.lang.String[][] getDrainingNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the lists of draining nodes for each of the named pools.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[][] getDrainingNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete and is replaced by VirtualServer.getErrorFile.
     */
    public java.lang.String[] getErrorFile(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether backend IPv4 nodes understand the FTP EPRT and
     * EPSV commands.
     */
    public boolean[] getFTPSupportRfc2428(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether backend IPv4 nodes understand the FTP EPRT and
     * EPSV commands. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getFTPSupportRfc2428ByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the pool to use when all nodes in a pool fail, for each
     * of the named pools.
     */
    public java.lang.String[] getFailpool(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the pool to use when all nodes in a pool fail, for each
     * of the named pools. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getFailpoolByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes.
     */
    public boolean[] getKeepalive(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes. This is a location specific function, any
     * action will operate on the specified location.
     */
    public boolean[] getKeepaliveByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes for non-idempotent requests.
     */
    public boolean[] getKeepaliveNonIdempotent(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes for non-idempotent requests. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getKeepaliveNonIdempotentByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the load balancing algorithms that each of the named pools
     * uses.
     */
    public com.zeus.soap.zxtm._1_0.PoolLoadBalancingAlgorithm[] getLoadBalancingAlgorithm(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the load balancing algorithms that each of the named pools
     * uses. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolLoadBalancingAlgorithm[] getLoadBalancingAlgorithmByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the times that each of the named pools should wait for
     * a connection to establish to a node before trying another node, in
     * seconds.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the times that each of the named pools should wait for
     * a connection to establish to a node before trying another node, in
     * seconds. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum number of conncurrent connections allowed
     * to each node in the pool per machine.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectionsPernode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum number of conncurrent connections allowed
     * to each node in the pool per machine. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectionsPernodeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum numbers of unused HTTP keepalive connections
     * that each of the named pools should maintain to an individual node.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxIdleConnectionsPerNode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum numbers of unused HTTP keepalive connections
     * that each of the named pools should maintain to an individual node.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxIdleConnectionsPerNodeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getMaxKeepalivesPerNode is deprecated, please use getMaxIdleConnectionsPerNode
     * instead.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxKeepalivesPerNode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getMaxKeepalivesPerNode is deprecated, please use getMaxIdleConnectionsPerNode
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxKeepalivesPerNodeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum number of connections that can be queued
     * due to connection limits.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxQueueSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum number of connections that can be queued
     * due to connection limits. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxQueueSizeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time that each of the named pools should wait for a
     * response from a node before either discarding the request or trying
     * another node, in seconds (retryable requests only).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxReplyTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time that each of the named pools should wait for a
     * response from a node before either discarding the request or trying
     * another node, in seconds (retryable requests only). This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxReplyTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of all monitors.
     */
    public java.lang.String[][] getMonitors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of all monitors. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[][] getMonitorsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether all connections that have been sent to a node are
     * closed when that node is marked as dead.
     */
    public boolean[] getNodeConnClose(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether all connections that have been sent to a node are
     * closed when that node is marked as dead. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getNodeConnCloseByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of times your traffic manager should try and
     * connect to a node before registering it as failed when passive monitoring
     * is enabled.
     */
    public org.apache.axis.types.UnsignedInt[] getNodeConnectionAttempts(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of times your traffic manager should try and
     * connect to a node before registering it as failed when passive monitoring
     * is enabled. This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getNodeConnectionAttemptsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time a failed node should be isolated for
     * before testing it with new traffic, in seconds
     */
    public org.apache.axis.types.UnsignedInt[] getNodeFailTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time a failed node should be isolated for
     * before testing it with new traffic, in seconds This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getNodeFailTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether Nagle's algorithm should be used for TCP connections
     * to the back-end nodes.
     */
    public boolean[] getNodeUseNagle(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether Nagle's algorithm should be used for TCP connections
     * to the back-end nodes. This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getNodeUseNagleByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the lists of nodes for each of the named pools.
     */
    public java.lang.String[][] getNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the lists of nodes for each of the named pools. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[][] getNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of active connections to each of the specified
     * nodes.
     */
    public int[] getNodesConnectionCounts(java.lang.String[] nodes) throws java.rmi.RemoteException;

    /**
     * Get the number of seconds since each of the specified nodes
     * was last used.
     */
    public int[] getNodesLastUsed(java.lang.String[] nodes) throws java.rmi.RemoteException;

    /**
     * For each of the named pools, get the priority values for the
     * named nodes in each pool.
     */
    public com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] getNodesPriorityValue(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the priority values for the
     * named nodes in each pool. This is a location specific function, any
     * action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] getNodesPriorityValueByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the weighting values for the
     * specified nodes in this pool.
     */
    public com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] getNodesWeightings(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the weighting values for the
     * specified nodes in this pool. This is a location specific function,
     * any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] getNodesWeightingsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named pools.
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether this pool uses passive monitoring.
     */
    public boolean[] getPassiveMonitoring(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether this pool uses passive monitoring. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getPassiveMonitoringByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default Session Persistence classes that each of the
     * named pools uses.
     */
    public java.lang.String[] getPersistence(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default Session Persistence classes that each of the
     * named pools uses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getPersistenceByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all of the configured pools.
     */
    public java.lang.String[] getPoolNames() throws java.rmi.RemoteException;

    /**
     * Get whether each of the named pools uses priority lists.
     */
    public boolean[] getPriorityEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools uses priority lists. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getPriorityEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum number of highest-priority active nodes, for
     * each of the named pools.
     */
    public org.apache.axis.types.UnsignedInt[] getPriorityNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum number of highest-priority active nodes, for
     * each of the named pools. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getPriorityNodesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the priority values for each
     * of the nodes in each pool.
     */
    public com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] getPriorityValues(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the priority values for each
     * of the nodes in each pool. This is a location specific function, any
     * action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] getPriorityValuesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum time to keep a connections queued in seconds.
     * A value of 0 will not timeout queued connections.
     */
    public org.apache.axis.types.UnsignedInt[] getQueueTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum time to keep a connections queued in seconds.
     * A value of 0 will not timeout queued connections. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getQueueTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should upgrade SMTP connections
     * to SSL using STARTTLS (the alternative is to encrypt the entire connection).
     */
    public boolean[] getSMTPSendStartTLS(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should upgrade SMTP connections
     * to SSL using STARTTLS (the alternative is to encrypt the entire connection).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getSMTPSendStartTLSByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should use client authentication.
     * If client authentication is enabled and a back-end node asks for a
     * client authentication, a suitable certificate and private key will
     * be used from the SSL Client Certificates catalog.
     */
    public boolean[] getSSLClientAuth(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should use client authentication.
     * If client authentication is enabled and a back-end node asks for a
     * client authentication, a suitable certificate and private key will
     * be used from the SSL Client Certificates catalog. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getSSLClientAuthByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should encrypt data to
     * the back-end nodes using SSL.
     */
    public boolean[] getSSLEncrypt(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should encrypt data to
     * the back-end nodes using SSL. This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getSSLEncryptByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should use SSL protocol
     * enhancements. These enhancements allow Riverbed Web Servers to run
     * multiple SSL sites, and to discover the client's IP address. Only
     * use enable this if, for this pool, you are using Riverbed Web Servers
     * or Stingray Traffic Managers whose virtual servers have the 'ssl_trust_magic'
     * setting enabled.
     */
    public boolean[] getSSLEnhance(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should use SSL protocol
     * enhancements. These enhancements allow Riverbed Web Servers to run
     * multiple SSL sites, and to discover the client's IP address. Only
     * use enable this if, for this pool, you are using Riverbed Web Servers
     * or Stingray Traffic Managers whose virtual servers have the 'ssl_trust_magic'
     * setting enabled. This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getSSLEnhanceByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should send a close alert
     * when they initiate socket disconnections.
     */
    public boolean[] getSSLSendCloseAlerts(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should send a close alert
     * when they initiate socket disconnections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getSSLSendCloseAlertsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if we should send the server_name extension to the back-end
     * node. This setting forces the use of at least TLS 1.0.
     */
    public boolean[] getSSLServerNameExtension(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if we should send the server_name extension to the back-end
     * node. This setting forces the use of at least TLS 1.0. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getSSLServerNameExtensionByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should perform strict certificate
     * validation on SSL certificates from the back-end nodes.
     */
    public boolean[] getSSLStrictVerify(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should perform strict certificate
     * validation on SSL certificates from the back-end nodes. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getSSLStrictVerifyByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should make connections
     * to the back-ends appear to originate from the source client IP address.
     */
    public boolean[] getTransparent(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named pools should make connections
     * to the back-ends appear to originate from the source client IP address.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getTransparentByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get what sets of IP addresses and ports from which we should
     * accept UDP responses.
     */
    public com.zeus.soap.zxtm._1_0.PoolUDPAcceptFrom[] getUDPAcceptFrom(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get what sets of IP addresses and ports from which we should
     * accept UDP responses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolUDPAcceptFrom[] getUDPAcceptFromByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the mask to validate the IP of UDP responses with. Only
     * used if UDPAcceptFromIP is set to 'ip_mask'.
     */
    public java.lang.String[] getUDPAcceptFromIPMask(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the mask to validate the IP of UDP responses with. Only
     * used if UDPAcceptFromIP is set to 'ip_mask'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getUDPAcceptFromIPMaskByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the weightings for each of
     * the nodes in each pool.
     */
    public com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] getWeightings(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, get the weightings for each of
     * the nodes in each pool. This is a location specific function, any
     * action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] getWeightingsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove nodes from the lists of draining nodes, for each of
     * the named pools.
     */
    public void removeDrainingNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove nodes from the lists of draining nodes, for each of
     * the named pools. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void removeDrainingNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove monitors from each of the named pools.
     */
    public void removeMonitors(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove monitors from each of the named pools. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeMonitorsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove nodes from each of the named pools.
     */
    public void removeNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove nodes from each of the named pools. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename each of the named pools.
     */
    public void renamePool(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the cloud credentials for this auto-scaled pool
     */
    public void setAutoscaleCloudcredentials(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud credentials for this auto-scaled pool This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleCloudcredentialsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The ESX host or ESX cluster name to put the new virtual
     * machine instances on.
     */
    public void setAutoscaleCluster(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The ESX host or ESX cluster name to put the new virtual
     * machine instances on. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setAutoscaleClusterByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The name of the logical datacenter on the vCenter server
     */
    public void setAutoscaleDatacenter(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The name of the logical datacenter on the vCenter server
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setAutoscaleDatacenterByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The name of the datastore to be used by the newly created
     * virtual machine.
     */
    public void setAutoscaleDatastore(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set The name of the datastore to be used by the newly created
     * virtual machine. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setAutoscaleDatastoreByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether this pool uses auto-scaling.
     */
    public void setAutoscaleEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether this pool uses auto-scaling. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setAutoscaleEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether autoscaling is handled externally or internally
     */
    public void setAutoscaleExternal(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether autoscaling is handled externally or internally
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setAutoscaleExternalByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the hysteresis period for an auto-scaled pool
     */
    public void setAutoscaleHysteresis(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the hysteresis period for an auto-scaled pool This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleHysteresisByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the image identifier
     */
    public void setAutoscaleImageid(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the image identifier This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setAutoscaleImageidByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to use the public or private IPs
     */
    public void setAutoscaleIpstouse(java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolAutoscaleIpstouse[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to use the public or private IPs This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setAutoscaleIpstouseByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolAutoscaleIpstouse[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the idle time of the last node in an autoscaled pool before
     * it can be destroyed
     */
    public void setAutoscaleLastnodeIdletime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the idle time of the last node in an autoscaled pool before
     * it can be destroyed This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setAutoscaleLastnodeIdletimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of nodes in an auto-scaled pool
     */
    public void setAutoscaleMaxNodes(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of nodes in an auto-scaled pool This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleMaxNodesByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum number of nodes in an auto-scaled pool
     */
    public void setAutoscaleMinNodes(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum number of nodes in an auto-scaled pool This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleMinNodesByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the node name prefix for this auto-scaled pool
     */
    public void setAutoscaleName(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the node name prefix for this auto-scaled pool This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleNameByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port number for this auto-scaled pool
     */
    public void setAutoscalePort(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port number for this auto-scaled pool This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setAutoscalePortByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the refractory period for an auto-scaled pool
     */
    public void setAutoscaleRefractory(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the refractory period for an auto-scaled pool This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleRefractoryByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the expected node response time in milliseconds
     */
    public void setAutoscaleResponseTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the expected node response time in milliseconds This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleResponseTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the threshold of conforming requests for scaling down
     */
    public void setAutoscaleScaledownLevel(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the threshold of conforming requests for scaling down This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscaleScaledownLevelByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the acceptable lower percentage of conforming requests
     */
    public void setAutoscaleScaleupLevel(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the acceptable lower percentage of conforming requests
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setAutoscaleScaleupLevelByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the size identifier
     */
    public void setAutoscaleSizeid(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the size identifier This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setAutoscaleSizeidByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Bandwidth Classes that each of the named pools uses.
     */
    public void setBandwidthClass(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Bandwidth Classes that each of the named pools uses.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setBandwidthClassByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the specified nodes to be
     * disabled in the pool (all other nodes will remain in their existing
     * state).
     */
    public void setDisabledNodes(java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the specified nodes to be
     * disabled in the pool (all other nodes will remain in their existing
     * state). This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setDisabledNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the lists of draining nodes for each of the named pools.
     */
    public void setDrainingNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the lists of draining nodes for each of the named pools.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setDrainingNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete and is replaced by VirtualServer.setErrorFile.
     */
    public void setErrorFile(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether backend IPv4 nodes understand the FTP EPRT and
     * EPSV commands.
     */
    public void setFTPSupportRfc2428(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether backend IPv4 nodes understand the FTP EPRT and
     * EPSV commands. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setFTPSupportRfc2428ByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the pool to use when all nodes in a pool fail, for each
     * of the named pools.
     */
    public void setFailpool(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the pool to use when all nodes in a pool fail, for each
     * of the named pools. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setFailpoolByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes.
     */
    public void setKeepalive(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setKeepaliveByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes for non-idempotent requests.
     */
    public void setKeepaliveNonIdempotent(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should maintain HTTP keepalive
     * connections to the nodes for non-idempotent requests. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setKeepaliveNonIdempotentByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the load balancing algorithms that each of the named pools
     * uses.
     */
    public void setLoadBalancingAlgorithm(java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolLoadBalancingAlgorithm[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the load balancing algorithms that each of the named pools
     * uses. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setLoadBalancingAlgorithmByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolLoadBalancingAlgorithm[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the times that each of the named pools should wait for
     * a connection to establish to a node before trying another node, in
     * seconds.
     */
    public void setMaxConnectTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the times that each of the named pools should wait for
     * a connection to establish to a node before trying another node, in
     * seconds. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setMaxConnectTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum number of conncurrent connections allowed
     * to each node in the pool per machine.
     */
    public void setMaxConnectionsPernode(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum number of conncurrent connections allowed
     * to each node in the pool per machine. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setMaxConnectionsPernodeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum numbers of unused HTTP keepalive connections
     * that each of the named pools should maintain to an individual node.
     */
    public void setMaxIdleConnectionsPerNode(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum numbers of unused HTTP keepalive connections
     * that each of the named pools should maintain to an individual node.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setMaxIdleConnectionsPerNodeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * setMaxKeepalivesPerNode is deprecated, please use setMaxIdleConnectionsPerNode
     * instead.
     */
    public void setMaxKeepalivesPerNode(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * setMaxKeepalivesPerNode is deprecated, please use setMaxIdleConnectionsPerNode
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setMaxKeepalivesPerNodeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum number of connections that can be queued
     * due to connection limits.
     */
    public void setMaxQueueSize(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum number of connections that can be queued
     * due to connection limits. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setMaxQueueSizeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time that each of the named pools should wait for a
     * response from a node before either discarding the request or trying
     * another node, in seconds (retryable requests only).
     */
    public void setMaxReplyTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time that each of the named pools should wait for a
     * response from a node before either discarding the request or trying
     * another node, in seconds (retryable requests only). This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMaxReplyTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of all monitors.
     */
    public void setMonitors(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of all monitors. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setMonitorsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether all connections that have been sent to a node are
     * closed when that node is marked as dead.
     */
    public void setNodeConnClose(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether all connections that have been sent to a node are
     * closed when that node is marked as dead. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setNodeConnCloseByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of times your traffic manager should try and
     * connect to a node before registering it as failed when passive monitoring
     * is enabled.
     */
    public void setNodeConnectionAttempts(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of times your traffic manager should try and
     * connect to a node before registering it as failed when passive monitoring
     * is enabled. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setNodeConnectionAttemptsByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the length of time a failed node should be isolated for
     * before testing it with new traffic, in seconds
     */
    public void setNodeFailTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the length of time a failed node should be isolated for
     * before testing it with new traffic, in seconds This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setNodeFailTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether Nagle's algorithm should be used for TCP connections
     * to the back-end nodes.
     */
    public void setNodeUseNagle(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether Nagle's algorithm should be used for TCP connections
     * to the back-end nodes. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setNodeUseNagleByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the lists of nodes for each of the named pools.
     */
    public void setNodes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the lists of nodes for each of the named pools. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setNodesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the priority values for the
     * named nodes in each pool.
     */
    public void setNodesPriorityValue(java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] node_values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the priority values for the
     * named nodes in each pool. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setNodesPriorityValueByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolPriorityValueDefinition[][] node_values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the weighting (for the Weighted
     * Round Robin algorithm) for each node in that pool.
     */
    public void setNodesWeightings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] nodes_values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named pools, set the weighting (for the Weighted
     * Round Robin algorithm) for each node in that pool. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setNodesWeightingsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolWeightingsDefinition[][] nodes_values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named pools.
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether this pool uses passive monitoring.
     */
    public void setPassiveMonitoring(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether this pool uses passive monitoring. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setPassiveMonitoringByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default Session Persistence classes that each of the
     * named pools uses.
     */
    public void setPersistence(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default Session Persistence classes that each of the
     * named pools uses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setPersistenceByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools uses priority lists.
     */
    public void setPriorityEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools uses priority lists. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setPriorityEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum number of highest-priority active nodes, for
     * each of the named pools.
     */
    public void setPriorityNodes(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum number of highest-priority active nodes, for
     * each of the named pools. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setPriorityNodesByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum time to keep a connections queued in seconds.
     * A value of 0 will not timeout queued connections.
     */
    public void setQueueTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set is the maximum time to keep a connections queued in seconds.
     * A value of 0 will not timeout queued connections. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setQueueTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should upgrade SMTP connections
     * to SSL using STARTTLS (the alternative is to encrypt the entire connection).
     */
    public void setSMTPSendStartTLS(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should upgrade SMTP connections
     * to SSL using STARTTLS (the alternative is to encrypt the entire connection).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSMTPSendStartTLSByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should use client authentication.
     * If client authentication is enabled and a back-end node asks for a
     * client authentication, a suitable certificate and private key will
     * be used from the SSL Client Certificates catalog.
     */
    public void setSSLClientAuth(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should use client authentication.
     * If client authentication is enabled and a back-end node asks for a
     * client authentication, a suitable certificate and private key will
     * be used from the SSL Client Certificates catalog. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLClientAuthByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should encrypt data to
     * the back-end nodes using SSL.
     */
    public void setSSLEncrypt(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should encrypt data to
     * the back-end nodes using SSL. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSSLEncryptByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should use SSL protocol
     * enhancements. These enhancements allow Riverbed Web Servers to run
     * multiple SSL sites, and to discover the client's IP address. Only
     * use enable this if, for this pool, you are using Riverbed Web Servers
     * or Stingray Traffic Managers whose virtual servers have the 'ssl_trust_magic'
     * setting enabled.
     */
    public void setSSLEnhance(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should use SSL protocol
     * enhancements. These enhancements allow Riverbed Web Servers to run
     * multiple SSL sites, and to discover the client's IP address. Only
     * use enable this if, for this pool, you are using Riverbed Web Servers
     * or Stingray Traffic Managers whose virtual servers have the 'ssl_trust_magic'
     * setting enabled. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setSSLEnhanceByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should send a close alert
     * when they initiate socket disconnections.
     */
    public void setSSLSendCloseAlerts(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should send a close alert
     * when they initiate socket disconnections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLSendCloseAlertsByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if we should send the server_name extension to the back-end
     * node. This setting forces the use of at least TLS 1.0.
     */
    public void setSSLServerNameExtension(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if we should send the server_name extension to the back-end
     * node. This setting forces the use of at least TLS 1.0. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLServerNameExtensionByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should perform strict certificate
     * validation on SSL certificates from the back-end nodes.
     */
    public void setSSLStrictVerify(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should perform strict certificate
     * validation on SSL certificates from the back-end nodes. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLStrictVerifyByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should make connections
     * to the back-ends appear to originate from the source client IP address.
     */
    public void setTransparent(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named pools should make connections
     * to the back-ends appear to originate from the source client IP address.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setTransparentByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set what sets of IP addresses and ports from which we should
     * accept UDP responses.
     */
    public void setUDPAcceptFrom(java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolUDPAcceptFrom[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set what sets of IP addresses and ports from which we should
     * accept UDP responses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setUDPAcceptFromByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.PoolUDPAcceptFrom[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the mask to validate the IP of UDP responses with. Only
     * used if UDPAcceptFromIP is set to 'ip_mask'.
     */
    public void setUDPAcceptFromIPMask(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the mask to validate the IP of UDP responses with. Only
     * used if UDPAcceptFromIP is set to 'ip_mask'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setUDPAcceptFromIPMaskByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
