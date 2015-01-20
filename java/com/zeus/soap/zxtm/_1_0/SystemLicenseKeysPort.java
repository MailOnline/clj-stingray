/**
 * SystemLicenseKeysPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface SystemLicenseKeysPort extends java.rmi.Remote {

    /**
     * Create and add each of the named license keys.
     */
    public int[] addLicenseKeys(java.lang.String[] license_texts) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete each of the named license keys.
     */
    public void deleteLicenseKeys(int[] serials) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get a list of all the serial numbers of the existing license
     * keys.
     */
    public int[] getAllLicenseKeys() throws java.rmi.RemoteException;

    /**
     * Get the serial number of the license key currently being used
     * by this machine.
     */
    public int getCurrentLicenseKey() throws java.rmi.RemoteException;

    /**
     * For each of the named license keys, get the license key structure.
     */
    public com.zeus.soap.zxtm._1_0.SystemLicenseKeysLicenseKey[] getLicenseKeys(int[] serials) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * For each of the named license keys, get the raw license key
     * text.
     */
    public java.lang.String[] getRawLicenseKeys(int[] serials) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
