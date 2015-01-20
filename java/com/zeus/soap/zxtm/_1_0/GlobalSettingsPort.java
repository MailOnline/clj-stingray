/**
 * GlobalSettingsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface GlobalSettingsPort extends java.rmi.Remote {

    /**
     * Add new IP addresses to the list that should be used to check
     * front-end connectivity
     */
    public void addFlipperFrontendCheckAddresses(java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Add new IP addresses to the list that should be used to check
     * front-end connectivity This is a location specific function, any action
     * will operate on the specified location.
     */
    public void addFlipperFrontendCheckAddressesByLocation(java.lang.String location, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Get the maximum number of entries in the ASP session cache.
     */
    public org.apache.axis.types.UnsignedInt getASPSessionCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the ASP session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getASPSessionCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how often each traffic manager child process checks whether
     * it should be accepting new connections.
     */
    public org.apache.axis.types.UnsignedInt getAcceptingDelay() throws java.rmi.RemoteException;

    /**
     * Get how often each traffic manager child process checks whether
     * it should be accepting new connections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getAcceptingDelayByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether SSL / TLS re-handshakes are supported.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsAdminAllowRehandshake getAdminAllowRehandshake() throws java.rmi.RemoteException;

    /**
     * Get the number of bits to use for Diffie-Hellman keys
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsAdminDiffieHellmanKeyLength getAdminDiffieHellmanKeyLength() throws java.rmi.RemoteException;

    /**
     * Get whether admin server SSL3 and TLS1 use one byte fragments
     */
    public boolean getAdminInsertExtraFragment() throws java.rmi.RemoteException;

    /**
     * Get the list of configured SSL ciphers for admin server and
     * internal connections (available ciphers can be displayed using the
     * command $ZEUSHOME/zxtm/bin/zeus.zxtm -s).
     */
    public java.lang.String getAdminSSLCiphers() throws java.rmi.RemoteException;

    /**
     * Get the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be for admin and internal connections.
     */
    public org.apache.axis.types.UnsignedInt getAdminSSLMaxHandshakeMessageSize() throws java.rmi.RemoteException;

    /**
     * Get whether TLSv1.1 support is enabled for admin server and
     * internal connections.
     */
    public boolean getAdminSSLSupportTLS11() throws java.rmi.RemoteException;

    /**
     * Get whether SSLv2 support is enabled for admin server and internal
     * connections.
     */
    public boolean getAdminSupportSSL2() throws java.rmi.RemoteException;

    /**
     * Get whether SSLv3 support is enabled for admin server and internal
     * connections.
     */
    public boolean getAdminSupportSSL3() throws java.rmi.RemoteException;

    /**
     * Get whether TLSv1 support is enabled for admin server and internal
     * connections.
     */
    public boolean getAdminSupportTLS1() throws java.rmi.RemoteException;

    /**
     * Get the length of time between alert emails, in seconds. Several
     * alert messages will be stored up and sent in one email.
     */
    public org.apache.axis.types.UnsignedInt getAlertEmailInterval() throws java.rmi.RemoteException;

    /**
     * Get the length of time between alert emails, in seconds. Several
     * alert messages will be stored up and sent in one email. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getAlertEmailIntervalByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of times to attempt sending an email before
     * giving up.
     */
    public org.apache.axis.types.UnsignedInt getAlertEmailMaxAttempts() throws java.rmi.RemoteException;

    /**
     * Get the number of times to attempt sending an email before
     * giving up. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getAlertEmailMaxAttemptsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the same character can appear consecutively in
     * passwords.
     */
    public boolean getAllowConsecutiveChars() throws java.rmi.RemoteException;

    /**
     * Get detailed logging of autoscaler status and actions
     */
    public boolean getAutoscalerVerbose() throws java.rmi.RemoteException;

    /**
     * Get detailed logging of autoscaler status and actions This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public boolean getAutoscalerVerboseByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getBackendKeepaliveTimeout is deprecated, please use getIdleConnectionTimeout
     * instead.
     */
    public org.apache.axis.types.UnsignedInt getBackendKeepaliveTimeout() throws java.rmi.RemoteException;

    /**
     * getBackendKeepaliveTimeout is deprecated, please use getIdleConnectionTimeout
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getBackendKeepaliveTimeoutByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete and is replaced by Catalog.Bandwidth.getSharing.
     */
    public boolean getBandwidthSharing() throws java.rmi.RemoteException;

    /**
     * Get whether or not users must explicitly agree to the displayed
     * login_banner text before logging in to the Admin Server.
     */
    public boolean getBannerAccept() throws java.rmi.RemoteException;

    /**
     * Get the default chunk size for reading and writing data, in
     * bytes.
     */
    public org.apache.axis.types.UnsignedInt getChunkSize() throws java.rmi.RemoteException;

    /**
     * Get the default chunk size for reading and writing data, in
     * bytes. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getChunkSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether client-first network socket optimisations should
     * be used.
     */
    public boolean getClientFirstOpt() throws java.rmi.RemoteException;

    /**
     * Get whether client-first network socket optimisations should
     * be used. This is a location specific function, any action will operate
     * on the specified location.
     */
    public boolean getClientFirstOptByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the hosts that are allowed to contact the internal administration
     * port on each traffic manager.
     */
    public java.lang.String getControlAllowHosts() throws java.rmi.RemoteException;

    /**
     * Get the hosts that are allowed to contact the internal administration
     * port on each traffic manager. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String getControlAllowHostsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the value of the control!canupdate key for new cluster
     * members.
     */
    public boolean getControlCanUpdateDefault() throws java.rmi.RemoteException;

    /**
     * This method should be replaced by getDNSCacheMaxTTL/getDNSCacheMinTTL.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheExpiryTime() throws java.rmi.RemoteException;

    /**
     * This method should be replaced by getDNSCacheMaxTTL/getDNSCacheMinTTL.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheExpiryTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum time entries are stored in the DNS cache for,
     * in seconds.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheMaxTTL() throws java.rmi.RemoteException;

    /**
     * Get the maximum time entries are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheMaxTTLByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum time entries are stored in the DNS cache for,
     * in seconds.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheMinTTL() throws java.rmi.RemoteException;

    /**
     * Get the minimum time entries are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheMinTTLByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time failed lookups are stored in the DNS cache for,
     * in seconds.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheNegativeExpiryTime() throws java.rmi.RemoteException;

    /**
     * Get the time failed lookups are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheNegativeExpiryTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of entries in the DNS cache.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the DNS cache. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getDNSCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the timeout for receiving a response from a DNS Server,
     * in seconds.
     */
    public org.apache.axis.types.UnsignedInt getDNSTimeout() throws java.rmi.RemoteException;

    /**
     * Get the timeout for receiving a response from a DNS Server,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getDNSTimeoutByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete and is replaced by Pool.getNodeFailTime.
     */
    public org.apache.axis.types.UnsignedInt getDeadTime() throws java.rmi.RemoteException;

    /**
     * Get the Access Key ID used for interacting with the EC2 API.
     */
    public java.lang.String getEC2AccessKeyID() throws java.rmi.RemoteException;

    /**
     * Get the Access Key ID used for interacting with the EC2 API.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String getEC2AccessKeyIDByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum severity of events that should be logged to
     * disk.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsErrorLevel getErrorLevel() throws java.rmi.RemoteException;

    /**
     * Get the minimum severity of events that should be logged to
     * disk. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsErrorLevel getErrorLevelByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the filename that errors are logged to.
     */
    public java.lang.String getErrorLogFile() throws java.rmi.RemoteException;

    /**
     * Get the filename that errors are logged to. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String getErrorLogFileByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether your traffic manager should permit use of FTP data
     * connection source ports lower than 1024.  If 'No' your traffic manager
     * can completely drop root privileges, if 'Yes' some or all privileges
     * may be retained in order to bind to low ports.
     */
    public boolean getFTPDataBindLow() throws java.rmi.RemoteException;

    /**
     * Get whether your traffic manager should permit use of FTP data
     * connection source ports lower than 1024.  If 'No' your traffic manager
     * can completely drop root privileges, if 'Yes' some or all privileges
     * may be retained in order to bind to low ports. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getFTPDataBindLowByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of ARP packets each traffic manager sends when
     * an IP address is raised.
     */
    public org.apache.axis.types.UnsignedInt getFlipperArpCount() throws java.rmi.RemoteException;

    /**
     * Get the number of ARP packets each traffic manager sends when
     * an IP address is raised. This is a location specific function, any
     * action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getFlipperArpCountByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether Traffic IPs should automatically failback to recovered
     * machines.
     */
    public boolean getFlipperAutofailback() throws java.rmi.RemoteException;

    /**
     * Get whether Traffic IPs should automatically failback to recovered
     * machines. This is a location specific function, any action will operate
     * on the specified location.
     */
    public boolean getFlipperAutofailbackByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the IP addresses that should be used to check front-end
     * connectivity.
     */
    public java.lang.String[] getFlipperFrontendCheckAddresses() throws java.rmi.RemoteException;

    /**
     * Get the IP addresses that should be used to check front-end
     * connectivity. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[] getFlipperFrontendCheckAddressesByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the method used to exchange cluster heartbeat messages.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsFlipperHeartbeatMethod getFlipperHeartbeatMethod() throws java.rmi.RemoteException;

    /**
     * Get the method used to exchange cluster heartbeat messages.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsFlipperHeartbeatMethod getFlipperHeartbeatMethodByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how frequently (in milliseconds) each traffic manager checks
     * and announces its connectivity.
     */
    public org.apache.axis.types.UnsignedInt getFlipperMonitorInterval() throws java.rmi.RemoteException;

    /**
     * Get how frequently (in milliseconds) each traffic manager checks
     * and announces its connectivity. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getFlipperMonitorIntervalByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how long (in seconds) each traffic manager waits for a
     * response from its connectivity tests or from other traffic managers
     * before registering a failure.
     */
    public org.apache.axis.types.UnsignedInt getFlipperMonitorTimeout() throws java.rmi.RemoteException;

    /**
     * Get how long (in seconds) each traffic manager waits for a
     * response from its connectivity tests or from other traffic managers
     * before registering a failure. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getFlipperMonitorTimeoutByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the multicast address and port used to announce connectivity
     * (e.g. 239.100.1.1:9090).
     */
    public java.lang.String getFlipperMulticastAddress() throws java.rmi.RemoteException;

    /**
     * Get the multicast address and port used to announce connectivity
     * (e.g. 239.100.1.1:9090). This is a location specific function, any
     * action will operate on the specified location.
     */
    public java.lang.String getFlipperMulticastAddressByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the unicast UDP port used to announce connectivity (e.g.
     * 9090)
     */
    public org.apache.axis.types.UnsignedInt getFlipperUnicastPort() throws java.rmi.RemoteException;

    /**
     * Get the unicast UDP port used to announce connectivity (e.g.
     * 9090) This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getFlipperUnicastPortByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the heartbeat messages used for fault tolerance
     * are only sent over the management network.
     */
    public boolean getFlipperUseBindip() throws java.rmi.RemoteException;

    /**
     * Get whether the heartbeat messages used for fault tolerance
     * are only sent over the management network. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean getFlipperUseBindipByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the traffic manager should logs all the connectivity
     * tests.
     */
    public boolean getFlipperVerbose() throws java.rmi.RemoteException;

    /**
     * Get whether the traffic manager should logs all the connectivity
     * tests. This is a location specific function, any action will operate
     * on the specified location.
     */
    public boolean getFlipperVerboseByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum change per second to load.
     */
    public org.apache.axis.types.UnsignedInt getGLBLoadChangeLimit() throws java.rmi.RemoteException;

    /**
     * Get the maximum change per second to load. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getGLBLoadChangeLimitByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether GSLB should log all DNS queries
     */
    public boolean getGLBVerbose() throws java.rmi.RemoteException;

    /**
     * Get whether GSLB should log all DNS queries This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getGLBVerboseByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time historical traffic information is kept
     * for, in days (0=keep indefinitely).
     */
    public org.apache.axis.types.UnsignedInt getHistoricalTrafficDays() throws java.rmi.RemoteException;

    /**
     * Get the length of time historical traffic information is kept
     * for, in days (0=keep indefinitely). This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getHistoricalTrafficDaysByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of entries in the IP session cache.
     */
    public org.apache.axis.types.UnsignedInt getIPSessionCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the IP session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getIPSessionCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how long unused HTTP keepalive connections should be kept
     * before being discarded, in seconds.
     */
    public org.apache.axis.types.UnsignedInt getIdleConnectionTimeout() throws java.rmi.RemoteException;

    /**
     * Get how long unused HTTP keepalive connections should be kept
     * before being discarded, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getIdleConnectionTimeoutByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of entries in the J2EE session cache.
     */
    public org.apache.axis.types.UnsignedInt getJ2EESessionCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the J2EE session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getJ2EESessionCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get extra Java CLASSPATH settings required for servlets.
     */
    public java.lang.String getJavaClasspath() throws java.rmi.RemoteException;

    /**
     * Get extra Java CLASSPATH settings required for servlets. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String getJavaClasspathByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the command (and arguments) used to start Java.
     */
    public java.lang.String getJavaCommand() throws java.rmi.RemoteException;

    /**
     * Get the command (and arguments) used to start Java. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String getJavaCommandByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to enable Java support.
     */
    public boolean getJavaEnabled() throws java.rmi.RemoteException;

    /**
     * Get whether to enable Java support. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean getJavaEnabledByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the location of the java library directory
     */
    public java.lang.String getJavaLib() throws java.rmi.RemoteException;

    /**
     * Get the location of the java library directory This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String getJavaLibByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of Java threads
     */
    public org.apache.axis.types.UnsignedInt getJavaMaxConns() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of Java threads This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getJavaMaxConnsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default maximum age of Java session persistence
     */
    public org.apache.axis.types.UnsignedInt getJavaSessionAge() throws java.rmi.RemoteException;

    /**
     * Get the default maximum age of Java session persistence This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getJavaSessionAgeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size of the listen queue for managing incoming connections.
     */
    public org.apache.axis.types.UnsignedInt getListenQueueSize() throws java.rmi.RemoteException;

    /**
     * Get the size of the listen queue for managing incoming connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getListenQueueSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time to wait before flushing the request
     * log files for each virtual server, in seconds.
     */
    public org.apache.axis.types.UnsignedInt getLogFlushFlushTime() throws java.rmi.RemoteException;

    /**
     * Get the length of time to wait before flushing the request
     * log files for each virtual server, in seconds. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getLogFlushFlushTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time between log messages for log intensive
     * features e.g. SLM, in seconds.
     */
    public org.apache.axis.types.UnsignedInt getLogInterval() throws java.rmi.RemoteException;

    /**
     * Get the length of time between log messages for log intensive
     * features e.g. SLM, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getLogIntervalByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the maximum number of connection errors logged per second.
     */
    public org.apache.axis.types.UnsignedInt getLogRate() throws java.rmi.RemoteException;

    /**
     * Get is the maximum number of connection errors logged per second.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getLogRateByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time to wait before re-opening request log
     * files, to handle log file rotation, in seconds.
     */
    public org.apache.axis.types.UnsignedInt getLogReopenTime() throws java.rmi.RemoteException;

    /**
     * Get the length of time to wait before re-opening request log
     * files, to handle log file rotation, in seconds. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getLogReopenTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the banner text to be shown on the Admin Server login page
     * and before logging in to appliance SSH servers.
     */
    public java.lang.String getLoginBanner() throws java.rmi.RemoteException;

    /**
     * Get the number of seconds before another login attempt can
     * be made after a failed attempt.
     */
    public org.apache.axis.types.UnsignedInt getLoginDelay() throws java.rmi.RemoteException;

    /**
     * Get how many traffic manager child processes accept new connections.
     */
    public org.apache.axis.types.UnsignedInt getMaxAccepting() throws java.rmi.RemoteException;

    /**
     * Get how many traffic manager child processes accept new connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getMaxAcceptingByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of unused HTTP keepalive connections
     * to all nodes that should maintained for re-use.
     */
    public org.apache.axis.types.UnsignedInt getMaxIdleConnections() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of unused HTTP keepalive connections
     * to all nodes that should maintained for re-use. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getMaxIdleConnectionsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getMaxKeepalives is deprecated, please use getMaxIdleConnections
     * instead.
     */
    public org.apache.axis.types.UnsignedInt getMaxKeepalives() throws java.rmi.RemoteException;

    /**
     * getMaxKeepalives is deprecated, please use getMaxIdleConnections
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getMaxKeepalivesByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of sequential failed login attempts that will
     * cause a user account to be suspended.  Setting this to 0 disables
     * this feature.
     */
    public org.apache.axis.types.UnsignedInt getMaxLoginAttempts() throws java.rmi.RemoteException;

    /**
     * Get whether or not usernames blocked due to the max_login_attempts
     * limit should also be blocked from authentication against external
     * services (such as LDAP and RADIUS).
     */
    public boolean getMaxLoginExternal() throws java.rmi.RemoteException;

    /**
     * Get number of minutes to suspend users who have exceeded the
     * max_login_attempts limit.
     */
    public org.apache.axis.types.UnsignedInt getMaxLoginSuspensionTime() throws java.rmi.RemoteException;

    /**
     * This method is now obsolete and is replaced by Pool.getNodeConnectionAttempts.
     */
    public org.apache.axis.types.UnsignedInt getMaxRetries() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of file descriptors that your traffic
     * manager will allocate
     */
    public org.apache.axis.types.UnsignedInt getMaximumFDCount() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of file descriptors that your traffic
     * manager will allocate This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getMaximumFDCountByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum number of alphabetic characters in a password.
     */
    public org.apache.axis.types.UnsignedInt getMinAlphaChars() throws java.rmi.RemoteException;

    /**
     * Get the minimum number of numeric characters in a password.
     */
    public org.apache.axis.types.UnsignedInt getMinNumericChars() throws java.rmi.RemoteException;

    /**
     * Get the minimum number of characters a password must contain.
     */
    public org.apache.axis.types.UnsignedInt getMinPasswordLength() throws java.rmi.RemoteException;

    /**
     * Get the minimum number of special characters in a password.
     */
    public org.apache.axis.types.UnsignedInt getMinSpecialChars() throws java.rmi.RemoteException;

    /**
     * Get the minimum number of uppercase characters in a password.
     */
    public org.apache.axis.types.UnsignedInt getMinUppercaseChars() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of nodes that can be monitored.
     */
    public org.apache.axis.types.UnsignedInt getMonitorNumNodes() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of nodes that can be monitored. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getMonitorNumNodesByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether your traffic manager should try and read multiple
     * new connections each time a new client connects.
     */
    public boolean getMultipleAccept() throws java.rmi.RemoteException;

    /**
     * Get whether your traffic manager should try and read multiple
     * new connections each time a new client connects. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getMultipleAcceptByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete and is replaced by Pool.getNodeConnectionAttempts.
     */
    public org.apache.axis.types.UnsignedInt getNodeConnectionAttempts() throws java.rmi.RemoteException;

    /**
     * This method is now obsolete and is replaced by Pool.getNodeFailTime.
     */
    public org.apache.axis.types.UnsignedInt getNodeFailTime() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the OCSP cache. This is
     * used to speed up OCSP checks by caching results
     */
    public org.apache.axis.types.UnsignedInt getOCSPCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the OCSP cache. This is
     * used to speed up OCSP checks by caching results This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getOCSPCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of times a password can be changed every
     * 24 hours.
     */
    public org.apache.axis.types.UnsignedInt getPasswordChangesPerDay() throws java.rmi.RemoteException;

    /**
     * Get the number of times a password must have been changed before
     * it can be reused.
     */
    public org.apache.axis.types.UnsignedInt getPasswordReuseAfter() throws java.rmi.RemoteException;

    /**
     * Get the banner text to be displayed on the appliance console
     * after login.
     */
    public java.lang.String getPostLoginBanner() throws java.rmi.RemoteException;

    /**
     * Get REST authentication timeout.
     */
    public org.apache.axis.types.UnsignedInt getRESTAuthTimeout() throws java.rmi.RemoteException;

    /**
     * Get whether REST service is enabled.
     */
    public boolean getRESTEnabled() throws java.rmi.RemoteException;

    /**
     * Get the maximum allowed length in bytes of a HTTP request's
     * headers.
     */
    public org.apache.axis.types.UnsignedInt getRESTMaxHTTPHeaderLength() throws java.rmi.RemoteException;

    /**
     * Get Absolute time before configuration replication via REST.
     */
    public org.apache.axis.types.UnsignedInt getRESTReplicateAbsoluteTime() throws java.rmi.RemoteException;

    /**
     * Get Lull time for configuration replication via REST.
     */
    public org.apache.axis.types.UnsignedInt getRESTReplicateLullTime() throws java.rmi.RemoteException;

    /**
     * Get the configuration replication timeout via REST.
     */
    public org.apache.axis.types.UnsignedInt getRESTReplicateTimeout() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of Rate classes allowed.
     */
    public org.apache.axis.types.UnsignedInt getRateClassLimit() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of Rate classes allowed. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getRateClassLimitByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the details of how many recently closed connections each
     * traffic manager process should save for use with the Connections page.
     */
    public org.apache.axis.types.UnsignedInt getRecentConns() throws java.rmi.RemoteException;

    /**
     * Get the details of how many recently closed connections each
     * traffic manager process should save for use with the Connections page.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getRecentConnsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get for how long a snapshot should be retained on the Connections
     * page.
     */
    public org.apache.axis.types.UnsignedInt getRecentConnsRetainTime() throws java.rmi.RemoteException;

    /**
     * Get for how long a snapshot should be retained on the Connections
     * page. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getRecentConnsRetainTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of connections each traffic manager
     * process should show for a snapshot on the Connections page.
     */
    public org.apache.axis.types.UnsignedInt getRecentConnsSnapshotSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of connections each traffic manager
     * process should show for a snapshot on the Connections page. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getRecentConnsSnapshotSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of SLM classes allowed.
     */
    public org.apache.axis.types.UnsignedInt getSLMClassLimit() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of SLM classes allowed. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSLMClassLimitByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of user defined SNMP counters (this single parameter
     * dictates the numbers of both 32- and 64-bit user counters - there
     * is always the same number of counters of each type).
     */
    public org.apache.axis.types.UnsignedInt getSNMPUserCounters() throws java.rmi.RemoteException;

    /**
     * Get the number of user defined SNMP counters (this single parameter
     * dictates the numbers of both 32- and 64-bit user counters - there
     * is always the same number of counters of each type). This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSNMPUserCountersByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether SSL / TLS re-handshakes are supported.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3AllowRehandshake getSSL3AllowRehandshake() throws java.rmi.RemoteException;

    /**
     * Get whether SSL / TLS re-handshakes are supported. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3AllowRehandshake getSSL3AllowRehandshakeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of configured SSL ciphers (available ciphers can
     * be displayed using the command $ZEUSHOME/zxtm/bin/zeus.zxtm -s).
     */
    public java.lang.String getSSL3Ciphers() throws java.rmi.RemoteException;

    /**
     * Get the list of configured SSL ciphers (available ciphers can
     * be displayed using the command $ZEUSHOME/zxtm/bin/zeus.zxtm -s). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String getSSL3CiphersByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of bits to use for Diffie-Hellman keys
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3DiffieHellmanKeyLength getSSL3DiffieHellmanKeyLength() throws java.rmi.RemoteException;

    /**
     * Get the number of bits to use for Diffie-Hellman keys This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3DiffieHellmanKeyLength getSSL3DiffieHellmanKeyLengthByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size of the CRL shared memory.
     */
    public java.lang.String getSSLCRLMemSize() throws java.rmi.RemoteException;

    /**
     * Get the size of the CRL shared memory. This is a location specific
     * function, any action will operate on the specified location.
     */
    public java.lang.String getSSLCRLMemSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getSSLDFailureCount is deprecated, please use getSSLHardwareFailureCount
     * instead.
     */
    public org.apache.axis.types.UnsignedInt getSSLDFailureCount() throws java.rmi.RemoteException;

    /**
     * getSSLDFailureCount is deprecated, please use getSSLHardwareFailureCount
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSSLDFailureCountByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getSSLDPKCS11Lib is deprecated, please use getSSLHardwarePKCS11Lib
     * instead.
     */
    public java.lang.String getSSLDPKCS11Lib() throws java.rmi.RemoteException;

    /**
     * getSSLDPKCS11Lib is deprecated, please use getSSLHardwarePKCS11Lib
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String getSSLDPKCS11LibByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether your traffic manager should always attempt to use
     * SSL hardware.
     */
    public boolean getSSLHardwareAccelerator() throws java.rmi.RemoteException;

    /**
     * Get whether your traffic manager should always attempt to use
     * SSL hardware. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean getSSLHardwareAcceleratorByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of consecutive failures from the SSL hardware
     * that will be tolerated before your traffic manager tries to log in
     * again.
     */
    public org.apache.axis.types.UnsignedInt getSSLHardwareFailureCount() throws java.rmi.RemoteException;

    /**
     * Get the number of consecutive failures from the SSL hardware
     * that will be tolerated before your traffic manager tries to log in
     * again. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSSLHardwareFailureCountByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the location of the PKCS#11 library supplied by your hardware
     * vendor.
     */
    public java.lang.String getSSLHardwarePKCS11Lib() throws java.rmi.RemoteException;

    /**
     * Get the location of the PKCS#11 library supplied by your hardware
     * vendor. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String getSSLHardwarePKCS11LibByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the label of the SSL hardware slot to use.
     */
    public java.lang.String getSSLHardwarePKCS11SlotLabel() throws java.rmi.RemoteException;

    /**
     * Get the label of the SSL hardware slot to use. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String getSSLHardwarePKCS11SlotLabelByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the type of PKCS11 slot to use. Only used for PKCS11.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwarePKCS11SlotType getSSLHardwarePKCS11SlotType() throws java.rmi.RemoteException;

    /**
     * Get the type of PKCS11 slot to use. Only used for PKCS11. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwarePKCS11SlotType getSSLHardwarePKCS11SlotTypeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the device driver library name.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwareType getSSLHardwareType() throws java.rmi.RemoteException;

    /**
     * Get the device driver library name. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwareType getSSLHardwareTypeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether SSL3 and TLS1 use one byte fragments
     */
    public boolean getSSLInsertExtraFragment() throws java.rmi.RemoteException;

    /**
     * Get whether SSL3 and TLS1 use one byte fragments This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public boolean getSSLInsertExtraFragmentByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be.
     */
    public org.apache.axis.types.UnsignedInt getSSLMaxHandshakeMessageSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSSLMaxHandshakeMessageSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of entries in the SSL session cache.
     * This is used to provide persistence based on SSL session IDs.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the SSL session cache.
     * This is used to provide persistence based on SSL session IDs. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the length of time that SSL session IDs are stored, in
     * seconds.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionIDCacheExpiryTime() throws java.rmi.RemoteException;

    /**
     * Get the length of time that SSL session IDs are stored, in
     * seconds. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionIDCacheExpiryTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of entries in the SSL session ID cache.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionIDCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the number of entries in the SSL session ID cache. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getSSLSessionIDCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether SSLv2 support is enabled.
     */
    public boolean getSSLSupportSSL2() throws java.rmi.RemoteException;

    /**
     * Get whether SSLv2 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean getSSLSupportSSL2ByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether SSLv3 support is enabled.
     */
    public boolean getSSLSupportSSL3() throws java.rmi.RemoteException;

    /**
     * Get whether SSLv3 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean getSSLSupportSSL3ByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether TLSv1 support is enabled.
     */
    public boolean getSSLSupportTLS1() throws java.rmi.RemoteException;

    /**
     * Get whether TLSv1.1 support is enabled.
     */
    public boolean getSSLSupportTLS11() throws java.rmi.RemoteException;

    /**
     * Get whether TLSv1.1 support is enabled. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getSSLSupportTLS11ByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether TLSv1 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean getSSLSupportTLS1ByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get is the size of shared memory pool to be used for shared
     * storage across worker processes.
     */
    public java.lang.String getSharedPoolSize() throws java.rmi.RemoteException;

    /**
     * Get is the size of shared memory pool to be used for shared
     * storage across worker processes. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String getSharedPoolSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of minutes the SOAP server remain idle before
     * exiting
     */
    public org.apache.axis.types.UnsignedInt getSoapIdleMinutes() throws java.rmi.RemoteException;

    /**
     * Get the number of minutes the SOAP server remain idle before
     * exiting This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSoapIdleMinutesByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether potential network socket optimisations should be
     * used.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSocketOptimizations getSocketOptimizations() throws java.rmi.RemoteException;

    /**
     * Get whether potential network socket optimisations should be
     * used. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSocketOptimizations getSocketOptimizationsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getSsldAccel is deprecated, please use getSSLHardwareAccelerator
     * instead.
     */
    public boolean getSsldAccel() throws java.rmi.RemoteException;

    /**
     * getSsldAccel is deprecated, please use getSSLHardwareAccelerator
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public boolean getSsldAccelByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * getSsldLibrary is deprecated, please use getSSLHardwareType
     * instead.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSsldLibrary getSsldLibrary() throws java.rmi.RemoteException;

    /**
     * getSsldLibrary is deprecated, please use getSSLHardwareType
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.GlobalSettingsSsldLibrary getSsldLibraryByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how often the cache state is propagated to other traffic
     * managers in the cluster, in seconds.
     */
    public org.apache.axis.types.UnsignedInt getStateSyncTime() throws java.rmi.RemoteException;

    /**
     * Get how often the cache state is propagated to other traffic
     * managers in the cluster, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getStateSyncTimeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the timeout for state propagation between cluster members,
     * in seconds
     */
    public org.apache.axis.types.UnsignedInt getStateSyncTimeout() throws java.rmi.RemoteException;

    /**
     * Get the timeout for state propagation between cluster members,
     * in seconds This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getStateSyncTimeoutByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size of the operating system's read buffer, in bytes
     * (0 means use the system default).
     */
    public org.apache.axis.types.UnsignedInt getSystemReadBufferSize() throws java.rmi.RemoteException;

    /**
     * Get the size of the operating system's read buffer, in bytes
     * (0 means use the system default). This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSystemReadBufferSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the size of the operating system's write buffer, in bytes
     * (0 means use the system default).
     */
    public org.apache.axis.types.UnsignedInt getSystemWriteBufferSize() throws java.rmi.RemoteException;

    /**
     * Get the size of the operating system's write buffer, in bytes
     * (0 means use the system default). This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getSystemWriteBufferSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to remember past login attempts from usernames
     * that are not known to exist (should be No for an Admin Server accessible
     * from the public Internet).
     */
    public boolean getTrackUnknownUsers() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of Traffic IP Groups allowed.
     */
    public org.apache.axis.types.UnsignedInt getTrafficIPGroupLimit() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of Traffic IP Groups allowed. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficIPGroupLimitByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of buffered network data a TrafficScript rule
     * can buffer before a warning is logged, in bytes.
     */
    public org.apache.axis.types.UnsignedInt getTrafficScriptMemoryWarning() throws java.rmi.RemoteException;

    /**
     * Get the amount of buffered network data a TrafficScript rule
     * can buffer before a warning is logged, in bytes. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficScriptMemoryWarningByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of array elements that can be stored before
     * additional memory is allocated.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptArrayElements() throws java.rmi.RemoteException;

    /**
     * Get the number of array elements that can be stored before
     * additional memory is allocated. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptArrayElementsByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the TrafficScript shared data pool
     * (specified as a percentage of system RAM, e.g. '5%', or an absolute
     * size, e.g. 200MB)
     */
    public java.lang.String getTrafficscriptDataSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum size of the TrafficScript shared data pool
     * (specified as a percentage of system RAM, e.g. '5%', or an absolute
     * size, e.g. 200MB) This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String getTrafficscriptDataSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of instructions a TrafficScript rule
     * will run before being aborted.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptMaxInstr() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of instructions a TrafficScript rule
     * will run before being aborted. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptMaxInstrByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of regular expressions to cache
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the number of regular expressions to cache This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of ways TrafficScript will attempt to
     * match a regular expression at each position in the subject string,
     * before it aborts the rule and reports a TrafficScript error.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexMatchLimit() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of ways TrafficScript will attempt to
     * match a regular expression at each position in the subject string,
     * before it aborts the rule and reports a TrafficScript error. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexMatchLimitByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the percentage of trafficscript!regex_match_limit at which
     * TrafficScript reports a performance warning.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexMatchWarnPerc() throws java.rmi.RemoteException;

    /**
     * Get the percentage of trafficscript!regex_match_limit at which
     * TrafficScript reports a performance warning. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getTrafficscriptRegexMatchWarnPercByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the 'pool.use' and 'pool.select' TrafficScript
     * functions accept variables as well as literal strings.
     */
    public boolean getTrafficscriptVariablePoolUse() throws java.rmi.RemoteException;

    /**
     * Get whether the 'pool.use' and 'pool.select' TrafficScript
     * functions accept variables as well as literal strings. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getTrafficscriptVariablePoolUseByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the banner text to be displayed on all Admin Server pages.
     */
    public java.lang.String getUipageBanner() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the universal session
     * cache.
     */
    public org.apache.axis.types.UnsignedInt getUniversalSessionCacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of entries in the universal session
     * cache. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getUniversalSessionCacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the estimated average length of the path for resources
     * to be cached
     */
    public org.apache.axis.types.UnsignedInt getWebcacheAvgPathLength() throws java.rmi.RemoteException;

    /**
     * Get the estimated average length of the path for resources
     * to be cached This is a location specific function, any action will
     * operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getWebcacheAvgPathLengthByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the webcache is stored on disk
     */
    public boolean getWebcacheDisk() throws java.rmi.RemoteException;

    /**
     * Get whether the webcache is stored on disk This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean getWebcacheDiskByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the disk cache location
     */
    public java.lang.String getWebcacheDiskDir() throws java.rmi.RemoteException;

    /**
     * Get the disk cache location This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String getWebcacheDiskDirByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum number of files that can be stored in the web
     * cache
     */
    public org.apache.axis.types.UnsignedInt getWebcacheMaxFileNum() throws java.rmi.RemoteException;

    /**
     * Get the maximum number of files that can be stored in the web
     * cache This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt getWebcacheMaxFileNumByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the largest size of a cacheable object, relative to the
     * total cache size, e.g. '2%', or as an absolute size in kB (default),
     * MB or GB, e.g. '20MB'.
     */
    public java.lang.String getWebcacheMaxFileSize() throws java.rmi.RemoteException;

    /**
     * Get the largest size of a cacheable object, relative to the
     * total cache size, e.g. '2%', or as an absolute size in kB (default),
     * MB or GB, e.g. '20MB'. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String getWebcacheMaxFileSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum length of the path for the resource being cached
     */
    public org.apache.axis.types.UnsignedInt getWebcacheMaxPathLength() throws java.rmi.RemoteException;

    /**
     * Get the maximum length of the path for the resource being cached
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt getWebcacheMaxPathLengthByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the assignment sub-strings in the parameter string
     * are put into alphabetical order.
     */
    public boolean getWebcacheNormalizeQuery() throws java.rmi.RemoteException;

    /**
     * Get whether the assignment sub-strings in the parameter string
     * are put into alphabetical order. This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean getWebcacheNormalizeQueryByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum size of the HTTP web page cache, (specified
     * as a percentage of system RAM, e.g. '20%', or an absolute size, e.g.
     * 200MB)
     */
    public java.lang.String getWebcacheSize() throws java.rmi.RemoteException;

    /**
     * Get the maximum size of the HTTP web page cache, (specified
     * as a percentage of system RAM, e.g. '20%', or an absolute size, e.g.
     * 200MB) This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String getWebcacheSizeByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether an X-Cache-Info header to show cacheability should
     * be added.
     */
    public boolean getWebcacheVerbose() throws java.rmi.RemoteException;

    /**
     * Get whether an X-Cache-Info header to show cacheability should
     * be added. This is a location specific function, any action will operate
     * on the specified location.
     */
    public boolean getWebcacheVerboseByLocation(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove IP addresses from the list that should be used to check
     * front-end connectivity
     */
    public void removeFlipperFrontendCheckAddresses(java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Remove IP addresses from the list that should be used to check
     * front-end connectivity This is a location specific function, any action
     * will operate on the specified location.
     */
    public void removeFlipperFrontendCheckAddressesByLocation(java.lang.String location, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the ASP session cache.
     */
    public void setASPSessionCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the ASP session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setASPSessionCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how often each traffic manager child process checks whether
     * it should be accepting new connections.
     */
    public void setAcceptingDelay(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how often each traffic manager child process checks whether
     * it should be accepting new connections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setAcceptingDelayByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSL / TLS re-handshakes are supported.
     */
    public void setAdminAllowRehandshake(com.zeus.soap.zxtm._1_0.GlobalSettingsAdminAllowRehandshake value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of bits to use for Diffie-Hellman keys
     */
    public void setAdminDiffieHellmanKeyLength(com.zeus.soap.zxtm._1_0.GlobalSettingsAdminDiffieHellmanKeyLength value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether admin server SSL3 and TLS1 use one byte fragments
     */
    public void setAdminInsertExtraFragment(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the list of configured SSL ciphers for admin server and
     * internal connections (available ciphers can be displayed using the
     * command $ZEUSHOME/zxtm/bin/zeus.zxtm -s).
     */
    public void setAdminSSLCiphers(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be for admin and internal connections.
     */
    public void setAdminSSLMaxHandshakeMessageSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1.1 support is enabled for admin server and
     * internal connections.
     */
    public void setAdminSSLSupportTLS11(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv2 support is enabled for admin server and internal
     * connections.
     */
    public void setAdminSupportSSL2(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv3 support is enabled for admin server and internal
     * connections.
     */
    public void setAdminSupportSSL3(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1 support is enabled for admin server and internal
     * connections.
     */
    public void setAdminSupportTLS1(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time between alert emails, in seconds. Several
     * alert messages will be stored up and sent in one email.
     */
    public void setAlertEmailInterval(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time between alert emails, in seconds. Several
     * alert messages will be stored up and sent in one email. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setAlertEmailIntervalByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of times to attempt sending an email before
     * giving up.
     */
    public void setAlertEmailMaxAttempts(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of times to attempt sending an email before
     * giving up. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setAlertEmailMaxAttemptsByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the same character can appear consecutively in
     * passwords.
     */
    public void setAllowConsecutiveChars(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set detailed logging of autoscaler status and actions
     */
    public void setAutoscalerVerbose(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set detailed logging of autoscaler status and actions This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setAutoscalerVerboseByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setBackendKeepaliveTimeout is deprecated, please use setIdleConnectionTimeout
     * instead.
     */
    public void setBackendKeepaliveTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setBackendKeepaliveTimeout is deprecated, please use setIdleConnectionTimeout
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setBackendKeepaliveTimeoutByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method is now obsolete and is replaced by Catalog.Bandwidth.setSharing.
     */
    public void setBandwidthSharing(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether or not users must explicitly agree to the displayed
     * login_banner text before logging in to the Admin Server.
     */
    public void setBannerAccept(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the lists of nodes for each of the named pools.
     */
    public void setBootloaderPassword(java.lang.String password) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the default chunk size for reading and writing data, in
     * bytes.
     */
    public void setChunkSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the default chunk size for reading and writing data, in
     * bytes. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setChunkSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether client-first network socket optimisations should
     * be used.
     */
    public void setClientFirstOpt(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether client-first network socket optimisations should
     * be used. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setClientFirstOptByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the hosts that are allowed to contact the internal administration
     * port on each traffic manager.
     */
    public void setControlAllowHosts(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the hosts that are allowed to contact the internal administration
     * port on each traffic manager. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setControlAllowHostsByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the value of the control!canupdate key for new cluster
     * members.
     */
    public void setControlCanUpdateDefault(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method should be replaced by setDNSCacheMaxTTL/setDNSCacheMinTTL.
     */
    public void setDNSCacheExpiryTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method should be replaced by setDNSCacheMaxTTL/setDNSCacheMinTTL.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setDNSCacheExpiryTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum time entries are stored in the DNS cache for,
     * in seconds.
     */
    public void setDNSCacheMaxTTL(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum time entries are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setDNSCacheMaxTTLByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum time entries are stored in the DNS cache for,
     * in seconds.
     */
    public void setDNSCacheMinTTL(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum time entries are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setDNSCacheMinTTLByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the time failed lookups are stored in the DNS cache for,
     * in seconds.
     */
    public void setDNSCacheNegativeExpiryTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the time failed lookups are stored in the DNS cache for,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setDNSCacheNegativeExpiryTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the DNS cache.
     */
    public void setDNSCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the DNS cache. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setDNSCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the timeout for receiving a response from a DNS Server,
     * in seconds.
     */
    public void setDNSTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the timeout for receiving a response from a DNS Server,
     * in seconds. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setDNSTimeoutByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method is now obsolete and is replaced by Pool.setNodeFailTime.
     */
    public void setDeadTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the Access Key ID used for interacting with the EC2 API.
     */
    public void setEC2AccessKeyID(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the Access Key ID used for interacting with the EC2 API.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setEC2AccessKeyIDByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the Secret Access Key used for interacting with the EC2
     * API.
     */
    public void setEC2SecretAccessKey(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the Secret Access Key used for interacting with the EC2
     * API. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setEC2SecretAccessKeyByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum severity of events that should be logged to
     * disk.
     */
    public void setErrorLevel(com.zeus.soap.zxtm._1_0.GlobalSettingsErrorLevel value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum severity of events that should be logged to
     * disk. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setErrorLevelByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsErrorLevel value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the filename that errors are logged to.
     */
    public void setErrorLogFile(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the filename that errors are logged to. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setErrorLogFileByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should permit use of FTP data
     * connection source ports lower than 1024.  If 'No' your traffic manager
     * can completely drop root privileges, if 'Yes' some or all privileges
     * may be retained in order to bind to low ports.
     */
    public void setFTPDataBindLow(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should permit use of FTP data
     * connection source ports lower than 1024.  If 'No' your traffic manager
     * can completely drop root privileges, if 'Yes' some or all privileges
     * may be retained in order to bind to low ports. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setFTPDataBindLowByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of ARP packets each traffic manager sends when
     * an IP address is raised.
     */
    public void setFlipperArpCount(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of ARP packets each traffic manager sends when
     * an IP address is raised. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setFlipperArpCountByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether Traffic IPs should automatically failback to recovered
     * machines.
     */
    public void setFlipperAutofailback(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether Traffic IPs should automatically failback to recovered
     * machines. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setFlipperAutofailbackByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the IP addresses that should be used to check front-end
     * connectivity.
     */
    public void setFlipperFrontendCheckAddresses(java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the IP addresses that should be used to check front-end
     * connectivity. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setFlipperFrontendCheckAddressesByLocation(java.lang.String location, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the method used to exchange cluster heartbeat messages.
     */
    public void setFlipperHeartbeatMethod(com.zeus.soap.zxtm._1_0.GlobalSettingsFlipperHeartbeatMethod value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the method used to exchange cluster heartbeat messages.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setFlipperHeartbeatMethodByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsFlipperHeartbeatMethod value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how frequently (in milliseconds) each traffic manager checks
     * and announces its connectivity.
     */
    public void setFlipperMonitorInterval(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how frequently (in milliseconds) each traffic manager checks
     * and announces its connectivity. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setFlipperMonitorIntervalByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how long (in seconds) each traffic manager waits for a
     * response from its connectivity tests or from other traffic managers
     * before registering a failure.
     */
    public void setFlipperMonitorTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how long (in seconds) each traffic manager waits for a
     * response from its connectivity tests or from other traffic managers
     * before registering a failure. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setFlipperMonitorTimeoutByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the multicast address and port used to announce connectivity
     * (e.g. 239.100.1.1:9090).
     */
    public void setFlipperMulticastAddress(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the multicast address and port used to announce connectivity
     * (e.g. 239.100.1.1:9090). This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setFlipperMulticastAddressByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the unicast UDP port used to announce connectivity (e.g.
     * 9090)
     */
    public void setFlipperUnicastPort(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the unicast UDP port used to announce connectivity (e.g.
     * 9090) This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setFlipperUnicastPortByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the heartbeat messages used for fault tolerance
     * are only sent over the management network.
     */
    public void setFlipperUseBindip(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the heartbeat messages used for fault tolerance
     * are only sent over the management network. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setFlipperUseBindipByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the traffic manager should logs all the connectivity
     * tests.
     */
    public void setFlipperVerbose(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the traffic manager should logs all the connectivity
     * tests. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setFlipperVerboseByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum change per second to load.
     */
    public void setGLBLoadChangeLimit(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum change per second to load. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setGLBLoadChangeLimitByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether GSLB should log all DNS queries
     */
    public void setGLBVerbose(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether GSLB should log all DNS queries This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setGLBVerboseByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time historical traffic information is kept
     * for, in days (0=keep indefinitely).
     */
    public void setHistoricalTrafficDays(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time historical traffic information is kept
     * for, in days (0=keep indefinitely). This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setHistoricalTrafficDaysByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the IP session cache.
     */
    public void setIPSessionCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the IP session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setIPSessionCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how long unused HTTP keepalive connections should be kept
     * before being discarded, in seconds.
     */
    public void setIdleConnectionTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how long unused HTTP keepalive connections should be kept
     * before being discarded, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setIdleConnectionTimeoutByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the J2EE session cache.
     */
    public void setJ2EESessionCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the J2EE session cache.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setJ2EESessionCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set extra Java CLASSPATH settings required for servlets.
     */
    public void setJavaClasspath(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set extra Java CLASSPATH settings required for servlets. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setJavaClasspathByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the command (and arguments) used to start Java.
     */
    public void setJavaCommand(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the command (and arguments) used to start Java. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setJavaCommandByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether to enable Java support.
     */
    public void setJavaEnabled(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether to enable Java support. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setJavaEnabledByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the location of the java library directory
     */
    public void setJavaLib(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the location of the java library directory This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setJavaLibByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Java threads
     */
    public void setJavaMaxConns(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Java threads This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setJavaMaxConnsByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the default maximum age of Java session persistence
     */
    public void setJavaSessionAge(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the default maximum age of Java session persistence This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setJavaSessionAgeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the listen queue for managing incoming connections.
     */
    public void setListenQueueSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the listen queue for managing incoming connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setListenQueueSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time to wait before flushing the request
     * log files for each virtual server, in seconds.
     */
    public void setLogFlushFlushTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time to wait before flushing the request
     * log files for each virtual server, in seconds. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setLogFlushFlushTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time between log messages for log intensive
     * features e.g. SLM, in seconds.
     */
    public void setLogInterval(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time between log messages for log intensive
     * features e.g. SLM, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setLogIntervalByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set is the maximum number of connection errors logged per second.
     */
    public void setLogRate(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set is the maximum number of connection errors logged per second.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogRateByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time to wait before re-opening request log
     * files, to handle log file rotation, in seconds.
     */
    public void setLogReopenTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time to wait before re-opening request log
     * files, to handle log file rotation, in seconds. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setLogReopenTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the banner text to be shown on the Admin Server login page
     * and before logging in to appliance SSH servers.
     */
    public void setLoginBanner(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of seconds before another login attempt can
     * be made after a failed attempt.
     */
    public void setLoginDelay(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how many traffic manager child processes accept new connections.
     */
    public void setMaxAccepting(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how many traffic manager child processes accept new connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setMaxAcceptingByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of unused HTTP keepalive connections
     * to all nodes that should maintained for re-use.
     */
    public void setMaxIdleConnections(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of unused HTTP keepalive connections
     * to all nodes that should maintained for re-use. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMaxIdleConnectionsByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setMaxKeepalives is deprecated, please use setMaxIdleConnections
     * instead.
     */
    public void setMaxKeepalives(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setMaxKeepalives is deprecated, please use setMaxIdleConnections
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setMaxKeepalivesByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of sequential failed login attempts that will
     * cause a user account to be suspended.  Setting this to 0 disables
     * this feature.
     */
    public void setMaxLoginAttempts(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether or not usernames blocked due to the max_login_attempts
     * limit should also be blocked from authentication against external
     * services (such as LDAP and RADIUS).
     */
    public void setMaxLoginExternal(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set number of minutes to suspend users who have exceeded the
     * max_login_attempts limit.
     */
    public void setMaxLoginSuspensionTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method is now obsolete and is replaced by Pool.setNodeConnectionAttempts.
     */
    public void setMaxRetries(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of file descriptors that your traffic
     * manager will allocate
     */
    public void setMaximumFDCount(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of file descriptors that your traffic
     * manager will allocate This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setMaximumFDCountByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum number of alphabetic characters in a password.
     */
    public void setMinAlphaChars(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum number of numeric characters in a password.
     */
    public void setMinNumericChars(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum number of characters a password must contain.
     */
    public void setMinPasswordLength(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum number of special characters in a password.
     */
    public void setMinSpecialChars(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the minimum number of uppercase characters in a password.
     */
    public void setMinUppercaseChars(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of nodes that can be monitored.
     */
    public void setMonitorNumNodes(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of nodes that can be monitored. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setMonitorNumNodesByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should try and read multiple
     * new connections each time a new client connects.
     */
    public void setMultipleAccept(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should try and read multiple
     * new connections each time a new client connects. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMultipleAcceptByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method is now obsolete and is replaced by Pool.setNodeConnectionAttempts.
     */
    public void setNodeConnectionAttempts(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * This method is now obsolete and is replaced by Pool.setNodeFailTime.
     */
    public void setNodeFailTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the OCSP cache. This is
     * used to speed up OCSP checks by caching results
     */
    public void setOCSPCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the OCSP cache. This is
     * used to speed up OCSP checks by caching results This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setOCSPCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of times a password can be changed every
     * 24 hours.
     */
    public void setPasswordChangesPerDay(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of times a password must have been changed before
     * it can be reused.
     */
    public void setPasswordReuseAfter(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the banner text to be displayed on the appliance console
     * after login.
     */
    public void setPostLoginBanner(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set REST authentication timeout.
     */
    public void setRESTAuthTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether REST service is enabled.
     */
    public void setRESTEnabled(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum allowed length in bytes of a HTTP request's
     * headers.
     */
    public void setRESTMaxHTTPHeaderLength(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set Absolute time before configuration replication via REST.
     */
    public void setRESTReplicateAbsoluteTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set Lull time for configuration replication via REST.
     */
    public void setRESTReplicateLullTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the configuration replication timeout via REST.
     */
    public void setRESTReplicateTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Rate classes allowed.
     */
    public void setRateClassLimit(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Rate classes allowed. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setRateClassLimitByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the details of how many recently closed connections each
     * traffic manager process should save for use with the Connections page.
     */
    public void setRecentConns(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the details of how many recently closed connections each
     * traffic manager process should save for use with the Connections page.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setRecentConnsByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set for how long a snapshot should be retained on the Connections
     * page.
     */
    public void setRecentConnsRetainTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set for how long a snapshot should be retained on the Connections
     * page. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setRecentConnsRetainTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of connections each traffic manager
     * process should show for a snapshot on the Connections page.
     */
    public void setRecentConnsSnapshotSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of connections each traffic manager
     * process should show for a snapshot on the Connections page. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setRecentConnsSnapshotSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of SLM classes allowed.
     */
    public void setSLMClassLimit(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of SLM classes allowed. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSLMClassLimitByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of user defined SNMP counters (this single parameter
     * dictates the numbers of both 32- and 64-bit user counters - there
     * is always the same number of counters of each type).
     */
    public void setSNMPUserCounters(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of user defined SNMP counters (this single parameter
     * dictates the numbers of both 32- and 64-bit user counters - there
     * is always the same number of counters of each type). This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSNMPUserCountersByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSL / TLS re-handshakes are supported.
     */
    public void setSSL3AllowRehandshake(com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3AllowRehandshake value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSL / TLS re-handshakes are supported. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSL3AllowRehandshakeByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3AllowRehandshake value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the list of configured SSL ciphers (available ciphers can
     * be displayed using the command $ZEUSHOME/zxtm/bin/zeus.zxtm -s).
     */
    public void setSSL3Ciphers(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the list of configured SSL ciphers (available ciphers can
     * be displayed using the command $ZEUSHOME/zxtm/bin/zeus.zxtm -s). This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSL3CiphersByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of bits to use for Diffie-Hellman keys
     */
    public void setSSL3DiffieHellmanKeyLength(com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3DiffieHellmanKeyLength value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of bits to use for Diffie-Hellman keys This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSL3DiffieHellmanKeyLengthByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSSL3DiffieHellmanKeyLength value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the CRL shared memory.
     */
    public void setSSLCRLMemSize(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the CRL shared memory. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLCRLMemSizeByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDFailureCount is deprecated, please use setSSLHardwareFailureCount
     * instead.
     */
    public void setSSLDFailureCount(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDFailureCount is deprecated, please use setSSLHardwareFailureCount
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLDFailureCountByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDPKCS11Lib is deprecated, please use setSSLHardwarePKCS11Lib
     * instead.
     */
    public void setSSLDPKCS11Lib(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDPKCS11Lib is deprecated, please use setSSLHardwarePKCS11Lib
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLDPKCS11LibByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDPKCS11UserPIN is deprecated, please use setSSLHardwarePKCS11UserPIN
     * instead.
     */
    public void setSSLDPKCS11UserPIN(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSSLDPKCS11UserPIN is deprecated, please use setSSLHardwarePKCS11UserPIN
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLDPKCS11UserPINByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should always attempt to use
     * SSL hardware.
     */
    public void setSSLHardwareAccelerator(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether your traffic manager should always attempt to use
     * SSL hardware. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setSSLHardwareAcceleratorByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of consecutive failures from the SSL hardware
     * that will be tolerated before your traffic manager tries to log in
     * again.
     */
    public void setSSLHardwareFailureCount(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of consecutive failures from the SSL hardware
     * that will be tolerated before your traffic manager tries to log in
     * again. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLHardwareFailureCountByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the location of the PKCS#11 library supplied by your hardware
     * vendor.
     */
    public void setSSLHardwarePKCS11Lib(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the location of the PKCS#11 library supplied by your hardware
     * vendor. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLHardwarePKCS11LibByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the label of the SSL hardware slot to use.
     */
    public void setSSLHardwarePKCS11SlotLabel(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the label of the SSL hardware slot to use. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLHardwarePKCS11SlotLabelByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the type of PKCS11 slot to use. Only used for PKCS11.
     */
    public void setSSLHardwarePKCS11SlotType(com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwarePKCS11SlotType value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the type of PKCS11 slot to use. Only used for PKCS11. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLHardwarePKCS11SlotTypeByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwarePKCS11SlotType value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the user PIN for the PKCS token (PKCS#11 devices only)
     */
    public void setSSLHardwarePKCS11UserPIN(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the user PIN for the PKCS token (PKCS#11 devices only)
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLHardwarePKCS11UserPINByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the device driver library name.
     */
    public void setSSLHardwareType(com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwareType value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the device driver library name. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLHardwareTypeByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSSLHardwareType value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSL3 and TLS1 use one byte fragments
     */
    public void setSSLInsertExtraFragment(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSL3 and TLS1 use one byte fragments This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLInsertExtraFragmentByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be.
     */
    public void setSSLMaxHandshakeMessageSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum acceptable size (in bytes) a SSL handshake
     * message is permitted to be. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSSLMaxHandshakeMessageSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the SSL session cache.
     * This is used to provide persistence based on SSL session IDs.
     */
    public void setSSLSessionCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the SSL session cache.
     * This is used to provide persistence based on SSL session IDs. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLSessionCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time that SSL session IDs are stored, in
     * seconds.
     */
    public void setSSLSessionIDCacheExpiryTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the length of time that SSL session IDs are stored, in
     * seconds. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLSessionIDCacheExpiryTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of entries in the SSL session ID cache.
     */
    public void setSSLSessionIDCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of entries in the SSL session ID cache. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLSessionIDCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv2 support is enabled.
     */
    public void setSSLSupportSSL2(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv2 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLSupportSSL2ByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv3 support is enabled.
     */
    public void setSSLSupportSSL3(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether SSLv3 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLSupportSSL3ByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1 support is enabled.
     */
    public void setSSLSupportTLS1(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1.1 support is enabled.
     */
    public void setSSLSupportTLS11(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1.1 support is enabled. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLSupportTLS11ByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether TLSv1 support is enabled. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLSupportTLS1ByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set is the size of shared memory pool to be used for shared
     * storage across worker processes.
     */
    public void setSharedPoolSize(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set is the size of shared memory pool to be used for shared
     * storage across worker processes. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSharedPoolSizeByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of minutes the SOAP server remain idle before
     * exiting
     */
    public void setSoapIdleMinutes(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of minutes the SOAP server remain idle before
     * exiting This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSoapIdleMinutesByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether potential network socket optimisations should be
     * used.
     */
    public void setSocketOptimizations(com.zeus.soap.zxtm._1_0.GlobalSettingsSocketOptimizations value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether potential network socket optimisations should be
     * used. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSocketOptimizationsByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSocketOptimizations value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSsldAccel is deprecated, please use setSSLHardwareAccelerator
     * instead.
     */
    public void setSsldAccel(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSsldAccel is deprecated, please use setSSLHardwareAccelerator
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSsldAccelByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSsldLibrary is deprecated, please use setSSLHardwareType
     * instead.
     */
    public void setSsldLibrary(com.zeus.soap.zxtm._1_0.GlobalSettingsSsldLibrary value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * setSsldLibrary is deprecated, please use setSSLHardwareType
     * instead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSsldLibraryByLocation(java.lang.String location, com.zeus.soap.zxtm._1_0.GlobalSettingsSsldLibrary value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how often the cache state is propagated to other traffic
     * managers in the cluster, in seconds.
     */
    public void setStateSyncTime(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set how often the cache state is propagated to other traffic
     * managers in the cluster, in seconds. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setStateSyncTimeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the timeout for state propagation between cluster members,
     * in seconds
     */
    public void setStateSyncTimeout(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the timeout for state propagation between cluster members,
     * in seconds This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setStateSyncTimeoutByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the operating system's read buffer, in bytes
     * (0 means use the system default).
     */
    public void setSystemReadBufferSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the operating system's read buffer, in bytes
     * (0 means use the system default). This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSystemReadBufferSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the operating system's write buffer, in bytes
     * (0 means use the system default).
     */
    public void setSystemWriteBufferSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the size of the operating system's write buffer, in bytes
     * (0 means use the system default). This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSystemWriteBufferSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether to remember past login attempts from usernames
     * that are not known to exist (should be No for an Admin Server accessible
     * from the public Internet).
     */
    public void setTrackUnknownUsers(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Traffic IP Groups allowed.
     */
    public void setTrafficIPGroupLimit(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of Traffic IP Groups allowed. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setTrafficIPGroupLimitByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the amount of buffered network data a TrafficScript rule
     * can buffer before a warning is logged, in bytes.
     */
    public void setTrafficScriptMemoryWarning(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the amount of buffered network data a TrafficScript rule
     * can buffer before a warning is logged, in bytes. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setTrafficScriptMemoryWarningByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of array elements that can be stored before
     * additional memory is allocated.
     */
    public void setTrafficscriptArrayElements(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of array elements that can be stored before
     * additional memory is allocated. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setTrafficscriptArrayElementsByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum size of the TrafficScript shared data pool
     * (specified as a percentage of system RAM, e.g. '5%', or an absolute
     * size, e.g. 200MB)
     */
    public void setTrafficscriptDataSize(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum size of the TrafficScript shared data pool
     * (specified as a percentage of system RAM, e.g. '5%', or an absolute
     * size, e.g. 200MB) This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setTrafficscriptDataSizeByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of instructions a TrafficScript rule
     * will run before being aborted.
     */
    public void setTrafficscriptMaxInstr(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of instructions a TrafficScript rule
     * will run before being aborted. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setTrafficscriptMaxInstrByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of regular expressions to cache
     */
    public void setTrafficscriptRegexCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the number of regular expressions to cache This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setTrafficscriptRegexCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of ways TrafficScript will attempt to
     * match a regular expression at each position in the subject string,
     * before it aborts the rule and reports a TrafficScript error.
     */
    public void setTrafficscriptRegexMatchLimit(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of ways TrafficScript will attempt to
     * match a regular expression at each position in the subject string,
     * before it aborts the rule and reports a TrafficScript error. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setTrafficscriptRegexMatchLimitByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the percentage of trafficscript!regex_match_limit at which
     * TrafficScript reports a performance warning.
     */
    public void setTrafficscriptRegexMatchWarnPerc(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the percentage of trafficscript!regex_match_limit at which
     * TrafficScript reports a performance warning. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setTrafficscriptRegexMatchWarnPercByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the 'pool.use' and 'pool.select' TrafficScript
     * functions accept variables as well as literal strings.
     */
    public void setTrafficscriptVariablePoolUse(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the 'pool.use' and 'pool.select' TrafficScript
     * functions accept variables as well as literal strings. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setTrafficscriptVariablePoolUseByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the banner text to be displayed on all Admin Server pages.
     */
    public void setUipageBanner(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the universal session
     * cache.
     */
    public void setUniversalSessionCacheSize(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of entries in the universal session
     * cache. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setUniversalSessionCacheSizeByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the estimated average length of the path for resources
     * to be cached
     */
    public void setWebcacheAvgPathLength(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the estimated average length of the path for resources
     * to be cached This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setWebcacheAvgPathLengthByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the webcache is stored on disk
     */
    public void setWebcacheDisk(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the webcache is stored on disk This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setWebcacheDiskByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the disk cache location
     */
    public void setWebcacheDiskDir(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the disk cache location This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setWebcacheDiskDirByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of files that can be stored in the web
     * cache
     */
    public void setWebcacheMaxFileNum(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum number of files that can be stored in the web
     * cache This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setWebcacheMaxFileNumByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the largest size of a cacheable object, relative to the
     * total cache size, e.g. '2%', or as an absolute size in kB (default),
     * MB or GB, e.g. '20MB'.
     */
    public void setWebcacheMaxFileSize(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the largest size of a cacheable object, relative to the
     * total cache size, e.g. '2%', or as an absolute size in kB (default),
     * MB or GB, e.g. '20MB'. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setWebcacheMaxFileSizeByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum length of the path for the resource being cached
     */
    public void setWebcacheMaxPathLength(org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum length of the path for the resource being cached
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setWebcacheMaxPathLengthByLocation(java.lang.String location, org.apache.axis.types.UnsignedInt value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the assignment sub-strings in the parameter string
     * are put into alphabetical order.
     */
    public void setWebcacheNormalizeQuery(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether the assignment sub-strings in the parameter string
     * are put into alphabetical order. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setWebcacheNormalizeQueryByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum size of the HTTP web page cache, (specified
     * as a percentage of system RAM, e.g. '20%', or an absolute size, e.g.
     * 200MB)
     */
    public void setWebcacheSize(java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set the maximum size of the HTTP web page cache, (specified
     * as a percentage of system RAM, e.g. '20%', or an absolute size, e.g.
     * 200MB) This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setWebcacheSizeByLocation(java.lang.String location, java.lang.String value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether an X-Cache-Info header to show cacheability should
     * be added.
     */
    public void setWebcacheVerbose(boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError;

    /**
     * Set whether an X-Cache-Info header to show cacheability should
     * be added. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setWebcacheVerboseByLocation(java.lang.String location, boolean value) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.DeploymentError;
}
