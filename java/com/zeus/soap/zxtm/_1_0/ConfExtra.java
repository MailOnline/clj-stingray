/**
 * ConfExtra.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface ConfExtra extends javax.xml.rpc.Service {

/**
 * The Conf.Extra interface allows management of the files stored
 * in the conf/extra directory. These files can be read in by rules,
 * and used as error pages to be sent to clients. This interface allows
 * creating, deleting and retrieving the files.
 */
    public java.lang.String getConfExtraPortAddress();

    public com.zeus.soap.zxtm._1_0.ConfExtraPort getConfExtraPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.ConfExtraPort getConfExtraPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
