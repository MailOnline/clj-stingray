/**
 * CatalogSSLCertificatesCertificateDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information used when generating self-signed
 * test certificates.
 */
public class CatalogSSLCertificatesCertificateDetails  implements java.io.Serializable {
    /* The subject of the new certificate. The common_name of the
     * subject should match the DNS name of the service this certificate
     * is to be used for. */
    private com.zeus.soap.zxtm._1_0.X509Name subject;

    /* The number of days this certificate should be value for (e.g.
     * 365 for 1 years validity) */
    private int valid_days;

    /* The size of the generated private key. Use 1024 for normal
     * use, or 2048 for more security */
    private int key_size;

    public CatalogSSLCertificatesCertificateDetails() {
    }

    public CatalogSSLCertificatesCertificateDetails(
           com.zeus.soap.zxtm._1_0.X509Name subject,
           int valid_days,
           int key_size) {
           this.subject = subject;
           this.valid_days = valid_days;
           this.key_size = key_size;
    }


    /**
     * Gets the subject value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @return subject   * The subject of the new certificate. The common_name of the
     * subject should match the DNS name of the service this certificate
     * is to be used for.
     */
    public com.zeus.soap.zxtm._1_0.X509Name getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @param subject   * The subject of the new certificate. The common_name of the
     * subject should match the DNS name of the service this certificate
     * is to be used for.
     */
    public void setSubject(com.zeus.soap.zxtm._1_0.X509Name subject) {
        this.subject = subject;
    }


    /**
     * Gets the valid_days value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @return valid_days   * The number of days this certificate should be value for (e.g.
     * 365 for 1 years validity)
     */
    public int getValid_days() {
        return valid_days;
    }


    /**
     * Sets the valid_days value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @param valid_days   * The number of days this certificate should be value for (e.g.
     * 365 for 1 years validity)
     */
    public void setValid_days(int valid_days) {
        this.valid_days = valid_days;
    }


    /**
     * Gets the key_size value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @return key_size   * The size of the generated private key. Use 1024 for normal
     * use, or 2048 for more security
     */
    public int getKey_size() {
        return key_size;
    }


    /**
     * Sets the key_size value for this CatalogSSLCertificatesCertificateDetails.
     * 
     * @param key_size   * The size of the generated private key. Use 1024 for normal
     * use, or 2048 for more security
     */
    public void setKey_size(int key_size) {
        this.key_size = key_size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogSSLCertificatesCertificateDetails)) return false;
        CatalogSSLCertificatesCertificateDetails other = (CatalogSSLCertificatesCertificateDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            this.valid_days == other.getValid_days() &&
            this.key_size == other.getKey_size();
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        _hashCode += getValid_days();
        _hashCode += getKey_size();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogSSLCertificatesCertificateDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.Certificates.CertificateDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "X509Name"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
