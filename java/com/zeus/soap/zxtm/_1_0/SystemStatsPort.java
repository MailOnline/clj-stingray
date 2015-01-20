/**
 * SystemStatsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemStatsPort extends java.rmi.Remote {

    /**
     * The number of actions configured in the traffic manager.
     */
    public int getActionNumber() throws java.rmi.RemoteException;

    /**
     * Gets the list of Alerting Actions configured.
     */
    public java.lang.String[] getActions() throws java.rmi.RemoteException;

    /**
     * Number of times this action has been processed, for each of
     * the named Actions.
     */
    public int[] getActionsProcessed(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The total number of ASP sessions stored in the cache.
     */
    public int getAspSessionCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of ASP sessions in the cache.
     */
    public int getAspSessionCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of ASP session lookups that succeeded.
     */
    public int getAspSessionCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a ASP session entry has been successfully found
     * in the cache.
     */
    public int getAspSessionCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a ASP session entry has been looked up in the
     * cache.
     */
    public int getAspSessionCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a ASP session entry has not been available
     * in the cache.
     */
    public int getAspSessionCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest ASP session in the cache (in seconds).
     */
    public int getAspSessionCacheOldest() throws java.rmi.RemoteException;

    /**
     * Number of connection errors that have occured when trying to
     * connect to an authentication server, for each of the named Authenticators.
     */
    public int[] getAuthenticatorErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this Authenticator has failed to authenticate,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorFails(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of Authenticators.
     */
    public int getAuthenticatorNumber() throws java.rmi.RemoteException;

    /**
     * Number of times this Authenticator has successfully authenticated,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorPasses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this Authenticator has been asked to authenticate,
     * for each of the named Authenticators.
     */
    public int[] getAuthenticatorRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Authenticators configured.
     */
    public java.lang.String[] getAuthenticators() throws java.rmi.RemoteException;

    /**
     * Bytes output by connections assigned to this bandwidth class,
     * for each of the named BandwidthClasses.
     */
    public long[] getBandwidthClassBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Guaranteed bandwidth class limit (kbits/s).  Currently unused,
     * for each of the named BandwidthClasses.
     */
    public int[] getBandwidthClassGuarantee(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum bandwidth class limit (kbits/s), for each of the named
     * BandwidthClasses.
     */
    public int[] getBandwidthClassMaximum(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of bandwidth classes defined.
     */
    public int getBandwidthClassNumber() throws java.rmi.RemoteException;

    /**
     * Gets the list of Bandwidth Classes configured.
     */
    public java.lang.String[] getBandwidthClasses() throws java.rmi.RemoteException;

    /**
     * The number of cloud credentials sets defined.
     */
    public int getCloudcredentialsClassNumber() throws java.rmi.RemoteException;

    /**
     * The number of instance creation API requests made with this
     * set of cloud credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsNodeCreations(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of instance destruction API requests made with this
     * set of cloud credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsNodeDeletions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of status API requests made with this set of cloud
     * credentials, for each of the named Cloudcredentialses.
     */
    public int[] getCloudcredentialsStatusRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Cloud Credentials configured.
     */
    public java.lang.String[] getCloudcredentialses() throws java.rmi.RemoteException;

    /**
     * Number of entries in the TrafficScript data.get()/set() storage.
     */
    public int getDataEntries() throws java.rmi.RemoteException;

    /**
     * Number of bytes used in the TrafficScript data.get()/set()
     * storage.
     */
    public int getDataMemoryUsage() throws java.rmi.RemoteException;

    /**
     * The number of event configurations.
     */
    public int getEventNumber() throws java.rmi.RemoteException;

    /**
     * Gets the list of Event Types configured.
     */
    public java.lang.String[] getEvents() throws java.rmi.RemoteException;

    /**
     * Number of times this event configuration has matched, for each
     * of the named Events.
     */
    public int[] getEventsMatched(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Events seen by the traffic Manager's event handling process.
     */
    public int getEventsSeen() throws java.rmi.RemoteException;

    /**
     * Number of A records this GLB Service has discarded, for each
     * of the named GlbServices.
     */
    public int[] getGlbServiceDiscarded(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of GLB Services on this system.
     */
    public int getGlbServiceNumber() throws java.rmi.RemoteException;

    /**
     * Number of A records this GLB Service has altered, for each
     * of the named GlbServices.
     */
    public int[] getGlbServiceResponses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of A records this GLB Service has passed through unmodified,
     * for each of the named GlbServices.
     */
    public int[] getGlbServiceUnmodified(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of GLB services configured.
     */
    public java.lang.String[] getGlbServices() throws java.rmi.RemoteException;

    /**
     * The number of collisions reported by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceCollisions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of network interfaces.
     */
    public int getInterfaceNumber() throws java.rmi.RemoteException;

    /**
     * Bytes received by this interface, for each of the named Interfaces.
     */
    public long[] getInterfaceRxBytes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of receive errors reported by this interface, for
     * each of the named Interfaces.
     */
    public int[] getInterfaceRxErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of packets received by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceRxPackets(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes transmitted by this interface, for each of the named
     * Interfaces.
     */
    public long[] getInterfaceTxBytes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of transmit errors reported by this interface, for
     * each of the named Interfaces.
     */
    public int[] getInterfaceTxErrors(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of packets transmitted by this interface, for each
     * of the named Interfaces.
     */
    public int[] getInterfaceTxPackets(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Network Interfaces configured.
     */
    public java.lang.String[] getInterfaces() throws java.rmi.RemoteException;

    /**
     * The total number of IP sessions stored in the cache.
     */
    public int getIpSessionCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of IP sessions in the cache.
     */
    public int getIpSessionCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of IP session lookups that succeeded.
     */
    public int getIpSessionCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a IP session entry has been successfully found
     * in the cache.
     */
    public int getIpSessionCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a IP session entry has been looked up in the
     * cache.
     */
    public int getIpSessionCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a IP session entry has not been available in
     * the cache.
     */
    public int getIpSessionCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest IP session in the cache (in seconds).
     */
    public int getIpSessionCacheOldest() throws java.rmi.RemoteException;

    /**
     * The total number of J2EE sessions stored in the cache.
     */
    public int getJ2EeSessionCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of J2EE sessions in the cache.
     */
    public int getJ2EeSessionCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of J2EE session lookups that succeeded.
     */
    public int getJ2EeSessionCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a J2EE session entry has been successfully
     * found in the cache.
     */
    public int getJ2EeSessionCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a J2EE session entry has been looked up in
     * the cache.
     */
    public int getJ2EeSessionCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a J2EE session entry has not been available
     * in the cache.
     */
    public int getJ2EeSessionCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest J2EE session in the cache (in seconds).
     */
    public int getJ2EeSessionCacheOldest() throws java.rmi.RemoteException;

    /**
     * The number of License keys.
     */
    public int getLicensekeyNumber() throws java.rmi.RemoteException;

    /**
     * Bytes sent to this listening IP, for each of the specified
     * ListenIPs.
     */
    public long[] getListenIPBytesIn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes sent from this listening IP, for each of the specified
     * ListenIPs.
     */
    public long[] getListenIPBytesOut(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * TCP connections currently established to this listening IP,
     * for each of the specified ListenIPs.
     */
    public int[] getListenIPCurrentConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum number of simultaneous TCP connections this listening
     * IP has processed at any one time, for each of the specified ListenIPs.
     */
    public int[] getListenIPMaxConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests sent to this listening IP, for each of the specified
     * ListenIPs.
     */
    public int[] getListenIPTotalConn(java.lang.String[] listen_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of all IP addresses that Virtual Servers are
     * listening on.
     */
    public java.lang.String[] getListenIPs() throws java.rmi.RemoteException;

    /**
     * The mean load metric for this location, for each of the named
     * Locations.
     */
    public int[] getLocationLoad(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of A records that have been altered to point to this
     * location, for each of the named Locations.
     */
    public int[] getLocationResponses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Locations configured.
     */
    public java.lang.String[] getLocations() throws java.rmi.RemoteException;

    /**
     * The number of Monitors.
     */
    public int getMonitorNumber() throws java.rmi.RemoteException;

    /**
     * Bytes received from this node, for each of the specified Nodes.
     */
    public long[] getNodeBytesFromNode(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes sent to this node, for each of the specified Nodes.
     */
    public long[] getNodeBytesToNode(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Current connections established to this node, includes idle
     * connections, for each of the specified Nodes.
     */
    public int[] getNodeCurrentConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Active connections established to this node, does not include
     * idle connections, for each of the specified Nodes.
     */
    public int[] getNodeCurrentRequests(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of timeouts, connection problems and other errors for
     * this node, for each of the specified Nodes.
     */
    public int[] getNodeErrors(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Failures of this node, for each of the specified Nodes.
     */
    public int[] getNodeFailures(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of idle HTTP connections to this node, for each of the
     * specified Nodes.
     */
    public int[] getNodeIdleConns(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests that created a new connection to this node, for each
     * of the specified Nodes.
     */
    public int[] getNodeNewConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of nodes on this system (includes IPv4 and IPv6
     * nodes).
     */
    public int getNodeNumber() throws java.rmi.RemoteException;

    /**
     * Requests that reused an existing pooled/keepalive connection
     * rather than creating a new TCP connection, for each of the specified
     * Nodes.
     */
    public int[] getNodePooledConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum response time (ms) in the last second for this node,
     * for each of the specified Nodes.
     */
    public int[] getNodeResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Mean response time (ms) in the last second for this node, for
     * each of the specified Nodes.
     */
    public int[] getNodeResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Minimum response time (ms) in the last second for this node,
     * for each of the specified Nodes.
     */
    public int[] getNodeResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The state of this node, for each of the specified Nodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsNodeState[] getNodeState(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests sent to this node, for each of the specified Nodes.
     */
    public int[] getNodeTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsNode[] nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Retrieves the list of available Nodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsNode[] getNodes() throws java.rmi.RemoteException;

    /**
     * Total number of idle HTTP connections to all nodes (used for
     * future HTTP requests).
     */
    public int getNumIdleConnections() throws java.rmi.RemoteException;

    /**
     * The number of traffic manager child processes.
     */
    public int getNumberChildProcesses() throws java.rmi.RemoteException;

    /**
     * Requests for DNS A records resolved from the traffic manager's
     * local cache.
     */
    public int getNumberDNSACacheHits() throws java.rmi.RemoteException;

    /**
     * Requests for DNS A records (hostname->IP address) made by the
     * traffic manager.
     */
    public int getNumberDNSARequests() throws java.rmi.RemoteException;

    /**
     * Requests for DNS PTR records resolved from the traffic manager's
     * local cache.
     */
    public int getNumberDNSPTRCacheHits() throws java.rmi.RemoteException;

    /**
     * Requests for DNS PTR records (IP address->hostname) made by
     * the traffic manager.
     */
    public int getNumberDNSPTRRequests() throws java.rmi.RemoteException;

    /**
     * Malformed SNMP requests received.
     */
    public int getNumberSNMPBadRequests() throws java.rmi.RemoteException;

    /**
     * SNMP GetBulkRequests received.
     */
    public int getNumberSNMPGetBulkRequests() throws java.rmi.RemoteException;

    /**
     * SNMP GetNextRequests received.
     */
    public int getNumberSNMPGetNextRequests() throws java.rmi.RemoteException;

    /**
     * SNMP GetRequests received.
     */
    public int getNumberSNMPGetRequests() throws java.rmi.RemoteException;

    /**
     * SNMP requests dropped due to access restrictions.
     */
    public int getNumberSNMPUnauthorisedRequests() throws java.rmi.RemoteException;

    /**
     * The draining state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceDraining[] getPerLocationServiceDraining(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The frontend state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceFrontendState[] getPerLocationServiceFrontendState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The load metric for this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public int[] getPerLocationServiceLoad(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The monitor state of this location for this GLB Service, for
     * each of the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceMonitorState[] getPerLocationServiceMonitorState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of A records that have been altered to point to this
     * location for this GLB Service, for each of the specified PerLocationServices.
     */
    public int[] getPerLocationServiceResponses(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The state of this location for this GLB Service, for each of
     * the specified PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationServiceState[] getPerLocationServiceState(com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] per_location_services) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Retrieves the list of available PerLocationServices.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerLocationService[] getPerLocationServices() throws java.rmi.RemoteException;

    /**
     * Maximum response time (ms) in the last second for this SLM
     * class to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Mean response time (ms) in the last second for this SLM class
     * to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Minimum response time (ms) in the last second for this SLM
     * class to this node, for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests handled by this SLM class to this node, for each of
     * the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Non-conforming requests handled by this SLM class to this node,
     * for each of the specified PerNodeServiceLevels.
     */
    public int[] getPerNodeServiceLevelTotalNonConf(com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] per_node_service_levels) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Retrieves the list of available PerNodeServiceLevels.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerNodeServiceLevel[] getPerNodeServiceLevels() throws java.rmi.RemoteException;

    /**
     * Bytes received from this node, for each of the specified PerPoolNodes.
     */
    public long[] getPerPoolNodeBytesFromNode(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes sent to this node, for each of the specified PerPoolNodes.
     */
    public long[] getPerPoolNodeBytesToNode(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Current connections established to a node, includes idle connections,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeCurrentConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Active connections established to this node, does not include
     * idle connections, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeCurrentRequests(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of timeouts, connection problems and other errors for
     * this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeErrors(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Failures of this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeFailures(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of idle HTTP connections to this node, for each of the
     * specified PerPoolNodes.
     */
    public int[] getPerPoolNodeIdleConns(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests that created a new connection to this node, for each
     * of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeNewConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of nodes on this system.
     */
    public int getPerPoolNodeNumber() throws java.rmi.RemoteException;

    /**
     * Requests that reused an existing pooled/keepalive connection
     * rather than creating a new TCP connection, for each of the specified
     * PerPoolNodes.
     */
    public int[] getPerPoolNodePooledConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum response time (ms) in the last second for this node,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMax(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Mean response time (ms) in the last second for this node, for
     * each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMean(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Minimum response time (ms) in the last second for this node,
     * for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeResponseMin(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The state of this node, for each of the specified PerPoolNodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNodeState[] getPerPoolNodeState(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests sent to this node, for each of the specified PerPoolNodes.
     */
    public int[] getPerPoolNodeTotalConn(com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] per_pool_nodes) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Retrieves the list of available PerPoolNodes.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPerPoolNode[] getPerPoolNodes() throws java.rmi.RemoteException;

    /**
     * The load-balancing algorithm the pool uses, for each of the
     * named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolAlgorithm[] getPoolAlgorithm(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes received by this pool from nodes, for each of the named
     * Pools.
     */
    public long[] getPoolBytesIn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes sent by this pool to nodes, for each of the named Pools.
     */
    public long[] getPoolBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Total connections currently queued to this pool, for each of
     * the named Pools.
     */
    public int[] getPoolConnsQueued(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * The number of nodes in this pool that are disabled, for each
     * of the named Pools.
     */
    public int[] getPoolDisabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of nodes in this pool which are draining, for each
     * of the named Pools.
     */
    public int[] getPoolDraining(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMaxQueueTime(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * Mean time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMeanQueueTime(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * Minimum time a connection was queued for, over the last second,
     * for each of the named Pools.
     */
    public int[] getPoolMinQueueTime(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * The number of nodes registered with this pool, for each of
     * the named Pools.
     */
    public int[] getPoolNodes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of pools on this system.
     */
    public int getPoolNumber() throws java.rmi.RemoteException;

    /**
     * The session persistence method this pool uses, for each of
     * the named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolPersistence[] getPoolPersistence(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Total connections that timed-out while queued, for each of
     * the named Pools.
     */
    public int[] getPoolQueueTimeouts(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * Sessions migrated to a new node because the desired node was
     * unavailable, for each of the named Pools.
     */
    public int[] getPoolSessionMigrated(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The state of this pool, for each of the named Pools.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsPoolState[] getPoolState(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests sent to this pool, for each of the named Pools.
     */
    public int[] getPoolTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Pools configured.
     */
    public java.lang.String[] getPools() throws java.rmi.RemoteException;

    /**
     * Connections that have entered the rate class and have been
     * queued, for each of the named RateClasses.
     */
    public int[] getRateClassConnsEntered(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections that have left the rate class, for each of the
     * named RateClasses.
     */
    public int[] getRateClassConnsLeft(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The average rate that requests are passing through this rate
     * class, for each of the named RateClasses.
     */
    public int[] getRateClassCurrentRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests dropped from this rate class without being processed
     * (e.g. timeouts), for each of the named RateClasses.
     */
    public int[] getRateClassDropped(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The maximum rate that requests may pass through this rate class
     * (requests/min), for each of the named RateClasses.
     */
    public int[] getRateClassMaxRatePerMin(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The maximum rate that requests may pass through this rate class
     * (requests/sec), for each of the named RateClasses.
     */
    public int[] getRateClassMaxRatePerSec(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of rate classes defined.
     */
    public int getRateClassNumber() throws java.rmi.RemoteException;

    /**
     * The current number of requests queued by this rate class, for
     * each of the named RateClasses.
     */
    public int[] getRateClassQueueLength(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Rate Classes configured.
     */
    public java.lang.String[] getRateClasses() throws java.rmi.RemoteException;

    /**
     * Number of times this TrafficScript rule has aborted, for each
     * of the named Rules.
     */
    public int[] getRuleAborts(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this TrafficScript rule has discarded the connection,
     * for each of the named Rules.
     */
    public int[] getRuleDiscards(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this TrafficScript rule has been executed,
     * for each of the named Rules.
     */
    public int[] getRuleExecutions(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of TrafficScript rules.
     */
    public int getRuleNumber() throws java.rmi.RemoteException;

    /**
     * Number of times this TrafficScript rule has selected a pool
     * to use, for each of the named Rules.
     */
    public int[] getRulePoolSelect(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this TrafficScript rule has responded directly
     * to the client, for each of the named Rules.
     */
    public int[] getRuleResponds(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of times this TrafficScript rule has forced the request
     * to be retried, for each of the named Rules.
     */
    public int[] getRuleRetries(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Rules configured.
     */
    public java.lang.String[] getRules() throws java.rmi.RemoteException;

    /**
     * Percentage of requests associated with this SLM class that
     * are conforming, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelConforming(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of connections currently associated with this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelCurrentConns(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Indicates if this SLM class is currently conforming, for each
     * of the named ServiceLevels.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsServiceLevelIsOK[] getServiceLevelIsOK(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of SLM classes defined.
     */
    public int getServiceLevelNumber() throws java.rmi.RemoteException;

    /**
     * Maximum response time (ms) in the last second for this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMax(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Mean response time (ms) in the last second for this SLM class,
     * for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMean(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Minimum response time (ms) in the last second for this SLM
     * class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelResponseMin(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests handled by this SLM class, for each of the named ServiceLevels.
     */
    public int[] getServiceLevelTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Non-conforming requests handled by this SLM class, for each
     * of the named ServiceLevels.
     */
    public int[] getServiceLevelTotalNonConf(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Service Level Monitoring classes configured.
     */
    public java.lang.String[] getServiceLevels() throws java.rmi.RemoteException;

    /**
     * The time (in hundredths of a second) since this service protection
     * class last refused a connection (this value will wrap if no connections
     * are refused in more than 497 days), for each of the named ServiceProts.
     */
    public int[] getServiceProtLastRefusalTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of service protection classes defined.
     */
    public int getServiceProtNumber() throws java.rmi.RemoteException;

    /**
     * Connections refused by this service protection class because
     * the  request contained disallowed binary content, for each of the
     * named ServiceProts.
     */
    public int[] getServiceProtRefusalBinary(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  top 10 source IP addresses issued too many concurrent connections,
     * for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConc10IP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  source IP address issued too many concurrent connections, for
     * each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConc1IP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  source IP address issued too many connections within 60 seconds,
     * for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalConnRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  source IP address was banned, for each of the named ServiceProts.
     */
    public int[] getServiceProtRefusalIP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  HTTP request was not RFC 2396 compliant, for each of the named
     * ServiceProts.
     */
    public int[] getServiceProtRefusalRFC2396(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class because
     * the  request was larger than the defined limits allowed, for each
     * of the named ServiceProts.
     */
    public int[] getServiceProtRefusalSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections refused by this service protection class, for each
     * of the named ServiceProts.
     */
    public int[] getServiceProtTotalRefusal(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Service Protection Classes configured.
     */
    public java.lang.String[] getServiceProts() throws java.rmi.RemoteException;

    /**
     * The total number of SSL sessions stored in the server cache.
     */
    public int getSslCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of SSL entries in the server cache.
     */
    public int getSslCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of SSL server cache lookups that succeeded.
     */
    public int getSslCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL entry has been successfully found in
     * the server cache.
     */
    public int getSslCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL entry has been looked up in the server
     * cache.
     */
    public int getSslCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL entry has not been available in the server
     * cache.
     */
    public int getSslCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest SSL session in the server cache (in seconds).
     */
    public int getSslCacheOldest() throws java.rmi.RemoteException;

    /**
     * Bytes decrypted with 3DES.
     */
    public int getSslCipher3DESDecrypts() throws java.rmi.RemoteException;

    /**
     * Bytes encrypted with 3DES.
     */
    public int getSslCipher3DESEncrypts() throws java.rmi.RemoteException;

    /**
     * Bytes decrypted with AES.
     */
    public int getSslCipherAESDecrypts() throws java.rmi.RemoteException;

    /**
     * Bytes encrypted with AES.
     */
    public int getSslCipherAESEncrypts() throws java.rmi.RemoteException;

    /**
     * Bytes decrypted with DES.
     */
    public int getSslCipherDESDecrypts() throws java.rmi.RemoteException;

    /**
     * Bytes encrypted with DES.
     */
    public int getSslCipherDESEncrypts() throws java.rmi.RemoteException;

    /**
     * Bytes decrypted with a symmetric cipher.
     */
    public int getSslCipherDecrypts() throws java.rmi.RemoteException;

    /**
     * Bytes encrypted with a symmetric cipher.
     */
    public int getSslCipherEncrypts() throws java.rmi.RemoteException;

    /**
     * Bytes decrypted with RC4.
     */
    public int getSslCipherRC4Decrypts() throws java.rmi.RemoteException;

    /**
     * Bytes encrypted with RC4.
     */
    public int getSslCipherRC4Encrypts() throws java.rmi.RemoteException;

    /**
     * Number of RSA decrypts.
     */
    public int getSslCipherRSADecrypts() throws java.rmi.RemoteException;

    /**
     * Number of external RSA decrypts.
     */
    public int getSslCipherRSADecryptsExternal() throws java.rmi.RemoteException;

    /**
     * Number of RSA encrypts.
     */
    public int getSslCipherRSAEncrypts() throws java.rmi.RemoteException;

    /**
     * Number of external RSA encrypts.
     */
    public int getSslCipherRSAEncryptsExternal() throws java.rmi.RemoteException;

    /**
     * Number of times a client certificate has expired.
     */
    public int getSslClientCertExpired() throws java.rmi.RemoteException;

    /**
     * Number of times a client certificate was invalid.
     */
    public int getSslClientCertInvalid() throws java.rmi.RemoteException;

    /**
     * Number of times a client certificate was required but not supplied.
     */
    public int getSslClientCertNotSent() throws java.rmi.RemoteException;

    /**
     * Number of times a client certificate was revoked.
     */
    public int getSslClientCertRevoked() throws java.rmi.RemoteException;

    /**
     * Number of SSL connections negotiated.
     */
    public int getSslConnections() throws java.rmi.RemoteException;

    /**
     * Number of SSLv2 handshakes.
     */
    public int getSslHandshakeSSLv2() throws java.rmi.RemoteException;

    /**
     * Number of SSLv3 handshakes.
     */
    public int getSslHandshakeSSLv3() throws java.rmi.RemoteException;

    /**
     * Number of TLSv1.0 handshakes.
     */
    public int getSslHandshakeTLSv1() throws java.rmi.RemoteException;

    /**
     * Number of TLSv1.1 handshakes.
     */
    public int getSslHandshakeTLSv11() throws java.rmi.RemoteException;

    /**
     * The total number of SSL session persistence entries stored
     * in the cache.
     */
    public int getSslSessionCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of SSL session persistence entries in the
     * cache.
     */
    public int getSslSessionCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of SSL session persistence lookups that succeeded.
     */
    public int getSslSessionCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL session persistence entry has been successfully
     * found in the cache.
     */
    public int getSslSessionCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL session persistence entry has been looked
     * up in the cache.
     */
    public int getSslSessionCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a SSL session persistence entry has not been
     * available in the cache.
     */
    public int getSslSessionCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest SSL session in the cache (in seconds).
     */
    public int getSslSessionCacheOldest() throws java.rmi.RemoteException;

    /**
     * Number of times the SSL session id was found in the disk cache
     * and reused (deprecated, will always return 0).
     */
    public int getSslSessionIDDiskCacheHit() throws java.rmi.RemoteException;

    /**
     * Number of times the SSL session id was not found in the disk
     * cache (deprecated, will always return 0).
     */
    public int getSslSessionIDDiskCacheMiss() throws java.rmi.RemoteException;

    /**
     * Number of times the SSL session id was found in the cache and
     * reused.
     */
    public int getSslSessionIDMemCacheHit() throws java.rmi.RemoteException;

    /**
     * Number of times the SSL session id was not found in the cache.
     */
    public int getSslSessionIDMemCacheMiss() throws java.rmi.RemoteException;

    /**
     * The number of Steelheads.
     */
    public int getSteelheadNumber() throws java.rmi.RemoteException;

    /**
     * The current number of connections being forwarded to the Cloud
     * Steelhead for optimization, for each of the named Steelheads.
     */
    public int[] getSteelheadOptimized(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Cloud Steelheads configured.
     */
    public java.lang.String[] getSteelheads() throws java.rmi.RemoteException;

    /**
     * Percentage of time that the CPUs are busy.
     */
    public int getSysCPUBusyPercent() throws java.rmi.RemoteException;

    /**
     * Percentage of time that the CPUs are idle.
     */
    public int getSysCPUIdlePercent() throws java.rmi.RemoteException;

    /**
     * Percentage of time that the CPUs are busy running system code.
     */
    public int getSysCPUSystemBusyPercent() throws java.rmi.RemoteException;

    /**
     * Percentage of time that the CPUs are busy running user-space
     * code.
     */
    public int getSysCPUUserBusyPercent() throws java.rmi.RemoteException;

    /**
     * Number of free file descriptors.
     */
    public int getSysFDsFree() throws java.rmi.RemoteException;

    /**
     * Buffer memory (MBytes).
     */
    public int getSysMemBuffered() throws java.rmi.RemoteException;

    /**
     * Free memory (MBytes).
     */
    public int getSysMemFree() throws java.rmi.RemoteException;

    /**
     * Memory used (MBytes).
     */
    public int getSysMemInUse() throws java.rmi.RemoteException;

    /**
     * Total swap space (MBytes).
     */
    public int getSysMemSwapTotal() throws java.rmi.RemoteException;

    /**
     * Amount of swap space in use (MBytes).
     */
    public int getSysMemSwapped() throws java.rmi.RemoteException;

    /**
     * Total memory (MBytes).
     */
    public int getSysMemTotal() throws java.rmi.RemoteException;

    /**
     * The time (in hundredths of a second) since the configuration
     * of traffic manager was updated (this value will wrap if no configuration
     * changes are made for 497 days).
     */
    public int getTimeLastConfigUpdate() throws java.rmi.RemoteException;

    /**
     * Total errors returned from the backend servers.
     */
    public int getTotalBackendServerErrors() throws java.rmi.RemoteException;

    /**
     * Total number of malformed DNS response packets encountered
     * from the backend servers.
     */
    public int getTotalBadDNSPackets() throws java.rmi.RemoteException;

    /**
     * Bytes received by the traffic manager from clients.
     */
    public long getTotalBytesIn() throws java.rmi.RemoteException;

    /**
     * Bytes sent by the traffic manager to clients.
     */
    public long getTotalBytesOut() throws java.rmi.RemoteException;

    /**
     * Total number of TCP connections received.
     */
    public int getTotalConn() throws java.rmi.RemoteException;

    /**
     * Number of TCP connections currently established.
     */
    public int getTotalCurrentConn() throws java.rmi.RemoteException;

    /**
     * Total number of DNS response packets handled.
     */
    public int getTotalDNSResponses() throws java.rmi.RemoteException;

    /**
     * Total number of TCP requests recieved.
     */
    public int getTotalRequests() throws java.rmi.RemoteException;

    /**
     * Total number of TCP requests being processed, after applying
     * TPS limits.
     */
    public int getTotalTransactions() throws java.rmi.RemoteException;

    /**
     * Number of ARP messages sent for raised Traffic IP Addresses.
     */
    public int getTrafficIPARPMessage() throws java.rmi.RemoteException;

    /**
     * Number of ping requests sent to the gateway machine.
     */
    public int getTrafficIPGatewayPingRequests() throws java.rmi.RemoteException;

    /**
     * Number of ping responses received from the gateway machine.
     */
    public int getTrafficIPGatewayPingResponses() throws java.rmi.RemoteException;

    /**
     * Number of ping requests sent to the backend nodes.
     */
    public int getTrafficIPNodePingRequests() throws java.rmi.RemoteException;

    /**
     * Number of ping responses received from the backend nodes.
     */
    public int getTrafficIPNodePingResponses() throws java.rmi.RemoteException;

    /**
     * The number of traffic IP addresses on this system (includes
     * IPv4 and IPv6 addresses).
     */
    public int getTrafficIPNumber() throws java.rmi.RemoteException;

    /**
     * The number of traffic IP addresses currently raised on this
     * system (includes IPv4 and IPv6 addresses).
     */
    public int getTrafficIPNumberRaised() throws java.rmi.RemoteException;

    /**
     * Number of ping response errors.
     */
    public int getTrafficIPPingResponseErrors() throws java.rmi.RemoteException;

    /**
     * Whether this traffic IP address is currently being hosted by
     * this traffic manager, for each of the specified TrafficIPs.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsTrafficIPState[] getTrafficIPState(java.lang.String[] traffic_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The time (in hundredths of a second) since trafficIPState last
     * changed (this value will wrap if the state hasn't changed for 497
     * days), for each of the specified TrafficIPs.
     */
    public int[] getTrafficIPTime(java.lang.String[] traffic_ip_addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Traffic IP addresses configured.
     */
    public java.lang.String[] getTrafficIPs() throws java.rmi.RemoteException;

    /**
     * The total number of universal sessions stored in the cache.
     */
    public int getUniSessionCacheEntries() throws java.rmi.RemoteException;

    /**
     * The maximum number of universal sessions in the cache.
     */
    public int getUniSessionCacheEntriesMax() throws java.rmi.RemoteException;

    /**
     * The percentage of universal session lookups that succeeded.
     */
    public int getUniSessionCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a universal session entry has been successfully
     * found in the cache.
     */
    public int getUniSessionCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a universal session entry has been looked up
     * in the cache.
     */
    public int getUniSessionCacheLookups() throws java.rmi.RemoteException;

    /**
     * Number of times a universal session entry has not been available
     * in the cache.
     */
    public int getUniSessionCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest universal session in the cache (in seconds).
     */
    public int getUniSessionCacheOldest() throws java.rmi.RemoteException;

    /**
     * The time (in hundredths of a second) that Stingray software
     * has been operational for (this value will wrap if it has been running
     * for more than 497 days).
     */
    public int getUpTime() throws java.rmi.RemoteException;

    /**
     * The value of the 64-bit user counter, for each of the named
     * UserCounter64s.
     */
    public long[] getUserCounter64Value(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of 64-bit User counters configured.
     */
    public java.lang.String[] getUserCounter64S() throws java.rmi.RemoteException;

    /**
     * The number of user defined counters.
     */
    public int getUserCounterNumber() throws java.rmi.RemoteException;

    /**
     * The value of the user counter, for each of the named UserCounters.
     */
    public int[] getUserCounterValue(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of User counters configured.
     */
    public java.lang.String[] getUserCounters() throws java.rmi.RemoteException;

    /**
     * Bytes received by this virtual server from clients, for each
     * of the named Virtualservers.
     */
    public long[] getVirtualserverBytesIn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes sent by this virtual server to clients, for each of the
     * named Virtualservers.
     */
    public long[] getVirtualserverBytesOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections closed by this virtual server because the 'connect_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverConnectTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of transaction or protocol errors in this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverConnectionErrors(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * Number of connection failures in this virtual server, for each
     * of the named Virtualservers.
     */
    public int[] getVirtualserverConnectionFailures(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * TCP connections currently established to this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverCurrentConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections closed by this virtual server because the 'timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverDataTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Direct replies from this virtual server, without forwarding
     * to a node, for each of the named Virtualservers.
     */
    public int[] getVirtualserverDirectReplies(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections discarded by this virtual server, for each of the
     * named Virtualservers.
     */
    public int[] getVirtualserverDiscard(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Responses which have been compressed by content compression,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverGzip(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Bytes of network traffic saved by content compression, for
     * each of the named Virtualservers.
     */
    public long[] getVirtualserverGzipBytesSaved(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Percentage hit rate of the web cache for this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheHitRate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * HTTP responses sent directly from the web cache by this virtual
     * server, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheHits(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * HTTP requests that are looked up in the web cache by this virtual
     * server, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpCacheLookups(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * HTTP Set-Cookie headers, supplied by a node, that have been
     * rewritten, for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpRewriteCookie(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * HTTP Location headers, supplied by a node, that have been rewritten,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverHttpRewriteLocation(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections closed by this virtual server because the 'keepalive_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverKeepaliveTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Maximum number of simultaneous TCP connections this virtual
     * server has processed at any one time, for each of the named Virtualservers.
     */
    public int[] getVirtualserverMaxConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The number of virtual servers.
     */
    public int getVirtualserverNumber() throws java.rmi.RemoteException;

    /**
     * The port the virtual server listens on, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverPort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * The protocol the virtual server is operating, for each of the
     * named Virtualservers.
     */
    public com.zeus.soap.zxtm._1_0.SystemStatsVirtualserverProtocol[] getVirtualserverProtocol(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Number of SIP requests rejected due to them exceeding the maximum
     * amount of memory allocated to the connection, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverSIPRejectedRequests(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Total number of SIP INVITE requests seen by this virtual server,
     * for each of the named Virtualservers.
     */
    public int[] getVirtualserverSIPTotalCalls(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Requests received by this virtual server, for each of the named
     * Virtualservers.
     */
    public int[] getVirtualserverTotalConn(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * UDP datagrams processed by this virtual server, for each of
     * the named Virtualservers.
     */
    public int[] getVirtualserverTotalDgram(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Connections closed by this virtual server because the 'udp_timeout'
     * interval was exceeded, for each of the named Virtualservers.
     */
    public int[] getVirtualserverUdpTimedOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Gets the list of Virtual Servers configured and enabled.
     */
    public java.lang.String[] getVirtualservers() throws java.rmi.RemoteException;

    /**
     * The number of items in the web cache.
     */
    public int getWebCacheEntries() throws java.rmi.RemoteException;

    /**
     * The percentage of web cache lookups that succeeded.
     */
    public int getWebCacheHitRate() throws java.rmi.RemoteException;

    /**
     * Number of times a page has been successfully found in the web
     * cache.
     */
    public long getWebCacheHits() throws java.rmi.RemoteException;

    /**
     * Number of times a page has been looked up in the web cache.
     */
    public long getWebCacheLookups() throws java.rmi.RemoteException;

    /**
     * The maximum number of items in the web cache.
     */
    public int getWebCacheMaxEntries() throws java.rmi.RemoteException;

    /**
     * The maximum amount of memory the web cache can use in kilobytes.
     */
    public int getWebCacheMemMaximum() throws java.rmi.RemoteException;

    /**
     * Total memory used by the web cache in kilobytes.
     */
    public int getWebCacheMemUsed() throws java.rmi.RemoteException;

    /**
     * Number of times a page has not been found in the web cache.
     */
    public long getWebCacheMisses() throws java.rmi.RemoteException;

    /**
     * The age of the oldest item in the web cache (in seconds).
     */
    public int getWebCacheOldest() throws java.rmi.RemoteException;

    /**
     * The number of traffic managers in the cluster.
     */
    public int getZxtmNumber() throws java.rmi.RemoteException;
}
