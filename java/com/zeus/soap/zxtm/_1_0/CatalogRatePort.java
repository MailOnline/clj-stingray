/**
 * CatalogRatePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogRatePort extends java.rmi.Remote {

    /**
     * Add new rate classes.
     */
    public void addRate(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named rate classes.
     */
    public void copyRate(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named rate classes.
     */
    public void deleteRate(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the maximum rate at which requests are allowed to be processed,
     * in requests per minute.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxRatePerMinute(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum rate at which requests are allowed to be processed,
     * in requests per minute. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxRatePerMinuteByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum rate at which requests are allowed to be processed,
     * in requests per second.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxRatePerSecond(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum rate at which requests are allowed to be processed,
     * in requests per second. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxRatePerSecondByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named Rate classes.
     */
    public java.lang.String[] getNote(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured rate classes.
     */
    public java.lang.String[] getRateNames() throws java.rmi.RemoteException;

    /**
     * Rename the named rate classes.
     */
    public void renameRate(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the maximum rate at which requests are allowed to be processed,
     * in requests per minute.
     */
    public void setMaxRatePerMinute(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum rate at which requests are allowed to be processed,
     * in requests per minute. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setMaxRatePerMinuteByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum rate at which requests are allowed to be processed,
     * in requests per second.
     */
    public void setMaxRatePerSecond(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum rate at which requests are allowed to be processed,
     * in requests per second. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setMaxRatePerSecondByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named Rate classes.
     */
    public void setNote(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
