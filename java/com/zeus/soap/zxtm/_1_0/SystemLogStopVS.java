/**
 * SystemLogStopVS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'stopvs' operations
 * (virtual server stopped). It is used when getting Audit Log data.
 */
public class SystemLogStopVS  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A virtual server. */
    private java.lang.String vs;

    public SystemLogStopVS() {
    }

    public SystemLogStopVS(
           java.lang.String vs) {
        this.vs = vs;
    }


    /**
     * Gets the vs value for this SystemLogStopVS.
     * 
     * @return vs   * A virtual server.
     */
    public java.lang.String getVs() {
        return vs;
    }


    /**
     * Sets the vs value for this SystemLogStopVS.
     * 
     * @param vs   * A virtual server.
     */
    public void setVs(java.lang.String vs) {
        this.vs = vs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogStopVS)) return false;
        SystemLogStopVS other = (SystemLogStopVS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vs==null && other.getVs()==null) || 
             (this.vs!=null &&
              this.vs.equals(other.getVs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getVs() != null) {
            _hashCode += getVs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogStopVS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.StopVS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vs"));
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
