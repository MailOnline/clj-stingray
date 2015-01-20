/**
 * DiagnoseSystemStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * Status information about the hardware in an appliance is reported
 * by instances of this structure.
 */
public class DiagnoseSystemStatus  implements java.io.Serializable {
    /* The component this object refers to */
    private java.lang.String component;

    /* The severity level */
    private com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity;

    /* Human-readable description of the status */
    private java.lang.String message;

    public DiagnoseSystemStatus() {
    }

    public DiagnoseSystemStatus(
           java.lang.String component,
           com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity,
           java.lang.String message) {
           this.component = component;
           this.severity = severity;
           this.message = message;
    }


    /**
     * Gets the component value for this DiagnoseSystemStatus.
     * 
     * @return component   * The component this object refers to
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this DiagnoseSystemStatus.
     * 
     * @param component   * The component this object refers to
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
    }


    /**
     * Gets the severity value for this DiagnoseSystemStatus.
     * 
     * @return severity   * The severity level
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseErrLevel getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this DiagnoseSystemStatus.
     * 
     * @param severity   * The severity level
     */
    public void setSeverity(com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity) {
        this.severity = severity;
    }


    /**
     * Gets the message value for this DiagnoseSystemStatus.
     * 
     * @return message   * Human-readable description of the status
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this DiagnoseSystemStatus.
     * 
     * @param message   * Human-readable description of the status
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnoseSystemStatus)) return false;
        DiagnoseSystemStatus other = (DiagnoseSystemStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnoseSystemStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.SystemStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.ErrLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
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
