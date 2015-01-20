/**
 * CatalogMonitorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogMonitorLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.CatalogMonitor {

/**
 * The Catalog.Monitor interface allows management of Custom Monitors.
 * Using this interface, you can create, delete and rename custom monitors,
 * and manage their configuration.
 */

    public CatalogMonitorLocator() {
    }


    public CatalogMonitorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CatalogMonitorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CatalogMonitorPort
    private java.lang.String CatalogMonitorPort_address = "https://admin_server:9090/soap";

    public java.lang.String getCatalogMonitorPortAddress() {
        return CatalogMonitorPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CatalogMonitorPortWSDDServiceName = "Catalog.MonitorPort";

    public java.lang.String getCatalogMonitorPortWSDDServiceName() {
        return CatalogMonitorPortWSDDServiceName;
    }

    public void setCatalogMonitorPortWSDDServiceName(java.lang.String name) {
        CatalogMonitorPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.CatalogMonitorPort getCatalogMonitorPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CatalogMonitorPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCatalogMonitorPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.CatalogMonitorPort getCatalogMonitorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.CatalogMonitorBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogMonitorBindingStub(portAddress, this);
            _stub.setPortName(getCatalogMonitorPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCatalogMonitorPortEndpointAddress(java.lang.String address) {
        CatalogMonitorPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.CatalogMonitorPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.CatalogMonitorBindingStub _stub = new com.zeus.soap.zxtm._1_0.CatalogMonitorBindingStub(new java.net.URL(CatalogMonitorPort_address), this);
                _stub.setPortName(getCatalogMonitorPortWSDDServiceName());
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
        if ("Catalog.MonitorPort".equals(inputPortName)) {
            return getCatalogMonitorPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Monitor");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.MonitorPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CatalogMonitorPort".equals(portName)) {
            setCatalogMonitorPortEndpointAddress(address);
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
