/**
 * SystemConnectionsConnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic information about a Connection.
 * It is used when retrieving the current and recent connections for
 * a machine.
 */
public class SystemConnectionsConnection  implements java.io.Serializable {
    /* The source IP address and port for connection. */
    private java.lang.String from;

    /* The local IP address and port for connection. */
    private java.lang.String via;

    /* The destination node for the connection. */
    private java.lang.String to;

    /* The connection state. */
    private com.zeus.soap.zxtm._1_0.SystemConnectionsConnectionState state;

    /* The virtual server handling the request. */
    private java.lang.String vserver;

    /* The rule being executed. */
    private java.lang.String rule;

    /* The pool being used. */
    private java.lang.String pool;

    /* The number of bytes that were received from the client. */
    private int bytes_in;

    /* The number of bytes that were sent to the client. */
    private int bytes_out;

    /* The length of time that the connection has been established,
     * in seconds. */
    private int time_est;

    /* The length of time since receiving the last client data, in
     * seconds. */
    private int time_client;

    /* The length of time since receiving the last server data, in
     * seconds. */
    private int time_server;

    /* The number of times that the connection to the node has been
     * retried. */
    private int retries;

    /* The Service Level Monitoring class being used. */
    private java.lang.String slm_class;

    /* The Virtual Server Bandwidth class being used. */
    private java.lang.String vs_bwclass;

    /* The Pool Bandwidth class being used. */
    private java.lang.String pool_bwclass;

    /* The status code in the HTTP response. */
    private java.lang.String code;

    /* The host header/URL in the HTTP request. */
    private java.lang.String request;

    public SystemConnectionsConnection() {
    }

    public SystemConnectionsConnection(
           java.lang.String from,
           java.lang.String via,
           java.lang.String to,
           com.zeus.soap.zxtm._1_0.SystemConnectionsConnectionState state,
           java.lang.String vserver,
           java.lang.String rule,
           java.lang.String pool,
           int bytes_in,
           int bytes_out,
           int time_est,
           int time_client,
           int time_server,
           int retries,
           java.lang.String slm_class,
           java.lang.String vs_bwclass,
           java.lang.String pool_bwclass,
           java.lang.String code,
           java.lang.String request) {
           this.from = from;
           this.via = via;
           this.to = to;
           this.state = state;
           this.vserver = vserver;
           this.rule = rule;
           this.pool = pool;
           this.bytes_in = bytes_in;
           this.bytes_out = bytes_out;
           this.time_est = time_est;
           this.time_client = time_client;
           this.time_server = time_server;
           this.retries = retries;
           this.slm_class = slm_class;
           this.vs_bwclass = vs_bwclass;
           this.pool_bwclass = pool_bwclass;
           this.code = code;
           this.request = request;
    }


    /**
     * Gets the from value for this SystemConnectionsConnection.
     * 
     * @return from   * The source IP address and port for connection.
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this SystemConnectionsConnection.
     * 
     * @param from   * The source IP address and port for connection.
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the via value for this SystemConnectionsConnection.
     * 
     * @return via   * The local IP address and port for connection.
     */
    public java.lang.String getVia() {
        return via;
    }


    /**
     * Sets the via value for this SystemConnectionsConnection.
     * 
     * @param via   * The local IP address and port for connection.
     */
    public void setVia(java.lang.String via) {
        this.via = via;
    }


    /**
     * Gets the to value for this SystemConnectionsConnection.
     * 
     * @return to   * The destination node for the connection.
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this SystemConnectionsConnection.
     * 
     * @param to   * The destination node for the connection.
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the state value for this SystemConnectionsConnection.
     * 
     * @return state   * The connection state.
     */
    public com.zeus.soap.zxtm._1_0.SystemConnectionsConnectionState getState() {
        return state;
    }


    /**
     * Sets the state value for this SystemConnectionsConnection.
     * 
     * @param state   * The connection state.
     */
    public void setState(com.zeus.soap.zxtm._1_0.SystemConnectionsConnectionState state) {
        this.state = state;
    }


