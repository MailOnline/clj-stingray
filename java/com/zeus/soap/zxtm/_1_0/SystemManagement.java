/**
 * SystemManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemManagement extends javax.xml.rpc.Service {

/**
 * The System.Management interface provides methods to manage the
 * traffic manager and the system, such as restarting the software.
 */
    public java.lang.String getSystemManagementPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemManagementPort getSystemManagementPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemManagementPort getSystemManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
