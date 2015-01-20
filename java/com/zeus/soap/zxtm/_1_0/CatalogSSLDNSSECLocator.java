/**
 * CatalogSSLDNSSECLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogSSLDNSSECLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.CatalogSSLDNSSEC {

/**
 * The Catalog.SSL.DNSSEC interface allows management of the DNSSEC
 * private keys used to alter signed GLB DNS responses.
 */

    public CatalogSSLDNSSECLocator() {
    }


    public CatalogSSLDNSSECLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogSSLDNSSECLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CatalogSSLDNSSECPort
    private java.lang.String CatalogSSLDNSSECPort_address = "https://admin_server:9090/soap";

    public java.lang.String getCatalogSSLDNSSECPortAddress() {
        return CatalogSSLDNSSECPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CatalogSSLDNSSECPortWSDDServiceName = "Catalog.SSL.DNSSECPort";

    public java.lang.String getCatalogSSLDNSSECPortWSDDServiceName() {
        return CatalogSSLDNSSECPortWSDDServiceName;
    }

    public void setCatalogSSLDNSSECPortWSDDServiceName(java.lang.String name) {
        CatalogSSLDNSSECPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECPort getCatalogSSLDNSSECPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CatalogSSLDNSSECPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCatalogSSLDNSSECPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECPort getCatalogSSLDNSSECPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECBindingStub(portAddress, this);
            _stub.setPortName(getCatalogSSLDNSSECPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCatalogSSLDNSSECPortEndpointAddress(java.lang.String address) {
        CatalogSSLDNSSECPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogSSLDNSSECBindingStub(new java.net.URL(CatalogSSLDNSSECPort_address), this);
                _stub.setPortName(getCatalogSSLDNSSECPortWSDDServiceName());
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
        if ("Catalog.SSL.DNSSECPort".equals(inputPortName)) {
            return getCatalogSSLDNSSECPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.DNSSEC");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.DNSSECPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CatalogSSLDNSSECPort".equals(portName)) {
            setCatalogSSLDNSSECPortEndpointAddress(address);
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
