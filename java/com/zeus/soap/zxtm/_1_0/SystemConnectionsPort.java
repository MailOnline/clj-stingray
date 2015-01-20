/**
 * SystemConnectionsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemConnectionsPort extends java.rmi.Remote {

    /**
     * Get a list of all connections, current and recent, for this
     * machine.
     */
    public com.zeus.soap.zxtm._1_0.SystemConnectionsConnection[] getAllConnections() throws java.rmi.RemoteException;
}
