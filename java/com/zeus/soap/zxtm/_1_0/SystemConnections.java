/**
 * SystemConnections.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemConnections extends javax.xml.rpc.Service {

/**
 * The System.Connections interface provides information about the
 * current and
 *                                         recent connections for this
 * machine. Using this interface you can retrieve a list
 *                                         of all connections.
 */
    public java.lang.String getSystemConnectionsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemConnectionsPort getSystemConnectionsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemConnectionsPort getSystemConnectionsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
