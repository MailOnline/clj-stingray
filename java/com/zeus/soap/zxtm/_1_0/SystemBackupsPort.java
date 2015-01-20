/**
 * SystemBackupsPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemBackupsPort extends java.rmi.Remote {

    /**
     * Create backup archive based on the current configuration
     */
    public void createBackup(java.lang.String name, java.lang.String description) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete all the backups
     */
    public void deleteAllBackups() throws java.rmi.RemoteException;

    /**
     * Delete one or more backups
     */
    public void deleteBackups(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Download a named backup archive
     */
    public byte[] downloadBackup(java.lang.String name) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get details for one or more backups.
     */
    public com.zeus.soap.zxtm._1_0.SystemBackupsBackup[] getBackupDetails(java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * List the details for all backup archives.
     */
    public com.zeus.soap.zxtm._1_0.SystemBackupsBackup[] listAllBackups() throws java.rmi.RemoteException;

    /**
     * Restore the named backup archive to be the current configuration
     */
    public void restoreBackup(java.lang.String name) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Upload a backup archive
     */
    public void uploadBackup(java.lang.String name, byte[] backup) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;
}
