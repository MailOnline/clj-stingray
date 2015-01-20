/**
 * SystemLogLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'login' operations
 * (logged in). It is used when getting Audit Log data.
 */
public class SystemLogLogin  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A login type, i.e. UI, basicauth, or SSH. */
    private java.lang.String logintype;

    /* A login timeout value. */
    private java.lang.String timeout;

    public SystemLogLogin() {
    }

    public SystemLogLogin(
           java.lang.String logintype,
           java.lang.String timeout) {
        this.logintype = logintype;
        this.timeout = timeout;
    }


    /**
     * Gets the logintype value for this SystemLogLogin.
     * 
     * @return logintype   * A login type, i.e. UI, basicauth, or SSH.
     */
    public java.lang.String getLogintype() {
        return logintype;
    }


    /**
     * Sets the logintype value for this SystemLogLogin.
     * 
     * @param logintype   * A login type, i.e. UI, basicauth, or SSH.
     */
    public void setLogintype(java.lang.String logintype) {
        this.logintype = logintype;
    }


    /**
     * Gets the timeout value for this SystemLogLogin.
     * 
     * @return timeout   * A login timeout value.
     */
    public java.lang.String getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this SystemLogLogin.
     * 
     * @param timeout   * A login timeout value.
     */
    public void setTimeout(java.lang.String timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogLogin)) return false;
        SystemLogLogin other = (SystemLogLogin) obj;
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
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogLogin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.Login"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logintype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
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
