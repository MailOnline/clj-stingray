/**
 * VirtualServerSSLOCSPIssuer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This object represents a mapping between a Certificate Authority
 * (this is the name of an item in the Certificate Authorities Catalog)
 * and configuration for an OCSP responder. Certificates issued by the
 * Certificate Authority will use these OCSP responder settings.
 */
public class VirtualServerSSLOCSPIssuer  implements java.io.Serializable {
    /* The Certificate Authority for whic these settings apply. This
     * is the name of an item in the Certificate Authorities Catalog. */
    private java.lang.String ca;

    /* The URL of the OCSP responder that should be used to check
     * the revocation status of certificates issued by the Certificate Authority. */
    private java.lang.String url;

    /* Is OCSP required for certificates signed by this CA? */
    private com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPCheck required;

    /* If set to true the Authority Information Access X509 extension
     * will be used to determine the OCSP server's URL */
    private boolean aia;

    /* Should an OCSP nonce be added to each request to protect against
     * replay attacks. Not all OCSP servers support nonces. */
    private com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPNonce nonce;

    /* Should we sign OCSP requests? */
    private com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPSignMode sign_mode;

    /* The key pair used to sign OCSP requests. If not set OCSP requests
     * will not be signed. Must be an entry in the SSL Certificates Catalog. */
    private java.lang.String signer;

    /* The expected certificate that the OCSP responder should provide.
     * Must be in the Certificate Authority catalog, or be empty (meaning
     * the issuer certificate), or be exactly "_SIGNED_BY_ISSUER_" (which
     * will accept either the issuer or one that is signed by it and has
     * id-kp-OCSPSigning in extendedKeyUsage and has id-pkix-ocsp-nocheck). */
    private java.lang.String responder_cert;

    public VirtualServerSSLOCSPIssuer() {
    }

    public VirtualServerSSLOCSPIssuer(
           java.lang.String ca,
           java.lang.String url,
           com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPCheck required,
           boolean aia,
           com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPNonce nonce,
           com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPSignMode sign_mode,
           java.lang.String signer,
           java.lang.String responder_cert) {
           this.ca = ca;
           this.url = url;
           this.required = required;
           this.aia = aia;
           this.nonce = nonce;
           this.sign_mode = sign_mode;
           this.signer = signer;
           this.responder_cert = responder_cert;
    }


    /**
     * Gets the ca value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return ca   * The Certificate Authority for whic these settings apply. This
     * is the name of an item in the Certificate Authorities Catalog.
     */
    public java.lang.String getCa() {
        return ca;
    }


    /**
     * Sets the ca value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param ca   * The Certificate Authority for whic these settings apply. This
     * is the name of an item in the Certificate Authorities Catalog.
     */
    public void setCa(java.lang.String ca) {
        this.ca = ca;
    }


    /**
     * Gets the url value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return url   * The URL of the OCSP responder that should be used to check
     * the revocation status of certificates issued by the Certificate Authority.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param url   * The URL of the OCSP responder that should be used to check
     * the revocation status of certificates issued by the Certificate Authority.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the required value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return required   * Is OCSP required for certificates signed by this CA?
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPCheck getRequired() {
        return required;
    }


    /**
     * Sets the required value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param required   * Is OCSP required for certificates signed by this CA?
     */
    public void setRequired(com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPCheck required) {
        this.required = required;
    }


    /**
     * Gets the aia value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return aia   * If set to true the Authority Information Access X509 extension
     * will be used to determine the OCSP server's URL
     */
    public boolean isAia() {
        return aia;
    }


    /**
     * Sets the aia value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param aia   * If set to true the Authority Information Access X509 extension
     * will be used to determine the OCSP server's URL
     */
    public void setAia(boolean aia) {
        this.aia = aia;
    }


    /**
     * Gets the nonce value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return nonce   * Should an OCSP nonce be added to each request to protect against
     * replay attacks. Not all OCSP servers support nonces.
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPNonce getNonce() {
        return nonce;
    }


    /**
     * Sets the nonce value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param nonce   * Should an OCSP nonce be added to each request to protect against
     * replay attacks. Not all OCSP servers support nonces.
     */
    public void setNonce(com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPNonce nonce) {
        this.nonce = nonce;
    }


