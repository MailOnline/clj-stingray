/**
 * CatalogSLMPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSLMPort extends java.rmi.Remote {

    /**
     * Add new SLM classes.
     */
    public void addSLM(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named SLM classes.
     */
    public void copySLM(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named SLM classes.
     */
    public void deleteSLM(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the note for each of the named SLM classes.
     */
    public java.lang.String[] getNote(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time limit for a response to conform (in milliseconds).
     */
    public org.apache.axis.types.UnsignedInt[] getResponseTime(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time limit for a response to conform (in milliseconds).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getResponseTimeByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured SLM classes.
     */
    public java.lang.String[] getSLMNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError;

    /**
     * Get the percentage of conforming responses below which a serious
     * error will be emitted.
     */
    public org.apache.axis.types.UnsignedInt[] getSeriousThreshold(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the percentage of conforming responses below which a serious
     * error will be emitted. This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSeriousThresholdByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the percentage of conforming responses below which a warning
     * message will be triggered.
     */
    public org.apache.axis.types.UnsignedInt[] getWarningThreshold(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the percentage of conforming responses below which a warning
     * message will be triggered. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getWarningThresholdByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named SLM classes.
     */
    public void renameSLM(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the note for each of the named SLM classes.
     */
    public void setNote(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time limit for a response to conform (in milliseconds).
     */
    public void setResponseTime(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time limit for a response to conform (in milliseconds).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setResponseTimeByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the percentage of conforming responses below which a serious
     * error will be emitted.
     */
    public void setSeriousThreshold(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the percentage of conforming responses below which a serious
     * error will be emitted. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setSeriousThresholdByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the percentage of conforming responses below which a warning
     * message will be triggered.
     */
    public void setWarningThreshold(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the percentage of conforming responses below which a warning
     * message will be triggered. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setWarningThresholdByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
