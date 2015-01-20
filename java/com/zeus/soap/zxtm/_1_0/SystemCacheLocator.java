/**
 * SystemCacheLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemCacheLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemCache {

/**
 * The System.Cache interface provides information about the content
 * cache for a machine. 
 *                                         Using this interface, you
 * can retrieve both individual cache entries and global cache
 *                                         data for a machine and delete
 * all entries in the cache.
 */

    public SystemCacheLocator() {
    }


    public SystemCacheLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemCacheLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemCachePort
    private java.lang.String SystemCachePort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemCachePortAddress() {
        return SystemCachePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemCachePortWSDDServiceName = "System.CachePort";

    public java.lang.String getSystemCachePortWSDDServiceName() {
        return SystemCachePortWSDDServiceName;
    }

    public void setSystemCachePortWSDDServiceName(java.lang.String name) {
        SystemCachePortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemCachePort getSystemCachePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemCachePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemCachePort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemCachePort getSystemCachePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemCacheBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemCacheBindingStub(portAddress, this);
            _stub.setPortName(getSystemCachePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemCachePortEndpointAddress(java.lang.String address) {
        SystemCachePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemCachePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemCacheBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemCacheBindingStub(new java.net.URL(SystemCachePort_address), this);
                _stub.setPortName(getSystemCachePortWSDDServiceName());
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
        if ("System.CachePort".equals(inputPortName)) {
            return getSystemCachePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Cache");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.CachePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemCachePort".equals(portName)) {
            setSystemCachePortEndpointAddress(address);
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
