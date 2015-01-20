/**
 * SystemRequestLogs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemRequestLogs extends javax.xml.rpc.Service {

/**
 * The RequestLogs interfaces provide operations on saved virtual
 * server request logs for a Stingray Appliance.  This interface is only
 * available on a Stingray Appliance.
 */
    public java.lang.String getSystemRequestLogsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemRequestLogsPort getSystemRequestLogsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemRequestLogsPort getSystemRequestLogsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
