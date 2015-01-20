/**
 * SystemLogPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemLogPort extends java.rmi.Remote {

    /**
     * Clear the error log for this machine.
     */
    public void clearErrorLog() throws java.rmi.RemoteException;

    /**
     * Get a list of the most recent elements of the audit log for
     * this machine.
     */
    public com.zeus.soap.zxtm._1_0.SystemLogAuditItem[] getAuditLog() throws java.rmi.RemoteException;

    /**
     * Get a maximum of max_lines lines of the audit log for this
     * machine.
     */
    public com.zeus.soap.zxtm._1_0.SystemLogAuditItem[] getAuditLogLines(int max_lines) throws java.rmi.RemoteException;

    /**
     * Get a maximum of max_lines lines of the error log for this
     * machine as a string, if max_lines is 0 then 1024 lines are returned.
     */
    public java.lang.String getErrorLogLines(int max_lines) throws java.rmi.RemoteException;

    /**
     * Get the error log for this machine as a string.
     */
    public java.lang.String getErrorLogString() throws java.rmi.RemoteException;
}
