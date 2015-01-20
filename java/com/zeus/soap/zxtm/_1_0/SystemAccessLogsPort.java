/**
 * SystemAccessLogsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemAccessLogsPort extends java.rmi.Remote {

    /**
     * Delete all the access logs for all virtual servers.
     */
    public void deleteAllVSAccessLogs() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Delete the specified access logs.
     */
    public void deleteVSAccessLog(java.lang.String[] logfiles) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Delete the access logs for specific virtual servers.
     */
    public void deleteVSAccessLogs(java.lang.String[] vservers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the access logs for all virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.SystemAccessLogsVSAccessLog[] getAllVSAccessLogs() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the access logs for specific virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.SystemAccessLogsVSAccessLog[][] getVSAccessLogs(java.lang.String[] vservers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;
}
