/**
 * LocationPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface LocationPort extends java.rmi.Remote {

    /**
     * Adds locations. Configuration for the new locations will be
     * based on the specified locations
     */
    public void addLocation(java.lang.String[] locations, com.zeus.soap.zxtm._1_0.LocationTypeInfo[] info) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Delete the named Location.
     */
    public void deleteLocation(java.lang.String[] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;

    /**
     * Disable support for configuration locations, setting all configuration
     * values to those for the specified location.
     */
    public void disable(java.lang.String location) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Enable support for configuration locations.
     */
    public void enable() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation;

    /**
     * Get the coordinates for the named locations.
     */
    public com.zeus.soap.zxtm._1_0.LocationCoordinates[] getCoordinates(java.lang.String[] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the names of all the configured locations.
     */
    public java.lang.String[] getLocations() throws java.rmi.RemoteException;

    /**
     * Get the note for each of the named locations
     */
    public java.lang.String[] getNote(java.lang.String[] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets the location that the named traffic managers are in.
     */
    public java.lang.String[] getTrafficManagerLocation(java.lang.String[] traffic_managers) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Gets a location's type, either config or glb. GLB locations
     * contain no traffic managers, and are only used for global load balancing.
     */
    public java.lang.String[] getType(java.lang.String[] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Rename the named Locations.
     */
    public void renameLocation(java.lang.String[] locations, java.lang.String[] new_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.InvalidObjectName, com.zeus.soap.zxtm._1_0.ObjectAlreadyExists;

    /**
     * Set the coordinates for the named locations. Coordinates are
     * only needed for global load balancing.
     */
    public void setCoordinates(java.lang.String[] locations, com.zeus.soap.zxtm._1_0.LocationCoordinates[] coordinates) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the note for each of the named locations
     */
    public void setNote(java.lang.String[] locations, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets the location that the named traffic managers are in.
     */
    public void setTrafficManagerLocation(java.lang.String[] traffic_managers, java.lang.String[] locations) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Sets a location's type, either config or glb. GLB locations
     * contain no traffic managers, and are only used for global load balancing.
     */
    public void setType(java.lang.String[] locations, com.zeus.soap.zxtm._1_0.LocationTypeInfo[] type_info) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.InvalidOperation, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist, com.zeus.soap.zxtm._1_0.ObjectInUse;
}
