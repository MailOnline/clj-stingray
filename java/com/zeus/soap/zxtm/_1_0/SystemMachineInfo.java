/**
 * SystemMachineInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemMachineInfo extends javax.xml.rpc.Service {

/**
 * The System.MachineInfo interface provides information about the
 * IP addresses,
 *                                           MAC addresses and traffic
 * manager software version for this machine.
 */
    public java.lang.String getSystemMachineInfoPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemMachineInfoPort getSystemMachineInfoPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemMachineInfoPort getSystemMachineInfoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
