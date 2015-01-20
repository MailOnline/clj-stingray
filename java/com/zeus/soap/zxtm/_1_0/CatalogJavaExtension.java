/**
 * CatalogJavaExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogJavaExtension extends javax.xml.rpc.Service {

/**
 * The Catalog.JavaExtension interface allows management of Java Extensions.
 * Using this interface you can retrieve information on each extension
 * in the system, and set the initialisation properties to alter their
 * behaviour.
 */
    public java.lang.String getCatalogJavaExtensionPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionPort getCatalogJavaExtensionPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionPort getCatalogJavaExtensionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
