/**
 * AFMLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AFMLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.AFM {

/**
 * The AFM interface allows management of the Stingray Application
 * Firewall.
 */

    public AFMLocator() {
    }


    public AFMLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AFMLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AFMPort
    private java.lang.String AFMPort_address = "https://admin_server:9090/soap";

    public java.lang.String getAFMPortAddress() {
        return AFMPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AFMPortWSDDServiceName = "AFMPort";

    public java.lang.String getAFMPortWSDDServiceName() {
        return AFMPortWSDDServiceName;
    }

    public void setAFMPortWSDDServiceName(java.lang.String name) {
        AFMPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.AFMPort getAFMPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AFMPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAFMPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.AFMPort getAFMPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.AFMBindingStub _stub = new com.zeus.soap.zxtm._1_0.AFMBindingStub(portAddress, this);
            _stub.setPortName(getAFMPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAFMPortEndpointAddress(java.lang.String address) {
        AFMPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.AFMPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.AFMBindingStub _stub = new com.zeus.soap.zxtm._1_0.AFMBindingStub(new java.net.URL(AFMPort_address), this);
                _stub.setPortName(getAFMPortWSDDServiceName());
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
        if ("AFMPort".equals(inputPortName)) {
            return getAFMPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFMPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AFMPort".equals(portName)) {
            setAFMPortEndpointAddress(address);
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
