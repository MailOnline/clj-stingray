/**
 * CatalogSLM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogSLM extends javax.xml.rpc.Service {

/**
 * The Catalog.SLM interface allows management of Service Level Monitoring
 * classes. Using this interface, you can create, delete and rename SLM
 * classes, and manage their configuration.
 */
    public java.lang.String getCatalogSLMPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogSLMPort getCatalogSLMPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogSLMPort getCatalogSLMPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
