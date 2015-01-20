/**
 * DiagnoseFailedNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains information about Flipper errors.
 */
public class DiagnoseFailedNode  implements java.io.Serializable {
    /* The name of the node that has failed. */
    private java.lang.String node;

    /* IP address in dotted-decimal notation. */
    private java.lang.String ipAddress;

    /* The port number of the node that has failed. */
    private int port;

    /* Number of seconds during which the node has not responded */
    private int noResponseFor;

    /* The minimum time in seconds before traffic will be sent to
     * this node */
    private int noRequestsFor;

    /* The last received error message. */
    private java.lang.String errorMessage;

    public DiagnoseFailedNode() {
    }

    public DiagnoseFailedNode(
           java.lang.String node,
           java.lang.String ipAddress,
           int port,
           int noResponseFor,
           int noRequestsFor,
           java.lang.String errorMessage) {
           this.node = node;
           this.ipAddress = ipAddress;
           this.port = port;
           this.noResponseFor = noResponseFor;
           this.noRequestsFor = noRequestsFor;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the node value for this DiagnoseFailedNode.
     * 
     * @return node   * The name of the node that has failed.
     */
    public java.lang.String getNode() {
        return node;
    }


    /**
     * Sets the node value for this DiagnoseFailedNode.
     * 
     * @param node   * The name of the node that has failed.
     */
    public void setNode(java.lang.String node) {
        this.node = node;
    }


    /**
     * Gets the ipAddress value for this DiagnoseFailedNode.
     * 
     * @return ipAddress   * IP address in dotted-decimal notation.
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this DiagnoseFailedNode.
     * 
     * @param ipAddress   * IP address in dotted-decimal notation.
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the port value for this DiagnoseFailedNode.
     * 
     * @return port   * The port number of the node that has failed.
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this DiagnoseFailedNode.
     * 
     * @param port   * The port number of the node that has failed.
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the noResponseFor value for this DiagnoseFailedNode.
     * 
     * @return noResponseFor   * Number of seconds during which the node has not responded
     */
    public int getNoResponseFor() {
        return noResponseFor;
    }


    /**
     * Sets the noResponseFor value for this DiagnoseFailedNode.
     * 
     * @param noResponseFor   * Number of seconds during which the node has not responded
     */
    public void setNoResponseFor(int noResponseFor) {
        this.noResponseFor = noResponseFor;
    }


    /**
     * Gets the noRequestsFor value for this DiagnoseFailedNode.
     * 
     * @return noRequestsFor   * The minimum time in seconds before traffic will be sent to
     * this node
     */
    public int getNoRequestsFor() {
        return noRequestsFor;
    }


    /**
     * Sets the noRequestsFor value for this DiagnoseFailedNode.
     * 
     * @param noRequestsFor   * The minimum time in seconds before traffic will be sent to
     * this node
     */
    public void setNoRequestsFor(int noRequestsFor) {
        this.noRequestsFor = noRequestsFor;
    }


    /**
     * Gets the errorMessage value for this DiagnoseFailedNode.
     * 
     * @return errorMessage   * The last received error message.
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DiagnoseFailedNode.
     * 
     * @param errorMessage   * The last received error message.
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnoseFailedNode)) return false;
        DiagnoseFailedNode other = (DiagnoseFailedNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.node==null && other.getNode()==null) || 
             (this.node!=null &&
              this.node.equals(other.getNode()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            this.port == other.getPort() &&
            this.noResponseFor == other.getNoResponseFor() &&
            this.noRequestsFor == other.getNoRequestsFor() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        if (getNode() != null) {
            _hashCode += getNode().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        _hashCode += getPort();
        _hashCode += getNoResponseFor();
        _hashCode += getNoRequestsFor();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiagnoseFailedNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.FailedNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noResponseFor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoResponseFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noRequestsFor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoRequestsFor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorMessage"));
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
