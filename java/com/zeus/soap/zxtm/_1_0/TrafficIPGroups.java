/**
 * TrafficIPGroups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface TrafficIPGroups extends javax.xml.rpc.Service {

/**
 * The TrafficIPGroup interface allows management of Traffic IP Group
 * objects. Using this interface, you can create, delete and rename Traffic
 * IP Group objects, and manage their configuration.
 */
    public java.lang.String getTrafficIPGroupsPortAddress();

    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsPort getTrafficIPGroupsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.TrafficIPGroupsPort getTrafficIPGroupsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
