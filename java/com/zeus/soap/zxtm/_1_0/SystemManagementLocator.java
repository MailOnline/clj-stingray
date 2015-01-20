/**
 * SystemManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemManagementLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemManagement {

/**
 * The System.Management interface provides methods to manage the
 * traffic manager and the system, such as restarting the software.
 */

    public SystemManagementLocator() {
    }


    public SystemManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemManagementPort
    private java.lang.String SystemManagementPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemManagementPortAddress() {
        return SystemManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemManagementPortWSDDServiceName = "System.ManagementPort";

    public java.lang.String getSystemManagementPortWSDDServiceName() {
        return SystemManagementPortWSDDServiceName;
    }

    public void setSystemManagementPortWSDDServiceName(java.lang.String name) {
        SystemManagementPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemManagementPort getSystemManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemManagementPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemManagementPort getSystemManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemManagementBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemManagementBindingStub(portAddress, this);
            _stub.setPortName(getSystemManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemManagementPortEndpointAddress(java.lang.String address) {
        SystemManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemManagementPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemManagementBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemManagementBindingStub(new java.net.URL(SystemManagementPort_address), this);
                _stub.setPortName(getSystemManagementPortWSDDServiceName());
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
        if ("System.ManagementPort".equals(inputPortName)) {
            return getSystemManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Management");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.ManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemManagementPort".equals(portName)) {
            setSystemManagementPortEndpointAddress(address);
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
