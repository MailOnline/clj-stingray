/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface Location extends javax.xml.rpc.Service {

/**
 * The Location interface allows management of traffic manager locations.
 * Using this interface, you can create, delete and rename Locations,
 * and manage their configuration.
 */
    public java.lang.String getLocationPortAddress();

    public com.zeus.soap.zxtm._1_0.LocationPort getLocationPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.LocationPort getLocationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
