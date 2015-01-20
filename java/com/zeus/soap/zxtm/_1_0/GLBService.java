/**
 * GLBService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface GLBService extends javax.xml.rpc.Service {

/**
 * The GLB.Service interface allows management of Global Load Balancing
 * Services. Using this interface, you can create, delete and rename
 * pool objects, and manage their configuration.
 */
    public java.lang.String getGLBServicePortAddress();

    public com.zeus.soap.zxtm._1_0.GLBServicePort getGLBServicePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.GLBServicePort getGLBServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
