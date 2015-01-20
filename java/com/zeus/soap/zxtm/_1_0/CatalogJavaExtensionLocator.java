/**
 * CatalogJavaExtensionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogJavaExtensionLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.CatalogJavaExtension {

/**
 * The Catalog.JavaExtension interface allows management of Java Extensions.
 * Using this interface you can retrieve information on each extension
 * in the system, and set the initialisation properties to alter their
 * behaviour.
 */

    public CatalogJavaExtensionLocator() {
    }


    public CatalogJavaExtensionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogJavaExtensionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CatalogJavaExtensionPort
    private java.lang.String CatalogJavaExtensionPort_address = "https://admin_server:9090/soap";

    public java.lang.String getCatalogJavaExtensionPortAddress() {
        return CatalogJavaExtensionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CatalogJavaExtensionPortWSDDServiceName = "Catalog.JavaExtensionPort";

    public java.lang.String getCatalogJavaExtensionPortWSDDServiceName() {
        return CatalogJavaExtensionPortWSDDServiceName;
    }

    public void setCatalogJavaExtensionPortWSDDServiceName(java.lang.String name) {
        CatalogJavaExtensionPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionPort getCatalogJavaExtensionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CatalogJavaExtensionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCatalogJavaExtensionPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionPort getCatalogJavaExtensionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.CatalogJavaExtensionBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogJavaExtensionBindingStub(portAddress, this);
            _stub.setPortName(getCatalogJavaExtensionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCatalogJavaExtensionPortEndpointAddress(java.lang.String address) {
        CatalogJavaExtensionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.CatalogJavaExtensionPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.CatalogJavaExtensionBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogJavaExtensionBindingStub(new java.net.URL(CatalogJavaExtensionPort_address), this);
                _stub.setPortName(getCatalogJavaExtensionPortWSDDServiceName());
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
        if ("Catalog.JavaExtensionPort".equals(inputPortName)) {
            return getCatalogJavaExtensionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.JavaExtension");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.JavaExtensionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CatalogJavaExtensionPort".equals(portName)) {
            setCatalogJavaExtensionPortEndpointAddress(address);
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
