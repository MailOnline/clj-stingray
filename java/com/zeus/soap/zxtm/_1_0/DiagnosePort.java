/**
 * DiagnosePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface DiagnosePort extends java.rmi.Remote {

    /**
     * Provides diagnostic information about the system. Only errors
     * with severity higher than or equal to the specified severity will
     * be reported.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseErrorInfo diagnoseSystem(com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity) throws java.rmi.RemoteException;
}
