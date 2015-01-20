/**
 * GlobalSettingsSsldLibrary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class GlobalSettingsSsldLibrary implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalSettingsSsldLibrary(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _pkcs11 = "pkcs11";
    public static final java.lang.String _cn1000 = "cn1000";
    public static final java.lang.String _cn2000 = "cn2000";
    public static final GlobalSettingsSsldLibrary none = new GlobalSettingsSsldLibrary(_none);
    public static final GlobalSettingsSsldLibrary pkcs11 = new GlobalSettingsSsldLibrary(_pkcs11);
    public static final GlobalSettingsSsldLibrary cn1000 = new GlobalSettingsSsldLibrary(_cn1000);
    public static final GlobalSettingsSsldLibrary cn2000 = new GlobalSettingsSsldLibrary(_cn2000);
    public java.lang.String getValue() { return _value_;}
    public static GlobalSettingsSsldLibrary fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalSettingsSsldLibrary enumeration = (GlobalSettingsSsldLibrary)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalSettingsSsldLibrary fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GlobalSettingsSsldLibrary.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GlobalSettings.SsldLibrary"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
