/**
 * CatalogBandwidth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogBandwidth extends javax.xml.rpc.Service {

/**
 * The Catalog.Bandwidth interface allows management of Bandwidth
 * classes. Using this interface, you can create, delete and rename bandwidth
 * classes, and manage their configuration.
 */
    public java.lang.String getCatalogBandwidthPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogBandwidthPort getCatalogBandwidthPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogBandwidthPort getCatalogBandwidthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
