/**
 * DiagnoseErrorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure combines configuration, node, and flipper errors
 * as well as a list of statuses (for an appliance).
 */
public class DiagnoseErrorInfo  implements java.io.Serializable {
    /* The list of traffic managers that could not be contacted. */
    private java.lang.String[] notReachableTrafficManagers;

    /* The list of configuration errors. */
    private com.zeus.soap.zxtm._1_0.DiagnoseConfigError[] configErrors;

    /* The list of flipper errors. */
    private com.zeus.soap.zxtm._1_0.DiagnoseFlipperError[] flipperErrors;

    /* The list of failed nodes. */
    private com.zeus.soap.zxtm._1_0.DiagnoseFailedNode[] failedNodes;

    /* The list of system status values. */
    private com.zeus.soap.zxtm._1_0.DiagnoseSystemStatus[] systemStatuses;

    public DiagnoseErrorInfo() {
    }

    public DiagnoseErrorInfo(
           java.lang.String[] notReachableTrafficManagers,
           com.zeus.soap.zxtm._1_0.DiagnoseConfigError[] configErrors,
           com.zeus.soap.zxtm._1_0.DiagnoseFlipperError[] flipperErrors,
           com.zeus.soap.zxtm._1_0.DiagnoseFailedNode[] failedNodes,
           com.zeus.soap.zxtm._1_0.DiagnoseSystemStatus[] systemStatuses) {
           this.notReachableTrafficManagers = notReachableTrafficManagers;
           this.configErrors = configErrors;
           this.flipperErrors = flipperErrors;
           this.failedNodes = failedNodes;
           this.systemStatuses = systemStatuses;
    }


    /**
     * Gets the notReachableTrafficManagers value for this DiagnoseErrorInfo.
     * 
     * @return notReachableTrafficManagers   * The list of traffic managers that could not be contacted.
     */
    public java.lang.String[] getNotReachableTrafficManagers() {
        return notReachableTrafficManagers;
    }


    /**
     * Sets the notReachableTrafficManagers value for this DiagnoseErrorInfo.
     * 
     * @param notReachableTrafficManagers   * The list of traffic managers that could not be contacted.
     */
    public void setNotReachableTrafficManagers(java.lang.String[] notReachableTrafficManagers) {
        this.notReachableTrafficManagers = notReachableTrafficManagers;
    }


    /**
     * Gets the configErrors value for this DiagnoseErrorInfo.
     * 
     * @return configErrors   * The list of configuration errors.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseConfigError[] getConfigErrors() {
        return configErrors;
    }


    /**
     * Sets the configErrors value for this DiagnoseErrorInfo.
     * 
     * @param configErrors   * The list of configuration errors.
     */
    public void setConfigErrors(com.zeus.soap.zxtm._1_0.DiagnoseConfigError[] configErrors) {
        this.configErrors = configErrors;
    }


    /**
     * Gets the flipperErrors value for this DiagnoseErrorInfo.
     * 
     * @return flipperErrors   * The list of flipper errors.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseFlipperError[] getFlipperErrors() {
        return flipperErrors;
    }


    /**
     * Sets the flipperErrors value for this DiagnoseErrorInfo.
     * 
     * @param flipperErrors   * The list of flipper errors.
     */
    public void setFlipperErrors(com.zeus.soap.zxtm._1_0.DiagnoseFlipperError[] flipperErrors) {
        this.flipperErrors = flipperErrors;
    }


    /**
     * Gets the failedNodes value for this DiagnoseErrorInfo.
     * 
     * @return failedNodes   * The list of failed nodes.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseFailedNode[] getFailedNodes() {
        return failedNodes;
    }


    /**
     * Sets the failedNodes value for this DiagnoseErrorInfo.
     * 
     * @param failedNodes   * The list of failed nodes.
     */
    public void setFailedNodes(com.zeus.soap.zxtm._1_0.DiagnoseFailedNode[] failedNodes) {
        this.failedNodes = failedNodes;
    }


    /**
     * Gets the systemStatuses value for this DiagnoseErrorInfo.
     * 
     * @return systemStatuses   * The list of system status values.
     */
    public com.zeus.soap.zxtm._1_0.DiagnoseSystemStatus[] getSystemStatuses() {
        return systemStatuses;
    }


    /**
     * Sets the systemStatuses value for this DiagnoseErrorInfo.
     * 
     * @param systemStatuses   * The list of system status values.
     */
    public void setSystemStatuses(com.zeus.soap.zxtm._1_0.DiagnoseSystemStatus[] systemStatuses) {
        this.systemStatuses = systemStatuses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiagnoseErrorInfo)) return false;
        DiagnoseErrorInfo other = (DiagnoseErrorInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notReachableTrafficManagers==null && other.getNotReachableTrafficManagers()==null) || 
             (this.notReachableTrafficManagers!=null &&
              java.util.Arrays.equals(this.notReachableTrafficManagers, other.getNotReachableTrafficManagers()))) &&
            ((this.configErrors==null && other.getConfigErrors()==null) || 
             (this.configErrors!=null &&
              java.util.Arrays.equals(this.configErrors, other.getConfigErrors()))) &&
            ((this.flipperErrors==null && other.getFlipperErrors()==null) || 
             (this.flipperErrors!=null &&
              java.util.Arrays.equals(this.flipperErrors, other.getFlipperErrors()))) &&
            ((this.failedNodes==null && other.getFailedNodes()==null) || 
             (this.failedNodes!=null &&
              java.util.Arrays.equals(this.failedNodes, other.getFailedNodes()))) &&
            ((this.systemStatuses==null && other.getSystemStatuses()==null) || 
             (this.systemStatuses!=null &&
              java.util.Arrays.equals(this.systemStatuses, other.getSystemStatuses())));
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
        if (getNotReachableTrafficManagers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotReachableTrafficManagers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotReachableTrafficManagers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlipperErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlipperErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlipperErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFailedNodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedNodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedNodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSystemStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSystemStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSystemStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(DiagnoseErrorInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.ErrorInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notReachableTrafficManagers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotReachableTrafficManagers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfigErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.ConfigError"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flipperErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlipperErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.FlipperError"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FailedNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.FailedNode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SystemStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Diagnose.SystemStatus"));
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
