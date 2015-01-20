/**
 * CatalogMonitorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogMonitorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CatalogMonitorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ping = "ping";
    public static final java.lang.String _connect = "connect";
    public static final java.lang.String _http = "http";
    public static final java.lang.String _tcp_transaction = "tcp_transaction";
    public static final java.lang.String _program = "program";
    public static final java.lang.String _sip = "sip";
    public static final java.lang.String _rtsp = "rtsp";
    public static final CatalogMonitorType ping = new CatalogMonitorType(_ping);
    public static final CatalogMonitorType connect = new CatalogMonitorType(_connect);
    public static final CatalogMonitorType http = new CatalogMonitorType(_http);
    public static final CatalogMonitorType tcp_transaction = new CatalogMonitorType(_tcp_transaction);
    public static final CatalogMonitorType program = new CatalogMonitorType(_program);
    public static final CatalogMonitorType sip = new CatalogMonitorType(_sip);
    public static final CatalogMonitorType rtsp = new CatalogMonitorType(_rtsp);
    public java.lang.String getValue() { return _value_;}
    public static CatalogMonitorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CatalogMonitorType enumeration = (CatalogMonitorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CatalogMonitorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CatalogMonitorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Monitor.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
