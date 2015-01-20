/**
 * Diagnose.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface Diagnose extends javax.xml.rpc.Service {

/**
 * The Diagnose interface provides information about errors and problems
 * in the system.
 */
    public java.lang.String getDiagnosePortAddress();

    public com.zeus.soap.zxtm._1_0.DiagnosePort getDiagnosePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.DiagnosePort getDiagnosePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
