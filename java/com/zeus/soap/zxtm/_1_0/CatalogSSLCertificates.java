/**
 * CatalogSSLCertificates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLCertificates extends javax.xml.rpc.Service {

/**
 * The Catalog.SSL.Certificates interface allows management of SSL
 * Certificates which are used for SSL decryption of services. Using
 * this interface, you can create, delete and rename SSL Certificate
 * objects.
 */
    public java.lang.String getCatalogSSLCertificatesPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificatesPort getCatalogSSLCertificatesPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificatesPort getCatalogSSLCertificatesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
