/**
 * DiagnoseLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class DiagnoseLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.Diagnose {

/**
 * The Diagnose interface provides information about errors and problems
 * in the system.
 */

    public DiagnoseLocator() {
    }


    public DiagnoseLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DiagnoseLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DiagnosePort
    private java.lang.String DiagnosePort_address = "https://admin_server:9090/soap";

    public java.lang.String getDiagnosePortAddress() {
        return DiagnosePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DiagnosePortWSDDServiceName = "DiagnosePort";

    public java.lang.String getDiagnosePortWSDDServiceName() {
        return DiagnosePortWSDDServiceName;
    }

    public void setDiagnosePortWSDDServiceName(java.lang.String name) {
        DiagnosePortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.DiagnosePort getDiagnosePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DiagnosePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDiagnosePort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.DiagnosePort getDiagnosePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.DiagnoseBindingStub _stub = new com.zeus.soap.zxtm._1_0.DiagnoseBindingStub(portAddress, this);
            _stub.setPortName(getDiagnosePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDiagnosePortEndpointAddress(java.lang.String address) {
        DiagnosePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.DiagnosePort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.DiagnoseBindingStub _stub = new com.zeus.soap.zxtm._1_0.DiagnoseBindingStub(new java.net.URL(DiagnosePort_address), this);
                _stub.setPortName(getDiagnosePortWSDDServiceName());
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
        if ("DiagnosePort".equals(inputPortName)) {
            return getDiagnosePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "DiagnosePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DiagnosePort".equals(portName)) {
            setDiagnosePortEndpointAddress(address);
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
