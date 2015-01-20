/**
 * SystemLogDeleteAuthenticator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'delauth' operations
 * (authenticator deleted). It is used when getting Audit Log data.
 */
public class SystemLogDeleteAuthenticator  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* An authenticator being modified. */
    private java.lang.String modauth;

    /* Type of an authenticator being modified. */
    private java.lang.String authtype;

    public SystemLogDeleteAuthenticator() {
    }

    public SystemLogDeleteAuthenticator(
           java.lang.String modauth,
           java.lang.String authtype) {
        this.modauth = modauth;
        this.authtype = authtype;
    }


    /**
     * Gets the modauth value for this SystemLogDeleteAuthenticator.
     * 
     * @return modauth   * An authenticator being modified.
     */
    public java.lang.String getModauth() {
        return modauth;
    }


    /**
     * Sets the modauth value for this SystemLogDeleteAuthenticator.
     * 
     * @param modauth   * An authenticator being modified.
     */
    public void setModauth(java.lang.String modauth) {
        this.modauth = modauth;
    }


    /**
     * Gets the authtype value for this SystemLogDeleteAuthenticator.
     * 
     * @return authtype   * Type of an authenticator being modified.
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this SystemLogDeleteAuthenticator.
     * 
     * @param authtype   * Type of an authenticator being modified.
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogDeleteAuthenticator)) return false;
        SystemLogDeleteAuthenticator other = (SystemLogDeleteAuthenticator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modauth==null && other.getModauth()==null) || 
             (this.modauth!=null &&
              this.modauth.equals(other.getModauth()))) &&
            ((this.authtype==null && other.getAuthtype()==null) || 
             (this.authtype!=null &&
              this.authtype.equals(other.getAuthtype())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getModauth() != null) {
            _hashCode += getModauth().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogDeleteAuthenticator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.DeleteAuthenticator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modauth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtype"));
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
