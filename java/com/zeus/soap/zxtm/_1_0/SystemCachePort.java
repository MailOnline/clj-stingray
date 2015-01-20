/**
 * SystemCachePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemCachePort extends java.rmi.Remote {

    /**
     * Clear all entries from the Web Cache for this machine.
     */
    public void clearWebCache() throws java.rmi.RemoteException;

    /**
     * Get information about the Web Cache entries for this machine.
     */
    public com.zeus.soap.zxtm._1_0.SystemCacheCacheContent[] getCacheContent() throws java.rmi.RemoteException;

    /**
     * Get the size of the Web Cache, the number of Web Cache entries
     * and the percentage
     *                                        memory used by the Web Cache
     * for this machine.
     */
    public com.zeus.soap.zxtm._1_0.SystemCacheGlobalInfo getGlobalCacheInfo() throws java.rmi.RemoteException;
}
