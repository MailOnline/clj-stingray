/**
 * VirtualServerPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface VirtualServerPort extends java.rmi.Remote {

    /**
     * For each named virtual server, add new MIME types to the list
     * of types to compress.
     */
    public void addCompressionMIMETypes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each named virtual server, add new MIME types to the list
     * of types to compress. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void addCompressionMIMETypesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on server responses for each of the
     * named virtual servers. New rules are run after existing rules. If
     * any of the rules are already configured to run, then they are enabled
     * and flags are set to the values passed in.
     */
    public void addResponseRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on server responses for each of the
     * named virtual servers. New rules are run after existing rules. If
     * any of the rules are already configured to run, then they are enabled
     * and flags are set to the values passed in. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addResponseRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on client requests for each of the
     * named virtual servers. New rules are run after existing rules. If
     * any of the rules are already configured to run, then they are enabled
     * and flags are set to the values passed in.
     */
    public void addRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new rules to be run on client requests for each of the
     * named virtual servers. New rules are run after existing rules. If
     * any of the rules are already configured to run, then they are enabled
     * and flags are set to the values passed in. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new certificate authorities for validating client certificates
     * for each of the named virtual servers.
     */
    public void addSSLClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add new certificate authorities for validating client certificates
     * for each of the named virtual servers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addSSLClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add CAs for which any client certificate they validate is considered
     * valid even if the client certificate's expiration date has passed,
     * for each of the named virtual servers.
     */
    public void addSSLNeverExpiringClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add CAs for which any client certificate they validate is considered
     * valid even if the client certificate's expiration date has passed,
     * for each of the named virtual servers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addSSLNeverExpiringClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Adds mappings between Certificate Authorities and OCSP responder
     * settings. Certificates issued by these authorities will be verified
     * with OCSP using these settings.
     */
    public void addSSLOCSPIssuers(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Adds mappings between Certificate Authorities and OCSP responder
     * settings. Certificates issued by these authorities will be verified
     * with OCSP using these settings. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void addSSLOCSPIssuersByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Adds the specified SSLSite objects to the named virtual servers.
     * These objects are mappings between destination addresses and the certificate
     * used for SSL decryption those addresses. Each certificate is the name
     * of an item in the SSL Certificates Catalog.
     */
    public void addSSLSites(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] ssl_sites) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Adds the specified SSLSite objects to the named virtual servers.
     * These objects are mappings between destination addresses and the certificate
     * used for SSL decryption those addresses. Each certificate is the name
     * of an item in the SSL Certificates Catalog. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void addSSLSitesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] ssl_sites) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Add each virtual servers, using the provided BasicInfo.
     */
    public void addVirtualServer(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerBasicInfo[] info) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Rename each of the named virtual servers.
     */
    public void copyVirtualServer(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Deletes the SSLSite objects that act on the IP addresses in
     * the site_ips array for each of the named virtual servers. These objects
     * are mappings between destination addresses and the certificate used
     * for SSL decryption those addresses. Each certificate is the name of
     * an item in the SSL Certificates Catalog.
     */
    public void deleteSSLSites(java.lang.String[] names, java.lang.String[][] site_ips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Deletes the SSLSite objects that act on the IP addresses in
     * the site_ips array for each of the named virtual servers. These objects
     * are mappings between destination addresses and the certificate used
     * for SSL decryption those addresses. Each certificate is the name of
     * an item in the SSL Certificates Catalog. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void deleteSSLSitesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] site_ips) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete each of the named virtual servers.
     */
    public void deleteVirtualServer(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Edits the SSLSite objects that act on the IP addresses in the
     * site_ips array for each of the named virtual servers. These objects
     * are mappings between destination addresses and the certificate used
     * for SSL decryption those addresses. Each certificate is the name of
     * an item in the SSL Certificates Catalog.
     */
    public void editSSLSites(java.lang.String[] names, java.lang.String[][] site_ips, com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] ssl_sites) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Edits the SSLSite objects that act on the IP addresses in the
     * site_ips array for each of the named virtual servers. These objects
     * are mappings between destination addresses and the certificate used
     * for SSL decryption those addresses. Each certificate is the name of
     * an item in the SSL Certificates Catalog. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void editSSLSitesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] site_ips, com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] ssl_sites) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether a 'X-Cluster-Client-Ip' header should be added
     * to each HTTP request, for each of the named virtual servers. The 'X-Cluster-Client-Ip'
     * header contains the client's IP address.
     */
    public boolean[] getAddClusterClientIPHeader(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether a 'X-Cluster-Client-Ip' header should be added
     * to each HTTP request, for each of the named virtual servers. The 'X-Cluster-Client-Ip'
     * header contains the client's IP address. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getAddClusterClientIPHeaderByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should aptimize
     * web content.
     */
    public boolean[] getAptimizerEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should aptimize
     * web content. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getAptimizerEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Bandwidth Class that each of the named virtual servers
     * uses.
     */
    public java.lang.String[] getBandwidthClass(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Bandwidth Class that each of the named virtual servers
     * uses. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getBandwidthClassByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the basic information for each of the named virtual servers.
     * This information includes the port, the protocol the virtual server
     * handles and the default pool for the traffic.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerBasicInfo[] getBasicInfo(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the basic information for each of the named virtual servers.
     * This information includes the port, the protocol the virtual server
     * handles and the default pool for the traffic. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerBasicInfo[] getBasicInfoByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should compress
     * documents with no given size.
     */
    public boolean[] getCompressUnknownSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should compress
     * documents with no given size. This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getCompressUnknownSizeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should compress
     * web pages before sending to the client.
     */
    public boolean[] getCompressionEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should compress
     * web pages before sending to the client. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getCompressionEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the gzip compression level, for each of the named virtual
     * servers.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionLevel(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the gzip compression level, for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionLevelByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of MIME types to compress, for each of the named
     * virtual servers.
     */
    public java.lang.String[][] getCompressionMIMETypes(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the list of MIME types to compress, for each of the named
     * virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[][] getCompressionMIMETypesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum document size to compress, in bytes, for each
     * of the named virtual servers.  A document size of '0' means 'unlimited'.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionMaxSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the maximum document size to compress, in bytes, for each
     * of the named virtual servers.  A document size of '0' means 'unlimited'.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionMaxSizeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum document size to compress, in bytes, for each
     * of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionMinSize(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the minimum document size to compress, in bytes, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getCompressionMinSizeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time to wait for data from a new connection, in seconds,
     * for each of the named virtual servers. If no data is received in this
     * time, the connection will be closed.
     */
    public org.apache.axis.types.UnsignedInt[] getConnectTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time to wait for data from a new connection, in seconds,
     * for each of the named virtual servers. If no data is received in this
     * time, the connection will be closed. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getConnectTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how each of the named virtual servers should rewrite the
     * domain portion of cookies set by a back-end web server.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerCookieDomainRewriteMode[] getCookieDomainRewriteMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how each of the named virtual servers should rewrite the
     * domain portion of cookies set by a back-end web server. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerCookieDomainRewriteMode[] getCookieDomainRewriteModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the domain to use when rewriting cookie domains, for each
     * of the named virtual servers.
     */
    public java.lang.String[] getCookieNamedDomain(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the domain to use when rewriting cookie domains, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getCookieNamedDomainByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, get the regex and replacement
     * for rewriting the path portion of a cookie.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] getCookiePathRewrite(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, get the regex and replacement
     * for rewriting the path portion of a cookie. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] getCookiePathRewriteByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should modify
     * the 'secure' tag of cookies set by a back-end web server.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerCookieSecureFlagRewriteMode[] getCookieSecureFlagRewriteMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should modify
     * the 'secure' tag of cookies set by a back-end web server. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerCookieSecureFlagRewriteMode[] getCookieSecureFlagRewriteModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default Pool that traffic is sent to for each of the
     * named virtual servers.
     */
    public java.lang.String[] getDefaultPool(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default Pool that traffic is sent to for each of the
     * named virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getDefaultPoolByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers is enabled (i.e.
     * serving traffic).
     */
    public boolean[] getEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers is enabled (i.e.
     * serving traffic). This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the file names of the error texts that each of the named
     * virtual servers will send back to a client in case of back-end or
     * internal errors.
     */
    public java.lang.String[] getErrorFile(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the file names of the error texts that each of the named
     * virtual servers will send back to a client in case of back-end or
     * internal errors. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getErrorFileByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the source port each of the named virtual servers should
     * use for active-mode FTP data connections.  If 0, a random high port
     * will be used, otherwise the specified port will be used.  If a port
     * below 1024 is required you must first explicitly permit use of low
     * ports with the ftp_data_bind_low global setting.
     */
    public org.apache.axis.types.UnsignedInt[] getFTPDataSourcePort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the source port each of the named virtual servers should
     * use for active-mode FTP data connections.  If 0, a random high port
     * will be used, otherwise the specified port will be used.  If a port
     * below 1024 is required you must first explicitly permit use of low
     * ports with the ftp_data_bind_low global setting. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getFTPDataSourcePortByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should require
     * incoming FTP data connections (from clients) to originate from the
     * same IP address as the corresponding control connection.
     */
    public boolean[] getFTPForceClientSecure(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should require
     * incoming FTP data connections (from clients) to originate from the
     * same IP address as the corresponding control connection. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getFTPForceClientSecureByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should require
     * incoming FTP data connections (from nodes) to originate from the same
     * IP address as the corresponding control connection.
     */
    public boolean[] getFTPForceServerSecure(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should require
     * incoming FTP data connections (from nodes) to originate from the same
     * IP address as the corresponding control connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getFTPForceServerSecureByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for FTP data connections for each of
     * the named virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerFTPPortRange[] getFTPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for FTP data connections for each of
     * the named virtual servers. This is a location specific function, any
     * action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerFTPPortRange[] getFTPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should use SSL
     * on the data connection as well as the control connection
     */
    public boolean[] getFTPSSLData(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should use SSL
     * on the data connection as well as the control connection This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getFTPSSLDataByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how to handle forwarding of data that is pure HTTP chunking
     * overhead.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerHttpChunkOverheadForwarding[] getHttpChunkOverheadForwarding(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get how to handle forwarding of data that is pure HTTP chunking
     * overhead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerHttpChunkOverheadForwarding[] getHttpChunkOverheadForwardingByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should allow
     * clients to maintain keepalive connections.
     */
    public boolean[] getKeepalive(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should allow
     * clients to maintain keepalive connections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getKeepaliveByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time that an idle keepalive connection should be kept
     * open for, in seconds, for each of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getKeepaliveTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time that an idle keepalive connection should be kept
     * open for, in seconds, for each of the named virtual servers. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getKeepaliveTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specific IP addresses and hostnames that each of the
     * named virtual servers are listening on. This will return an empty
     * array for a virtual server if it is listening on all addresses.
     */
    public java.lang.String[][] getListenAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specific IP addresses and hostnames that each of the
     * named virtual servers are listening on. This will return an empty
     * array for a virtual server if it is listening on all addresses. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[][] getListenAddressesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, gets whether the virtual
     * server is listening on all IP addresses
     */
    public boolean[] getListenOnAllAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, gets whether the virtual
     * server is listening on all IP addresses This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getListenOnAllAddressesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specific Traffic IP Groups that each named virtual
     * server listens on. This will return an empty array for a virtual server
     * if it is listening on all addresses.
     */
    public java.lang.String[][] getListenTrafficIPGroups(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the specific Traffic IP Groups that each named virtual
     * server listens on. This will return an empty array for a virtual server
     * if it is listening on all addresses. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[][] getListenTrafficIPGroupsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should rewrite
     * the 'Location' header. The rewrite is only performed if the location
     * rewrite regex didn't match.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerLocationDefaultRewriteMode[] getLocationDefaultRewriteMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should rewrite
     * the 'Location' header. The rewrite is only performed if the location
     * rewrite regex didn't match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerLocationDefaultRewriteMode[] getLocationDefaultRewriteModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, get the regex, and replacement
     * for rewriting any 'Location' headers.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] getLocationRewrite(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, get the regex, and replacement
     * for rewriting any 'Location' headers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] getLocationRewriteByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log client connection failures.
     */
    public boolean[] getLogClientConnectionFailures(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log client connection failures.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getLogClientConnectionFailuresByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should log each
     * connection to a disk on the file system.
     */
    public boolean[] getLogEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should log each
     * connection to a disk on the file system. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getLogEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the file used to store request logs, for each
     * of the named virtual servers.
     */
    public java.lang.String[] getLogFilename(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the file used to store request logs, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getLogFilenameByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the log file format for each of the named virtual servers.
     */
    public java.lang.String[] getLogFormat(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the log file format for each of the named virtual servers.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getLogFormatByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log ssl failures.
     */
    public boolean[] getLogSSLFailures(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log ssl failures. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getLogSSLFailuresByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log server connection failures.
     */
    public boolean[] getLogServerConnectionFailures(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the virtual server will log server connection failures.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getLogServerConnectionFailuresByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should auto-detect
     * MIME types if the server does not provide them.
     */
    public boolean[] getMIMEAutoDetect(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should auto-detect
     * MIME types if the server does not provide them. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getMIMEAutoDetectByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the MIME type that the server uses as its 'default', for
     * each of the named virtual servers. Responses with this mime type will
     * be auto-corrected by the virtual server if this setting is enabled.
     */
    public java.lang.String[] getMIMEDefaultType(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the MIME type that the server uses as its 'default', for
     * each of the named virtual servers. Responses with this mime type will
     * be auto-corrected by the virtual server if this setting is enabled.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getMIMEDefaultTypeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of memory used to store data sent by the client,
     * in bytes, for each of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxClientBuffer(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of memory used to store data sent by the client,
     * in bytes, for each of the named virtual servers. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxClientBufferByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of memory used to store data returned by the
     * server, in bytes, for each of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxServerBuffer(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the amount of memory used to store data returned by the
     * server, in bytes, for each of the named virtual servers. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getMaxServerBufferByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the note for each of the named virtual servers.
     */
    public java.lang.String[] getNote(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port that each of the named virtual servers listens
     * on for incoming connections.
     */
    public org.apache.axis.types.UnsignedInt[] getPort(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port that each of the named virtual servers listens
     * on for incoming connections. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getPortByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Service Protection Settings that are used to protect
     * each of the named virtual servers.
     */
    public java.lang.String[] getProtection(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Service Protection Settings that are used to protect
     * each of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public java.lang.String[] getProtectionByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the protocol that each of the named virtual servers uses.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerProtocol[] getProtocol(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send a
     * FIN packet on to the back-end server when it is received from the
     * client.  The alternative is to close the connection to the client
     * immediately.  If the traffic manager is responding to the request
     * itself, enabling this setting will cause the traffic manager to continue
     * writing the response even after it has received a FIN from the client.
     */
    public boolean[] getProxyClose(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send a
     * FIN packet on to the back-end server when it is received from the
     * client.  The alternative is to close the connection to the client
     * immediately.  If the traffic manager is responding to the request
     * itself, enabling this setting will cause the traffic manager to continue
     * writing the response even after it has received a FIN from the client.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getProxyCloseByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for RTSP streaming data connections,
     * for each of the named virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] getRTSPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for RTSP streaming data connections,
     * for each of the named virtual servers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] getRTSPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time, in seconds, after which data-streams associated
     * with RTSP connections timeout if no data is transmitted.
     */
    public org.apache.axis.types.UnsignedInt[] getRTSPStreamingTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time, in seconds, after which data-streams associated
     * with RTSP connections timeout if no data is transmitted. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getRTSPStreamingTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should log each
     * connection to a remote syslog server.
     */
    public boolean[] getRequestSyslogEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should log each
     * connection to a remote syslog server. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getRequestSyslogEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the remote log line format for each of the named virtual
     * servers.
     */
    public java.lang.String[] getRequestSyslogFormat(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the remote log line format for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getRequestSyslogFormatByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the remote syslog endpoint for each of the named virtual
     * servers
     */
    public java.lang.String[] getRequestSyslogIPEndpoint(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the remote syslog endpoint for each of the named virtual
     * servers This is a location specific function, any action will operate
     * on the specified location.
     */
    public java.lang.String[] getRequestSyslogIPEndpointByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to record a detailed list of processing history
     * for each request.
     */
    public boolean[] getRequestTracingEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to record a detailed list of processing history
     * for each request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public boolean[] getRequestTracingEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to record a detailed list of every IO event in
     * the processing history for each request.
     */
    public boolean[] getRequestTracingIO(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to record a detailed list of every IO event in
     * the processing history for each request. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getRequestTracingIOByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on server responses for each of
     * the named virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRule[][] getResponseRules(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on server responses for each of
     * the named virtual servers. This is a location specific function, any
     * action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRule[][] getResponseRulesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the Request-URI of SIP requests will be replaced
     * with the selected back-end node's address.
     */
    public boolean[] getRewriteSIPURI(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether the Request-URI of SIP requests will be replaced
     * with the selected back-end node's address. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getRewriteSIPURIByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on client requests for each of the
     * named virtual servers.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRule[][] getRules(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the rules that are run on client requests for each of the
     * named virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerRule[][] getRulesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get what should be done with requests that contain body data
     * and should be routed to an external IP.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSIPDangerousRequestMode[] getSIPDangerousRequestMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get what should be done with requests that contain body data
     * and should be routed to an external IP. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSIPDangerousRequestMode[] getSIPDangerousRequestModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to follow routing information in SIP requests.
     */
    public boolean[] getSIPFollowRoute(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to follow routing information in SIP requests.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getSIPFollowRouteByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get maximum memory per connection.
     */
    public org.apache.axis.types.UnsignedInt[] getSIPMaxConnectionMemory(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get maximum memory per connection. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSIPMaxConnectionMemoryByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get which mode of operation the SIP virtual server should run
     * in.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSIPMode[] getSIPMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get which mode of operation the SIP virtual server should run
     * in. This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSIPMode[] getSIPModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for SIP data connections, for each
     * of the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] getSIPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the port range used for SIP data connections, for each
     * of the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode. This is a location specific
     * function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] getSIPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time, in seconds, after which a UDP stream will timeout
     * if it has not seen any data.
     */
    public org.apache.axis.types.UnsignedInt[] getSIPStreamingTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time, in seconds, after which a UDP stream will timeout
     * if it has not seen any data. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSIPStreamingTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get send a timed out response to the client and CANCEL request
     * to the server when a transaction times out.
     */
    public boolean[] getSIPTimeoutMessages(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get send a timed out response to the client and CANCEL request
     * to the server when a transaction times out. This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getSIPTimeoutMessagesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the default SSL Certificate that is used for
     * SSL decryption for each of the named virtual servers. This is the
     * name of an item in the SSL Certificates Catalog.
     */
    public java.lang.String[] getSSLCertificate(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the name of the default SSL Certificate that is used for
     * SSL decryption for each of the named virtual servers. This is the
     * name of an item in the SSL Certificates Catalog. This is a location
     * specific function, any action will operate on the specified location.
     */
    public java.lang.String[] getSSLCertificateByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the certificate authorities that are trusted for validating
     * client certificates, for each of the named virtual servers.
     */
    public java.lang.String[][] getSSLClientCertificateAuthorities(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the certificate authorities that are trusted for validating
     * client certificates, for each of the named virtual servers. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[][] getSSLClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should add HTTP
     * headers to each request to show the data in the client certificate.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLClientCertificateHeaders[] getSSLClientCertificateHeaders(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should add HTTP
     * headers to each request to show the data in the client certificate.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLClientCertificateHeaders[] getSSLClientCertificateHeadersByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should decrypt
     * SSL traffic.
     */
    public boolean[] getSSLDecrypt(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should decrypt
     * SSL traffic. This is a location specific function, any action will
     * operate on the specified location.
     */
    public boolean[] getSSLDecryptByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should upgrade
     * SMTP connections to SSL using the STARTTLS command.
     */
    public boolean[] getSSLExpectStartTLS(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should upgrade
     * SMTP connections to SSL using the STARTTLS command. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getSSLExpectStartTLSByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should add HTTP
     * headers to each request to show SSL connection parameters.
     */
    public boolean[] getSSLHeaders(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should add HTTP
     * headers to each request to show SSL connection parameters. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public boolean[] getSSLHeadersByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete. SSL logging is now done if LogConnectionFailures
     * is enabled. Use VirtualServer.getLogConnectionFailures and VirtualServer.getLogConnection
     * failures to control this configuration.
     */
    public boolean[] getSSLLogEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the CAs for which any client certificate they validate
     * is considered valid even if the client certificate's expiration date
     * has passed.
     */
    public java.lang.String[][] getSSLNeverExpiringClientCertificateAuthorities(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the CAs for which any client certificate they validate
     * is considered valid even if the client certificate's expiration date
     * has passed. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[][] getSSLNeverExpiringClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default OCSP responder settings for all client certificates.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[] getSSLOCSPDefaults(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the default OCSP responder settings for all client certificates.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[] getSSLOCSPDefaultsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets a list of mappings between Certificate Authorities and
     * OCSP responder settings. Certificates issued by these authorities
     * will be verified with OCSP using these settings.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] getSSLOCSPIssuers(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets a list of mappings between Certificate Authorities and
     * OCSP responder settings. Certificates issued by these authorities
     * will be verified with OCSP using these settings. This is a location
     * specific function, any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] getSSLOCSPIssuersByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds for which an OCSP response is considered
     * valid if it has not yet exceeded the time specified in the 'nextUpdate'
     * field
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPMaxResponseAge(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds for which an OCSP response is considered
     * valid if it has not yet exceeded the time specified in the 'nextUpdate'
     * field This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPMaxResponseAgeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds outside the permitted range for which
     * the 'thisUpdate' and 'nextUpdate' fields of an OCSP response are still
     * considered valid
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPTimeTolerance(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds outside the permitted range for which
     * the 'thisUpdate' and 'nextUpdate' fields of an OCSP response are still
     * considered valid This is a location specific function, any action
     * will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPTimeToleranceByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds after which OCSP requests will be
     * timed out
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the number of seconds after which OCSP requests will be
     * timed out This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getSSLOCSPTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to prefer SSLv3 over TLS when the client appears
     * to support both. SSLv3 is slightly faster, but some clients don't
     * allow SSLv3 but still send the ClientHello inside SSLv2 or SSLv3 records.
     */
    public boolean[] getSSLPreferSSLv3(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether to prefer SSLv3 over TLS when the client appears
     * to support both. SSLv3 is slightly faster, but some clients don't
     * allow SSLv3 but still send the ClientHello inside SSLv2 or SSLv3 records.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getSSLPreferSSLv3ByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should request
     * (or require) an identifying certificate from each client.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLRequestClientCertMode[] getSSLRequestClientCertMode(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should request
     * (or require) an identifying certificate from each client. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLRequestClientCertMode[] getSSLRequestClientCertModeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send a
     * close alert when initiating SSL socket disconnections.
     */
    public boolean[] getSSLSendCloseAlerts(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send a
     * close alert when initiating SSL socket disconnections. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getSSLSendCloseAlertsByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets a list of mappings between destination addresses and the
     * certificate used for SSL decryption those addresses, for each of the
     * named virtual servers. Each certificate is the name of an item in
     * the SSL Certificates Catalog.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] getSSLSites(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets a list of mappings between destination addresses and the
     * certificate used for SSL decryption those addresses, for each of the
     * named virtual servers. Each certificate is the name of an item in
     * the SSL Certificates Catalog. This is a location specific function,
     * any action will operate on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLSite[][] getSSLSitesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should decode
     * extra information on the true origin of an SSL connection. This information
     * is prefixed onto an incoming SSL connection from another traffic manager.
     */
    public boolean[] getSSLTrustMagic(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should decode
     * extra information on the true origin of an SSL connection. This information
     * is prefixed onto an incoming SSL connection from another traffic manager.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getSSLTrustMagicByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether or not the traffic manager should use OCSP to check
     * the revocation status of client certificates
     */
    public boolean[] getSSLUseOCSP(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether or not the traffic manager should use OCSP to check
     * the revocation status of client certificates This is a location specific
     * function, any action will operate on the specified location.
     */
    public boolean[] getSSLUseOCSPByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the banner that each of the named virtual servers sends
     * to clients for server-first protocols such as POP, SMTP and IMAP.
     */
    public java.lang.String[] getServerfirstBanner(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the banner that each of the named virtual servers sends
     * to clients for server-first protocols such as POP, SMTP and IMAP.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public java.lang.String[] getServerfirstBannerByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Service Level Monitoring class that each of the named
     * virtual servers uses.
     */
    public java.lang.String[] getServiceLevelMonitoring(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Service Level Monitoring class that each of the named
     * virtual servers uses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public java.lang.String[] getServiceLevelMonitoringByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time after which an incomplete transaction should be
     * discarded, in seconds, for each of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getSipTransactionTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time after which an incomplete transaction should be
     * discarded, in seconds, for each of the named virtual servers. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public org.apache.axis.types.UnsignedInt[] getSipTransactionTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time to wait for data on an already established connection,
     * in seconds, for each of the named virtual servers.
     */
    public org.apache.axis.types.UnsignedInt[] getTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time to wait for data on an already established connection,
     * in seconds, for each of the named virtual servers. This is a location
     * specific function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send the
     * UDP datagrams from the same IP and port to the same node in the pool
     * if there's an existing UDP transaction. Although it's not always guaranteed
     * as while making a decision to reuse same node, traffic manager can
     * also apply other protocol specific filtering e.g CallID matching for
     * SIP packets in addition to IP and port matching.
     */
    public boolean[] getUDPEndpointPersistence(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should send the
     * UDP datagrams from the same IP and port to the same node in the pool
     * if there's an existing UDP transaction. Although it's not always guaranteed
     * as while making a decision to reuse same node, traffic manager can
     * also apply other protocol specific filtering e.g CallID matching for
     * SIP packets in addition to IP and port matching. This is a location
     * specific function, any action will operate on the specified location.
     */
    public boolean[] getUDPEndpointPersistenceByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the expected number of UDP datagrams in the response, for
     * each of the named virtual servers.  For simple request/response protocols
     * a value of '1' should be used. If set to -1, the connection will not
     * be discarded until the udp_timeout is reached.
     */
    public int[] getUDPResponseDatagramsExpected(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the expected number of UDP datagrams in the response, for
     * each of the named virtual servers.  For simple request/response protocols
     * a value of '1' should be used. If set to -1, the connection will not
     * be discarded until the udp_timeout is reached. This is a location
     * specific function, any action will operate on the specified location.
     */
    public int[] getUDPResponseDatagramsExpectedByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time after which an idle UDP connection should be discarded
     * and resources reclaimed, in seconds, for each of the named virtual
     * servers.
     */
    public org.apache.axis.types.UnsignedInt[] getUDPTimeout(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time after which an idle UDP connection should be discarded
     * and resources reclaimed, in seconds, for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getUDPTimeoutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether Nagle's algorithm should be used for TCP connections.
     */
    public boolean[] getUseNagle(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether Nagle's algorithm should be used for TCP connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public boolean[] getUseNagleByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the names of all the configured virtual servers.
     */
    public java.lang.String[] getVirtualServerNames() throws java.rmi.RemoteException;

    /**
     * Get the Cache-Control header that should be sent with cached
     * HTTP responses.
     */
    public java.lang.String[] getWebcacheControlOut(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the Cache-Control header that should be sent with cached
     * HTTP responses. This is a location specific function, any action will
     * operate on the specified location.
     */
    public java.lang.String[] getWebcacheControlOutByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should attempt
     * to cache web server responses.
     */
    public boolean[] getWebcacheEnabled(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether each of the named virtual servers should attempt
     * to cache web server responses. This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getWebcacheEnabledByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should cache error pages for.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheErrorpageTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should cache error pages for. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheErrorpageTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should consider re-fetching cached pages in.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheRefreshTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should consider re-fetching cached pages in. This is a location specific
     * function, any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheRefreshTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should cache web pages for.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheTime(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the time periods that each of the named virtual servers
     * should cache web pages for. This is a location specific function,
     * any action will operate on the specified location.
     */
    public org.apache.axis.types.UnsignedInt[] getWebcacheTimeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each named virtual server, remove new MIME types from the
     * list of types to compress.
     */
    public void removeCompressionMIMETypes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each named virtual server, remove new MIME types from the
     * list of types to compress. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void removeCompressionMIMETypesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow FTP connections to use any free ports, for each of the
     * named virtual servers.
     */
    public void removeFTPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow FTP connections to use any free ports, for each of the
     * named virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void removeFTPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow any free ports to be used for RTSP connections, for each
     * of the named virtual servers.
     */
    public void removeRTSPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow any free ports to be used for RTSP connections, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void removeRTSPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, remove rules from the
     * list that are run on server responses.
     */
    public void removeResponseRules(java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, remove rules from the
     * list that are run on server responses. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeResponseRulesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, remove rules from the
     * list of rules that are run on client requests.
     */
    public void removeRules(java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, remove rules from the
     * list of rules that are run on client requests. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeRulesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow any free ports to be used for SIP connections, for each
     * of the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode.
     */
    public void removeSIPPortRange(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Allow any free ports to be used for SIP connections, for each
     * of the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeSIPPortRangeByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove certificate authorities for validating client certificates
     * for each of the named virtual servers.
     */
    public void removeSSLClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove certificate authorities for validating client certificates
     * for each of the named virtual servers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void removeSSLClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove CAs for which any client certificate they validate is
     * considered valid even if the client certificate's expiration date
     * has passed, for each of the named virtual servers.
     */
    public void removeSSLNeverExpiringClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Remove CAs for which any client certificate they validate is
     * considered valid even if the client certificate's expiration date
     * has passed, for each of the named virtual servers. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void removeSSLNeverExpiringClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Removes mappings between OCSP responder settings for the specified
     * Certificate authorities
     */
    public void removeSSLOCSPIssuers(java.lang.String[] names, java.lang.String[][] cas) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Removes mappings between OCSP responder settings for the specified
     * Certificate authorities This is a location specific function, any
     * action will operate on the specified location.
     */
    public void removeSSLOCSPIssuersByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] cas) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename each of the named virtual servers.
     */
    public void renameVirtualServer(java.lang.String[] names, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName;

    /**
     * Set whether a 'X-Cluster-Client-Ip' header should be added
     * to each HTTP request, for each of the named virtual servers. The 'X-Cluster-Client-Ip'
     * header contains the client's IP address.
     */
    public void setAddClusterClientIPHeader(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether a 'X-Cluster-Client-Ip' header should be added
     * to each HTTP request, for each of the named virtual servers. The 'X-Cluster-Client-Ip'
     * header contains the client's IP address. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setAddClusterClientIPHeaderByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, enable or disable the
     * Stingray Application Firewall.
     */
    public void setApplicationFirewallEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, enable or disable the
     * Stingray Application Firewall. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setApplicationFirewallEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should aptimize
     * web content.
     */
    public void setAptimizerEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should aptimize
     * web content. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setAptimizerEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Bandwidth Class that each of the named virtual servers
     * uses.
     */
    public void setBandwidthClass(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Bandwidth Class that each of the named virtual servers
     * uses. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setBandwidthClassByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should compress
     * documents with no given size.
     */
    public void setCompressUnknownSize(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should compress
     * documents with no given size. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setCompressUnknownSizeByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should compress
     * web pages before sending to the client.
     */
    public void setCompressionEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should compress
     * web pages before sending to the client. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setCompressionEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the gzip compression level, for each of the named virtual
     * servers.
     */
    public void setCompressionLevel(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the gzip compression level, for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setCompressionLevelByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of MIME types to compress, for each of the named
     * virtual servers.
     */
    public void setCompressionMIMETypes(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the list of MIME types to compress, for each of the named
     * virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setCompressionMIMETypesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum document size to compress, in bytes, for each
     * of the named virtual servers.  A document size of '0' means 'unlimited'.
     */
    public void setCompressionMaxSize(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the maximum document size to compress, in bytes, for each
     * of the named virtual servers.  A document size of '0' means 'unlimited'.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setCompressionMaxSizeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum document size to compress, in bytes, for each
     * of the named virtual servers.
     */
    public void setCompressionMinSize(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the minimum document size to compress, in bytes, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setCompressionMinSizeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time to wait for data from a new connection, in seconds,
     * for each of the named virtual servers. If no data is received in this
     * time, the connection will be closed.
     */
    public void setConnectTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time to wait for data from a new connection, in seconds,
     * for each of the named virtual servers. If no data is received in this
     * time, the connection will be closed. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setConnectTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how each of the named virtual servers should rewrite the
     * domain portion of cookies set by a back-end web server.
     */
    public void setCookieDomainRewriteMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerCookieDomainRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how each of the named virtual servers should rewrite the
     * domain portion of cookies set by a back-end web server. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setCookieDomainRewriteModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerCookieDomainRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the domain to use when rewriting cookie domains, for each
     * of the named virtual servers.
     */
    public void setCookieNamedDomain(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the domain to use when rewriting cookie domains, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setCookieNamedDomainByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set the regex, and replacement
     * for rewriting the path portion of a cookie.
     */
    public void setCookiePathRewrite(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set the regex, and replacement
     * for rewriting the path portion of a cookie. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setCookiePathRewriteByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should modify
     * the 'secure' tag of cookies set by a back-end web server.
     */
    public void setCookieSecureFlagRewriteMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerCookieSecureFlagRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should modify
     * the 'secure' tag of cookies set by a back-end web server. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setCookieSecureFlagRewriteModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerCookieSecureFlagRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default Pool that traffic is sent to for each of the
     * named virtual servers.
     */
    public void setDefaultPool(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default Pool that traffic is sent to for each of the
     * named virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setDefaultPoolByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers is enabled (i.e.
     * serving traffic).
     */
    public void setEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers is enabled (i.e.
     * serving traffic). This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the file names of the error texts that each of the named
     * virtual servers will send back to a client in case of back-end or
     * internal errors.
     */
    public void setErrorFile(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the file names of the error texts that each of the named
     * virtual servers will send back to a client in case of back-end or
     * internal errors. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setErrorFileByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the source port each of the named virtual servers should
     * use for active-mode FTP data connections.  If 0, a random high port
     * will be used, otherwise the specified port will be used.  If a port
     * below 1024 is required you must first explicitly permit use of low
     * ports with the ftp_data_bind_low global setting.
     */
    public void setFTPDataSourcePort(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the source port each of the named virtual servers should
     * use for active-mode FTP data connections.  If 0, a random high port
     * will be used, otherwise the specified port will be used.  If a port
     * below 1024 is required you must first explicitly permit use of low
     * ports with the ftp_data_bind_low global setting. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setFTPDataSourcePortByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should require
     * incoming FTP data connections (from clients) to originate from the
     * same IP address as the corresponding control connection.
     */
    public void setFTPForceClientSecure(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should require
     * incoming FTP data connections (from clients) to originate from the
     * same IP address as the corresponding control connection. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setFTPForceClientSecureByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should require
     * incoming FTP data connections (from nodes) to originate from the same
     * IP address as the corresponding control connection.
     */
    public void setFTPForceServerSecure(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should require
     * incoming FTP data connections (from nodes) to originate from the same
     * IP address as the corresponding control connection. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setFTPForceServerSecureByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for FTP data connections for each of
     * the named virtual servers.
     */
    public void setFTPPortRange(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerFTPPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for FTP data connections for each of
     * the named virtual servers. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setFTPPortRangeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerFTPPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should use SSL
     * on the data connection as well as the control connection
     */
    public void setFTPSSLData(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should use SSL
     * on the data connection as well as the control connection This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setFTPSSLDataByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how to handle forwarding of data that is pure HTTP chunking
     * overhead.
     */
    public void setHttpChunkOverheadForwarding(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerHttpChunkOverheadForwarding[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set how to handle forwarding of data that is pure HTTP chunking
     * overhead. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setHttpChunkOverheadForwardingByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerHttpChunkOverheadForwarding[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should allow
     * clients to maintain keepalive connections.
     */
    public void setKeepalive(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should allow
     * clients to maintain keepalive connections. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setKeepaliveByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time that an idle keepalive connection should be kept
     * open for, in seconds, for each of the named virtual servers.
     */
    public void setKeepaliveTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time that an idle keepalive connection should be kept
     * open for, in seconds, for each of the named virtual servers. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setKeepaliveTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the specific IP addresses and hostnames for each named
     * virtual server to listen on.
     */
    public void setListenAddresses(java.lang.String[] names, java.lang.String[][] addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the specific IP addresses and hostnames for each named
     * virtual server to listen on. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setListenAddressesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] addresses) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Make each of the named virtual servers listen on all IP addresses.
     */
    public void setListenOnAllAddresses(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Make each of the named virtual servers listen on all IP addresses.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setListenOnAllAddressesByLocation(java.lang.String location, java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set specific Traffic
     * IP Groups for it to listen on.
     */
    public void setListenTrafficIPGroups(java.lang.String[] names, java.lang.String[][] groups) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set specific Traffic
     * IP Groups for it to listen on. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setListenTrafficIPGroupsByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] groups) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should rewrite
     * the 'Location' header. The rewrite is only performed if the location
     * rewrite regex didn't match.
     */
    public void setLocationDefaultRewriteMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerLocationDefaultRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should rewrite
     * the 'Location' header. The rewrite is only performed if the location
     * rewrite regex didn't match. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setLocationDefaultRewriteModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerLocationDefaultRewriteMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set the regex, and replacement
     * for rewriting any 'Location' headers.
     */
    public void setLocationRewrite(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named virtual servers, set the regex, and replacement
     * for rewriting any 'Location' headers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setLocationRewriteByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRegexReplacement[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log client connection failures.
     */
    public void setLogClientConnectionFailures(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log client connection failures.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogClientConnectionFailuresByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should log each
     * connection to a disk on the file system.
     */
    public void setLogEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should log each
     * connection to a disk on the file system. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setLogEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the file used to store request logs, for each
     * of the named virtual servers.
     */
    public void setLogFilename(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the file used to store request logs, for each
     * of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setLogFilenameByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the log file format for each of the named virtual servers.
     */
    public void setLogFormat(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the log file format for each of the named virtual servers.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogFormatByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log ssl failures.
     */
    public void setLogSSLFailures(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log ssl failures. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setLogSSLFailuresByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log server connection failures.
     */
    public void setLogServerConnectionFailures(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the virtual server will log server connection failures.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setLogServerConnectionFailuresByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should auto-detect
     * MIME types if the server does not provide them.
     */
    public void setMIMEAutoDetect(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should auto-detect
     * MIME types if the server does not provide them. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMIMEAutoDetectByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the MIME type that the server uses as its 'default', for
     * each of the named virtual servers. Responses with this mime type will
     * be auto-corrected by the virtual server if this setting is enabled.
     */
    public void setMIMEDefaultType(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the MIME type that the server uses as its 'default', for
     * each of the named virtual servers. Responses with this mime type will
     * be auto-corrected by the virtual server if this setting is enabled.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setMIMEDefaultTypeByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of memory used to store data sent by the client,
     * in bytes, for each of the named virtual servers.
     */
    public void setMaxClientBuffer(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of memory used to store data sent by the client,
     * in bytes, for each of the named virtual servers. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setMaxClientBufferByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of memory used to store data returned by the
     * server, in bytes, for each of the named virtual servers.
     */
    public void setMaxServerBuffer(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the amount of memory used to store data returned by the
     * server, in bytes, for each of the named virtual servers. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setMaxServerBufferByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named virtual servers.
     */
    public void setNote(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port that each of the named virtual servers listens
     * on for incoming connections.
     */
    public void setPort(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port that each of the named virtual servers listens
     * on for incoming connections. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setPortByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Service Protection Settings that are used to protect
     * each of the named virtual servers.
     */
    public void setProtection(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Service Protection Settings that are used to protect
     * each of the named virtual servers. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setProtectionByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the protocol that each of the named virtual servers uses.
     */
    public void setProtocol(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerProtocol[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send a
     * FIN packet on to the back-end server when it is received from the
     * client.  The alternative is to close the connection to the client
     * immediately.  If the traffic manager is responding to the request
     * itself, enabling this setting will cause the traffic manager to continue
     * writing the response even after it has received a FIN from the client.
     */
    public void setProxyClose(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send a
     * FIN packet on to the back-end server when it is received from the
     * client.  The alternative is to close the connection to the client
     * immediately.  If the traffic manager is responding to the request
     * itself, enabling this setting will cause the traffic manager to continue
     * writing the response even after it has received a FIN from the client.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setProxyCloseByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for RTSP streaming data connections
     * for each of the named virtual servers.
     */
    public void setRTSPPortRange(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for RTSP streaming data connections
     * for each of the named virtual servers. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setRTSPPortRangeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time, in seconds, after which data-streams associated
     * with RTSP connections timeout if no data is transmitted.
     */
    public void setRTSPStreamingTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time, in seconds, after which data-streams associated
     * with RTSP connections timeout if no data is transmitted. This is a
     * location specific function, any action will operate on the specified
     * location.
     */
    public void setRTSPStreamingTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should log each
     * connection to a remote syslog server.
     */
    public void setRequestSyslogEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should log each
     * connection to a remote syslog server. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setRequestSyslogEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the remote log line format for each of the named virtual
     * servers.
     */
    public void setRequestSyslogFormat(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the remote log line format for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setRequestSyslogFormatByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the remote syslog endpoint for each of the named virtual
     * servers
     */
    public void setRequestSyslogIPEndpoint(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the remote syslog endpoint for each of the named virtual
     * servers This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setRequestSyslogIPEndpointByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to record a detailed list of processing history
     * for each request.
     */
    public void setRequestTracingEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to record a detailed list of processing history
     * for each request. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setRequestTracingEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to record a detailed list of every IO event in
     * the processing history for each request.
     */
    public void setRequestTracingIO(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to record a detailed list of every IO event in
     * the processing history for each request. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setRequestTracingIOByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on server responses for each of
     * the named virtual servers.
     */
    public void setResponseRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on server responses for each of
     * the named virtual servers. This is a location specific function, any
     * action will operate on the specified location.
     */
    public void setResponseRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the Request-URI of SIP requests will be replaced
     * with the selected back-end node's address.
     */
    public void setRewriteSIPURI(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether the Request-URI of SIP requests will be replaced
     * with the selected back-end node's address. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setRewriteSIPURIByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on client requests for each of the
     * named virtual servers.
     */
    public void setRules(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the rules that are run on client requests for each of the
     * named virtual servers. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setRulesByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerRule[][] rules) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set what should be done with requests that contain body data
     * and should be routed to an external IP.
     */
    public void setSIPDangerousRequestMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSIPDangerousRequestMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set what should be done with requests that contain body data
     * and should be routed to an external IP. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSIPDangerousRequestModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSIPDangerousRequestMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to follow routing information in SIP requests.
     */
    public void setSIPFollowRoute(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to follow routing information in SIP requests.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSIPFollowRouteByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set maximum memory per connection.
     */
    public void setSIPMaxConnectionMemory(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set maximum memory per connection. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSIPMaxConnectionMemoryByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set which mode of operation the SIP virtual server should run
     * in.
     */
    public void setSIPMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSIPMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set which mode of operation the SIP virtual server should run
     * in. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSIPModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSIPMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for SIP data connections for each of
     * the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode.
     */
    public void setSIPPortRange(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the port range used for SIP data connections for each of
     * the named virtual servers. This setting is only used when the SIP
     * virtual server is using 'Full Gateway' mode. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSIPPortRangeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerPortRange[] range) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time, in seconds, after which a UDP stream will timeout
     * if it has not seen any data.
     */
    public void setSIPStreamingTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time, in seconds, after which a UDP stream will timeout
     * if it has not seen any data. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setSIPStreamingTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set send a timed out response to the client and CANCEL request
     * to the server when a transaction times out.
     */
    public void setSIPTimeoutMessages(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set send a timed out response to the client and CANCEL request
     * to the server when a transaction times out. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSIPTimeoutMessagesByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the default SSL Certificate that is used for
     * SSL decryption for each of the named virtual servers. This is the
     * name of an item in the SSL Certificates Catalog. You must call this
     * function to set an SSL Certificate before turning on SSL Decryption.
     */
    public void setSSLCertificate(java.lang.String[] names, java.lang.String[] certs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the name of the default SSL Certificate that is used for
     * SSL decryption for each of the named virtual servers. This is the
     * name of an item in the SSL Certificates Catalog. You must call this
     * function to set an SSL Certificate before turning on SSL Decryption.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLCertificateByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] certs) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the certificate authorities that are trusted for validating
     * client certificates, for each of the named virtual servers.
     */
    public void setSSLClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the certificate authorities that are trusted for validating
     * client certificates, for each of the named virtual servers. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should add HTTP
     * headers to each request to show the data in the client certificate.
     */
    public void setSSLClientCertificateHeaders(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLClientCertificateHeaders[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should add HTTP
     * headers to each request to show the data in the client certificate.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLClientCertificateHeadersByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLClientCertificateHeaders[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets whether each of the named virtual servers should decrypt
     * SSL traffic. This function will error unless an SSL Certificate has
     * previously been set using setSSLCertificate.
     */
    public void setSSLDecrypt(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets whether each of the named virtual servers should decrypt
     * SSL traffic. This function will error unless an SSL Certificate has
     * previously been set using setSSLCertificate. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLDecryptByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should upgrade
     * SMTP connections to SSL using the STARTTLS command.
     */
    public void setSSLExpectStartTLS(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should upgrade
     * SMTP connections to SSL using the STARTTLS command. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLExpectStartTLSByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should add HTTP
     * headers to each request to show SSL connection parameters.
     */
    public void setSSLHeaders(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should add HTTP
     * headers to each request to show SSL connection parameters. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLHeadersByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * This method is now obsolete. SSL logging is now done if LogConnectionFailures
     * is enabled. Use VirtualServer.getLogConnectionFailures and VirtualServer.getLogConnection
     * failures to control this configuration.
     */
    public void setSSLLogEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the CAs for which any client certificate they validate
     * is considered valid even if the client certificate's expiration date
     * has passed.
     */
    public void setSSLNeverExpiringClientCertificateAuthorities(java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the CAs for which any client certificate they validate
     * is considered valid even if the client certificate's expiration date
     * has passed. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setSSLNeverExpiringClientCertificateAuthoritiesByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[][] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default OCSP responder settings for all client certificates.
     */
    public void setSSLOCSPDefaults(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the default OCSP responder settings for all client certificates.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLOCSPDefaultsByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets a list of mappings between Certificate Authorities and
     * OCSP responder settings. Certificates issued by these authorities
     * will be verified with OCSP using these settings.
     */
    public void setSSLOCSPIssuers(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets a list of mappings between Certificate Authorities and
     * OCSP responder settings. Certificates issued by these authorities
     * will be verified with OCSP using these settings. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLOCSPIssuersByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPIssuer[][] ssl_ocsp_issuers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds for which an OCSP response is considered
     * valid if it has not yet exceeded the time specified in the 'nextUpdate'
     * field
     */
    public void setSSLOCSPMaxResponseAge(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds for which an OCSP response is considered
     * valid if it has not yet exceeded the time specified in the 'nextUpdate'
     * field This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLOCSPMaxResponseAgeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds outside the permitted range for which
     * the 'thisUpdate' and 'nextUpdate' fields of an OCSP response are still
     * considered valid
     */
    public void setSSLOCSPTimeTolerance(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds outside the permitted range for which
     * the 'thisUpdate' and 'nextUpdate' fields of an OCSP response are still
     * considered valid This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setSSLOCSPTimeToleranceByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds after which OCSP requests will be
     * timed out
     */
    public void setSSLOCSPTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the number of seconds after which OCSP requests will be
     * timed out This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setSSLOCSPTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to prefer SSLv3 over TLS when the client appears
     * to support both. SSLv3 is slightly faster, but some clients don't
     * allow SSLv3 but still send the ClientHello inside SSLv2 or SSLv3 records.
     */
    public void setSSLPreferSSLv3(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether to prefer SSLv3 over TLS when the client appears
     * to support both. SSLv3 is slightly faster, but some clients don't
     * allow SSLv3 but still send the ClientHello inside SSLv2 or SSLv3 records.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLPreferSSLv3ByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should request
     * (or require) an identifying certificate from each client.
     */
    public void setSSLRequestClientCertMode(java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLRequestClientCertMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should request
     * (or require) an identifying certificate from each client. This is
     * a location specific function, any action will operate on the specified
     * location.
     */
    public void setSSLRequestClientCertModeByLocation(java.lang.String location, java.lang.String[] names, com.zeus.soap.zxtm._1_0.VirtualServerSSLRequestClientCertMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send a
     * close alert when initiating SSL socket disconnections.
     */
    public void setSSLSendCloseAlerts(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send a
     * close alert when initiating SSL socket disconnections. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setSSLSendCloseAlertsByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should decode
     * extra information on the true origin of an SSL connection. This information
     * is prefixed onto an incoming SSL connection from another traffic manager.
     */
    public void setSSLTrustMagic(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should decode
     * extra information on the true origin of an SSL connection. This information
     * is prefixed onto an incoming SSL connection from another traffic manager.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setSSLTrustMagicByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether or not the traffic manager should use OCSP to check
     * the revocation status of client certificates
     */
    public void setSSLUseOCSP(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether or not the traffic manager should use OCSP to check
     * the revocation status of client certificates This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setSSLUseOCSPByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the banner that each of the named virtual servers sends
     * to clients for server-first protocols such as POP, SMTP and IMAP.
     */
    public void setServerfirstBanner(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the banner that each of the named virtual servers sends
     * to clients for server-first protocols such as POP, SMTP and IMAP.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setServerfirstBannerByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Service Level Monitoring class that each of the named
     * virtual servers uses.
     */
    public void setServiceLevelMonitoring(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Service Level Monitoring class that each of the named
     * virtual servers uses. This is a location specific function, any action
     * will operate on the specified location.
     */
    public void setServiceLevelMonitoringByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time after which an incomplete transaction should be
     * discarded, in seconds, for each of the named virtual servers.
     */
    public void setSipTransactionTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time after which an incomplete transaction should be
     * discarded, in seconds, for each of the named virtual servers. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setSipTransactionTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time to wait for data on an already established connection,
     * in seconds, for each of the named virtual servers.
     */
    public void setTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time to wait for data on an already established connection,
     * in seconds, for each of the named virtual servers. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send the
     * UDP datagrams from the same IP and port to the same node in the pool
     * if there's an existing UDP transaction. Although it's not always guaranteed
     * as while making a decision to reuse same node, traffic manager can
     * also apply other protocol specific filtering e.g CallID matching for
     * SIP packets in addition to IP and port matching.
     */
    public void setUDPEndpointPersistence(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should send the
     * UDP datagrams from the same IP and port to the same node in the pool
     * if there's an existing UDP transaction. Although it's not always guaranteed
     * as while making a decision to reuse same node, traffic manager can
     * also apply other protocol specific filtering e.g CallID matching for
     * SIP packets in addition to IP and port matching. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setUDPEndpointPersistenceByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the expected number of UDP datagrams in the response, for
     * each of the named virtual servers.  For simple request/response protocols
     * a value of '1' should be used. If set to -1, the connection will not
     * be discarded until the udp_timeout is reached.
     */
    public void setUDPResponseDatagramsExpected(java.lang.String[] names, int[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the expected number of UDP datagrams in the response, for
     * each of the named virtual servers.  For simple request/response protocols
     * a value of '1' should be used. If set to -1, the connection will not
     * be discarded until the udp_timeout is reached. This is a location
     * specific function, any action will operate on the specified location.
     */
    public void setUDPResponseDatagramsExpectedByLocation(java.lang.String location, java.lang.String[] names, int[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time after which an idle UDP connection should be discarded
     * and resources reclaimed, in seconds, for each of the named virtual
     * servers.
     */
    public void setUDPTimeout(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time after which an idle UDP connection should be discarded
     * and resources reclaimed, in seconds, for each of the named virtual
     * servers. This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setUDPTimeoutByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether Nagle's algorithm should be used for TCP connections.
     */
    public void setUseNagle(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether Nagle's algorithm should be used for TCP connections.
     * This is a location specific function, any action will operate on the
     * specified location.
     */
    public void setUseNagleByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Cache-Control header that should be sent with cached
     * HTTP responses.
     */
    public void setWebcacheControlOut(java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the Cache-Control header that should be sent with cached
     * HTTP responses. This is a location specific function, any action will
     * operate on the specified location.
     */
    public void setWebcacheControlOutByLocation(java.lang.String location, java.lang.String[] names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should attempt
     * to cache web server responses.
     */
    public void setWebcacheEnabled(java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether each of the named virtual servers should attempt
     * to cache web server responses. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setWebcacheEnabledByLocation(java.lang.String location, java.lang.String[] names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should cache error pages for.
     */
    public void setWebcacheErrorpageTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should cache error pages for. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setWebcacheErrorpageTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should consider re-fetching cached pages in.
     */
    public void setWebcacheRefreshTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should consider re-fetching cached pages in. This is a location specific
     * function, any action will operate on the specified location.
     */
    public void setWebcacheRefreshTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should cache web pages for.
     */
    public void setWebcacheTime(java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the time periods that each of the named virtual servers
     * should cache web pages for. This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setWebcacheTimeByLocation(java.lang.String location, java.lang.String[] names, org.apache.axis.types.UnsignedInt[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