    /**
     * Gets the sign_mode value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return sign_mode   * Should we sign OCSP requests?
     */
    public com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPSignMode getSign_mode() {
        return sign_mode;
    }


    /**
     * Sets the sign_mode value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param sign_mode   * Should we sign OCSP requests?
     */
    public void setSign_mode(com.zeus.soap.zxtm._1_0.VirtualServerSSLOCSPSignMode sign_mode) {
        this.sign_mode = sign_mode;
    }


    /**
     * Gets the signer value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return signer   * The key pair used to sign OCSP requests. If not set OCSP requests
     * will not be signed. Must be an entry in the SSL Certificates Catalog.
     */
    public java.lang.String getSigner() {
        return signer;
    }


    /**
     * Sets the signer value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param signer   * The key pair used to sign OCSP requests. If not set OCSP requests
     * will not be signed. Must be an entry in the SSL Certificates Catalog.
     */
    public void setSigner(java.lang.String signer) {
        this.signer = signer;
    }


    /**
     * Gets the responder_cert value for this VirtualServerSSLOCSPIssuer.
     * 
     * @return responder_cert   * The expected certificate that the OCSP responder should provide.
     * Must be in the Certificate Authority catalog, or be empty (meaning
     * the issuer certificate), or be exactly "_SIGNED_BY_ISSUER_" (which
     * will accept either the issuer or one that is signed by it and has
     * id-kp-OCSPSigning in extendedKeyUsage and has id-pkix-ocsp-nocheck).
     */
    public java.lang.String getResponder_cert() {
        return responder_cert;
    }


    /**
     * Sets the responder_cert value for this VirtualServerSSLOCSPIssuer.
     * 
     * @param responder_cert   * The expected certificate that the OCSP responder should provide.
     * Must be in the Certificate Authority catalog, or be empty (meaning
     * the issuer certificate), or be exactly "_SIGNED_BY_ISSUER_" (which
     * will accept either the issuer or one that is signed by it and has
     * id-kp-OCSPSigning in extendedKeyUsage and has id-pkix-ocsp-nocheck).
     */
    public void setResponder_cert(java.lang.String responder_cert) {
        this.responder_cert = responder_cert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualServerSSLOCSPIssuer)) return false;
        VirtualServerSSLOCSPIssuer other = (VirtualServerSSLOCSPIssuer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ca==null && other.getCa()==null) || 
             (this.ca!=null &&
              this.ca.equals(other.getCa()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            this.aia == other.isAia() &&
            ((this.nonce==null && other.getNonce()==null) || 
             (this.nonce!=null &&
              this.nonce.equals(other.getNonce()))) &&
            ((this.sign_mode==null && other.getSign_mode()==null) || 
             (this.sign_mode!=null &&
              this.sign_mode.equals(other.getSign_mode()))) &&
            ((this.signer==null && other.getSigner()==null) || 
             (this.signer!=null &&
              this.signer.equals(other.getSigner()))) &&
            ((this.responder_cert==null && other.getResponder_cert()==null) || 
             (this.responder_cert!=null &&
              this.responder_cert.equals(other.getResponder_cert())));
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
        if (getCa() != null) {
            _hashCode += getCa().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        _hashCode += (isAia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNonce() != null) {
            _hashCode += getNonce().hashCode();
        }
        if (getSign_mode() != null) {
            _hashCode += getSign_mode().hashCode();
        }
        if (getSigner() != null) {
            _hashCode += getSigner().hashCode();
        }
        if (getResponder_cert() != null) {
            _hashCode += getResponder_cert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualServerSSLOCSPIssuer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.SSLOCSPIssuer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.SSLOCSPCheck"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.SSLOCSPNonce"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sign_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "VirtualServer.SSLOCSPSignMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responder_cert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responder_cert"));
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
