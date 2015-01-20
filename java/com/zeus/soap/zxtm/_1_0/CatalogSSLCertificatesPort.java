/**
 * CatalogSSLCertificatesPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLCertificatesPort extends java.rmi.Remote {

    /**
     * Create new self-signed certificates.
     */
    public void createSelfSignedCertificate(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogSSLCertificatesCertificateDetails[] details) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named certificates.
     */
    public void deleteCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Delete the named certificates even if they are stored on secure
     * hardware and could be in use by other clients of the hardware.
     */
    public void deleteCertificateHW(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Get the information about the namedcertificates.
     */
    public com.zeus.soap.zxtm._1_0.Certificate[] getCertificateInfo(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of the installed certificates.
     */
    public java.lang.String[] getCertificateNames() throws java.rmi.RemoteException;

    /**
     * Get Certificate signing requests for the named certificates.
     */
    public java.lang.String[] getCertificateRequest(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the raw (PEM-encoded) certificates.
     */
    public java.lang.String[] getRawCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Create a new certificate, importing the certificate and private
     * key.
     */
    public void importCertificate(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CertificateFiles[] keys) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Rename the named certificates.
     */
    public void renameCertificate(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the (PEM-encoded) certificate. This should be used after
     * getting a Certificate request signed by a certificate authority.
     */
    public void setRawCertificate(java.lang.String[] names, java.lang.String[] certs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
