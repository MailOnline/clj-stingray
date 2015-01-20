/**
 * SystemLicenseKeys.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemLicenseKeys extends javax.xml.rpc.Service {

/**
 * The System.LicenseKeys interface provides license key information
 * for this machine. 
 *                                         Using this interface, you
 * can add and delete license keys, and retrieve both the 
 *                                         license key currently in use
 * and a list of all existing license keys.
 */
    public java.lang.String getSystemLicenseKeysPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemLicenseKeysPort getSystemLicenseKeysPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemLicenseKeysPort getSystemLicenseKeysPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
