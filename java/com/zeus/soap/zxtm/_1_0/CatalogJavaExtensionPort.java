/**
 * CatalogJavaExtensionPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogJavaExtensionPort extends java.rmi.Remote {

    /**
     * Adds initialisation properties for each of the specified extensions.
     */
    public void addProperties(java.lang.String[] class_names, com.zeus.soap.zxtm._1_0.CatalogJavaExtensionProperty[][] properties) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete the named Java Extension files.
     */
    public void deleteJavaExtensionFile(java.lang.String[] names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Download the named Java Extension File.
     */
    public byte[] downloadJavaExtensionFile(java.lang.String name) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Edits the initialisation properties for each of the specified
     * extensions.
     */
    public void editProperties(java.lang.String[] class_names, java.lang.String[][] properties_being_edited, com.zeus.soap.zxtm._1_0.CatalogJavaExtensionProperty[][] properties) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the class names of all the extensions currently in the
     * system.
     */
    public java.lang.String[] getExtensionClassNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError;

    /**
     * Gets the errors for each of the specified extensions.
     */
    public java.lang.String[][] getExtensionErrors(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets information on each of the specified extensions.
     */
    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionInfo[] getExtensionInfo(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of Java Extension files on the traffic manager.
     * This list includes files that contain Java Extension and non-Java
     * Extension files, such as other .jar files.
     */
    public java.lang.String[] getJavaExtensionFileNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError;

    /**
     * Gets the initialisation properties for each of the specified
     * extensions.
     */
    public com.zeus.soap.zxtm._1_0.CatalogJavaExtensionProperty[][] getProperties(java.lang.String[] class_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Removes initialisation properties for each of the specified
     * extensions.
     */
    public void removeProperties(java.lang.String[] class_names, java.lang.String[][] prop_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Uploads a new file that may contain a Java Extension. This
     * will overwrite the file if it already exists.
     */
    public void uploadJavaExtensionFile(java.lang.String name, byte[] content) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidObjectName;
}
