/**
 * CatalogBandwidthPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogBandwidthPort extends java.rmi.Remote {

    /**
     * Add new bandwidth classes.
     */
    public void addBandwidth(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named bandwidth classes.
     */
    public void copyBandwidth(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named bandwidth classes.
     */
    public void deleteBandwidth(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the names of all the configured bandwidth classes.
     */
    public java.lang.String[] getBandwidthNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError;

    /**
     * Get the maximum bandwidth, in kbits/second.
     */
    public org.apache.axis.types.UnsignedInt[] getMaximum(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum bandwidth, in kbits/second. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaximumByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named Bandwidth classes.
     */
    public java.lang.String[] getNote(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the bandwidth sharing mode
     */
    public com.zeus.soap.zxtm._1_0.CatalogBandwidthSharing[] getSharing(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the bandwidth sharing mode This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogBandwidthSharing[] getSharingByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named bandwidth classes.
     */
    public void renameBandwidth(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the maximum bandwidth, in kbits/second.
     */
    public void setMaximum(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum bandwidth, in kbits/second. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMaximumByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named Bandwidth classes.
     */
    public void setNote(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the bandwidth sharing mode
     */
    public void setSharing(java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogBandwidthSharing[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the bandwidth sharing mode This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSharingByLocation(java.lang.String location, java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogBandwidthSharing[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
