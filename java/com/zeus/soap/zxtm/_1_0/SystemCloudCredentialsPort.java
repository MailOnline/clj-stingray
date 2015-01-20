/**
 * SystemCloudCredentialsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemCloudCredentialsPort extends java.rmi.Remote {

    /**
     * Add new sets of cloud credentials.
     */
    public void addCloudCredentials(java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.SystemCloudCredentialsCredentialsData[] class_values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named set of cloud credentials.
     */
    public void copyCloudCredentials(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named sets of cloud credentials.
     */
    public void deleteCloudCredentials(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the vcenter server hostname or IP address.
     */
    public java.lang.String[] getApiServer(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the vcenter server hostname or IP address. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getApiServerByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of time change calls are allowed to take
     */
    public org.apache.axis.types.UnsignedInt[] getChangeProcessTimeout(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of time change calls are allowed to take This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getChangeProcessTimeoutByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured cloud credentials.
     */
    public java.lang.String[] getCloudCredentialsNames() throws java.rmi.RemoteException;

    /**
     * Get the cloud user name
     */
    public java.lang.String[] getCred1(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the cloud user name This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getCred1ByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the script
     */
    public java.lang.String[] getScript(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the script This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getScriptByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the interval at which cloud status is queried
     */
    public org.apache.axis.types.UnsignedInt[] getUpdateInterval(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the interval at which cloud status is queried This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getUpdateIntervalByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named sets of cloud credentials.
     */
    public void renameCloudCredentials(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the vcenter server hostname or IP address.
     */
    public void setApiServer(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the vcenter server hostname or IP address. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setApiServerByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of time change calls are allowed to take
     */
    public void setChangeProcessTimeout(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of time change calls are allowed to take This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setChangeProcessTimeoutByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user name
     */
    public void setCred1(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user name This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setCred1ByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user password
     */
    public void setCred2(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user password This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setCred2ByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user authentication token
     */
    public void setCred3(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the cloud user authentication token This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setCred3ByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the script
     */
    public void setScript(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the script This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setScriptByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the interval at which cloud status is queried
     */
    public void setUpdateInterval(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the interval at which cloud status is queried This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setUpdateIntervalByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
