/**
 * SystemLogCopyAuthenticator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'copyauth' operations
 * (authenticator copied). It is used when getting Audit Log data.
 */
public class SystemLogCopyAuthenticator  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* An authenticator being modified. */
    private java.lang.String modauth;

    /* An authenticator that was copied. */
    private java.lang.String oldauth;

    /* Type of an authenticator being modified. */
    private java.lang.String authtype;

    public SystemLogCopyAuthenticator() {
    }

    public SystemLogCopyAuthenticator(
           java.lang.String modauth,
           java.lang.String oldauth,
           java.lang.String authtype) {
        this.modauth = modauth;
        this.oldauth = oldauth;
        this.authtype = authtype;
    }


    /**
     * Gets the modauth value for this SystemLogCopyAuthenticator.
     * 
     * @return modauth   * An authenticator being modified.
     */
    public java.lang.String getModauth() {
        return modauth;
    }


    /**
     * Sets the modauth value for this SystemLogCopyAuthenticator.
     * 
     * @param modauth   * An authenticator being modified.
     */
    public void setModauth(java.lang.String modauth) {
        this.modauth = modauth;
    }


    /**
     * Gets the oldauth value for this SystemLogCopyAuthenticator.
     * 
     * @return oldauth   * An authenticator that was copied.
     */
    public java.lang.String getOldauth() {
        return oldauth;
    }


    /**
     * Sets the oldauth value for this SystemLogCopyAuthenticator.
     * 
     * @param oldauth   * An authenticator that was copied.
     */
    public void setOldauth(java.lang.String oldauth) {
        this.oldauth = oldauth;
    }


    /**
     * Gets the authtype value for this SystemLogCopyAuthenticator.
     * 
     * @return authtype   * Type of an authenticator being modified.
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this SystemLogCopyAuthenticator.
     * 
     * @param authtype   * Type of an authenticator being modified.
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogCopyAuthenticator)) return false;
        SystemLogCopyAuthenticator other = (SystemLogCopyAuthenticator) obj;
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
            ((this.oldauth==null && other.getOldauth()==null) || 
             (this.oldauth!=null &&
              this.oldauth.equals(other.getOldauth()))) &&
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
        if (getOldauth() != null) {
            _hashCode += getOldauth().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogCopyAuthenticator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.CopyAuthenticator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modauth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldauth"));
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
