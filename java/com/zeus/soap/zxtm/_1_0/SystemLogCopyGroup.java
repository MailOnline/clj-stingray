/**
 * SystemLogCopyGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'copygroup' operations
 * (group copied). It is used when getting Audit Log data.
 */
public class SystemLogCopyGroup  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A group being modified. */
    private java.lang.String modgroup;

    /* A group that was copied. */
    private java.lang.String oldgroup;

    public SystemLogCopyGroup() {
    }

    public SystemLogCopyGroup(
           java.lang.String modgroup,
           java.lang.String oldgroup) {
        this.modgroup = modgroup;
        this.oldgroup = oldgroup;
    }


    /**
     * Gets the modgroup value for this SystemLogCopyGroup.
     * 
     * @return modgroup   * A group being modified.
     */
    public java.lang.String getModgroup() {
        return modgroup;
    }


    /**
     * Sets the modgroup value for this SystemLogCopyGroup.
     * 
     * @param modgroup   * A group being modified.
     */
    public void setModgroup(java.lang.String modgroup) {
        this.modgroup = modgroup;
    }


    /**
     * Gets the oldgroup value for this SystemLogCopyGroup.
     * 
     * @return oldgroup   * A group that was copied.
     */
    public java.lang.String getOldgroup() {
        return oldgroup;
    }


    /**
     * Sets the oldgroup value for this SystemLogCopyGroup.
     * 
     * @param oldgroup   * A group that was copied.
     */
    public void setOldgroup(java.lang.String oldgroup) {
        this.oldgroup = oldgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogCopyGroup)) return false;
        SystemLogCopyGroup other = (SystemLogCopyGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modgroup==null && other.getModgroup()==null) || 
             (this.modgroup!=null &&
              this.modgroup.equals(other.getModgroup()))) &&
            ((this.oldgroup==null && other.getOldgroup()==null) || 
             (this.oldgroup!=null &&
              this.oldgroup.equals(other.getOldgroup())));
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
        if (getModgroup() != null) {
            _hashCode += getModgroup().hashCode();
        }
        if (getOldgroup() != null) {
            _hashCode += getOldgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogCopyGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.CopyGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oldgroup"));
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
