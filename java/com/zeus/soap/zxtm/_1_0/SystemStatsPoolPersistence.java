/**
 * SystemStatsPoolPersistence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class SystemStatsPoolPersistence implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SystemStatsPoolPersistence(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _ip = "ip";
    public static final java.lang.String _rule = "rule";
    public static final java.lang.String _transparent = "transparent";
    public static final java.lang.String _applicationCookie = "applicationCookie";
    public static final java.lang.String _xZeusBackend = "xZeusBackend";
    public static final java.lang.String _ssl = "ssl";
    public static final SystemStatsPoolPersistence none = new SystemStatsPoolPersistence(_none);
    public static final SystemStatsPoolPersistence ip = new SystemStatsPoolPersistence(_ip);
    public static final SystemStatsPoolPersistence rule = new SystemStatsPoolPersistence(_rule);
    public static final SystemStatsPoolPersistence transparent = new SystemStatsPoolPersistence(_transparent);
    public static final SystemStatsPoolPersistence applicationCookie = new SystemStatsPoolPersistence(_applicationCookie);
    public static final SystemStatsPoolPersistence xZeusBackend = new SystemStatsPoolPersistence(_xZeusBackend);
    public static final SystemStatsPoolPersistence ssl = new SystemStatsPoolPersistence(_ssl);
    public java.lang.String getValue() { return _value_;}
    public static SystemStatsPoolPersistence fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SystemStatsPoolPersistence enumeration = (SystemStatsPoolPersistence)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SystemStatsPoolPersistence fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SystemStatsPoolPersistence.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Stats.PoolPersistence"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
