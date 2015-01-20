/**
 * CatalogAptimizerProfilePort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface CatalogAptimizerProfilePort extends java.rmi.Remote {

    /**
     * Get the names of all the configured Aptimizer profiles.
     */
    public java.lang.String[] getAptimizerProfileNames() throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError;

    /**
     * Get the configuration string for the Aptimize profile.
     */
    public java.lang.String[] getConfig(java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the configuration string for the Aptimize profile. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public java.lang.String[] getConfigByLocation(java.lang.String location, java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the mode in which Aptimizer should run when this profile
     * is applied
     */
    public com.zeus.soap.zxtm._1_0.CatalogAptimizerProfileMode[] getMode(java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get the mode in which Aptimizer should run when this profile
     * is applied This is a location specific function, any action will operate
     * on the specified location.
     */
    public com.zeus.soap.zxtm._1_0.CatalogAptimizerProfileMode[] getModeByLocation(java.lang.String location, java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether or not the Aptimizer information bar should be
     * displayed on accelerated web pages
     */
    public boolean[] getShowInfoBar(java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Get whether or not the Aptimizer information bar should be
     * displayed on accelerated web pages This is a location specific function,
     * any action will operate on the specified location.
     */
    public boolean[] getShowInfoBarByLocation(java.lang.String location, java.lang.String[] profile_names) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the configuration string for the Aptimize profile.
     */
    public void setConfig(java.lang.String[] profile_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the configuration string for the Aptimize profile. This
     * is a location specific function, any action will operate on the specified
     * location.
     */
    public void setConfigByLocation(java.lang.String location, java.lang.String[] profile_names, java.lang.String[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the mode in which Aptimizer should run when this profile
     * is applied
     */
    public void setMode(java.lang.String[] profile_names, com.zeus.soap.zxtm._1_0.CatalogAptimizerProfileMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set the mode in which Aptimizer should run when this profile
     * is applied This is a location specific function, any action will operate
     * on the specified location.
     */
    public void setModeByLocation(java.lang.String location, java.lang.String[] profile_names, com.zeus.soap.zxtm._1_0.CatalogAptimizerProfileMode[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether or not the Aptimizer information bar should be
     * displayed on accelerated web pages
     */
    public void setShowInfoBar(java.lang.String[] profile_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;

    /**
     * Set whether or not the Aptimizer information bar should be
     * displayed on accelerated web pages This is a location specific function,
     * any action will operate on the specified location.
     */
    public void setShowInfoBarByLocation(java.lang.String location, java.lang.String[] profile_names, boolean[] values) throws java.rmi.RemoteException, com.zeus.soap.zxtm._1_0.LicenseError, com.zeus.soap.zxtm._1_0.InvalidInput, com.zeus.soap.zxtm._1_0.DeploymentError, com.zeus.soap.zxtm._1_0.ObjectDoesNotExist;
}
