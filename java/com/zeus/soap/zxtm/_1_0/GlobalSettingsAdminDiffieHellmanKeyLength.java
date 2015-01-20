/**
 * GlobalSettingsAdminDiffieHellmanKeyLength.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GlobalSettingsAdminDiffieHellmanKeyLength implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalSettingsAdminDiffieHellmanKeyLength(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _dh_1024 = "dh_1024";
    public static final java.lang.String _dh_2048 = "dh_2048";
    public static final java.lang.String _dh_3072 = "dh_3072";
    public static final java.lang.String _dh_4096 = "dh_4096";
    public static final GlobalSettingsAdminDiffieHellmanKeyLength dh_1024 = new GlobalSettingsAdminDiffieHellmanKeyLength(_dh_1024);
    public static final GlobalSettingsAdminDiffieHellmanKeyLength dh_2048 = new GlobalSettingsAdminDiffieHellmanKeyLength(_dh_2048);
    public static final GlobalSettingsAdminDiffieHellmanKeyLength dh_3072 = new GlobalSettingsAdminDiffieHellmanKeyLength(_dh_3072);
    public static final GlobalSettingsAdminDiffieHellmanKeyLength dh_4096 = new GlobalSettingsAdminDiffieHellmanKeyLength(_dh_4096);
    public java.lang.String getValue() { return _value_;}
    public static GlobalSettingsAdminDiffieHellmanKeyLength fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalSettingsAdminDiffieHellmanKeyLength enumeration = (GlobalSettingsAdminDiffieHellmanKeyLength)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalSettingsAdminDiffieHellmanKeyLength fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalSettingsAdminDiffieHellmanKeyLength.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettings.AdminDiffieHellmanKeyLength"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
