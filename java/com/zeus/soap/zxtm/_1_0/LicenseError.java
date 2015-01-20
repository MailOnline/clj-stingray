/**
 * LicenseError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * The LicenseError fault is emitted when attempting to use functionality
 * that is disabled by the license key.
 *          
 *               You will need to contact your support provider to get
 * a new license
 *               key with the required functionality. There may be a
 * charge for this.
 */
public class LicenseError  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* A human readable string describing the error */
    private java.lang.String errmsg;

    /* The license key feature that was missing */
    private java.lang.String feature;

    public LicenseError() {
    }

    public LicenseError(
           java.lang.String errmsg,
           java.lang.String feature) {
        this.errmsg = errmsg;
        this.feature = feature;
    }


    /**
     * Gets the errmsg value for this LicenseError.
     * 
     * @return errmsg   * A human readable string describing the error
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this LicenseError.
     * 
     * @param errmsg   * A human readable string describing the error
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the feature value for this LicenseError.
     * 
     * @return feature   * The license key feature that was missing
     */
    public java.lang.String getFeature() {
        return feature;
    }


    /**
     * Sets the feature value for this LicenseError.
     * 
     * @param feature   * The license key feature that was missing
     */
    public void setFeature(java.lang.String feature) {
        this.feature = feature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LicenseError)) return false;
        LicenseError other = (LicenseError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errmsg==null && other.getErrmsg()==null) || 
             (this.errmsg!=null &&
              this.errmsg.equals(other.getErrmsg()))) &&
            ((this.feature==null && other.getFeature()==null) || 
             (this.feature!=null &&
              this.feature.equals(other.getFeature())));
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
        if (getErrmsg() != null) {
            _hashCode += getErrmsg().hashCode();
        }
        if (getFeature() != null) {
            _hashCode += getFeature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LicenseError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "LicenseError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feature"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
