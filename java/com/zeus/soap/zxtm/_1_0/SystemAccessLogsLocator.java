/**
 * SystemAccessLogsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemAccessLogsLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemAccessLogs {

/**
 * The AccessLogs interfaces provide operations on saved virtual server
 * access logs for a Stingray Appliance.  This interface is only available
 * on a Stingray Appliance and is deprecated; use the System.RequestLogs
 * interface instead.
 */

    public SystemAccessLogsLocator() {
    }


    public SystemAccessLogsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemAccessLogsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemAccessLogsPort
    private java.lang.String SystemAccessLogsPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemAccessLogsPortAddress() {
        return SystemAccessLogsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemAccessLogsPortWSDDServiceName = "System.AccessLogsPort";

    public java.lang.String getSystemAccessLogsPortWSDDServiceName() {
        return SystemAccessLogsPortWSDDServiceName;
    }

    public void setSystemAccessLogsPortWSDDServiceName(java.lang.String name) {
        SystemAccessLogsPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemAccessLogsPort getSystemAccessLogsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemAccessLogsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemAccessLogsPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemAccessLogsPort getSystemAccessLogsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemAccessLogsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemAccessLogsBindingStub(portAddress, this);
            _stub.setPortName(getSystemAccessLogsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemAccessLogsPortEndpointAddress(java.lang.String address) {
        SystemAccessLogsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemAccessLogsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemAccessLogsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemAccessLogsBindingStub(new java.net.URL(SystemAccessLogsPort_address), this);
                _stub.setPortName(getSystemAccessLogsPortWSDDServiceName());
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
        if ("System.AccessLogsPort".equals(inputPortName)) {
            return getSystemAccessLogsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.AccessLogs");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.AccessLogsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemAccessLogsPort".equals(portName)) {
            setSystemAccessLogsPortEndpointAddress(address);
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
