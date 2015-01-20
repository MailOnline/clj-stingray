/**
 * AlertCallbackPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AlertCallbackPort extends java.rmi.Remote {

    /**
     * This function is used by the traffic manager to report an event
     * using a SOAP call. You can easily identify the event being reported
     * using the primary_tag field, which is the event's unique identifier.
     * The tags array is reserved for future use, and will be empty.
     */
    public void eventOccurred(java.lang.String zxtm, java.util.Calendar time, com.zeus.soap.zxtm._1_0.AlertCallbackSeverity severity, com.zeus.soap.zxtm._1_0.AlertCallbackTag primary_tag, com.zeus.soap.zxtm._1_0.AlertCallbackTag[] tags, com.zeus.soap.zxtm._1_0.AlertCallbackObject[] objects, java.lang.String description, java.lang.String additional, java.lang.String event_type) throws java.rmi.RemoteException;
}
