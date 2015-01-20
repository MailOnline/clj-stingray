/**
 * SystemStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemStats extends javax.xml.rpc.Service {

/**
 * The System.Stats interface retrieves statistical information about
 * the system. Note: This interface is essentially a SOAP implementation
 * of part of the SNMP interface.  If you experience any performance
 * issues using this interface, it is recommended trying SNMP directly.
 */
    public java.lang.String getSystemStatsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemStatsPort getSystemStatsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemStatsPort getSystemStatsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
