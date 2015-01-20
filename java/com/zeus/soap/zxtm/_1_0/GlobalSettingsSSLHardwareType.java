/**
 * GlobalSettingsSSLHardwareType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GlobalSettingsSSLHardwareType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalSettingsSSLHardwareType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _pkcs11 = "pkcs11";
    public static final java.lang.String _cn1000 = "cn1000";
    public static final java.lang.String _cn2000 = "cn2000";
    public static final GlobalSettingsSSLHardwareType none = new GlobalSettingsSSLHardwareType(_none);
    public static final GlobalSettingsSSLHardwareType pkcs11 = new GlobalSettingsSSLHardwareType(_pkcs11);
    public static final GlobalSettingsSSLHardwareType cn1000 = new GlobalSettingsSSLHardwareType(_cn1000);
    public static final GlobalSettingsSSLHardwareType cn2000 = new GlobalSettingsSSLHardwareType(_cn2000);
    public java.lang.String getValue() { return _value_;}
    public static GlobalSettingsSSLHardwareType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalSettingsSSLHardwareType enumeration = (GlobalSettingsSSLHardwareType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalSettingsSSLHardwareType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalSettingsSSLHardwareType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettings.SSLHardwareType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
