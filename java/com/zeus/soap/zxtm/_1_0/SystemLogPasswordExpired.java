/**
 * SystemLogPasswordExpired.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'passwordexpired'
 * operations (user's password has expired.). It is used when getting
 * Audit Log data.
 */
public class SystemLogPasswordExpired  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A login type, i.e. UI, basicauth, or SSH. */
    private java.lang.String logintype;

    /* Resource being accessed. */
    private java.lang.String resource;

    public SystemLogPasswordExpired() {
    }

    public SystemLogPasswordExpired(
           java.lang.String logintype,
           java.lang.String resource) {
        this.logintype = logintype;
        this.resource = resource;
    }


    /**
     * Gets the logintype value for this SystemLogPasswordExpired.
     * 
     * @return logintype   * A login type, i.e. UI, basicauth, or SSH.
     */
    public java.lang.String getLogintype() {
        return logintype;
    }


    /**
     * Sets the logintype value for this SystemLogPasswordExpired.
     * 
     * @param logintype   * A login type, i.e. UI, basicauth, or SSH.
     */
    public void setLogintype(java.lang.String logintype) {
        this.logintype = logintype;
    }


    /**
     * Gets the resource value for this SystemLogPasswordExpired.
     * 
     * @return resource   * Resource being accessed.
     */
    public java.lang.String getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this SystemLogPasswordExpired.
     * 
     * @param resource   * Resource being accessed.
     */
    public void setResource(java.lang.String resource) {
        this.resource = resource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogPasswordExpired)) return false;
        SystemLogPasswordExpired other = (SystemLogPasswordExpired) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.logintype==null && other.getLogintype()==null) || 
             (this.logintype!=null &&
              this.logintype.equals(other.getLogintype()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource())));
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
        if (getLogintype() != null) {
            _hashCode += getLogintype().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogPasswordExpired.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.PasswordExpired"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logintype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource"));
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
