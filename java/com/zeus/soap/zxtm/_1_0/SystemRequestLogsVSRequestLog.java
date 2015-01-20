/**
 * SystemRequestLogsVSRequestLog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the information for each virtual server
 * request log.
 */
public class SystemRequestLogsVSRequestLog  implements java.io.Serializable {
    /* The log filename. */
    private java.lang.String filename;

    /* The virtual server for this logfile. */
    private java.lang.String virtual_server;

    /* The date this logfile was created. */
    private java.util.Calendar logdate;

    /* The size (in bytes) of this logfile. */
    private int filesize;

    public SystemRequestLogsVSRequestLog() {
    }

    public SystemRequestLogsVSRequestLog(
           java.lang.String filename,
           java.lang.String virtual_server,
           java.util.Calendar logdate,
           int filesize) {
           this.filename = filename;
           this.virtual_server = virtual_server;
           this.logdate = logdate;
           this.filesize = filesize;
    }


    /**
     * Gets the filename value for this SystemRequestLogsVSRequestLog.
     * 
     * @return filename   * The log filename.
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this SystemRequestLogsVSRequestLog.
     * 
     * @param filename   * The log filename.
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the virtual_server value for this SystemRequestLogsVSRequestLog.
     * 
     * @return virtual_server   * The virtual server for this logfile.
     */
    public java.lang.String getVirtual_server() {
        return virtual_server;
    }


    /**
     * Sets the virtual_server value for this SystemRequestLogsVSRequestLog.
     * 
     * @param virtual_server   * The virtual server for this logfile.
     */
    public void setVirtual_server(java.lang.String virtual_server) {
        this.virtual_server = virtual_server;
    }


    /**
     * Gets the logdate value for this SystemRequestLogsVSRequestLog.
     * 
     * @return logdate   * The date this logfile was created.
     */
    public java.util.Calendar getLogdate() {
        return logdate;
    }


    /**
     * Sets the logdate value for this SystemRequestLogsVSRequestLog.
     * 
     * @param logdate   * The date this logfile was created.
     */
    public void setLogdate(java.util.Calendar logdate) {
        this.logdate = logdate;
    }


    /**
     * Gets the filesize value for this SystemRequestLogsVSRequestLog.
     * 
     * @return filesize   * The size (in bytes) of this logfile.
     */
    public int getFilesize() {
        return filesize;
    }


    /**
     * Sets the filesize value for this SystemRequestLogsVSRequestLog.
     * 
     * @param filesize   * The size (in bytes) of this logfile.
     */
    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemRequestLogsVSRequestLog)) return false;
        SystemRequestLogsVSRequestLog other = (SystemRequestLogsVSRequestLog) obj;
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
            ((this.virtual_server==null && other.getVirtual_server()==null) || 
             (this.virtual_server!=null &&
              this.virtual_server.equals(other.getVirtual_server()))) &&
            ((this.logdate==null && other.getLogdate()==null) || 
             (this.logdate!=null &&
              this.logdate.equals(other.getLogdate()))) &&
            this.filesize == other.getFilesize();
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
        if (getVirtual_server() != null) {
            _hashCode += getVirtual_server().hashCode();
        }
        if (getLogdate() != null) {
            _hashCode += getLogdate().hashCode();
        }
        _hashCode += getFilesize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemRequestLogsVSRequestLog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.RequestLogs.VSRequestLog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "virtual_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filesize"));
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
