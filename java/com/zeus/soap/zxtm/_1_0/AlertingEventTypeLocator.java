/**
 * AlertingEventTypeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AlertingEventTypeLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.AlertingEventType {

/**
 * Alerting.EventType is an interface that allows you to manage event
 * types.  Event
 *          Types are groups of events and are associated with a list
 * of actions that are
 *          invoked when one of the events in the Event Type is triggered.
 */

    public AlertingEventTypeLocator() {
    }


    public AlertingEventTypeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AlertingEventTypeLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AlertingEventTypePort
    private java.lang.String AlertingEventTypePort_address = "https://admin_server:9090/soap";

    public java.lang.String getAlertingEventTypePortAddress() {
        return AlertingEventTypePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AlertingEventTypePortWSDDServiceName = "Alerting.EventTypePort";

    public java.lang.String getAlertingEventTypePortWSDDServiceName() {
        return AlertingEventTypePortWSDDServiceName;
    }

    public void setAlertingEventTypePortWSDDServiceName(java.lang.String name) {
        AlertingEventTypePortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.AlertingEventTypePort getAlertingEventTypePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AlertingEventTypePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAlertingEventTypePort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.AlertingEventTypePort getAlertingEventTypePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.AlertingEventTypeBindingStub _stub = new com.zeus.soap.zxtm._1_0.AlertingEventTypeBindingStub(portAddress, this);
            _stub.setPortName(getAlertingEventTypePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAlertingEventTypePortEndpointAddress(java.lang.String address) {
        AlertingEventTypePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.AlertingEventTypePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.AlertingEventTypeBindingStub _stub = new com.zeus.soap.zxtm._1_0.AlertingEventTypeBindingStub(new java.net.URL(AlertingEventTypePort_address), this);
                _stub.setPortName(getAlertingEventTypePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Alerting.EventTypePort".equals(inputPortName)) {
            return getAlertingEventTypePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Alerting.EventType");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Alerting.EventTypePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AlertingEventTypePort".equals(portName)) {
            setAlertingEventTypePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
