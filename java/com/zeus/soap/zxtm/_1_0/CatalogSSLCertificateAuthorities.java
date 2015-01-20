/**
 * CatalogSSLCertificateAuthorities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLCertificateAuthorities extends javax.xml.rpc.Service {

/**
 * The Catalog.SSL.CertificateAuthorities interface allows management
 * of SSL Certificate Authorities which are used to authenticate back-end
 * nodes when doing SSL encryption.
 */
    public java.lang.String getCatalogSSLCertificateAuthoritiesPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesPort getCatalogSSLCertificateAuthoritiesPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesPort getCatalogSSLCertificateAuthoritiesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
