/**
 * AlertCallback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AlertCallback extends javax.xml.rpc.Service {

/**
 * AlertCallback is a callback interface that can be implemented on
 * a separate server to receive events via SOAP from the traffic manager.
 * This interface is not implemented by traffic manager itself.
 */
    public java.lang.String getAlertCallbackPortAddress();

    public com.zeus.soap.zxtm._1_0.AlertCallbackPort getAlertCallbackPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.AlertCallbackPort getAlertCallbackPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