    /**
     * Gets the vserver value for this SystemConnectionsConnection.
     * 
     * @return vserver   * The virtual server handling the request.
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this SystemConnectionsConnection.
     * 
     * @param vserver   * The virtual server handling the request.
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the rule value for this SystemConnectionsConnection.
     * 
     * @return rule   * The rule being executed.
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this SystemConnectionsConnection.
     * 
     * @param rule   * The rule being executed.
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the pool value for this SystemConnectionsConnection.
     * 
     * @return pool   * The pool being used.
     */
    public java.lang.String getPool() {
        return pool;
    }


    /**
     * Sets the pool value for this SystemConnectionsConnection.
     * 
     * @param pool   * The pool being used.
     */
    public void setPool(java.lang.String pool) {
        this.pool = pool;
    }


    /**
     * Gets the bytes_in value for this SystemConnectionsConnection.
     * 
     * @return bytes_in   * The number of bytes that were received from the client.
     */
    public int getBytes_in() {
        return bytes_in;
    }


    /**
     * Sets the bytes_in value for this SystemConnectionsConnection.
     * 
     * @param bytes_in   * The number of bytes that were received from the client.
     */
    public void setBytes_in(int bytes_in) {
        this.bytes_in = bytes_in;
    }


    /**
     * Gets the bytes_out value for this SystemConnectionsConnection.
     * 
     * @return bytes_out   * The number of bytes that were sent to the client.
     */
    public int getBytes_out() {
        return bytes_out;
    }


    /**
     * Sets the bytes_out value for this SystemConnectionsConnection.
     * 
     * @param bytes_out   * The number of bytes that were sent to the client.
     */
    public void setBytes_out(int bytes_out) {
        this.bytes_out = bytes_out;
    }


    /**
     * Gets the time_est value for this SystemConnectionsConnection.
     * 
     * @return time_est   * The length of time that the connection has been established,
     * in seconds.
     */
    public int getTime_est() {
        return time_est;
    }


    /**
     * Sets the time_est value for this SystemConnectionsConnection.
     * 
     * @param time_est   * The length of time that the connection has been established,
     * in seconds.
     */
    public void setTime_est(int time_est) {
        this.time_est = time_est;
    }


    /**
     * Gets the time_client value for this SystemConnectionsConnection.
     * 
     * @return time_client   * The length of time since receiving the last client data, in
     * seconds.
     */
    public int getTime_client() {
        return time_client;
    }


    /**
     * Sets the time_client value for this SystemConnectionsConnection.
     * 
     * @param time_client   * The length of time since receiving the last client data, in
     * seconds.
     */
    public void setTime_client(int time_client) {
        this.time_client = time_client;
    }


    /**
     * Gets the time_server value for this SystemConnectionsConnection.
     * 
     * @return time_server   * The length of time since receiving the last server data, in
     * seconds.
     */
    public int getTime_server() {
        return time_server;
    }


    /**
     * Sets the time_server value for this SystemConnectionsConnection.
     * 
     * @param time_server   * The length of time since receiving the last server data, in
     * seconds.
     */
    public void setTime_server(int time_server) {
        this.time_server = time_server;
    }


    /**
     * Gets the retries value for this SystemConnectionsConnection.
     * 
     * @return retries   * The number of times that the connection to the node has been
     * retried.
     */
    public int getRetries() {
        return retries;
    }


    /**
     * Sets the retries value for this SystemConnectionsConnection.
     * 
     * @param retries   * The number of times that the connection to the node has been
     * retried.
     */
    public void setRetries(int retries) {
        this.retries = retries;
    }


    /**
     * Gets the slm_class value for this SystemConnectionsConnection.
     * 
     * @return slm_class   * The Service Level Monitoring class being used.
     */
    public java.lang.String getSlm_class() {
        return slm_class;
    }


