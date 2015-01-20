/**
 * GLBServicePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface GLBServicePort extends java.rmi.Remote {

    /**
     * Add a set of DNSSEC domain to key mappings to the GLB services
     * specified.
     */
    public void addDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each named GLB service, add new DNS domain names to the
     * list of domains to load balance
     */
    public void addDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add the list of locations that are draining for this service.
     */
    public void addDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add each of the named GLB Services, using the domain lists
     * for each.
     */
    public void addGLBService(java.lang.String[] names, java.lang.String[][] domains) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Add Local IPs to the named GLB Services
     */
    public void addLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new locations to each of the named GLB services.
     */
    public void addLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add Monitors to the named GLB Services
     */
    public void addMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add Monitors to the named GLB Services This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on DNS packets for each of the named
     * GLB services. New rules are run after existing rules. If any of the
     * rules are already configured to run, then they are enabled and flags
     * are set to the values passed in.
     */
    public void addRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on DNS packets for each of the named
     * GLB services. New rules are run after existing rules. If any of the
     * rules are already configured to run, then they are enabled and flags
     * are set to the values passed in. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void addRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete each of the named GLB Services.
     */
    public void deleteGLBService(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the load balancing algorithm to use.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[] getAlgorithm(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether all monitors are required to be working in a location
     * for this service to be alive.
     */
    public boolean[] getAllMonitorsNeeded(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether automatic failback mode is enabled.
     */
    public boolean[] getAutoFailback(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the load for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] getDNSSECMappings(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of domain names to load balance, for each of the
     * named GLB services
     */
    public java.lang.String[][] getDomains(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of locations that are draining for this service.
     */
    public java.lang.String[][] getDraining(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether we perform DNS manipulation.
     */
    public boolean[] getEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all of the configured GLB Services.
     */
    public java.lang.String[] getGLBServiceNames() throws java.rmi.RemoteException;

    /**
     * Get the influence of locality on location choice
     */
    public org.apache.axis.types.UnsignedInt[] getGeoEffect(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the load for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceLoad[][] getLoad(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Local IPs configured for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] getLocalIPAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the locations configured for the named GLB services.
     */
    public java.lang.String[][] getLocations(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named GLB services should log each
     * connection.
     */
    public boolean[] getLogEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named GLB services should log each
     * connection. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getLogEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the file used to store query logs, for each
     * of the named GLB services.
     */
    public java.lang.String[] getLogFilename(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the file used to store query logs, for each
     * of the named GLB services. This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getLogFilenameByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the log file format for each of the named GLB services.
     */
    public java.lang.String[] getLogFormat(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the log file format for each of the named GLB services.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getLogFormatByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Monitors configured for the named GLB Services
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] getMonitors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Monitors configured for the named GLB Services This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] getMonitorsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to return all or no IP addresses on a complete
     * failure
     */
    public boolean[] getReturnIPsOnFail(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on DNS packets for each of the named
     * GLB services.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceRule[][] getRules(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on DNS packets for each of the named
     * GLB services. This is a location specific function, any action will
     * operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GLBServiceRule[][] getRulesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the TTL used for domains handled by this config
     */
    public int[] getTTL(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove the specified DNSSEC domain to key mappings.
     */
    public void removeDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each named GLB service, remove DNS domain names from the
     * list of domains to load balance
     */
    public void removeDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove the list of locations that are draining for this service.
     */
    public void removeDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove Local IPs from the named GLB Services
     */
    public void removeLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named GLB services, remove locations.
     */
    public void removeLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove Monitors from the named GLB Services
     */
    public void removeMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove Monitors from the named GLB Services This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named GLB services, remove rules from the list
     * of rules that are run on DNS packets.
     */
    public void removeRules(java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named GLB services, remove rules from the list
     * of rules that are run on DNS packets. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeRulesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename each of the named GLB Services.
     */
    public void renameGLBService(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the load balancing algorithm to use.
     */
    public void setAlgorithm(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceAlgorithm[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether all monitors are required to be working in a location
     * for this service to be alive.
     */
    public void setAllMonitorsNeeded(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether automatic failback mode is enabled.
     */
    public void setAutoFailback(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the DNSSEC domain to key mappings to the GLB services specified.
     * All previous mappings for this service will be removed.
     */
    public void setDNSSECMappings(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceDNSSECMapping[][] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of domain names to load balance, for each of the
     * named GLB services
     */
    public void setDomains(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of locations that are draining for this service.
     */
    public void setDraining(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether we perform DNS manipulation.
     */
    public void setEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the influence of locality on location choice
     */
    public void setGeoEffect(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the load for the named GLB Services
     */
    public void setLoad(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLoad[][] loads) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Local IPs configured for the named GLB Services
     */
    public void setLocalIPAddresses(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceLocalIPList[][] localips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the locations configured for each of the named GLB services.
     */
    public void setLocations(java.lang.String[] names, java.lang.String[][] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named GLB services should log each
     * connection.
     */
    public void setLogEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named GLB services should log each
     * connection. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setLogEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the file used to store query logs, for each
     * of the named GLB services.
     */
    public void setLogFilename(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the file used to store query logs, for each
     * of the named GLB services. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setLogFilenameByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the log file format for each of the named GLB services.
     */
    public void setLogFormat(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the log file format for each of the named GLB services.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogFormatByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Monitors configured for the named GLB Services
     */
    public void setMonitors(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Monitors configured for the named GLB Services This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setMonitorsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceMonitorList[][] monitors) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to return all or no IP addresses on a complete
     * failure
     */
    public void setReturnIPsOnFail(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on DNS packets for each of the named
     * GLB services.
     */
    public void setRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on DNS packets for each of the named
     * GLB services. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.GLBServiceRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the TTL used for domains handled by this config
     */
    public void setTTL(java.lang.String[] names, int[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
