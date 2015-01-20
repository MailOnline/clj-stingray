/**
 * VirtualServerCookieSecureFlagRewriteMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class VirtualServerCookieSecureFlagRewriteMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VirtualServerCookieSecureFlagRewriteMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _no_modify = "no_modify";
    public static final java.lang.String _set_secure = "set_secure";
    public static final java.lang.String _unset_secure = "unset_secure";
    public static final VirtualServerCookieSecureFlagRewriteMode no_modify = new VirtualServerCookieSecureFlagRewriteMode(_no_modify);
    public static final VirtualServerCookieSecureFlagRewriteMode set_secure = new VirtualServerCookieSecureFlagRewriteMode(_set_secure);
    public static final VirtualServerCookieSecureFlagRewriteMode unset_secure = new VirtualServerCookieSecureFlagRewriteMode(_unset_secure);
    public java.lang.String getValue() { return _value_;}
    public static VirtualServerCookieSecureFlagRewriteMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VirtualServerCookieSecureFlagRewriteMode enumeration = (VirtualServerCookieSecureFlagRewriteMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VirtualServerCookieSecureFlagRewriteMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VirtualServerCookieSecureFlagRewriteMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.CookieSecureFlagRewriteMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
