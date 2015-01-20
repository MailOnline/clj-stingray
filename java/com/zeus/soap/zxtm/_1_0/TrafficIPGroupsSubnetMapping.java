/**
 * TrafficIPGroupsSubnetMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains mappings of network interface to CIDR subnets.
 * These mappings are used to raise a TrafficIP on a desired interface.
 */
public class TrafficIPGroupsSubnetMapping  implements java.io.Serializable {
    /* The interface on the system. */
    private java.lang.String _interface;

    /* The subnets mappings for the interface. */
    private java.lang.String[] subnets;

    public TrafficIPGroupsSubnetMapping() {
    }

    public TrafficIPGroupsSubnetMapping(
           java.lang.String _interface,
           java.lang.String[] subnets) {
           this._interface = _interface;
           this.subnets = subnets;
    }


    /**
     * Gets the _interface value for this TrafficIPGroupsSubnetMapping.
     * 
     * @return _interface   * The interface on the system.
     */
    public java.lang.String get_interface() {
        return _interface;
    }


    /**
     * Sets the _interface value for this TrafficIPGroupsSubnetMapping.
     * 
     * @param _interface   * The interface on the system.
     */
    public void set_interface(java.lang.String _interface) {
        this._interface = _interface;
    }


    /**
     * Gets the subnets value for this TrafficIPGroupsSubnetMapping.
     * 
     * @return subnets   * The subnets mappings for the interface.
     */
    public java.lang.String[] getSubnets() {
        return subnets;
    }


    /**
     * Sets the subnets value for this TrafficIPGroupsSubnetMapping.
     * 
     * @param subnets   * The subnets mappings for the interface.
     */
    public void setSubnets(java.lang.String[] subnets) {
        this.subnets = subnets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficIPGroupsSubnetMapping)) return false;
        TrafficIPGroupsSubnetMapping other = (TrafficIPGroupsSubnetMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._interface==null && other.get_interface()==null) || 
             (this._interface!=null &&
              this._interface.equals(other.get_interface()))) &&
            ((this.subnets==null && other.getSubnets()==null) || 
             (this.subnets!=null &&
              java.util.Arrays.equals(this.subnets, other.getSubnets())));
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
        if (get_interface() != null) {
            _hashCode += get_interface().hashCode();
        }
        if (getSubnets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubnets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubnets(), i);
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
        new org.apache.axis.description.TypeDesc(TrafficIPGroupsSubnetMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "TrafficIPGroups.SubnetMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_interface");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnets"));
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
