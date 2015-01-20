/**
 * SystemLogNoChangePermission.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This is the operation parameters structure for 'nopostperm' operations
 * (user was refused permission to update data in section). It is used
 * when getting Audit Log data.
 */
public class SystemLogNoChangePermission  extends com.zeus.soap.zxtm._1_0.SystemLogOpParam  implements java.io.Serializable {
    /* A section. */
    private java.lang.String sec;

    public SystemLogNoChangePermission() {
    }

    public SystemLogNoChangePermission(
           java.lang.String sec) {
        this.sec = sec;
    }


    /**
     * Gets the sec value for this SystemLogNoChangePermission.
     * 
     * @return sec   * A section.
     */
    public java.lang.String getSec() {
        return sec;
    }


    /**
     * Sets the sec value for this SystemLogNoChangePermission.
     * 
     * @param sec   * A section.
     */
    public void setSec(java.lang.String sec) {
        this.sec = sec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLogNoChangePermission)) return false;
        SystemLogNoChangePermission other = (SystemLogNoChangePermission) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sec==null && other.getSec()==null) || 
             (this.sec!=null &&
              this.sec.equals(other.getSec())));
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
        if (getSec() != null) {
            _hashCode += getSec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLogNoChangePermission.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Log.NoChangePermission"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sec"));
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
