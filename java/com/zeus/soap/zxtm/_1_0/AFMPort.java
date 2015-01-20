/**
 * AFMPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AFMPort extends java.rmi.Remote {

    /**
     * Disables the Stingray Application Firewall on the traffic manager.
     */
    public void disable() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Enables the Stingray Application Firewall on the traffic manager.
     */
    public void enable() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall XML Master port, this port is
     * used on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getAdminMasterPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall Administration server port, this
     * port is only open on localhost.  For a change to this setting to take
     * effect the Stingray administration server must be restarted on all
     * cluster members.
     */
    public org.apache.axis.types.UnsignedInt getAdminServerPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall XML Slave port, this port is used
     * on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getAdminSlavePort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get state data for the Stingray Application Firewall across
     * all machines in the cluster.
     */
    public com.zeus.soap.zxtm._1_0.AFMState[] getClusterState() throws java.rmi.RemoteException;

    /**
     * Get the Application Firewall base decider port.  This port,
     * plus one port per decider process above this port, will be used for
     * the Application Firewall deciders. For example, if set to 8100 then
     * ports 8100, 8101, and 8102 will be used.
     */
    public org.apache.axis.types.UnsignedInt getDeciderBasePort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall internal decider communication
     * base port. The Application Firewall requires ports for internal communication,
     * these ports are bound to localhost (127.0.0.1) only.  This sets the
     * base for these communication ports, when the Application Firewall
     * is started it will start at this port and work its way up taking available
     * ports until it has enough ports.
     */
    public org.apache.axis.types.UnsignedInt getInternalDeciderBasePort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the number of Application Firewall decider processes to
     * run.
     */
    public org.apache.axis.types.UnsignedInt getNumberOfDeciders() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall Updater External Control Center
     * port, this port is used on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getUpdateExternControlCenterPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall Updater GUI Backend port, this
     * port is used on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getUpdateGUIBackendPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall Updater GUI Server port, this
     * port is used on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getUpdateGUIServerPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the Application Firewall Updater Slave port, this port
     * is used on all IP addresses.
     */
    public org.apache.axis.types.UnsignedInt getUpdaterPort() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the version of the Stingray Application Firewall installed
     * on the traffic manager.  Returns an empty string if Stingray Application
     * Firewall is not installed.
     */
    public java.lang.String getVersion() throws java.rmi.RemoteException;

    /**
     * Set the Application Firewall XML Master port, this port is
     * used on all IP addresses.
     */
    public void setAdminMasterPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall Administration server port, this
     * port is only open on localhost.  For a change to this setting to take
     * effect the Stingray administration server must be restarted on all
     * cluster members.
     */
    public void setAdminServerPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall XML Slave port, this port is used
     * on all IP addresses.
     */
    public void setAdminSlavePort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall base decider port.  This port,
     * plus one port per decider process above this port, will be used for
     * the Application Firewall deciders. For example, if set to 8100 then
     * ports 8100, 8101, and 8102 will be used.
     */
    public void setDeciderBasePort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall internal decider communication
     * base port. The Application Firewall requires ports for internal communication,
     * these ports are bound to localhost (127.0.0.1) only.  This sets the
     * base for these communication ports, when the Application Firewall
     * is started it will start at this port and work its way up taking available
     * ports until it has enough ports.
     */
    public void setInternalDeciderBasePort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the number of Application Firewall decider processes to
     * run.
     */
    public void setNumberOfDeciders(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall Updater External Control Center
     * port, this port is used on all IP addresses.
     */
    public void setUpdateExternControlCenterPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall Updater GUI Backend port, this
     * port is used on all IP addresses.
     */
    public void setUpdateGUIBackendPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall Updater GUI Server port, this
     * port is used on all IP addresses.
     */
    public void setUpdateGUIServerPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Set the Application Firewall Updater Slave port, this port
     * is used on all IP addresses.
     */
    public void setUpdaterPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Uninstalls the Stingray Application Firewall on the traffic
     * manager.
     */
    public void uninstall() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation;
}
