/**
 * CatalogSSLDNSSEC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSSLDNSSEC extends javax.xml.rpc.Service {

/**
 * The Catalog.SSL.DNSSEC interface allows management of the DNSSEC
 * private keys used to alter signed GLB DNS responses.
 */
    public java.lang.String getCatalogSSLDNSSECPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECPort getCatalogSSLDNSSECPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECPort getCatalogSSLDNSSECPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
