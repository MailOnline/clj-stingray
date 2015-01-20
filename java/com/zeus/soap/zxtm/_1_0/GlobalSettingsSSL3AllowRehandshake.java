/**
 * GlobalSettingsSSL3AllowRehandshake.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GlobalSettingsSSL3AllowRehandshake implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalSettingsSSL3AllowRehandshake(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _always = "always";
    public static final java.lang.String _safe = "safe";
    public static final java.lang.String _rfc5746 = "rfc5746";
    public static final java.lang.String _never = "never";
    public static final GlobalSettingsSSL3AllowRehandshake always = new GlobalSettingsSSL3AllowRehandshake(_always);
    public static final GlobalSettingsSSL3AllowRehandshake safe = new GlobalSettingsSSL3AllowRehandshake(_safe);
    public static final GlobalSettingsSSL3AllowRehandshake rfc5746 = new GlobalSettingsSSL3AllowRehandshake(_rfc5746);
    public static final GlobalSettingsSSL3AllowRehandshake never = new GlobalSettingsSSL3AllowRehandshake(_never);
    public java.lang.String getValue() { return _value_;}
    public static GlobalSettingsSSL3AllowRehandshake fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalSettingsSSL3AllowRehandshake enumeration = (GlobalSettingsSSL3AllowRehandshake)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalSettingsSSL3AllowRehandshake fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalSettingsSSL3AllowRehandshake.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettings.SSL3AllowRehandshake"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
