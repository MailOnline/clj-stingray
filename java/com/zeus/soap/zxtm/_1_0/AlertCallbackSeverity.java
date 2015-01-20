/**
 * AlertCallbackSeverity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class AlertCallbackSeverity implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlertCallbackSeverity(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DOS = "DOS";
    public static final java.lang.String _FATAL = "FATAL";
    public static final java.lang.String _INFO = "INFO";
    public static final java.lang.String _SERIOUS = "SERIOUS";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _WARN = "WARN";
    public static final AlertCallbackSeverity DOS = new AlertCallbackSeverity(_DOS);
    public static final AlertCallbackSeverity FATAL = new AlertCallbackSeverity(_FATAL);
    public static final AlertCallbackSeverity INFO = new AlertCallbackSeverity(_INFO);
    public static final AlertCallbackSeverity SERIOUS = new AlertCallbackSeverity(_SERIOUS);
    public static final AlertCallbackSeverity SSL = new AlertCallbackSeverity(_SSL);
    public static final AlertCallbackSeverity WARN = new AlertCallbackSeverity(_WARN);
    public java.lang.String getValue() { return _value_;}
    public static AlertCallbackSeverity fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AlertCallbackSeverity enumeration = (AlertCallbackSeverity)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AlertCallbackSeverity fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AlertCallbackSeverity.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "AlertCallback.Severity"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
