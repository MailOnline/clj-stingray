/**
 * CatalogSSLDNSSECPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLDNSSECPort extends java.rmi.Remote {

    /**
     * Upload a DNSSEC private key to the traffic manager's catalog.
     * Each key string should be the contents of your private key file. The
     * ID of the key is the third set of parameters.
     */
    public void addKeysWithManualIDs(java.lang.String[] names, java.lang.String[] keys, int[] ids) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Upload a DNSSEC private key to the traffic manager's catalog.
     * Each key string should be the contents of your private key file. The
     * ID of the key will be calculated assuming it is a standard ZSK.
     */
    public void addStandardKeys(java.lang.String[] names, java.lang.String[] keys) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the specified DNSSEC keys.
     */
    public void deleteKeys(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the IDs of the specified DNSSEC private keys.
     */
    public int[] getKeyIDs(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of the installed DNSSEC private keys.
     */
    public java.lang.String[] getKeyNames() throws java.rmi.RemoteException;

    /**
     * Rename the specified DNSSEC keys.
     */
    public void renameKeys(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;
}
