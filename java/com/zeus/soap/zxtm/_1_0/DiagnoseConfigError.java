/**
 * DiagnoseConfigError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information about configuration errors.
 */
public class DiagnoseConfigError  implements java.io.Serializable {
    /* The file where the error has occurred. */
    private java.lang.String filename;

    /* The faulty configuration key */
    private java.lang.String configKey;

    /* Severity of the error */
    private com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity;

    /* Date when the error occurred */
    private java.util.Calendar detectionDate;

    /* A human readable description of the error */
    private java.lang.String description;

    public DiagnoseConfigError() {
    }

    public DiagnoseConfigError(
           java.lang.String filename,
           java.lang.String configKey,
           com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity,
           java.util.Calendar detectionDate,
           java.lang.String description) {
           this.filename = filename;
           this.configKey = configKey;
           this.severity = severity;
           this.detectionDate = detectionDate;
           this.description = description;
    }


    /**
     * Gets the filename value for this DiagnoseConfigError.
     * 
     * @return filename   * The file where the error has occurred.
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this DiagnoseConfigError.
     * 
     * @param filename   * The file where the error has occurred.
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the configKey value for this DiagnoseConfigError.
     * 
     * @return configKey   * The faulty configuration key
     */
    public java.lang.String getConfigKey() {
        return configKey;
    }


    /**
     * Sets the configKey value for this DiagnoseConfigError.
     * 
     * @param configKey   * The faulty configuration key
     */
    public void setConfigKey(java.lang.String configKey) {
        this.configKey = configKey;
    }


    /**
     * Gets the severity value for this DiagnoseConfigError.
     * 
     * @return severity   * Severity of the error
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseErrLevel getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this DiagnoseConfigError.
     * 
     * @param severity   * Severity of the error
     */
    public void setSeverity(com.zeus.soap.zxtm._1_0.DiagnoseErrLevel severity) {
        this.severity = severity;
    }


    /**
     * Gets the detectionDate value for this DiagnoseConfigError.
     * 
     * @return detectionDate   * Date when the error occurred
     */
    public java.util.Calendar getDetectionDate() {
        return detectionDate;
    }


    /**
     * Sets the detectionDate value for this DiagnoseConfigError.
     * 
     * @param detectionDate   * Date when the error occurred
     */
    public void setDetectionDate(java.util.Calendar detectionDate) {
        this.detectionDate = detectionDate;
    }


    /**
     * Gets the description value for this DiagnoseConfigError.
     * 
     * @return description   * A human readable description of the error
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DiagnoseConfigError.
     * 
     * @param description   * A human readable description of the error
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnoseConfigError)) return false;
        DiagnoseConfigError other = (DiagnoseConfigError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.configKey==null && other.getConfigKey()==null) || 
             (this.configKey!=null &&
              this.configKey.equals(other.getConfigKey()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.detectionDate==null && other.getDetectionDate()==null) || 
             (this.detectionDate!=null &&
              this.detectionDate.equals(other.getDetectionDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getConfigKey() != null) {
            _hashCode += getConfigKey().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getDetectionDate() != null) {
            _hashCode += getDetectionDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnoseConfigError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.ConfigError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfigKey"));
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
        elemField.setFieldName("detectionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetectionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
