/**
 * CatalogSSLClientCertificates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLClientCertificates extends javax.xml.rpc.Service {

/**
 * The Catalog.SSL.ClientCertificates interface allows management
 * of SSL Client Certificates which are for authentication with back-end
 * nodes when encrypting services. This interfaces allows you to import,
 * retrieve, rename and delete the SSL Client Certificate objects
 */
    public java.lang.String getCatalogSSLClientCertificatesPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogSSLClientCertificatesPort getCatalogSSLClientCertificatesPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogSSLClientCertificatesPort getCatalogSSLClientCertificatesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
