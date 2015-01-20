/**
 * SystemBackups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemBackups extends javax.xml.rpc.Service {

/**
 * The Backups interfaces provide operations on saved configuration
 * backup archives.
 */
    public java.lang.String getSystemBackupsPortAddress();

    public com.zeus.soap.zxtm._1_0.SystemBackupsPort getSystemBackupsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemBackupsPort getSystemBackupsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
