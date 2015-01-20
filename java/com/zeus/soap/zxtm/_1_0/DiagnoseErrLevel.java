/**
 * DiagnoseErrLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class DiagnoseErrLevel implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DiagnoseErrLevel(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ERR_UNDEF = "ERR_UNDEF";
    public static final java.lang.String _ERR_FATAL = "ERR_FATAL";
    public static final java.lang.String _ERR_SERIOUS = "ERR_SERIOUS";
    public static final java.lang.String _ERR_DOS = "ERR_DOS";
    public static final java.lang.String _ERR_SSL = "ERR_SSL";
    public static final java.lang.String _ERR_WARN = "ERR_WARN";
    public static final java.lang.String _ERR_INFO = "ERR_INFO";
    public static final DiagnoseErrLevel ERR_UNDEF = new DiagnoseErrLevel(_ERR_UNDEF);
    public static final DiagnoseErrLevel ERR_FATAL = new DiagnoseErrLevel(_ERR_FATAL);
    public static final DiagnoseErrLevel ERR_SERIOUS = new DiagnoseErrLevel(_ERR_SERIOUS);
    public static final DiagnoseErrLevel ERR_DOS = new DiagnoseErrLevel(_ERR_DOS);
    public static final DiagnoseErrLevel ERR_SSL = new DiagnoseErrLevel(_ERR_SSL);
    public static final DiagnoseErrLevel ERR_WARN = new DiagnoseErrLevel(_ERR_WARN);
    public static final DiagnoseErrLevel ERR_INFO = new DiagnoseErrLevel(_ERR_INFO);
    public java.lang.String getValue() { return _value_;}
    public static DiagnoseErrLevel fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DiagnoseErrLevel enumeration = (DiagnoseErrLevel)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DiagnoseErrLevel fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DiagnoseErrLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.ErrLevel"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
