/**
 * CatalogPersistencePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogPersistencePort extends java.rmi.Remote {

    /**
     * Add new persistence classes.
     */
    public void addPersistence(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named persistence classes.
     */
    public void copyPersistence(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named persistence classes.
     */
    public void deletePersistence(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the name of the cookie used to track session persistence.
     */
    public java.lang.String[] getCookie(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the cookie used to track session persistence.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getCookieByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the session should be deleted if a failure occurs.
     */
    public boolean[] getDelete(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the session should be deleted if a failure occurs.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getDeleteByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the action that should be taken if the session data is
     * invalid or the node specified cannot be contacted.
     */
    public com.zeus.soap.zxtm._1_0.CatalogPersistenceFailureMode[] getFailureMode(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the action that should be taken if the session data is
     * invalid or the node specified cannot be contacted. This is a location
     * specific function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogPersistenceFailureMode[] getFailureModeByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named Session Persistence classes.
     */
    public java.lang.String[] getNote(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured persistence classes.
     */
    public java.lang.String[] getPersistenceNames() throws java.rmi.RemoteException;

    /**
     * Gets the session method type.
     */
    public com.zeus.soap.zxtm._1_0.CatalogPersistenceType[] getType(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the session method type. This is a location specific function,
     * any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogPersistenceType[] getTypeByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the URL to send to clients if the session persistence is
     * configured to redirect users when a node dies.
     */
    public java.lang.String[] getUrl(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the URL to send to clients if the session persistence is
     * configured to redirect users when a node dies. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getUrlByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named persistence classes.
     */
    public void renamePersistence(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the name of the cookie used to track session persistence.
     */
    public void setCookie(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the cookie used to track session persistence.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setCookieByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the session should be deleted if a failure occurs.
     */
    public void setDelete(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the session should be deleted if a failure occurs.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setDeleteByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the action that should be taken if the session data is
     * invalid or the node specified cannot be contacted.
     */
    public void setFailureMode(java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogPersistenceFailureMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the action that should be taken if the session data is
     * invalid or the node specified cannot be contacted. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setFailureModeByLocation(java.lang.String location, java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogPersistenceFailureMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named Session Persistence classes.
     */
    public void setNote(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the session method type.
     */
    public void setType(java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogPersistenceType[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the session method type. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setTypeByLocation(java.lang.String location, java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogPersistenceType[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the URL to send to clients if the session persistence is
     * configured to redirect users when a node dies.
     */
    public void setUrl(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the URL to send to clients if the session persistence is
     * configured to redirect users when a node dies. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setUrlByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
