/**
 * AlertingActionPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface AlertingActionPort extends java.rmi.Remote {

    /**
     * Add a action that can be run by an event.
     */
    public void addAction(java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionType[] types) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Adds a set of arguments to the specified actions. The actions
     * specified must be of type 'program'.
     */
    public void addScriptArguments(java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionArgument[][] arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Copy each of the named actions.
     */
    public void copyAction(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Deletes each of the named actions.
     */
    public void deleteAction(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Delete the named action programs.
     */
    public void deleteActionProgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Download the named action program.
     */
    public byte[] downloadActionProgram(java.lang.String name) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all available actions.
     */
    public java.lang.String[] getActionNames() throws java.rmi.RemoteException;

    /**
     * Get the names of all actions of the specified type.
     */
    public java.lang.String[] getActionNamesOfType(com.zeus.soap.zxtm._1_0.AlertingActionType type) throws java.rmi.RemoteException;

    /**
     * Get the names of all the uploaded action programs. These are
     * the programs that can be executed by custom program actions.
     */
    public java.lang.String[] getActionProgramNames() throws java.rmi.RemoteException;

    /**
     * Returns the type of each of the named actions.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionType[] getActionType(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the address the alert emails are sent from.
     */
    public java.lang.String[] getEmailRecipients(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the address the alert emails are sent from. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getEmailRecipientsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SMTP server used to send alert emails for the specified
     * actions.
     */
    public java.lang.String[] getEmailSMTPServer(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SMTP server used to send alert emails for the specified
     * actions. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getEmailSMTPServerByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specified email addresses to the recipient list for
     * the specified actions.
     */
    public java.lang.String[] getEmailSender(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specified email addresses to the recipient list for
     * the specified actions. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getEmailSenderByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the file this action logs to.
     */
    public java.lang.String[] getLogFilePath(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the file this action logs to. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getLogFilePathByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP hash algorithm for sending the Notify over SNMPv3.
     * Valid values are "md5" and "sha1". The actions specified must be of
     * type 'trap'.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionSNMPHashAlg[] getSNMPHashAlg(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP hash algorithm for sending the Notify over SNMPv3.
     * Valid values are "md5" and "sha1". The actions specified must be of
     * type 'trap'. This is a location specific function, any action will
     * operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionSNMPHashAlg[] getSNMPHashAlgByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP username for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'.
     */
    public java.lang.String[] getSNMPUsername(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP username for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getSNMPUsernameByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP version used to send the trap/notify. The actions
     * specified must be of type 'trap'.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionSNMPVersion[] getSNMPVersion(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP version used to send the trap/notify. The actions
     * specified must be of type 'trap'. This is a location specific function,
     * any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionSNMPVersion[] getSNMPVersionByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the additional information to send with the SOAP alert
     * call.
     */
    public java.lang.String[] getSOAPAdditional(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the additional information to send with the SOAP alert
     * call. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getSOAPAdditionalByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the username used to log in with HTTP basic authentication.
     * The actions specified must be of type 'soap'. Note that the password
     * field is always returned as an empty string.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionLogin[] getSOAPAuthentication(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the username used to log in with HTTP basic authentication.
     * The actions specified must be of type 'soap'. Note that the password
     * field is always returned as an empty string. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionLogin[] getSOAPAuthenticationByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the server the SOAP event call will be made to for each
     * of the specified SOAP events.
     */
    public java.lang.String[] getSOAPProxy(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the server the SOAP event call will be made to for each
     * of the specified SOAP events. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getSOAPProxyByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets all arguments for the specified script actions. The actions
     * specified must be of type 'program'.
     */
    public com.zeus.soap.zxtm._1_0.AlertingActionArgument[][] getScriptArguments(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the program to run including its command line arguments.
     * The actions specified must be of type 'program'.
     */
    public java.lang.String[] getScriptProgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the host to send syslog messages to (if empty, messages
     * will be sent to localhost). The actions specified must be of type
     * 'syslog'.
     */
    public java.lang.String[] getSyslogHost(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the host to send syslog messages to (if empty, messages
     * will be sent to localhost). The actions specified must be of type
     * 'syslog'. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getSyslogHostByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how long an action has to run, in seconds (set to 0 disable
     * timing out).
     */
    public org.apache.axis.types.UnsignedInt[] getTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how long an action has to run, in seconds (set to 0 disable
     * timing out). This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP community string for the SNMP trap. The actions
     * specified must be of type 'trap'.
     */
    public java.lang.String[] getTrapCommunity(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the SNMP community string for the SNMP trap. The actions
     * specified must be of type 'trap'. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getTrapCommunityByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the hostname or IPv4 address and optional port number that
     * should receive the SNMP trap. The actions specified must be of type
     * 'trap'.
     */
    public java.lang.String[] getTrapHost(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the hostname or IPv4 address and optional port number that
     * should receive the SNMP trap. The actions specified must be of type
     * 'trap'. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getTrapHostByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if verbose logging is enabled for this action.
     */
    public boolean[] getVerbose(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if verbose logging is enabled for this action. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getVerboseByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Disables using HTTP basic authentication with the SOAP Call.
     * The actions specified must be of type 'soap'.
     */
    public void removeSOAPAuthentication(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Disables using HTTP basic authentication with the SOAP Call.
     * The actions specified must be of type 'soap'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeSOAPAuthenticationByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Removes a set of arguments from the specified script actions.
     * The actions specified must be of type 'program'.
     */
    public void removeScriptArguments(java.lang.String[] names, java.lang.String[][] arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename each of the named actions.
     */
    public void renameAction(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the address the alert emails are sent from.
     */
    public void setEmailRecipients(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the address the alert emails are sent from. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setEmailRecipientsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SMTP server used to send alert emails for the specified
     * actions.
     */
    public void setEmailSMTPServer(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SMTP server used to send alert emails for the specified
     * actions. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setEmailSMTPServerByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the specified email addresses to the recipient list for
     * the specified actions.
     */
    public void setEmailSender(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the specified email addresses to the recipient list for
     * the specified actions. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setEmailSenderByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the file this action logs to.
     */
    public void setLogFilePath(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the file this action logs to. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setLogFilePathByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP password for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'.
     */
    public void setSNMPAuthPassword(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP password for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSNMPAuthPasswordByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP hash algorithm for sending the Notify over SNMPv3.
     * Valid values are "md5" and "sha1". The actions specified must be of
     * type 'trap'.
     */
    public void setSNMPHashAlg(java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionSNMPHashAlg[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP hash algorithm for sending the Notify over SNMPv3.
     * Valid values are "md5" and "sha1". The actions specified must be of
     * type 'trap'. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setSNMPHashAlgByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionSNMPHashAlg[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP encryption key to encrpt SNMPv3 Notify messages.
     * The actions specified must be of type 'trap'.
     */
    public void setSNMPPrivPassword(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP encryption key to encrpt SNMPv3 Notify messages.
     * The actions specified must be of type 'trap'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSNMPPrivPasswordByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP username for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'.
     */
    public void setSNMPUsername(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP username for sending the Notify over SNMPv3. The
     * actions specified must be of type 'trap'. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSNMPUsernameByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP version used to send the trap/notify. The actions
     * specified must be of type 'trap'.
     */
    public void setSNMPVersion(java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionSNMPVersion[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP version used to send the trap/notify. The actions
     * specified must be of type 'trap'. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSNMPVersionByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionSNMPVersion[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the additional information to send with the SOAP alert
     * call.
     */
    public void setSOAPAdditional(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the additional information to send with the SOAP alert
     * call. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSOAPAdditionalByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the username and password to use to log in with HTTP basic
     * authentication. The actions specified must be of type 'soap'.
     */
    public void setSOAPAuthentication(java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionLogin[] credentials) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the username and password to use to log in with HTTP basic
     * authentication. The actions specified must be of type 'soap'. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSOAPAuthenticationByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.AlertingActionLogin[] credentials) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the server the SOAP event call will be made to for each
     * of the specified SOAP events.
     */
    public void setSOAPProxy(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the server the SOAP event call will be made to for each
     * of the specified SOAP events. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSOAPProxyByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the program to run including its command line arguments.
     * The actions specified must be of type 'program'.
     */
    public void setScriptProgram(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the host to send syslog messages to (if empty, messages
     * will be sent to localhost). The actions specified must be of type
     * 'syslog'.
     */
    public void setSyslogHost(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the host to send syslog messages to (if empty, messages
     * will be sent to localhost). The actions specified must be of type
     * 'syslog'. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSyslogHostByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how long an action has to run, in seconds (set to 0 disable
     * timing out).
     */
    public void setTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how long an action has to run, in seconds (set to 0 disable
     * timing out). This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP community string for the SNMP trap. The actions
     * specified must be of type 'trap'.
     */
    public void setTrapCommunity(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the SNMP community string for the SNMP trap. The actions
     * specified must be of type 'trap'. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setTrapCommunityByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the hostname or IPv4 address and optional port number that
     * should receive the SNMP trap. The actions specified must be of type
     * 'trap'.
     */
    public void setTrapHost(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the hostname or IPv4 address and optional port number that
     * should receive the SNMP trap. The actions specified must be of type
     * 'trap'. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setTrapHostByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if verbose logging is enabled for this action.
     */
    public void setVerbose(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if verbose logging is enabled for this action. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setVerboseByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sends a test event to the named actions to confirm that they
     * are working as expected.
     */
    public void testAction(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allows arguments for the the specified script actions to be
     * changed. The actions specified must be of type 'program'.
     */
    public void updateScriptArguments(java.lang.String[] names, java.lang.String[][] argument_names, com.zeus.soap.zxtm._1_0.AlertingActionArgument[][] new_arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Uploads an action program, overwriting the file if it already
     * exists.
     */
    public void uploadActionProgram(java.lang.String name, byte[] content) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName;
}
