/**
 * TrafficIPGroupsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface TrafficIPGroupsPort extends java.rmi.Remote {

    /**
     * Add new IP addresses to each of the named traffic IP groups.
     */
    public void addIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add machines to the lists of passive machines, for each of
     * the named traffic IP groups.
     */
    public void addPassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add the new named Traffic IP Groups, using the provided details.
     */
    public void addTrafficIPGroup(java.lang.String[] names, com.zeus.soap.zxtm._1_0.TrafficIPGroupsDetails[] details) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Add new traffic managers to each of the named traffic IP groups.
     */
    public void addTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete specified interface network mappings.
     */
    public void deleteSpecificSubnetMappings(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput;

    /**
     * Delete all interface network mappings.
     */
    public void deleteSubnetMappings() throws java.rmi.RemoteException;

    /**
     * Delete the named Traffic IP Groups.
     */
    public void deleteTrafficIPGroup(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the names of all of the Traffic Managers in the cluster.
     */
    public java.lang.String[] getAvailableTrafficManagers() throws java.rmi.RemoteException;

    /**
     * Get whether this traffic IP group is enabled or not.
     */
    public boolean[] getEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the IP addresses that are managed by each of the named
     * traffic IP groups.
     */
    public java.lang.String[][] getIPAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how traffic IPs will be distributed across the machines
     * in the cluster. If "multihosted" mode is used, the multicast IP must
     * be set first.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[] getIPDistributionMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the KeepTogether attribute for each of the named traffic
     * IP groups.
     */
    public boolean[] getKeepTogether(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the multicast IP group that is used to share data across
     * machines in the cluster. This setting is only used if the traffic
     * IP is using 'multihosted' distribution mode.
     */
    public java.lang.String[] getMulticastIP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get a list of network interfaces for all machines in the cluster.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsNetworkInterface[] getNetworkInterfaces() throws java.rmi.RemoteException;

    /**
     * Get the note for each of the named traffic IP groups.
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the lists of passive machines in each of the named traffic
     * IP groups.
     */
    public java.lang.String[][] getPassiveMachine(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get interface to CIDR subnet mappings.
     */
    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] getSubnetMappings(java.lang.String[] hostnames) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput;

    /**
     * Get the names of all of the configured Traffic IP Groups.
     */
    public java.lang.String[] getTrafficIPGroupNames() throws java.rmi.RemoteException;

    /**
     * Get the traffic managers that manage the IP addresses in each
     * of the named traffic IP groups.
     */
    public java.lang.String[][] getTrafficManager(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the source port is taken into account when deciding
     * which traffic manager should handle the request. This setting is only
     * used if the Traffic IP is using 'multihosted' distribution mode.
     */
    public boolean[] getUseClientSourcePort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove the named IP addresses from each of the named traffic
     * IP groups.
     */
    public void removeIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove the named machines from the list of passive machines,
     * for each of the named traffic IP groups.
     */
    public void removePassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove the named traffic managers from each named traffic IP
     * group.
     */
    public void removeTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename each of the named Traffic IP Groups.
     */
    public void renameTrafficIPGroup(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether this traffic IP group is enabled or not.
     */
    public void setEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the IP addresses that are managed by each of the named
     * traffic IP groups.
     */
    public void setIPAddresses(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how traffic IPs will be distributed across the machines
     * in the cluster. If "multihosted" mode is used, the multicast IP must
     * be set first.
     */
    public void setIPDistributionMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.TrafficIPGroupsIPDistributionMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the KeepTogether attribute for each of the named traffic
     * IP groups.
     */
    public void setKeepTogether(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the multicast IP group that is used to share data across
     * machines in the cluster. This setting is only used if the traffic
     * IP is using 'multihosted' distribution mode.
     */
    public void setMulticastIP(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named traffic IP groups.
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the lists of passive machines in each of the named traffic
     * IP groups.
     */
    public void setPassiveMachine(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Update interface to CIDR subnet mappings.
     */
    public void setSubnetMappings(com.zeus.soap.zxtm._1_0.TrafficIPGroupsSubnetMappingPerHost[] mappings) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the traffic managers that manage the IP addresses in each
     * of the named traffic IP groups.
     */
    public void setTrafficManager(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the source port is taken into account when deciding
     * which traffic manager should handle the request. This setting is only
     * used if the Traffic IP is using 'multihosted' distribution mode.
     */
    public void setUseClientSourcePort(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
