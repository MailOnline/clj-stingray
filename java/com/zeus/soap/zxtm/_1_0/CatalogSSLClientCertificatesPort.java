/**
 * CatalogSSLClientCertificatesPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLClientCertificatesPort extends java.rmi.Remote {

    /**
     * Delete the named client certificates.
     */
    public void deleteClientCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete the named client certificates even if they are stored
     * on secure hardware and could be in use by other clients of the hardware.
     */
    public void deleteClientCertificateHW(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the information about the named client certificates.
     */
    public com.zeus.soap.zxtm._1_0.Certificate[] getClientCertificateInfo(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of the installed client certificates.
     */
    public java.lang.String[] getClientCertificateNames() throws java.rmi.RemoteException;

    /**
     * Import client certificates and associated private keys.
     */
    public void importClientCertificate(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CertificateFiles[] keys) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Rename the named client certificates.
     */
    public void renameClientCertificate(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;
}
