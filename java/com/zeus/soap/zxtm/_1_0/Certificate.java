/**
 * Certificate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information (such as the subject and issuer)
 * about a certificate.
 */
public class Certificate  implements java.io.Serializable {
    /* The version of the X509 Certificate */
    private int version;

    /* The serial number of the Certificate */
    private java.lang.String serial;

    /* The issuer (i.e. who signed it) of the Certificate */
    private com.zeus.soap.zxtm._1_0.X509Name issuer;

    /* The subject (i.e. who it is for) of the Certificate */
    private com.zeus.soap.zxtm._1_0.X509Name subject;

    /* The time the certificate is valid from. */
    private java.util.Calendar valid_from;

    /* The time the certificate is valid to. */
    private java.util.Calendar valid_to;

    /* The modulus of the certificate. */
    private java.lang.String modulus;

    /* The exponent of the certificate. */
    private java.lang.String exponent;

    /* Whether the certificate is self-signed (i.e. the issuer is
     * the same as the subject) */
    private boolean self_signed;

    public Certificate() {
    }

    public Certificate(
           int version,
           java.lang.String serial,
           com.zeus.soap.zxtm._1_0.X509Name issuer,
           com.zeus.soap.zxtm._1_0.X509Name subject,
           java.util.Calendar valid_from,
           java.util.Calendar valid_to,
           java.lang.String modulus,
           java.lang.String exponent,
           boolean self_signed) {
           this.version = version;
           this.serial = serial;
           this.issuer = issuer;
           this.subject = subject;
           this.valid_from = valid_from;
           this.valid_to = valid_to;
           this.modulus = modulus;
           this.exponent = exponent;
           this.self_signed = self_signed;
    }


    /**
     * Gets the version value for this Certificate.
     * 
     * @return version   * The version of the X509 Certificate
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Certificate.
     * 
     * @param version   * The version of the X509 Certificate
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the serial value for this Certificate.
     * 
     * @return serial   * The serial number of the Certificate
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this Certificate.
     * 
     * @param serial   * The serial number of the Certificate
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the issuer value for this Certificate.
     * 
     * @return issuer   * The issuer (i.e. who signed it) of the Certificate
     */
    public com.zeus.soap.zxtm._1_0.X509Name getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this Certificate.
     * 
     * @param issuer   * The issuer (i.e. who signed it) of the Certificate
     */
    public void setIssuer(com.zeus.soap.zxtm._1_0.X509Name issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the subject value for this Certificate.
     * 
     * @return subject   * The subject (i.e. who it is for) of the Certificate
     */
    public com.zeus.soap.zxtm._1_0.X509Name getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Certificate.
     * 
     * @param subject   * The subject (i.e. who it is for) of the Certificate
     */
    public void setSubject(com.zeus.soap.zxtm._1_0.X509Name subject) {
        this.subject = subject;
    }


    /**
     * Gets the valid_from value for this Certificate.
     * 
     * @return valid_from   * The time the certificate is valid from.
     */
    public java.util.Calendar getValid_from() {
        return valid_from;
    }


    /**
     * Sets the valid_from value for this Certificate.
     * 
     * @param valid_from   * The time the certificate is valid from.
     */
    public void setValid_from(java.util.Calendar valid_from) {
        this.valid_from = valid_from;
    }


    /**
     * Gets the valid_to value for this Certificate.
     * 
     * @return valid_to   * The time the certificate is valid to.
     */
    public java.util.Calendar getValid_to() {
        return valid_to;
    }


    /**
     * Sets the valid_to value for this Certificate.
     * 
     * @param valid_to   * The time the certificate is valid to.
     */
    public void setValid_to(java.util.Calendar valid_to) {
        this.valid_to = valid_to;
    }


    /**
     * Gets the modulus value for this Certificate.
     * 
     * @return modulus   * The modulus of the certificate.
     */
    public java.lang.String getModulus() {
        return modulus;
    }


    /**
     * Sets the modulus value for this Certificate.
     * 
     * @param modulus   * The modulus of the certificate.
     */
    public void setModulus(java.lang.String modulus) {
        this.modulus = modulus;
    }


    /**
     * Gets the exponent value for this Certificate.
     * 
     * @return exponent   * The exponent of the certificate.
     */
    public java.lang.String getExponent() {
        return exponent;
    }


    /**
     * Sets the exponent value for this Certificate.
     * 
     * @param exponent   * The exponent of the certificate.
     */
    public void setExponent(java.lang.String exponent) {
        this.exponent = exponent;
    }


    /**
     * Gets the self_signed value for this Certificate.
     * 
     * @return self_signed   * Whether the certificate is self-signed (i.e. the issuer is
     * the same as the subject)
     */
    public boolean isSelf_signed() {
        return self_signed;
    }


    /**
     * Sets the self_signed value for this Certificate.
     * 
     * @param self_signed   * Whether the certificate is self-signed (i.e. the issuer is
     * the same as the subject)
     */
    public void setSelf_signed(boolean self_signed) {
        this.self_signed = self_signed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Certificate)) return false;
        Certificate other = (Certificate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.version == other.getVersion() &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.valid_from==null && other.getValid_from()==null) || 
             (this.valid_from!=null &&
              this.valid_from.equals(other.getValid_from()))) &&
            ((this.valid_to==null && other.getValid_to()==null) || 
             (this.valid_to!=null &&
              this.valid_to.equals(other.getValid_to()))) &&
            ((this.modulus==null && other.getModulus()==null) || 
             (this.modulus!=null &&
              this.modulus.equals(other.getModulus()))) &&
            ((this.exponent==null && other.getExponent()==null) || 
             (this.exponent!=null &&
              this.exponent.equals(other.getExponent()))) &&
            this.self_signed == other.isSelf_signed();
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
        _hashCode += getVersion();
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getValid_from() != null) {
            _hashCode += getValid_from().hashCode();
        }
        if (getValid_to() != null) {
            _hashCode += getValid_to().hashCode();
        }
        if (getModulus() != null) {
            _hashCode += getModulus().hashCode();
        }
        if (getExponent() != null) {
            _hashCode += getExponent().hashCode();
        }
        _hashCode += (isSelf_signed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Certificate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Certificate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "X509Name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "X509Name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("self_signed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "self_signed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
