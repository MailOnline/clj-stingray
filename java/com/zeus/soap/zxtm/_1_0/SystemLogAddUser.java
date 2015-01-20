/**
 * SystemLogAddUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'adduser' operations
 * (user added). It is used when getting Audit Log data.
 */
public class SystemLogAddUser  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A user being modified. */
    private java.lang.String moduser;

    /* A group being modified. */
    private java.lang.String modgroup;

    public SystemLogAddUser() {
    }

    public SystemLogAddUser(
           java.lang.String moduser,
           java.lang.String modgroup) {
        this.moduser = moduser;
        this.modgroup = modgroup;
    }


    /**
     * Gets the moduser value for this SystemLogAddUser.
     * 
     * @return moduser   * A user being modified.
     */
    public java.lang.String getModuser() {
        return moduser;
    }


    /**
     * Sets the moduser value for this SystemLogAddUser.
     * 
     * @param moduser   * A user being modified.
     */
    public void setModuser(java.lang.String moduser) {
        this.moduser = moduser;
    }


    /**
     * Gets the modgroup value for this SystemLogAddUser.
     * 
     * @return modgroup   * A group being modified.
     */
    public java.lang.String getModgroup() {
        return modgroup;
    }


    /**
     * Sets the modgroup value for this SystemLogAddUser.
     * 
     * @param modgroup   * A group being modified.
     */
    public void setModgroup(java.lang.String modgroup) {
        this.modgroup = modgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogAddUser)) return false;
        SystemLogAddUser other = (SystemLogAddUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.moduser==null && other.getModuser()==null) || 
             (this.moduser!=null &&
              this.moduser.equals(other.getModuser()))) &&
            ((this.modgroup==null && other.getModgroup()==null) || 
             (this.modgroup!=null &&
              this.modgroup.equals(other.getModgroup())));
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
        if (getModuser() != null) {
            _hashCode += getModuser().hashCode();
        }
        if (getModgroup() != null) {
            _hashCode += getModgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogAddUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.AddUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modgroup"));
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
