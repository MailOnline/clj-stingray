/**
 * CatalogRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogRate extends javax.xml.rpc.Service {

/**
 * The Catalog.Rate interface allows management of Rate classes. Using
 * this interface, you can create, delete and rename rate classes, and
 * manage their configuration.
 */
    public java.lang.String getCatalogRatePortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogRatePort getCatalogRatePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogRatePort getCatalogRatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
