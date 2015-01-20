/**
 * SystemCloudCredentialsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemCloudCredentialsLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemCloudCredentials {

/**
 * The System.CloudCredentials interface allows management of Cloud
 * Credentials. Using this interface, you can create, delete and rename
 * sets of cloud credentials, and manage their configuration.
 */

    public SystemCloudCredentialsLocator() {
    }


    public SystemCloudCredentialsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemCloudCredentialsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemCloudCredentialsPort
    private java.lang.String SystemCloudCredentialsPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemCloudCredentialsPortAddress() {
        return SystemCloudCredentialsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemCloudCredentialsPortWSDDServiceName = "System.CloudCredentialsPort";

    public java.lang.String getSystemCloudCredentialsPortWSDDServiceName() {
        return SystemCloudCredentialsPortWSDDServiceName;
    }

    public void setSystemCloudCredentialsPortWSDDServiceName(java.lang.String name) {
        SystemCloudCredentialsPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemCloudCredentialsPort getSystemCloudCredentialsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemCloudCredentialsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemCloudCredentialsPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemCloudCredentialsPort getSystemCloudCredentialsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemCloudCredentialsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemCloudCredentialsBindingStub(portAddress, this);
            _stub.setPortName(getSystemCloudCredentialsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemCloudCredentialsPortEndpointAddress(java.lang.String address) {
        SystemCloudCredentialsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemCloudCredentialsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemCloudCredentialsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemCloudCredentialsBindingStub(new java.net.URL(SystemCloudCredentialsPort_address), this);
                _stub.setPortName(getSystemCloudCredentialsPortWSDDServiceName());
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
        if ("System.CloudCredentialsPort".equals(inputPortName)) {
            return getSystemCloudCredentialsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.CloudCredentials");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.CloudCredentialsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemCloudCredentialsPort".equals(portName)) {
            setSystemCloudCredentialsPortEndpointAddress(address);
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
