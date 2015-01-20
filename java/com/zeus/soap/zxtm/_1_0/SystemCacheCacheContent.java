/**
 * SystemCacheCacheContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic information about an individual
 * cache entry for a machine.
 */
public class SystemCacheCacheContent  implements java.io.Serializable {
    /* The URL of the entry. */
    private java.lang.String url;

    /* The time that the entry was last used. */
    private java.util.Calendar time_used;

    /* The time that the entry expires. */
    private java.util.Calendar time_expires;

    /* The number of hits for the entry. */
    private int hits;

    /* The number of variants of this entry in the cache. */
    private int num;

    /* The HTTP response code for this entry in the cache. */
    private int response_code;

    /* The HTTP versions the entry is cached for. */
    private java.lang.String[] versions;

    /* The set of request-header fields that determine if the cache
     * entry may be
     *                  used for a particular request. */
    private java.lang.String[] varys;

    public SystemCacheCacheContent() {
    }

    public SystemCacheCacheContent(
           java.lang.String url,
           java.util.Calendar time_used,
           java.util.Calendar time_expires,
           int hits,
           int num,
           int response_code,
           java.lang.String[] versions,
           java.lang.String[] varys) {
           this.url = url;
           this.time_used = time_used;
           this.time_expires = time_expires;
           this.hits = hits;
           this.num = num;
           this.response_code = response_code;
           this.versions = versions;
           this.varys = varys;
    }


    /**
     * Gets the url value for this SystemCacheCacheContent.
     * 
     * @return url   * The URL of the entry.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this SystemCacheCacheContent.
     * 
     * @param url   * The URL of the entry.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the time_used value for this SystemCacheCacheContent.
     * 
     * @return time_used   * The time that the entry was last used.
     */
    public java.util.Calendar getTime_used() {
        return time_used;
    }


    /**
     * Sets the time_used value for this SystemCacheCacheContent.
     * 
     * @param time_used   * The time that the entry was last used.
     */
    public void setTime_used(java.util.Calendar time_used) {
        this.time_used = time_used;
    }


    /**
     * Gets the time_expires value for this SystemCacheCacheContent.
     * 
     * @return time_expires   * The time that the entry expires.
     */
    public java.util.Calendar getTime_expires() {
        return time_expires;
    }


    /**
     * Sets the time_expires value for this SystemCacheCacheContent.
     * 
     * @param time_expires   * The time that the entry expires.
     */
    public void setTime_expires(java.util.Calendar time_expires) {
        this.time_expires = time_expires;
    }


    /**
     * Gets the hits value for this SystemCacheCacheContent.
     * 
     * @return hits   * The number of hits for the entry.
     */
    public int getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this SystemCacheCacheContent.
     * 
     * @param hits   * The number of hits for the entry.
     */
    public void setHits(int hits) {
        this.hits = hits;
    }


    /**
     * Gets the num value for this SystemCacheCacheContent.
     * 
     * @return num   * The number of variants of this entry in the cache.
     */
    public int getNum() {
        return num;
    }


    /**
     * Sets the num value for this SystemCacheCacheContent.
     * 
     * @param num   * The number of variants of this entry in the cache.
     */
    public void setNum(int num) {
        this.num = num;
    }


    /**
     * Gets the response_code value for this SystemCacheCacheContent.
     * 
     * @return response_code   * The HTTP response code for this entry in the cache.
     */
    public int getResponse_code() {
        return response_code;
    }


    /**
     * Sets the response_code value for this SystemCacheCacheContent.
     * 
     * @param response_code   * The HTTP response code for this entry in the cache.
     */
    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }


    /**
     * Gets the versions value for this SystemCacheCacheContent.
     * 
     * @return versions   * The HTTP versions the entry is cached for.
     */
    public java.lang.String[] getVersions() {
        return versions;
    }


    /**
     * Sets the versions value for this SystemCacheCacheContent.
     * 
     * @param versions   * The HTTP versions the entry is cached for.
     */
    public void setVersions(java.lang.String[] versions) {
        this.versions = versions;
    }


    /**
     * Gets the varys value for this SystemCacheCacheContent.
     * 
     * @return varys   * The set of request-header fields that determine if the cache
     * entry may be
     *                  used for a particular request.
     */
    public java.lang.String[] getVarys() {
        return varys;
    }


    /**
     * Sets the varys value for this SystemCacheCacheContent.
     * 
     * @param varys   * The set of request-header fields that determine if the cache
     * entry may be
     *                  used for a particular request.
     */
    public void setVarys(java.lang.String[] varys) {
        this.varys = varys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemCacheCacheContent)) return false;
        SystemCacheCacheContent other = (SystemCacheCacheContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.time_used==null && other.getTime_used()==null) || 
             (this.time_used!=null &&
              this.time_used.equals(other.getTime_used()))) &&
            ((this.time_expires==null && other.getTime_expires()==null) || 
             (this.time_expires!=null &&
              this.time_expires.equals(other.getTime_expires()))) &&
            this.hits == other.getHits() &&
            this.num == other.getNum() &&
            this.response_code == other.getResponse_code() &&
            ((this.versions==null && other.getVersions()==null) || 
             (this.versions!=null &&
              java.util.Arrays.equals(this.versions, other.getVersions()))) &&
            ((this.varys==null && other.getVarys()==null) || 
             (this.varys!=null &&
              java.util.Arrays.equals(this.varys, other.getVarys())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getTime_used() != null) {
            _hashCode += getTime_used().hashCode();
        }
        if (getTime_expires() != null) {
            _hashCode += getTime_expires().hashCode();
        }
        _hashCode += getHits();
        _hashCode += getNum();
        _hashCode += getResponse_code();
        if (getVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVersions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVarys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVarys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVarys(), i);
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
        new org.apache.axis.description.TypeDesc(SystemCacheCacheContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Cache.CacheContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_expires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("varys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "varys"));
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
