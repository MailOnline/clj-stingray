/**
 * SystemLogLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemLogLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemLog {

/**
 * The System.Log interface provides audit log and error log information
 * for this machine. Using this
 *             interface, you can retrieve the error log as a string,
 * get a list of individual entries in the audit
 *             log and clear the error log.
 */

    public SystemLogLocator() {
    }


    public SystemLogLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemLogLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemLogPort
    private java.lang.String SystemLogPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemLogPortAddress() {
        return SystemLogPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemLogPortWSDDServiceName = "System.LogPort";

    public java.lang.String getSystemLogPortWSDDServiceName() {
        return SystemLogPortWSDDServiceName;
    }

    public void setSystemLogPortWSDDServiceName(java.lang.String name) {
        SystemLogPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemLogPort getSystemLogPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemLogPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemLogPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemLogPort getSystemLogPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemLogBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemLogBindingStub(portAddress, this);
            _stub.setPortName(getSystemLogPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemLogPortEndpointAddress(java.lang.String address) {
        SystemLogPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemLogPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemLogBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemLogBindingStub(new java.net.URL(SystemLogPort_address), this);
                _stub.setPortName(getSystemLogPortWSDDServiceName());
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
        if ("System.LogPort".equals(inputPortName)) {
            return getSystemLogPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.LogPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemLogPort".equals(portName)) {
            setSystemLogPortEndpointAddress(address);
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
