/**
 * SystemSteelheadPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemSteelheadPort extends java.rmi.Remote {

    /**
     * Returns the mode used to discover Cloud Steelheads in the local
     * data center or cloud for the supplied traffic managers.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[] getDiscoveryMode(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns true if the Cloud Steelhead discovery agents on the
     * provided traffic managers are enabled.
     */
    public boolean[] getEnabled(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the current load balancing method that each of the
     * named traffic managers are using. Only required when using 'manual'
     * mode.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[] getLoadBalancingMethod(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the level of logging used on each of the named traffic
     * managers.
     */
    public com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[] getLogLevel(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the string used to identifiy the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public java.lang.String[] getPortalClientID(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the key used to authenticate the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public java.lang.String[] getPortalClientKey(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the hostname or IP address of the cloud portal to use.
     * Only required when using the 'local' discovery mode.
     */
    public java.lang.String[] getPortalHost(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Returns the hostname or IP address of the proxy that portal
     * communication should go through, or the empty string if no proxy should
     * be used. Configured per traffic manager.
     */
    public java.lang.String[] getProxyHost(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the current proxy server port for each of the named traffic
     * managers. Only used if a proxy host has been specified.
     */
    public java.lang.String[] getProxyPort(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets an array of Cloud Steelhead IP addresses that each of
     * the named traffic managers is using. Only required when using the
     * 'manual' discovery mode.
     */
    public java.lang.String[][] getSteelheadIPs(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the mode used to discover Cloud Steelheads in the local
     * data center or cloud for the supplied traffic managers.
     */
    public void setDiscoveryMode(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadDiscoveryMode[] modes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Enable or disable the Cloud Steelhead discovery agent on each
     * of the provided traffic managers
     */
    public void setEnabled(java.lang.String[] traffic_managers, boolean[] enabled) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the load balancing method that each of the named traffic
     * managers should use. Only required when using 'manual' mode.
     */
    public void setLoadBalancingMethod(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadSteelheadLB[] lbs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the level of logging used on each of the named traffic
     * managers.
     */
    public void setLogLevel(java.lang.String[] traffic_managers, com.zeus.soap.zxtm._1_0.SystemSteelheadLogLevel[] levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the string used to identifiy the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public void setPortalClientID(java.lang.String[] traffic_managers, java.lang.String[] ids) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the key used to authenticate the supplied traffic managers
     * to the cloud portal. Only required in 'portal' and 'local' discovery
     * modes.
     */
    public void setPortalClientKey(java.lang.String[] traffic_managers, java.lang.String[] keys) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the hostname or IP address of the cloud portal to use.
     * Only required when using the 'local' discovery mode.
     */
    public void setPortalHost(java.lang.String[] traffic_managers, java.lang.String[] hosts) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the hostname or IP address of the proxy that portal communication
     * should go through. Set to the empty string to not use a proxy. Configured
     * per traffic manager.
     */
    public void setProxyHost(java.lang.String[] traffic_managers, java.lang.String[] hosts) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the current proxy server port for each of the named traffic
     * managers. Only used if a proxy host has been specified, can be set
     * to the empty string otherwise.
     */
    public void setProxyPort(java.lang.String[] traffic_managers, java.lang.String[] ports) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets an array of Cloud Steelhead IP addresses that each of
     * the named traffic managers should use. Only required when using the
     * 'manual' discovery mode.
     */
    public void setSteelheadIPs(java.lang.String[] traffic_managers, java.lang.String[][] ips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
