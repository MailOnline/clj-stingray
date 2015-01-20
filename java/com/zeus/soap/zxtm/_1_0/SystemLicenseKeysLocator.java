/**
 * SystemLicenseKeysLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemLicenseKeysLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemLicenseKeys {

/**
 * The System.LicenseKeys interface provides license key information
 * for this machine. 
 *                                         Using this interface, you
 * can add and delete license keys, and retrieve both the 
 *                                         license key currently in use
 * and a list of all existing license keys.
 */

    public SystemLicenseKeysLocator() {
    }


    public SystemLicenseKeysLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemLicenseKeysLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemLicenseKeysPort
    private java.lang.String SystemLicenseKeysPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemLicenseKeysPortAddress() {
        return SystemLicenseKeysPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemLicenseKeysPortWSDDServiceName = "System.LicenseKeysPort";

    public java.lang.String getSystemLicenseKeysPortWSDDServiceName() {
        return SystemLicenseKeysPortWSDDServiceName;
    }

    public void setSystemLicenseKeysPortWSDDServiceName(java.lang.String name) {
        SystemLicenseKeysPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemLicenseKeysPort getSystemLicenseKeysPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemLicenseKeysPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemLicenseKeysPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemLicenseKeysPort getSystemLicenseKeysPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemLicenseKeysBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemLicenseKeysBindingStub(portAddress, this);
            _stub.setPortName(getSystemLicenseKeysPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemLicenseKeysPortEndpointAddress(java.lang.String address) {
        SystemLicenseKeysPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemLicenseKeysPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemLicenseKeysBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemLicenseKeysBindingStub(new java.net.URL(SystemLicenseKeysPort_address), this);
                _stub.setPortName(getSystemLicenseKeysPortWSDDServiceName());
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
        if ("System.LicenseKeysPort".equals(inputPortName)) {
            return getSystemLicenseKeysPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.LicenseKeys");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.LicenseKeysPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemLicenseKeysPort".equals(portName)) {
            setSystemLicenseKeysPortEndpointAddress(address);
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
