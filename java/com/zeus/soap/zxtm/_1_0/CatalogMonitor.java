/**
 * CatalogMonitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogMonitor extends javax.xml.rpc.Service {

/**
 * The Catalog.Monitor interface allows management of Custom Monitors.
 * Using this interface, you can create, delete and rename custom monitors,
 * and manage their configuration.
 */
    public java.lang.String getCatalogMonitorPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogMonitorPort getCatalogMonitorPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogMonitorPort getCatalogMonitorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
