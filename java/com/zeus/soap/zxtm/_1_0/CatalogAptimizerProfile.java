/**
 * CatalogAptimizerProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogAptimizerProfile extends javax.xml.rpc.Service {

/**
 * The Catalog.AptimizerAptimizerProfile interface allows management
 * of Aptimizer profiles. Using this interface, you can create, delete
 * and rename Aptimizer profiles, and manage their configuration.
 */
    public java.lang.String getCatalogAptimizerProfilePortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogAptimizerProfilePort getCatalogAptimizerProfilePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogAptimizerProfilePort getCatalogAptimizerProfilePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
