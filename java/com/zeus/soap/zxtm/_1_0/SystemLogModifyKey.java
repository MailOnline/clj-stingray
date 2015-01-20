/**
 * SystemLogModifyKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'keymod' operations
 * (config modified). It is used when getting Audit Log data.
 */
public class SystemLogModifyKey  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A configuration key. */
    private java.lang.String key;

    /* A configuration value. */
    private java.lang.String value;

    /* A value that was changed. */
    private java.lang.String oldval;

    /* A file on the filesystem being modified. */
    private java.lang.String file;

    public SystemLogModifyKey() {
    }

    public SystemLogModifyKey(
           java.lang.String key,
           java.lang.String value,
           java.lang.String oldval,
           java.lang.String file) {
        this.key = key;
        this.value = value;
        this.oldval = oldval;
        this.file = file;
    }


    /**
     * Gets the key value for this SystemLogModifyKey.
     * 
     * @return key   * A configuration key.
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this SystemLogModifyKey.
     * 
     * @param key   * A configuration key.
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the value value for this SystemLogModifyKey.
     * 
     * @return value   * A configuration value.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SystemLogModifyKey.
     * 
     * @param value   * A configuration value.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the oldval value for this SystemLogModifyKey.
     * 
     * @return oldval   * A value that was changed.
     */
    public java.lang.String getOldval() {
        return oldval;
    }


    /**
     * Sets the oldval value for this SystemLogModifyKey.
     * 
     * @param oldval   * A value that was changed.
     */
    public void setOldval(java.lang.String oldval) {
        this.oldval = oldval;
    }


    /**
     * Gets the file value for this SystemLogModifyKey.
     * 
     * @return file   * A file on the filesystem being modified.
     */
    public java.lang.String getFile() {
        return file;
    }


    /**
     * Sets the file value for this SystemLogModifyKey.
     * 
     * @param file   * A file on the filesystem being modified.
     */
    public void setFile(java.lang.String file) {
        this.file = file;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogModifyKey)) return false;
        SystemLogModifyKey other = (SystemLogModifyKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.oldval==null && other.getOldval()==null) || 
             (this.oldval!=null &&
              this.oldval.equals(other.getOldval()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getOldval() != null) {
            _hashCode += getOldval().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogModifyKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.ModifyKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file"));
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
