/**
 * SystemManagementPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemManagementPort extends java.rmi.Remote {

    /**
     * Perform a system reboot.
     */
    public void rebootSystem() throws java.rmi.RemoteException;

    /**
     * Restart the Stingray Application Firewall on all machines.
     * Any connections currently using Stingray Application Firewall will
     * be aborted.
     */
    public void restartAFM() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Restart the Java Extension support. Any connections currently
     * using a Java Extension will be aborted.
     */
    public void restartJava() throws java.rmi.RemoteException;

    /**
     * Restarts the traffic manager software. Any connections currently
     * being handled will be aborted.
     */
    public void restartTrafficManager() throws java.rmi.RemoteException;

    /**
     * Perform a system shutdown.
     */
    public void shutdownSystem() throws java.rmi.RemoteException;
}
