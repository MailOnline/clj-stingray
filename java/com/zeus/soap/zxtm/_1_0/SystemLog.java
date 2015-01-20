/**
 * SystemLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemLog extends javax.xml.rpc.Service {

/**
 * The System.Log interface provides audit log and error log information
 * for this machine. Using this
 *             interface, you can retrieve the error log as a string,
 * get a list of individual entries in the audit
 *             log and clear the error log.
 */
    public java.lang.String getSystemLogPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemLogPort getSystemLogPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemLogPort getSystemLogPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
