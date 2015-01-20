/**
 * CatalogProtectionPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogProtectionPort extends java.rmi.Remote {

    /**
     * Add new IP addresses and CIDR IP subnets to the list of machines
     * that are always allowed access.
     */
    public void addAllowedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new IP addresses and CIDR IP subnets to the list of machines
     * that are always allowed access. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void addAllowedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new IP addresses and CIDR IP subnets to the list of machines
     * that aren't allowed access.
     */
    public void addBannedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new IP addresses and CIDR IP subnets to the list of machines
     * that aren't allowed access. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void addBannedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new Protection classes.
     */
    public void addProtection(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Copy the named Protection classes.
     */
    public void copyProtection(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named Protection classes.
     */
    public void deleteProtection(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Get the list of IP addresses and CIDR IP subnets that are always
     * allowed access.
     */
    public java.lang.String[][] getAllowedAddresses(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of IP addresses and CIDR IP subnets that are always
     * allowed access. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[][] getAllowedAddressesByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of IP addresses and CIDR IP subnets that aren't
     * allowed access.
     */
    public java.lang.String[][] getBannedAddresses(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of IP addresses and CIDR IP subnets that aren't
     * allowed access. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[][] getBannedAddressesByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are in debug mode.
     * When in debug mode, verbose log messages are written.
     */
    public boolean[] getDebug(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are in debug mode.
     * When in debug mode, verbose log messages are written. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getDebugByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are enabled.
     */
    public boolean[] getEnabled(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are enabled. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getEnabledByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether requests with poorly-formed URLs (as specified
     * in RFC 2396) should be rejected.
     */
    public boolean[] getHTTPCheckRfc2396(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether requests with poorly-formed URLs (as specified
     * in RFC 2396) should be rejected. This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getHTTPCheckRfc2396ByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether requests containing binary data (after decoding)
     * should be rejected.
     */
    public boolean[] getHTTPRejectBinary(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether requests containing binary data (after decoding)
     * should be rejected. This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getHTTPRejectBinaryByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether an HTTP error message should be sent when a connection
     * is dropped, rather than just dropping the connection.
     */
    public boolean[] getHTTPSendErrorPage(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether an HTTP error message should be sent when a connection
     * is dropped, rather than just dropping the connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getHTTPSendErrorPageByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the interval between logging service protection messages
     * (in seconds).
     */
    public org.apache.axis.types.UnsignedInt[] getLogInterval(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the interval between logging service protection messages
     * (in seconds). This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getLogIntervalByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of simultaneous connections allowed
     * from the 10 busiest IP addresses.
     */
    public org.apache.axis.types.UnsignedInt[] getMax10Connections(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of simultaneous connections allowed
     * from the 10 busiest IP addresses. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMax10ConnectionsByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of simultaneous connections allowed
     * from an individual IP address.
     */
    public org.apache.axis.types.UnsignedInt[] getMax1Connections(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of simultaneous connections allowed
     * from an individual IP address. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMax1ConnectionsByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of connections and HTTP keepalive requests
     * allowed from 1 IP address in the 'rate_timer' interval (0 means unlimited).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectionRate(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of connections and HTTP keepalive requests
     * allowed from 1 IP address in the 'rate_timer' interval (0 means unlimited).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxConnectionRateByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the HTTP request body data (in bytes,
     * 0 means no limit).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPBodyLength(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the HTTP request body data (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPBodyLengthByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of a single HTTP request header (in bytes,
     * 0 means no limit).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPHeaderLength(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of a single HTTP request header (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPHeaderLengthByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of all the HTTP request headers (in bytes,
     * 0 means no limit).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPRequestLength(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of all the HTTP request headers (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPRequestLengthByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the request URL (in bytes, 0 means
     * no limit).
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPURLLength(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the request URL (in bytes, 0 means
     * no limit). This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxHTTPURLLengthByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of simultaneous connections that are always
     * allowed from each IP address (0 means unlimited).
     */
    public org.apache.axis.types.UnsignedInt[] getMinConnections(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of simultaneous connections that are always
     * allowed from each IP address (0 means unlimited). This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMinConnectionsByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named Protection classes
     */
    public java.lang.String[] getNote(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured Protection classes.
     */
    public java.lang.String[] getProtectionNames() throws java.rmi.RemoteException;

    /**
     * Get how frequently the max_connection_rate is assessed.  For
     * example, a value of 1 second will impose a limit of max connections/second;
     * a value of 60 will impose a limit of max connections/minute controlling
     * how our connection rates are calculated.
     */
    public org.apache.axis.types.UnsignedInt[] getRateTimer(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how frequently the max_connection_rate is assessed.  For
     * example, a value of 1 second will impose a limit of max connections/second;
     * a value of 60 will impose a limit of max connections/minute controlling
     * how our connection rates are calculated. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getRateTimerByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the TrafficScript rule to be applied to all connections.
     */
    public java.lang.String[] getRule(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the TrafficScript rule to be applied to all connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getRuleByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are in testing mode.
     * When in testing mode the class logs when a connection would be dropped,
     * but it allows all connections through.
     */
    public boolean[] getTesting(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the service protection classes are in testing mode.
     * When in testing mode the class logs when a connection would be dropped,
     * but it allows all connections through. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getTestingByLocation(java.lang.String location, java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove IP addresses and CIDR IP subnets from the list of machines
     * that are always allowed access.
     */
    public void removeAllowedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove IP addresses and CIDR IP subnets from the list of machines
     * that are always allowed access. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void removeAllowedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove IP addresses and CIDR IP subnets from the list of machines
     * that aren't allowed access.
     */
    public void removeBannedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove IP addresses and CIDR IP subnets from the list of machines
     * that aren't allowed access. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void removeBannedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named Protection classes.
     */
    public void renameProtection(java.lang.String[] class_names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the list of IP addresses and CIDR IP subnets that are always
     * allowed access.
     */
    public void setAllowedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of IP addresses and CIDR IP subnets that are always
     * allowed access. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setAllowedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of IP addresses and CIDR IP subnets that aren't
     * allowed access.
     */
    public void setBannedAddresses(java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of IP addresses and CIDR IP subnets that aren't
     * allowed access. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setBannedAddressesByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are in debug mode.
     * When in debug mode, verbose log messages are written.
     */
    public void setDebug(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are in debug mode.
     * When in debug mode, verbose log messages are written. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setDebugByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are enabled.
     */
    public void setEnabled(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are enabled. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setEnabledByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether requests with poorly-formed URLs (as specified
     * in RFC 2396) should be rejected.
     */
    public void setHTTPCheckRfc2396(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether requests with poorly-formed URLs (as specified
     * in RFC 2396) should be rejected. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setHTTPCheckRfc2396ByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether requests containing binary data (after decoding)
     * should be rejected.
     */
    public void setHTTPRejectBinary(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether requests containing binary data (after decoding)
     * should be rejected. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setHTTPRejectBinaryByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether an HTTP error message should be sent when a connection
     * is dropped, rather than just dropping the connection.
     */
    public void setHTTPSendErrorPage(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether an HTTP error message should be sent when a connection
     * is dropped, rather than just dropping the connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setHTTPSendErrorPageByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the interval between logging service protection messages
     * (in seconds).
     */
    public void setLogInterval(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the interval between logging service protection messages
     * (in seconds). This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setLogIntervalByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of simultaneous connections allowed
     * from the 10 busiest IP addresses.
     */
    public void setMax10Connections(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of simultaneous connections allowed
     * from the 10 busiest IP addresses. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setMax10ConnectionsByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of simultaneous connections allowed
     * from an individual IP address.
     */
    public void setMax1Connections(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of simultaneous connections allowed
     * from an individual IP address. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setMax1ConnectionsByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of connections and HTTP keepalive requests
     * allowed from 1 IP address in the 'rate_timer' interval (0 means unlimited).
     */
    public void setMaxConnectionRate(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum number of connections and HTTP keepalive requests
     * allowed from 1 IP address in the 'rate_timer' interval (0 means unlimited).
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setMaxConnectionRateByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of the HTTP request body data (in bytes,
     * 0 means no limit).
     */
    public void setMaxHTTPBodyLength(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of the HTTP request body data (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setMaxHTTPBodyLengthByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of a single HTTP request header (in bytes,
     * 0 means no limit).
     */
    public void setMaxHTTPHeaderLength(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of a single HTTP request header (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setMaxHTTPHeaderLengthByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of all the HTTP request headers (in bytes,
     * 0 means no limit).
     */
    public void setMaxHTTPRequestLength(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of all the HTTP request headers (in bytes,
     * 0 means no limit). This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setMaxHTTPRequestLengthByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of the request URL (in bytes, 0 means
     * no limit).
     */
    public void setMaxHTTPURLLength(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum size of the request URL (in bytes, 0 means
     * no limit). This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setMaxHTTPURLLengthByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of simultaneous connections that are always
     * allowed from each IP address (0 means unlimited).
     */
    public void setMinConnections(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of simultaneous connections that are always
     * allowed from each IP address (0 means unlimited). This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMinConnectionsByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named Protection classes
     */
    public void setNote(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how frequently the max_connection_rate is assessed.  For
     * example, a value of 1 second will impose a limit of max connections/second;
     * a value of 60 will impose a limit of max connections/minute controlling
     * how our connection rates are calculated.
     */
    public void setRateTimer(java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how frequently the max_connection_rate is assessed.  For
     * example, a value of 1 second will impose a limit of max connections/second;
     * a value of 60 will impose a limit of max connections/minute controlling
     * how our connection rates are calculated. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setRateTimerByLocation(java.lang.String location, java.lang.String[] class_names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the TrafficScript rule to be applied to all connections.
     */
    public void setRule(java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the TrafficScript rule to be applied to all connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setRuleByLocation(java.lang.String location, java.lang.String[] class_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are in testing mode.
     * When in testing mode the class logs when a connection would be dropped,
     * but it allows all connections through.
     */
    public void setTesting(java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the service protection classes are in testing mode.
     * When in testing mode the class logs when a connection would be dropped,
     * but it allows all connections through. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setTestingByLocation(java.lang.String location, java.lang.String[] class_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
