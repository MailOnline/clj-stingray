/**
 * SystemSteelhead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemSteelhead extends javax.xml.rpc.Service {

/**
 * The System.Steelhead interface manages Riverbed Discovery Agent
 * settings.
 */
    public java.lang.String getSystemSteelheadPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemSteelheadPort getSystemSteelheadPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemSteelheadPort getSystemSteelheadPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
