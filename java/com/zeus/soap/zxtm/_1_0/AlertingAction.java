/**
 * AlertingAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AlertingAction extends javax.xml.rpc.Service {

/**
 * Alerting.Action is an interface that allows you to add actions
 * that are run by event types.
 */
    public java.lang.String getAlertingActionPortAddress();

    public com.zeus.soap.zxtm._1_0.AlertingActionPort getAlertingActionPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.AlertingActionPort getAlertingActionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
