/**
 * AlertingEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AlertingEventType extends javax.xml.rpc.Service {

/**
 * Alerting.EventType is an interface that allows you to manage event
 * types.  Event
 *          Types are groups of events and are associated with a list
 * of actions that are
 *          invoked when one of the events in the Event Type is triggered.
 */
    public java.lang.String getAlertingEventTypePortAddress();

    public com.zeus.soap.zxtm._1_0.AlertingEventTypePort getAlertingEventTypePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.AlertingEventTypePort getAlertingEventTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
