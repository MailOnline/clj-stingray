/**
 * CertificateFiles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains a public certificate and private key. It
 * is used
 *              when importing certificates into the traffic manager.
 */
public class CertificateFiles  implements java.io.Serializable {
    /* The PEM-encoded public certificate (containing the BEGIN CERTIFICATE
     * and END CERTIFICATE tags) */
    private java.lang.String public_cert;

    /* The PEM-encoded private key (containing the BEGIN RSA PRIVATE
     * KEY and
     *                   END RSA PRIVATE KEY tags) */
    private java.lang.String private_key;

    public CertificateFiles() {
    }

    public CertificateFiles(
           java.lang.String public_cert,
           java.lang.String private_key) {
           this.public_cert = public_cert;
           this.private_key = private_key;
    }


    /**
     * Gets the public_cert value for this CertificateFiles.
     * 
     * @return public_cert   * The PEM-encoded public certificate (containing the BEGIN CERTIFICATE
     * and END CERTIFICATE tags)
     */
    public java.lang.String getPublic_cert() {
        return public_cert;
    }


    /**
     * Sets the public_cert value for this CertificateFiles.
     * 
     * @param public_cert   * The PEM-encoded public certificate (containing the BEGIN CERTIFICATE
     * and END CERTIFICATE tags)
     */
    public void setPublic_cert(java.lang.String public_cert) {
        this.public_cert = public_cert;
    }


    /**
     * Gets the private_key value for this CertificateFiles.
     * 
     * @return private_key   * The PEM-encoded private key (containing the BEGIN RSA PRIVATE
     * KEY and
     *                   END RSA PRIVATE KEY tags)
     */
    public java.lang.String getPrivate_key() {
        return private_key;
    }


    /**
     * Sets the private_key value for this CertificateFiles.
     * 
     * @param private_key   * The PEM-encoded private key (containing the BEGIN RSA PRIVATE
     * KEY and
     *                   END RSA PRIVATE KEY tags)
     */
    public void setPrivate_key(java.lang.String private_key) {
        this.private_key = private_key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CertificateFiles)) return false;
        CertificateFiles other = (CertificateFiles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.public_cert==null && other.getPublic_cert()==null) || 
             (this.public_cert!=null &&
              this.public_cert.equals(other.getPublic_cert()))) &&
            ((this.private_key==null && other.getPrivate_key()==null) || 
             (this.private_key!=null &&
              this.private_key.equals(other.getPrivate_key())));
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
        if (getPublic_cert() != null) {
            _hashCode += getPublic_cert().hashCode();
        }
        if (getPrivate_key() != null) {
            _hashCode += getPrivate_key().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CertificateFiles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "CertificateFiles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("public_cert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "public_cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("private_key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "private_key"));
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