    /**
     * Sets the slm_class value for this SystemConnectionsConnection.
     * 
     * @param slm_class   * The Service Level Monitoring class being used.
     */
    public void setSlm_class(java.lang.String slm_class) {
        this.slm_class = slm_class;
    }


    /**
     * Gets the vs_bwclass value for this SystemConnectionsConnection.
     * 
     * @return vs_bwclass   * The Virtual Server Bandwidth class being used.
     */
    public java.lang.String getVs_bwclass() {
        return vs_bwclass;
    }


    /**
     * Sets the vs_bwclass value for this SystemConnectionsConnection.
     * 
     * @param vs_bwclass   * The Virtual Server Bandwidth class being used.
     */
    public void setVs_bwclass(java.lang.String vs_bwclass) {
        this.vs_bwclass = vs_bwclass;
    }


    /**
     * Gets the pool_bwclass value for this SystemConnectionsConnection.
     * 
     * @return pool_bwclass   * The Pool Bandwidth class being used.
     */
    public java.lang.String getPool_bwclass() {
        return pool_bwclass;
    }


    /**
     * Sets the pool_bwclass value for this SystemConnectionsConnection.
     * 
     * @param pool_bwclass   * The Pool Bandwidth class being used.
     */
    public void setPool_bwclass(java.lang.String pool_bwclass) {
        this.pool_bwclass = pool_bwclass;
    }


    /**
     * Gets the code value for this SystemConnectionsConnection.
     * 
     * @return code   * The status code in the HTTP response.
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this SystemConnectionsConnection.
     * 
     * @param code   * The status code in the HTTP response.
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the request value for this SystemConnectionsConnection.
     * 
     * @return request   * The host header/URL in the HTTP request.
     */
    public java.lang.String getRequest() {
        return request;
    }


    /**
     * Sets the request value for this SystemConnectionsConnection.
     * 
     * @param request   * The host header/URL in the HTTP request.
     */
    public void setRequest(java.lang.String request) {
        this.request = request;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemConnectionsConnection)) return false;
        SystemConnectionsConnection other = (SystemConnectionsConnection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              this.vserver.equals(other.getVserver()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.pool==null && other.getPool()==null) || 
             (this.pool!=null &&
              this.pool.equals(other.getPool()))) &&
            this.bytes_in == other.getBytes_in() &&
            this.bytes_out == other.getBytes_out() &&
            this.time_est == other.getTime_est() &&
            this.time_client == other.getTime_client() &&
            this.time_server == other.getTime_server() &&
            this.retries == other.getRetries() &&
            ((this.slm_class==null && other.getSlm_class()==null) || 
             (this.slm_class!=null &&
              this.slm_class.equals(other.getSlm_class()))) &&
            ((this.vs_bwclass==null && other.getVs_bwclass()==null) || 
             (this.vs_bwclass!=null &&
              this.vs_bwclass.equals(other.getVs_bwclass()))) &&
            ((this.pool_bwclass==null && other.getPool_bwclass()==null) || 
             (this.pool_bwclass!=null &&
              this.pool_bwclass.equals(other.getPool_bwclass()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest())));
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getVserver() != null) {
            _hashCode += getVserver().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getPool() != null) {
            _hashCode += getPool().hashCode();
        }
        _hashCode += getBytes_in();
        _hashCode += getBytes_out();
        _hashCode += getTime_est();
        _hashCode += getTime_client();
        _hashCode += getTime_server();
        _hashCode += getRetries();
        if (getSlm_class() != null) {
            _hashCode += getSlm_class().hashCode();
        }
        if (getVs_bwclass() != null) {
            _hashCode += getVs_bwclass().hashCode();
        }
        if (getPool_bwclass() != null) {
            _hashCode += getPool_bwclass().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemConnectionsConnection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Connections.Connection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("", "via"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.Connections.ConnectionState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytes_in");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bytes_in"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bytes_out");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bytes_out"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_est");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_est"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slm_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slm_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vs_bwclass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vs_bwclass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool_bwclass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pool_bwclass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("", "request"));
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
