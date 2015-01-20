/**
 * CatalogProtection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogProtection extends javax.xml.rpc.Service {

/**
 * The Catalog.Protection interface allows management of Service Protection
 * classes. Using this interface, you can create, delete and rename Protection
 * classes, and manage their configuration.
 */
    public java.lang.String getCatalogProtectionPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogProtectionPort getCatalogProtectionPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogProtectionPort getCatalogProtectionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
