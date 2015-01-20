/**
 * SystemRequestLogsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemRequestLogsPort extends java.rmi.Remote {

    /**
     * Delete all the request logs for all virtual servers.
     */
    public void deleteAllVSRequestLogs() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Delete the specified request logs.
     */
    public void deleteVSRequestLog(java.lang.String[] logfiles) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Delete the request logs for specific virtual servers.
     */
    public void deleteVSRequestLogs(java.lang.String[] vservers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the request logs for all virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.SystemRequestLogsVSRequestLog[] getAllVSRequestLogs() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the request logs for specific virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.SystemRequestLogsVSRequestLog[][] getVSRequestLogs(java.lang.String[] vservers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;
}
