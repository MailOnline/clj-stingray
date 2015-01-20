/**
 * CatalogPersistence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogPersistence extends javax.xml.rpc.Service {

/**
 * The Catalog.Persistence interface allows management of Persistence
 * classes. Using this interface, you can create, delete and rename persistence
 * classes, and manage their configuration.
 */
    public java.lang.String getCatalogPersistencePortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogPersistencePort getCatalogPersistencePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogPersistencePort getCatalogPersistencePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
