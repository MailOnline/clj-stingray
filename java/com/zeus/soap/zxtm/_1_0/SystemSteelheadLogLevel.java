/**
 * SystemSteelheadLogLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemSteelheadLogLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemSteelheadLogLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _critial = "critial";
    public static final java.lang.String _serious = "serious";
    public static final java.lang.String _warning = "warning";
    public static final java.lang.String _notice = "notice";
    public static final java.lang.String _info = "info";
    public static final java.lang.String _debug = "debug";
    public static final SystemSteelheadLogLevel critial = new SystemSteelheadLogLevel(_critial);
    public static final SystemSteelheadLogLevel serious = new SystemSteelheadLogLevel(_serious);
    public static final SystemSteelheadLogLevel warning = new SystemSteelheadLogLevel(_warning);
    public static final SystemSteelheadLogLevel notice = new SystemSteelheadLogLevel(_notice);
    public static final SystemSteelheadLogLevel info = new SystemSteelheadLogLevel(_info);
    public static final SystemSteelheadLogLevel debug = new SystemSteelheadLogLevel(_debug);
    public java.lang.String getValue() { return _value_;}
    public static SystemSteelheadLogLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemSteelheadLogLevel enumeration = (SystemSteelheadLogLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemSteelheadLogLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemSteelheadLogLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Steelhead.LogLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
