/**
 * ConfExtraPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface ConfExtraPort extends java.rmi.Remote {

    /**
     * Add new files to the conf/extra directory. This function will
     * raise an exception if the file already exists.
     */
    public void addFile(java.lang.String[] names, java.lang.String[] contents) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named files from the conf/extra directory.
     */
    public void deleteFile(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the contents of the named files from the conf/extra directory.
     */
    public java.lang.String[] getFile(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the files stored in the conf/extra directory.
     */
    public java.lang.String[] getFileNames() throws java.rmi.RemoteException;

    /**
     * Write files to the conf/extra directory, overwriting files
     * if they already exist.
     */
    public void writeFile(java.lang.String[] names, java.lang.String[] contents) throws java.rmi.RemoteException;
}
