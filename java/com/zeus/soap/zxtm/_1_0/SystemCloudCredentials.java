/**
 * SystemCloudCredentials.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemCloudCredentials extends javax.xml.rpc.Service {

/**
 * The System.CloudCredentials interface allows management of Cloud
 * Credentials. Using this interface, you can create, delete and rename
 * sets of cloud credentials, and manage their configuration.
 */
    public java.lang.String getSystemCloudCredentialsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemCloudCredentialsPort getSystemCloudCredentialsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemCloudCredentialsPort getSystemCloudCredentialsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
