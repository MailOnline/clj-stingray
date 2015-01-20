/**
 * SystemMachineInfoPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemMachineInfoPort extends java.rmi.Remote {

    /**
     * Gets all of the machines in this traffic manager's cluster.
     */
    public com.zeus.soap.zxtm._1_0.SystemMachineInfoMachine[] getAllClusterMachines() throws java.rmi.RemoteException;

    /**
     * Get a list of IP addresses for this machine.
     */
    public java.lang.String[] getIPAddresses() throws java.rmi.RemoteException;

    /**
     * Get a list of MAC addresses for this machine.
     */
    public java.lang.String[] getMACAddresses() throws java.rmi.RemoteException;

    /**
     * Get the traffic manager software version for this machine.
     */
    public java.lang.String getProductVersion() throws java.rmi.RemoteException;

    /**
     * Get the Stingray Operating System version for this appliance.
     */
    public java.lang.String getStingrayOSVersion() throws java.rmi.RemoteException;

    /**
     * Get the time (in seconds) that the traffic manager has been
     * running for.
     */
    public org.apache.axis.types.UnsignedInt getTrafficManagerUptime() throws java.rmi.RemoteException;

    /**
     * Get the install location of the traffic manager software (ZEUSHOME).
     */
    public java.lang.String getZeusHome() throws java.rmi.RemoteException;

    /**
     * Check whether IPv6 is enabled on this system and supported
     * by the traffic manager
     */
    public boolean isIPv6Enabled() throws java.rmi.RemoteException;
}
