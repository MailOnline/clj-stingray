/**
 * CatalogSSLCertificateAuthoritiesPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLCertificateAuthoritiesPort extends java.rmi.Remote {

    /**
     * Delete the named Certificate Authority and associated Revocation
     * list.
     */
    public void deleteCertificateAuthority(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Certificate Information, and the revoked certificates.
     */
    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesDetails[] getCertificateAuthorityInfo(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of the configured Certificate Authorities.
     */
    public java.lang.String[] getCertificateAuthorityNames() throws java.rmi.RemoteException;

    /**
     * Get the raw PEM encoded Certificate for the named Certificate
     * Authorities.
     */
    public java.lang.String[] getRawCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Import Certificate Revocation Lists. The associated Certificate
     * Authority certificates should already be imported.
     */
    public void importCRL(java.lang.String[] crls) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Import new Certificate Authorities.
     */
    public void importCertificateAuthority(java.lang.String[] names, java.lang.String[] certs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Rename the named Certificate Authorities.
     */
    public void renameCertificateAuthority(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;
}
