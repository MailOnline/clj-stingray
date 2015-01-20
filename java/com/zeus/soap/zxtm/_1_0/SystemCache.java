/**
 * SystemCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemCache extends javax.xml.rpc.Service {

/**
 * The System.Cache interface provides information about the content
 * cache for a machine. 
 *                                         Using this interface, you
 * can retrieve both individual cache entries and global cache
 *                                         data for a machine and delete
 * all entries in the cache.
 */
    public java.lang.String getSystemCachePortAddress();

    public com.zeus.soap.zxtm._1_0.SystemCachePort getSystemCachePort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.SystemCachePort getSystemCachePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
