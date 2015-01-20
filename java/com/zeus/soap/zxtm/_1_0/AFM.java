/**
 * AFM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AFM extends javax.xml.rpc.Service {

/**
 * The AFM interface allows management of the Stingray Application
 * Firewall.
 */
    public java.lang.String getAFMPortAddress();

    public com.zeus.soap.zxtm._1_0.AFMPort getAFMPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.AFMPort getAFMPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
