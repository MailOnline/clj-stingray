/**
 * GLBServiceMonitorList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the list of monitors for a GLB location.
 */
public class GLBServiceMonitorList  implements java.io.Serializable {
    /* The glb location. */
    private java.lang.String location;

    /* The monitors determining the health of the corresponding location. */
    private java.lang.String[] monitors;

    public GLBServiceMonitorList() {
    }

    public GLBServiceMonitorList(
           java.lang.String location,
           java.lang.String[] monitors) {
           this.location = location;
           this.monitors = monitors;
    }


    /**
     * Gets the location value for this GLBServiceMonitorList.
     * 
     * @return location   * The glb location.
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this GLBServiceMonitorList.
     * 
     * @param location   * The glb location.
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the monitors value for this GLBServiceMonitorList.
     * 
     * @return monitors   * The monitors determining the health of the corresponding location.
     */
    public java.lang.String[] getMonitors() {
        return monitors;
    }


    /**
     * Sets the monitors value for this GLBServiceMonitorList.
     * 
     * @param monitors   * The monitors determining the health of the corresponding location.
     */
    public void setMonitors(java.lang.String[] monitors) {
        this.monitors = monitors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GLBServiceMonitorList)) return false;
        GLBServiceMonitorList other = (GLBServiceMonitorList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.monitors==null && other.getMonitors()==null) || 
             (this.monitors!=null &&
              java.util.Arrays.equals(this.monitors, other.getMonitors())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMonitors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GLBServiceMonitorList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "GLB.Service.MonitorList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitors"));
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
