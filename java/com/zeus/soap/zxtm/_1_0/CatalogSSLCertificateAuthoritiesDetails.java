/**
 * CatalogSSLCertificateAuthoritiesDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information about a Certificate Authority.
 * It contains both the Certificate, and the list of revoked Certificates
 * contained in the associated CRL.
 */
public class CatalogSSLCertificateAuthoritiesDetails  implements java.io.Serializable {
    /* The Certificate Authority certificate */
    private com.zeus.soap.zxtm._1_0.Certificate certificate;

    /* If set to 'true' then there is an associated CRL, otherwise
     * the CRL structure contains no useful information */
    private boolean have_crl;

    /* The associated CRL. */
    private com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesCRL crl;

    public CatalogSSLCertificateAuthoritiesDetails() {
    }

    public CatalogSSLCertificateAuthoritiesDetails(
           com.zeus.soap.zxtm._1_0.Certificate certificate,
           boolean have_crl,
           com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesCRL crl) {
           this.certificate = certificate;
           this.have_crl = have_crl;
           this.crl = crl;
    }


    /**
     * Gets the certificate value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @return certificate   * The Certificate Authority certificate
     */
    public com.zeus.soap.zxtm._1_0.Certificate getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @param certificate   * The Certificate Authority certificate
     */
    public void setCertificate(com.zeus.soap.zxtm._1_0.Certificate certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the have_crl value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @return have_crl   * If set to 'true' then there is an associated CRL, otherwise
     * the CRL structure contains no useful information
     */
    public boolean isHave_crl() {
        return have_crl;
    }


    /**
     * Sets the have_crl value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @param have_crl   * If set to 'true' then there is an associated CRL, otherwise
     * the CRL structure contains no useful information
     */
    public void setHave_crl(boolean have_crl) {
        this.have_crl = have_crl;
    }


    /**
     * Gets the crl value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @return crl   * The associated CRL.
     */
    public com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesCRL getCrl() {
        return crl;
    }


    /**
     * Sets the crl value for this CatalogSSLCertificateAuthoritiesDetails.
     * 
     * @param crl   * The associated CRL.
     */
    public void setCrl(com.zeus.soap.zxtm._1_0.CatalogSSLCertificateAuthoritiesCRL crl) {
        this.crl = crl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogSSLCertificateAuthoritiesDetails)) return false;
        CatalogSSLCertificateAuthoritiesDetails other = (CatalogSSLCertificateAuthoritiesDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            this.have_crl == other.isHave_crl() &&
            ((this.crl==null && other.getCrl()==null) || 
             (this.crl!=null &&
              this.crl.equals(other.getCrl())));
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
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        _hashCode += (isHave_crl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCrl() != null) {
            _hashCode += getCrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogSSLCertificateAuthoritiesDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.CertificateAuthorities.Details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Certificate"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("have_crl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "have_crl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Catalog.SSL.CertificateAuthorities.CRL"));
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
