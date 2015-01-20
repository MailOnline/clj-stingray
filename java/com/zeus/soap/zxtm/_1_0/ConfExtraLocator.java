/**
 * ConfExtraLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class ConfExtraLocator extends org.apache.axis.client.Service implements com.zeus.soap.zxtm._1_0.ConfExtra {

/**
 * The Conf.Extra interface allows management of the files stored
 * in the conf/extra directory. These files can be read in by rules,
 * and used as error pages to be sent to clients. This interface allows
 * creating, deleting and retrieving the files.
 */

    public ConfExtraLocator() {
    }


    public ConfExtraLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConfExtraLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConfExtraPort
    private java.lang.String ConfExtraPort_address = "https://admin_server:9090/soap";

    public java.lang.String getConfExtraPortAddress() {
        return ConfExtraPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConfExtraPortWSDDServiceName = "Conf.ExtraPort";

    public java.lang.String getConfExtraPortWSDDServiceName() {
        return ConfExtraPortWSDDServiceName;
    }

    public void setConfExtraPortWSDDServiceName(java.lang.String name) {
        ConfExtraPortWSDDServiceName = name;
    }

    public com.zeus.soap.zxtm._1_0.ConfExtraPort getConfExtraPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConfExtraPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConfExtraPort(endpoint);
    }

    public com.zeus.soap.zxtm._1_0.ConfExtraPort getConfExtraPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.zeus.soap.zxtm._1_0.ConfExtraBindingStub _stub = new com.zeus.soap.zxtm._1_0.ConfExtraBindingStub(portAddress, this);
            _stub.setPortName(getConfExtraPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConfExtraPortEndpointAddress(java.lang.String address) {
        ConfExtraPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.zeus.soap.zxtm._1_0.ConfExtraPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.zeus.soap.zxtm._1_0.ConfExtraBindingStub _stub = new com.zeus.soap.zxtm._1_0.ConfExtraBindingStub(new java.net.URL(ConfExtraPort_address), this);
                _stub.setPortName(getConfExtraPortWSDDServiceName());
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
        if ("Conf.ExtraPort".equals(inputPortName)) {
            return getConfExtraPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Conf.Extra");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Conf.ExtraPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConfExtraPort".equals(portName)) {
            setConfExtraPortEndpointAddress(address);
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
