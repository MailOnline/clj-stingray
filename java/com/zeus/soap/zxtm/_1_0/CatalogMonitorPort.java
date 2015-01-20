/**
 * CatalogMonitorPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogMonitorPort extends java.rmi.Remote {

    /**
     * Add new monitors (defaults to TCP transaction monitor, monitoring
     * each node separately).
     */
    public void addMonitors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Adds a set of arguments to the specified monitors. The monitors
     * specified must be of type 'program'.
     */
    public void addProgramArguments(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogMonitorArgument[][] arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Copy the named monitors.
     */
    public void copyMonitors(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named monitor programs.
     */
    public void deleteMonitorProgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Delete these monitors.
     */
    public void deleteMonitors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Download the named monitor program.
     */
    public byte[] downloadMonitorProgram(java.lang.String name) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all monitors.
     */
    public java.lang.String[] getAllMonitorNames() throws java.rmi.RemoteException;

    /**
     * Get the authentication (user:password) that each of the named
     * monitors should use in the test HTTP request.
     */
    public java.lang.String[] getAuthentication(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the authentication (user:password) that each of the named
     * monitors should use in the test HTTP request. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getAuthenticationByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should back-off after
     * it has failed.
     */
    public boolean[] getBackOff(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should back-off after
     * it has failed. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getBackOffByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that that each of the named
     * monitors' HTTP response must match.
     */
    public java.lang.String[] getBodyRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that that each of the named
     * monitors' HTTP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getBodyRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get an optional string that each of the named monitors should
     * write to the server before closing the connection.
     */
    public java.lang.String[] getCloseString(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get an optional string that each of the named monitors should
     * write to the server before closing the connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getCloseStringByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the custom monitors.
     */
    public java.lang.String[] getCustomMonitorNames() throws java.rmi.RemoteException;

    /**
     * Get the minimum time between calls to each of the named monitors
     * (in seconds).
     */
    public org.apache.axis.types.UnsignedInt[] getDelay(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum time between calls to each of the named monitors
     * (in seconds). This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getDelayByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of failures required, by each of the named monitors,
     * before a node is classed as unavailable.
     */
    public org.apache.axis.types.UnsignedInt[] getFailures(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of failures required, by each of the named monitors,
     * before a node is classed as unavailable. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getFailuresByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should monitor health
     * only (ignore load).
     */
    public boolean[] getHealthOnly(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should monitor health
     * only (ignore load). This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getHealthOnlyByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the host header that each of the named monitors should
     * use in the test HTTP request.
     */
    public java.lang.String[] getHostHeader(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the host header that each of the named monitors should
     * use in the test HTTP request. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getHostHeaderByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the machine that each of the named monitors should monitor
     * (must be a valid hostname:port or a hostname for Ping monitors).
     */
    public java.lang.String[] getMachine(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the machine that each of the named monitors should monitor
     * (must be a valid hostname:port or a hostname for Ping monitors). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[] getMachineByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum amount of data (in bytes) that each of the
     * named monitors should read back from a server (0 = unlimited).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxResponseLen(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum amount of data (in bytes) that each of the
     * named monitors should read back from a server (0 = unlimited). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxResponseLenByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the uploaded monitor programs. These are
     * the programs that can be executed by custom program monitors.
     */
    public java.lang.String[] getMonitorProgramNames() throws java.rmi.RemoteException;

    /**
     * Get the note for each of the named Monitors.
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the path that each of the named monitors should use in
     * the test HTTP request.
     */
    public java.lang.String[] getPath(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the path that each of the named monitors should use in
     * the test HTTP request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getPathByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the program that each named monitor runs.
     */
    public java.lang.String[] getProgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets all arguments for the specified monitors. The monitors
     * specified must be of type 'program'.
     */
    public com.zeus.soap.zxtm._1_0.CatalogMonitorArgument[][] getProgramArguments(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the regular expression that each of the named monitors
     * should match against the server response.
     */
    public java.lang.String[] getResponseRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the regular expression that each of the named monitors
     * should match against the server response. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getResponseRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that each of the named monitors'
     * RTSP response must match.
     */
    public java.lang.String[] getRtspBodyRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that each of the named monitors'
     * RTSP response must match. This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getRtspBodyRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the path that each of the named monitors should use in
     * the test RTSP request.
     */
    public java.lang.String[] getRtspPath(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the path that each of the named monitors should use in
     * the test RTSP request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getRtspPathByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that each of the named
     * monitors' RTSP response must match.
     */
    public java.lang.String[] getRtspStatusRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that each of the named
     * monitors' RTSP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getRtspStatusRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the scope of each named monitor.
     */
    public com.zeus.soap.zxtm._1_0.CatalogMonitorScope[] getScope(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that that each of the named
     * monitors' SIP response must match.
     */
    public java.lang.String[] getSipBodyRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the body regular expression that that each of the named
     * monitors' SIP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getSipBodyRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that that each of the
     * named monitors' SIP response must match.
     */
    public java.lang.String[] getSipStatusRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that that each of the
     * named monitors' SIP response must match. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getSipStatusRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the transport protocol that the monitor will use
     */
    public com.zeus.soap.zxtm._1_0.CatalogMonitorSipTransport[] getSipTransport(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the transport protocol that the monitor will use This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogMonitorSipTransport[] getSipTransportByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that that each of the
     * named monitors' HTTP response must match.
     */
    public java.lang.String[] getStatusRegex(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the status code regular expression that that each of the
     * named monitors' HTTP response must match. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String[] getStatusRegexByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum time that an individual instance, of each of
     * the named monitors, is allowed to run for (in seconds).
     */
    public org.apache.axis.types.UnsignedInt[] getTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum time that an individual instance, of each of
     * the named monitors, is allowed to run for (in seconds). This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the internal monitor type to use for each named monitor.
     */
    public com.zeus.soap.zxtm._1_0.CatalogMonitorType[] getType(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if the monitor should accept responses from any IP and
     * port. UDP monitors only.
     */
    public boolean[] getUDPAcceptAll(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get if the monitor should accept responses from any IP and
     * port. UDP monitors only. This is a location specific function, any
     * action will operate on the specified location.
     */
    public boolean[] getUDPAcceptAllByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors can connect using SSL.
     */
    public boolean[] getUseSSL(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors can connect using SSL.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getUseSSLByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should emit verbose
     * logging (useful for diagnostics).
     */
    public boolean[] getVerbose(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named monitors should emit verbose
     * logging (useful for diagnostics). This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getVerboseByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the string that each of the named monitors should write
     * down the TCP connection.
     */
    public java.lang.String[] getWriteString(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the string that each of the named monitors should write
     * down the TCP connection. This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String[] getWriteStringByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Removes a set of arguments from the specified monitors. The
     * monitors specified must be of type 'program'.
     */
    public void removeProgramArguments(java.lang.String[] names, java.lang.String[][] arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename these monitors.
     */
    public void renameMonitors(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the authentication (user:password) that each of the named
     * monitors should use in the test HTTP request.
     */
    public void setAuthentication(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the authentication (user:password) that each of the named
     * monitors should use in the test HTTP request. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setAuthenticationByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should back-off after
     * it has failed.
     */
    public void setBackOff(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should back-off after
     * it has failed. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setBackOffByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that that each of the named
     * monitors' HTTP response must match.
     */
    public void setBodyRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that that each of the named
     * monitors' HTTP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setBodyRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set an optional string that each of the named monitors should
     * write to the server before closing the connection.
     */
    public void setCloseString(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set an optional string that each of the named monitors should
     * write to the server before closing the connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setCloseStringByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum time between calls to each of the named monitors
     * (in seconds).
     */
    public void setDelay(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum time between calls to each of the named monitors
     * (in seconds). This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setDelayByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of failures required, by each of the named monitors,
     * before a node is classed as unavailable.
     */
    public void setFailures(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of failures required, by each of the named monitors,
     * before a node is classed as unavailable. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setFailuresByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should monitor health
     * only (ignore load).
     */
    public void setHealthOnly(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should monitor health
     * only (ignore load). This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setHealthOnlyByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the host header that each of the named monitors should
     * use in the test HTTP request.
     */
    public void setHostHeader(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the host header that each of the named monitors should
     * use in the test HTTP request. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setHostHeaderByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the machine that each of the named monitors should monitor
     * (must be a valid hostname:port or a hostname for Ping monitors).
     */
    public void setMachine(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the machine that each of the named monitors should monitor
     * (must be a valid hostname:port or a hostname for Ping monitors). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setMachineByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum amount of data (in bytes) that each of the
     * named monitors should read back from a server (0 = unlimited).
     */
    public void setMaxResponseLen(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum amount of data (in bytes) that each of the
     * named monitors should read back from a server (0 = unlimited). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setMaxResponseLenByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named Monitors.
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the path that each of the named monitors should use in
     * the test HTTP request.
     */
    public void setPath(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the path that each of the named monitors should use in
     * the test HTTP request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setPathByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the program that each named monitor runs.
     */
    public void setProgram(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the regular expression that each of the named monitors
     * should match against the server response.
     */
    public void setResponseRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the regular expression that each of the named monitors
     * should match against the server response. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setResponseRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that each of the named monitors'
     * RTSP response must match.
     */
    public void setRtspBodyRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that each of the named monitors'
     * RTSP response must match. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setRtspBodyRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the path that each of the named monitors should use in
     * the test RTSP request.
     */
    public void setRtspPath(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the path that each of the named monitors should use in
     * the test RTSP request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setRtspPathByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that each of the named
     * monitors' RTSP response must match.
     */
    public void setRtspStatusRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that each of the named
     * monitors' RTSP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setRtspStatusRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the scope of each named monitor.
     */
    public void setScope(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogMonitorScope[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that that each of the named
     * monitors' SIP response must match.
     */
    public void setSipBodyRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the body regular expression that that each of the named
     * monitors' SIP response must match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSipBodyRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that that each of the
     * named monitors' SIP response must match.
     */
    public void setSipStatusRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that that each of the
     * named monitors' SIP response must match. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSipStatusRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the transport protocol that the monitor will use
     */
    public void setSipTransport(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogMonitorSipTransport[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the transport protocol that the monitor will use This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setSipTransportByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogMonitorSipTransport[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that that each of the
     * named monitors' HTTP response must match.
     */
    public void setStatusRegex(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the status code regular expression that that each of the
     * named monitors' HTTP response must match. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setStatusRegexByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum time that an individual instance, of each of
     * the named monitors, is allowed to run for (in seconds).
     */
    public void setTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum time that an individual instance, of each of
     * the named monitors, is allowed to run for (in seconds). This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the internal monitor type to use for each named monitor.
     */
    public void setType(java.lang.String[] names, com.zeus.soap.zxtm._1_0.CatalogMonitorType[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if the monitor should accept responses from any IP and
     * port. UDP monitors only.
     */
    public void setUDPAcceptAll(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set if the monitor should accept responses from any IP and
     * port. UDP monitors only. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setUDPAcceptAllByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors can connect using SSL.
     */
    public void setUseSSL(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors can connect using SSL.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setUseSSLByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should emit verbose
     * logging (useful for diagnostics).
     */
    public void setVerbose(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named monitors should emit verbose
     * logging (useful for diagnostics). This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setVerboseByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the string that each of the named monitors should write
     * down the TCP connection.
     */
    public void setWriteString(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the string that each of the named monitors should write
     * down the TCP connection. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setWriteStringByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allows arguments for the the specified monitors to be changed.
     * The monitors specified must be of type 'program'.
     */
    public void updateProgramArguments(java.lang.String[] names, java.lang.String[][] argument_names, com.zeus.soap.zxtm._1_0.CatalogMonitorArgument[][] new_arguments) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Uploads a monitor program, overwriting the file if it already
     * exists.
     */
    public void uploadMonitorProgram(java.lang.String name, byte[] content) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName;
}
