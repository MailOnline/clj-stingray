/**
 * SystemCacheGlobalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic information about the content
 * cache for a machine.
 */
public class SystemCacheGlobalInfo  implements java.io.Serializable {
    /* The number of bytes of memory used by the cache. */
    private int bytes_used;

    /* The percentage of the cache used. */
    private float percent_used;

    /* The number of entries in the cache. */
    private int entries;

    /* The number of times a request has tried to get a page from
     * the cache. */
    private int num_lookups;

    /* The number of times a request has successfully been served
     * from the cache. */
    private int num_hits;

    public SystemCacheGlobalInfo() {
    }

    public SystemCacheGlobalInfo(
           int bytes_used,
           float percent_used,
           int entries,
           int num_lookups,
           int num_hits) {
           this.bytes_used = bytes_used;
           this.percent_used = percent_used;
           this.entries = entries;
           this.num_lookups = num_lookups;
           this.num_hits = num_hits;
    }


    /**
     * Gets the bytes_used value for this SystemCacheGlobalInfo.
     * 
     * @return bytes_used   * The number of bytes of memory used by the cache.
     */
    public int getBytes_used() {
        return bytes_used;
    }


    /**
     * Sets the bytes_used value for this SystemCacheGlobalInfo.
     * 
     * @param bytes_used   * The number of bytes of memory used by the cache.
     */
    public void setBytes_used(int bytes_used) {
        this.bytes_used = bytes_used;
    }


    /**
     * Gets the percent_used value for this SystemCacheGlobalInfo.
     * 
     * @return percent_used   * The percentage of the cache used.
     */
    public float getPercent_used() {
        return percent_used;
    }


    /**
     * Sets the percent_used value for this SystemCacheGlobalInfo.
     * 
     * @param percent_used   * The percentage of the cache used.
     */
    public void setPercent_used(float percent_used) {
        this.percent_used = percent_used;
    }


    /**
     * Gets the entries value for this SystemCacheGlobalInfo.
     * 
     * @return entries   * The number of entries in the cache.
     */
    public int getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this SystemCacheGlobalInfo.
     * 
     * @param entries   * The number of entries in the cache.
     */
    public void setEntries(int entries) {
        this.entries = entries;
    }


    /**
     * Gets the num_lookups value for this SystemCacheGlobalInfo.
     * 
     * @return num_lookups   * The number of times a request has tried to get a page from
     * the cache.
     */
    public int getNum_lookups() {
        return num_lookups;
    }


    /**
     * Sets the num_lookups value for this SystemCacheGlobalInfo.
     * 
     * @param num_lookups   * The number of times a request has tried to get a page from
     * the cache.
     */
    public void setNum_lookups(int num_lookups) {
        this.num_lookups = num_lookups;
    }


    /**
     * Gets the num_hits value for this SystemCacheGlobalInfo.
     * 
     * @return num_hits   * The number of times a request has successfully been served
     * from the cache.
     */
    public int getNum_hits() {
        return num_hits;
    }


    /**
     * Sets the num_hits value for this SystemCacheGlobalInfo.
     * 
     * @param num_hits   * The number of times a request has successfully been served
     * from the cache.
     */
    public void setNum_hits(int num_hits) {
        this.num_hits = num_hits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemCacheGlobalInfo)) return false;
        SystemCacheGlobalInfo other = (SystemCacheGlobalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bytes_used == other.getBytes_used() &&
            this.percent_used == other.getPercent_used() &&
            this.entries == other.getEntries() &&
            this.num_lookups == other.getNum_lookups() &&
            this.num_hits == other.getNum_hits();
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
        _hashCode += getBytes_used();
        _hashCode += new Float(getPercent_used()).hashCode();
        _hashCode += getEntries();
        _hashCode += getNum_lookups();
        _hashCode += getNum_hits();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemCacheGlobalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Cache.GlobalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytes_used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bytes_used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_used"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_lookups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num_lookups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num_hits"));
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
