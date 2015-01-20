/**
 * UsersPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface UsersPort extends java.rmi.Remote {

    /**
     * Add a new local user to Stingray Traffic Manager.
     */
    public void addUser(java.lang.String user, java.lang.String password, java.lang.String group) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Change password for a given user.
     */
    public void changePassword(java.lang.String user, java.lang.String newPassword) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Delete a local user from Stingray Traffic Manager.
     */
    public void deleteUser(java.lang.String user) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * List all groups of Stingray Traffic Manager.
     */
    public java.lang.String[] listGroups() throws java.rmi.RemoteException;

    /**
     * List all users of Stingray Traffic Manager.
     */
    public java.lang.String[] listUsers() throws java.rmi.RemoteException;
}
