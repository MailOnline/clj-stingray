/**
 * CatalogAuthenticators.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogAuthenticators extends javax.xml.rpc.Service {

/**
 * The Catalog.Authenticator interface allows management of authenticator
 * information, which are used by TrafficScript to communicate with an
 * authentication service.
 */
    public java.lang.String getCatalogAuthenticatorsPortAddress();

    public com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsPort getCatalogAuthenticatorsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.CatalogAuthenticatorsPort getCatalogAuthenticatorsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
