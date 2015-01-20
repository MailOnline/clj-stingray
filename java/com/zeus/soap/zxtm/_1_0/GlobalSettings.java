/**
 * GlobalSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface GlobalSettings extends javax.xml.rpc.Service {

/**
 * The Global Settings interface allows management of the traffic
 * manager settings.
 */
    public java.lang.String getGlobalSettingsPortAddress();

    public com.zeus.soap.zxtm._1_0.GlobalSettingsPort getGlobalSettingsPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.GlobalSettingsPort getGlobalSettingsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
