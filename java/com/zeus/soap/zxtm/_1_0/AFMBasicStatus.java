/**
 * AFMBasicStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * Contains basic Stingray Application Firewall runtime status information.
 */
public class AFMBasicStatus  implements java.io.Serializable {
    /* Whether or not Stingray Application Firewall is installed. */
    private java.lang.String installed;

    /* Whether or not Stingray Application Firewall is running. */
    private java.lang.String running;

    /* The version of Stingray Application Firewall installed. */
    private java.lang.String version;

    /* Whether or not the machine is clustered with the local Stingray
     * Application Firewall. */
    private java.lang.String clustered;

    public AFMBasicStatus() {
    }

    public AFMBasicStatus(
           java.lang.String installed,
           java.lang.String running,
           java.lang.String version,
           java.lang.String clustered) {
           this.installed = installed;
           this.running = running;
           this.version = version;
           this.clustered = clustered;
    }


    /**
     * Gets the installed value for this AFMBasicStatus.
     * 
     * @return installed   * Whether or not Stingray Application Firewall is installed.
     */
    public java.lang.String getInstalled() {
        return installed;
    }


    /**
     * Sets the installed value for this AFMBasicStatus.
     * 
     * @param installed   * Whether or not Stingray Application Firewall is installed.
     */
    public void setInstalled(java.lang.String installed) {
        this.installed = installed;
    }


    /**
     * Gets the running value for this AFMBasicStatus.
     * 
     * @return running   * Whether or not Stingray Application Firewall is running.
     */
    public java.lang.String getRunning() {
        return running;
    }


    /**
     * Sets the running value for this AFMBasicStatus.
     * 
     * @param running   * Whether or not Stingray Application Firewall is running.
     */
    public void setRunning(java.lang.String running) {
        this.running = running;
    }


    /**
     * Gets the version value for this AFMBasicStatus.
     * 
     * @return version   * The version of Stingray Application Firewall installed.
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AFMBasicStatus.
     * 
     * @param version   * The version of Stingray Application Firewall installed.
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the clustered value for this AFMBasicStatus.
     * 
     * @return clustered   * Whether or not the machine is clustered with the local Stingray
     * Application Firewall.
     */
    public java.lang.String getClustered() {
        return clustered;
    }


    /**
     * Sets the clustered value for this AFMBasicStatus.
     * 
     * @param clustered   * Whether or not the machine is clustered with the local Stingray
     * Application Firewall.
     */
    public void setClustered(java.lang.String clustered) {
        this.clustered = clustered;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AFMBasicStatus)) return false;
        AFMBasicStatus other = (AFMBasicStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.installed==null && other.getInstalled()==null) || 
             (this.installed!=null &&
              this.installed.equals(other.getInstalled()))) &&
            ((this.running==null && other.getRunning()==null) || 
             (this.running!=null &&
              this.running.equals(other.getRunning()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.clustered==null && other.getClustered()==null) || 
             (this.clustered!=null &&
              this.clustered.equals(other.getClustered())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInstalled() != null) {
            _hashCode += getInstalled().hashCode();
        }
        if (getRunning() != null) {
            _hashCode += getRunning().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getClustered() != null) {
            _hashCode += getClustered().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AFMBasicStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AFM.BasicStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("", "running"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clustered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clustered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
