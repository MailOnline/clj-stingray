/**
 * VirtualServerPortRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the range of ports.
 */
public class VirtualServerPortRange  implements java.io.Serializable {
    /* The lower bound of the port range. */
    private int low;

    /* The upper bound of the port range. */
    private int high;

    public VirtualServerPortRange() {
    }

    public VirtualServerPortRange(
           int low,
           int high) {
           this.low = low;
           this.high = high;
    }


    /**
     * Gets the low value for this VirtualServerPortRange.
     * 
     * @return low   * The lower bound of the port range.
     */
    public int getLow() {
        return low;
    }


    /**
     * Sets the low value for this VirtualServerPortRange.
     * 
     * @param low   * The lower bound of the port range.
     */
    public void setLow(int low) {
        this.low = low;
    }


    /**
     * Gets the high value for this VirtualServerPortRange.
     * 
     * @return high   * The upper bound of the port range.
     */
    public int getHigh() {
        return high;
    }


    /**
     * Sets the high value for this VirtualServerPortRange.
     * 
     * @param high   * The upper bound of the port range.
     */
    public void setHigh(int high) {
        this.high = high;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerPortRange)) return false;
        VirtualServerPortRange other = (VirtualServerPortRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.low == other.getLow() &&
            this.high == other.getHigh();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getLow();
        _hashCode += getHigh();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerPortRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.PortRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
