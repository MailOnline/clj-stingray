/**
 * CatalogPersistenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public class CatalogPersistenceType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CatalogPersistenceType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "ip";
    public static final java.lang.String _value2 = "universal";
    public static final java.lang.String _value3 = "named";
    public static final java.lang.String _value4 = "transparent";
    public static final java.lang.String _value5 = "monitor-cookies";
    public static final java.lang.String _value6 = "j2ee";
    public static final java.lang.String _value7 = "asp";
    public static final java.lang.String _value8 = "x-zeus";
    public static final java.lang.String _value9 = "ssl";
    public static final java.lang.String _value10 = "kipper";
    public static final java.lang.String _value11 = "sardine";
    public static final CatalogPersistenceType value1 = new CatalogPersistenceType(_value1);
    public static final CatalogPersistenceType value2 = new CatalogPersistenceType(_value2);
    public static final CatalogPersistenceType value3 = new CatalogPersistenceType(_value3);
    public static final CatalogPersistenceType value4 = new CatalogPersistenceType(_value4);
    public static final CatalogPersistenceType value5 = new CatalogPersistenceType(_value5);
    public static final CatalogPersistenceType value6 = new CatalogPersistenceType(_value6);
    public static final CatalogPersistenceType value7 = new CatalogPersistenceType(_value7);
    public static final CatalogPersistenceType value8 = new CatalogPersistenceType(_value8);
    public static final CatalogPersistenceType value9 = new CatalogPersistenceType(_value9);
    public static final CatalogPersistenceType value10 = new CatalogPersistenceType(_value10);
    public static final CatalogPersistenceType value11 = new CatalogPersistenceType(_value11);
    public java.lang.String getValue() { return _value_;}
    public static CatalogPersistenceType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CatalogPersistenceType enumeration = (CatalogPersistenceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CatalogPersistenceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CatalogPersistenceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.Persistence.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
