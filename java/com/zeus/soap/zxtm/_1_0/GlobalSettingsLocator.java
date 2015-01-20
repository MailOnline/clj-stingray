/**
 * GlobalSettingsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GlobalSettingsLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.GlobalSettings {

/**
 * The Global Settings interface allows management of the traffic
 * manager settings.
 */

    public GlobalSettingsLocator() {
    }


    public GlobalSettingsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalSettingsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalSettingsPort
    private java.lang.String GlobalSettingsPort_address = "https://admin_server:9090/soap";

    public java.lang.String getGlobalSettingsPortAddress() {
        return GlobalSettingsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalSettingsPortWSDDServiceName = "GlobalSettingsPort";

    public java.lang.String getGlobalSettingsPortWSDDServiceName() {
        return GlobalSettingsPortWSDDServiceName;
    }

    public void setGlobalSettingsPortWSDDServiceName(java.lang.String name) {
        GlobalSettingsPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.GlobalSettingsPort getGlobalSettingsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalSettingsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalSettingsPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.GlobalSettingsPort getGlobalSettingsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.GlobalSettingsBindingStub _stub = new com.zeus.soap.zxtm._1_0.GlobalSettingsBindingStub(portAddress, this);
            _stub.setPortName(getGlobalSettingsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalSettingsPortEndpointAddress(java.lang.String address) {
        GlobalSettingsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.GlobalSettingsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.GlobalSettingsBindingStub _stub = new com.zeus.soap.zxtm._1_0.GlobalSettingsBindingStub(new java.net.URL(GlobalSettingsPort_address), this);
                _stub.setPortName(getGlobalSettingsPortWSDDServiceName());
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
        if ("GlobalSettingsPort".equals(inputPortName)) {
            return getGlobalSettingsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettings");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettingsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalSettingsPort".equals(portName)) {
            setGlobalSettingsPortEndpointAddress(address);
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
