/**
 * DiagnoseFlipperError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information about Flipper errors.
 */
public class DiagnoseFlipperError  implements java.io.Serializable {
    /* The name of the affected machine. */
    private java.lang.String machine;

    /* IP address in dotted-decimal notation. */
    private java.lang.String ipAddress;

    /* All error messages for that machine. */
    private com.zeus.soap.zxtm._1_0.DiagnoseAgeError[] errors;

    public DiagnoseFlipperError() {
    }

    public DiagnoseFlipperError(
           java.lang.String machine,
           java.lang.String ipAddress,
           com.zeus.soap.zxtm._1_0.DiagnoseAgeError[] errors) {
           this.machine = machine;
           this.ipAddress = ipAddress;
           this.errors = errors;
    }


    /**
     * Gets the machine value for this DiagnoseFlipperError.
     * 
     * @return machine   * The name of the affected machine.
     */
    public java.lang.String getMachine() {
        return machine;
    }


    /**
     * Sets the machine value for this DiagnoseFlipperError.
     * 
     * @param machine   * The name of the affected machine.
     */
    public void setMachine(java.lang.String machine) {
        this.machine = machine;
    }


    /**
     * Gets the ipAddress value for this DiagnoseFlipperError.
     * 
     * @return ipAddress   * IP address in dotted-decimal notation.
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this DiagnoseFlipperError.
     * 
     * @param ipAddress   * IP address in dotted-decimal notation.
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the errors value for this DiagnoseFlipperError.
     * 
     * @return errors   * All error messages for that machine.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseAgeError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this DiagnoseFlipperError.
     * 
     * @param errors   * All error messages for that machine.
     */
    public void setErrors(com.zeus.soap.zxtm._1_0.DiagnoseAgeError[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnoseFlipperError)) return false;
        DiagnoseFlipperError other = (DiagnoseFlipperError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.machine==null && other.getMachine()==null) || 
             (this.machine!=null &&
              this.machine.equals(other.getMachine()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
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
        if (getMachine() != null) {
            _hashCode += getMachine().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnoseFlipperError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.FlipperError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("machine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "machine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.AgeError"));
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
