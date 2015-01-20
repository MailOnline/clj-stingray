/**
 * SystemStatsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemStatsLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.SystemStats {

/**
 * The System.Stats interface retrieves statistical information about
 * the system. Note: This interface is essentially a SOAP implementation
 * of part of the SNMP interface.  If you experience any performance
 * issues using this interface, it is recommended trying SNMP directly.
 */

    public SystemStatsLocator() {
    }


    public SystemStatsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemStatsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemStatsPort
    private java.lang.String SystemStatsPort_address = "https://admin_server:9090/soap";

    public java.lang.String getSystemStatsPortAddress() {
        return SystemStatsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemStatsPortWSDDServiceName = "System.StatsPort";

    public java.lang.String getSystemStatsPortWSDDServiceName() {
        return SystemStatsPortWSDDServiceName;
    }

    public void setSystemStatsPortWSDDServiceName(java.lang.String name) {
        SystemStatsPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.SystemStatsPort getSystemStatsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemStatsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemStatsPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.SystemStatsPort getSystemStatsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.SystemStatsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemStatsBindingStub(portAddress, this);
            _stub.setPortName(getSystemStatsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemStatsPortEndpointAddress(java.lang.String address) {
        SystemStatsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.SystemStatsPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.SystemStatsBindingStub _stub = new com.zeus.soap.zxtm._1_0.SystemStatsBindingStub(new java.net.URL(SystemStatsPort_address), this);
                _stub.setPortName(getSystemStatsPortWSDDServiceName());
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
        if ("System.StatsPort".equals(inputPortName)) {
            return getSystemStatsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.StatsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemStatsPort".equals(portName)) {
            setSystemStatsPortEndpointAddress(address);
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
