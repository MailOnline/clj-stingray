/**
 * SystemAccessLogs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemAccessLogs extends javax.xml.rpc.Service {

/**
 * The AccessLogs interfaces provide operations on saved virtual server
 * access logs for a Stingray Appliance.  This interface is only available
 * on a Stingray Appliance and is deprecated; use the System.RequestLogs
 * interface instead.
 */
    public java.lang.String getSystemAccessLogsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemAccessLogsPort getSystemAccessLogsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemAccessLogsPort getSystemAccessLogsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
