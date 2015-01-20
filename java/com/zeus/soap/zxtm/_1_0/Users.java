/**
 * Users.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface Users extends javax.xml.rpc.Service {

/**
 * The Users interface allows management of users of Stingray Traffic
 * Manager. Using this interface, you can create and delete users, assign
 * them to permission groups and manage their configuration.
 */
    public java.lang.String getUsersPortAddress();

    public com.zeus.soap.zxtm._1_0.UsersPort getUsersPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.UsersPort getUsersPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
