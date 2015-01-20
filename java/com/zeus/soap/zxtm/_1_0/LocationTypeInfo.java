/**
 * LocationTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information required when adding a location.
 */
public class LocationTypeInfo  implements java.io.Serializable {
    /* Location type, either config or glb. GLB locations don't contain
     * any traffic managers and are used for global load balancing. */
    private java.lang.String type;

    /* If the location isn't of type GLB, this is the location that
     * the configuration will be be based on initially */
    private java.lang.String based_on;

    public LocationTypeInfo() {
    }

    public LocationTypeInfo(
           java.lang.String type,
           java.lang.String based_on) {
           this.type = type;
           this.based_on = based_on;
    }


    /**
     * Gets the type value for this LocationTypeInfo.
     * 
     * @return type   * Location type, either config or glb. GLB locations don't contain
     * any traffic managers and are used for global load balancing.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this LocationTypeInfo.
     * 
     * @param type   * Location type, either config or glb. GLB locations don't contain
     * any traffic managers and are used for global load balancing.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the based_on value for this LocationTypeInfo.
     * 
     * @return based_on   * If the location isn't of type GLB, this is the location that
     * the configuration will be be based on initially
     */
    public java.lang.String getBased_on() {
        return based_on;
    }


    /**
     * Sets the based_on value for this LocationTypeInfo.
     * 
     * @param based_on   * If the location isn't of type GLB, this is the location that
     * the configuration will be be based on initially
     */
    public void setBased_on(java.lang.String based_on) {
        this.based_on = based_on;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationTypeInfo)) return false;
        LocationTypeInfo other = (LocationTypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.based_on==null && other.getBased_on()==null) || 
             (this.based_on!=null &&
              this.based_on.equals(other.getBased_on())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBased_on() != null) {
            _hashCode += getBased_on().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationTypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Location.TypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("based_on");
        elemField.setXmlName(new javax.xml.namespace.QName("", "based_on"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
