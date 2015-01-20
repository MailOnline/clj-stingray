/**
 * SystemLicenseKeysLicenseKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * This structure contains the basic information for a license key.
 * It is used 
 *              when adding, deleting or retrieving license keys.
 */
public class SystemLicenseKeysLicenseKey  implements java.io.Serializable {
    /* The name of the product the license is for. */
    private java.lang.String product;

    /* The traffic manager software version for this machine. */
    private java.lang.String version;

    /* The list of platforms that the software may run on. */
    private java.lang.String[] platforms;

    /* The maximum number of CPUs that the software may run on. Note
     * that this field 
     *                  may not exist for all license keys in which case
     * its value will be '0'. */
    private int maxcpus;

    /* The IP addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array. */
    private java.lang.String[] ip_address;

    /* The MAC addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array. */
    private java.lang.String[] mac_address;

    /* The features that are supported by the license key. */
    private java.lang.String[] features;

    /* The maximum number of backends supported by the license key.
     * Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be '0'. */
    private int max_backends;

    /* Additional customer information for the license key. Note that
     * this field may not exist 
     *                  for all license keys in which case its value will
     * be "". */
    private java.lang.String customer_info;

    /* The customer ID for the license key. Note that this field may
     * not exist 
     *                  for all license keys in which case its value will
     * be "". */
    private java.lang.String customer_id;

    /* The serial number of the license key. */
    private int serial;

    /* The time at which the license key will expire. */
    private java.util.Calendar expires;

    /* The time at which the license key was issued. */
    private java.util.Calendar issued;

    /* The time at which the support contract for the license key
     * expires. Note that this 
     *                  field is for future use so may not exist for all
     * license keys, in which case its value will be equal 
     *                  to '01/01/1970 00:00:00'. */
    private java.util.Calendar maintenance;

    /* The hardware serial number for the appliance with this license
     * key. Note that this 
     *                  field is only applicable to Stingray Appliances and
     * otherwise will have the value "". */
    private java.lang.String hwserial;

    /* The maximum cluster size supported by the license key. Note
     * that this field may not 
     *                  exist for all license keys in which case its value
     * will be equal to '0'. */
    private int cluster_size;

    public SystemLicenseKeysLicenseKey() {
    }

    public SystemLicenseKeysLicenseKey(
           java.lang.String product,
           java.lang.String version,
           java.lang.String[] platforms,
           int maxcpus,
           java.lang.String[] ip_address,
           java.lang.String[] mac_address,
           java.lang.String[] features,
           int max_backends,
           java.lang.String customer_info,
           java.lang.String customer_id,
           int serial,
           java.util.Calendar expires,
           java.util.Calendar issued,
           java.util.Calendar maintenance,
           java.lang.String hwserial,
           int cluster_size) {
           this.product = product;
           this.version = version;
           this.platforms = platforms;
           this.maxcpus = maxcpus;
           this.ip_address = ip_address;
           this.mac_address = mac_address;
           this.features = features;
           this.max_backends = max_backends;
           this.customer_info = customer_info;
           this.customer_id = customer_id;
           this.serial = serial;
           this.expires = expires;
           this.issued = issued;
           this.maintenance = maintenance;
           this.hwserial = hwserial;
           this.cluster_size = cluster_size;
    }


    /**
     * Gets the product value for this SystemLicenseKeysLicenseKey.
     * 
     * @return product   * The name of the product the license is for.
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SystemLicenseKeysLicenseKey.
     * 
     * @param product   * The name of the product the license is for.
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the version value for this SystemLicenseKeysLicenseKey.
     * 
     * @return version   * The traffic manager software version for this machine.
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SystemLicenseKeysLicenseKey.
     * 
     * @param version   * The traffic manager software version for this machine.
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the platforms value for this SystemLicenseKeysLicenseKey.
     * 
     * @return platforms   * The list of platforms that the software may run on.
     */
    public java.lang.String[] getPlatforms() {
        return platforms;
    }


    /**
     * Sets the platforms value for this SystemLicenseKeysLicenseKey.
     * 
     * @param platforms   * The list of platforms that the software may run on.
     */
    public void setPlatforms(java.lang.String[] platforms) {
        this.platforms = platforms;
    }


    /**
     * Gets the maxcpus value for this SystemLicenseKeysLicenseKey.
     * 
     * @return maxcpus   * The maximum number of CPUs that the software may run on. Note
     * that this field 
     *                  may not exist for all license keys in which case
     * its value will be '0'.
     */
    public int getMaxcpus() {
        return maxcpus;
    }


    /**
     * Sets the maxcpus value for this SystemLicenseKeysLicenseKey.
     * 
     * @param maxcpus   * The maximum number of CPUs that the software may run on. Note
     * that this field 
     *                  may not exist for all license keys in which case
     * its value will be '0'.
     */
    public void setMaxcpus(int maxcpus) {
        this.maxcpus = maxcpus;
    }


    /**
     * Gets the ip_address value for this SystemLicenseKeysLicenseKey.
     * 
     * @return ip_address   * The IP addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array.
     */
    public java.lang.String[] getIp_address() {
        return ip_address;
    }


    /**
     * Sets the ip_address value for this SystemLicenseKeysLicenseKey.
     * 
     * @param ip_address   * The IP addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array.
     */
    public void setIp_address(java.lang.String[] ip_address) {
        this.ip_address = ip_address;
    }


    /**
     * Gets the mac_address value for this SystemLicenseKeysLicenseKey.
     * 
     * @return mac_address   * The MAC addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array.
     */
    public java.lang.String[] getMac_address() {
        return mac_address;
    }


    /**
     * Sets the mac_address value for this SystemLicenseKeysLicenseKey.
     * 
     * @param mac_address   * The MAC addresses of the machines that the software may run
     * on. Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be the empty array.
     */
    public void setMac_address(java.lang.String[] mac_address) {
        this.mac_address = mac_address;
    }


    /**
     * Gets the features value for this SystemLicenseKeysLicenseKey.
     * 
     * @return features   * The features that are supported by the license key.
     */
    public java.lang.String[] getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this SystemLicenseKeysLicenseKey.
     * 
     * @param features   * The features that are supported by the license key.
     */
    public void setFeatures(java.lang.String[] features) {
        this.features = features;
    }


    /**
     * Gets the max_backends value for this SystemLicenseKeysLicenseKey.
     * 
     * @return max_backends   * The maximum number of backends supported by the license key.
     * Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be '0'.
     */
    public int getMax_backends() {
        return max_backends;
    }


    /**
     * Sets the max_backends value for this SystemLicenseKeysLicenseKey.
     * 
     * @param max_backends   * The maximum number of backends supported by the license key.
     * Note that this 
     *                  field may not exist for all license keys in which
     * case its value will be '0'.
     */
    public void setMax_backends(int max_backends) {
        this.max_backends = max_backends;
    }


    /**
     * Gets the customer_info value for this SystemLicenseKeysLicenseKey.
     * 
     * @return customer_info   * Additional customer information for the license key. Note that
     * this field may not exist 
     *                  for all license keys in which case its value will
     * be "".
     */
    public java.lang.String getCustomer_info() {
        return customer_info;
    }


    /**
     * Sets the customer_info value for this SystemLicenseKeysLicenseKey.
     * 
     * @param customer_info   * Additional customer information for the license key. Note that
     * this field may not exist 
     *                  for all license keys in which case its value will
     * be "".
     */
    public void setCustomer_info(java.lang.String customer_info) {
        this.customer_info = customer_info;
    }


    /**
     * Gets the customer_id value for this SystemLicenseKeysLicenseKey.
     * 
     * @return customer_id   * The customer ID for the license key. Note that this field may
     * not exist 
     *                  for all license keys in which case its value will
     * be "".
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this SystemLicenseKeysLicenseKey.
     * 
     * @param customer_id   * The customer ID for the license key. Note that this field may
     * not exist 
     *                  for all license keys in which case its value will
     * be "".
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the serial value for this SystemLicenseKeysLicenseKey.
     * 
     * @return serial   * The serial number of the license key.
     */
    public int getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this SystemLicenseKeysLicenseKey.
     * 
     * @param serial   * The serial number of the license key.
     */
    public void setSerial(int serial) {
        this.serial = serial;
    }


    /**
     * Gets the expires value for this SystemLicenseKeysLicenseKey.
     * 
     * @return expires   * The time at which the license key will expire.
     */
    public java.util.Calendar getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this SystemLicenseKeysLicenseKey.
     * 
     * @param expires   * The time at which the license key will expire.
     */
    public void setExpires(java.util.Calendar expires) {
        this.expires = expires;
    }


    /**
     * Gets the issued value for this SystemLicenseKeysLicenseKey.
     * 
     * @return issued   * The time at which the license key was issued.
     */
    public java.util.Calendar getIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this SystemLicenseKeysLicenseKey.
     * 
     * @param issued   * The time at which the license key was issued.
     */
    public void setIssued(java.util.Calendar issued) {
        this.issued = issued;
    }


    /**
     * Gets the maintenance value for this SystemLicenseKeysLicenseKey.
     * 
     * @return maintenance   * The time at which the support contract for the license key
     * expires. Note that this 
     *                  field is for future use so may not exist for all
     * license keys, in which case its value will be equal 
     *                  to '01/01/1970 00:00:00'.
     */
    public java.util.Calendar getMaintenance() {
        return maintenance;
    }


    /**
     * Sets the maintenance value for this SystemLicenseKeysLicenseKey.
     * 
     * @param maintenance   * The time at which the support contract for the license key
     * expires. Note that this 
     *                  field is for future use so may not exist for all
     * license keys, in which case its value will be equal 
     *                  to '01/01/1970 00:00:00'.
     */
    public void setMaintenance(java.util.Calendar maintenance) {
        this.maintenance = maintenance;
    }


    /**
     * Gets the hwserial value for this SystemLicenseKeysLicenseKey.
     * 
     * @return hwserial   * The hardware serial number for the appliance with this license
     * key. Note that this 
     *                  field is only applicable to Stingray Appliances and
     * otherwise will have the value "".
     */
    public java.lang.String getHwserial() {
        return hwserial;
    }


    /**
     * Sets the hwserial value for this SystemLicenseKeysLicenseKey.
     * 
     * @param hwserial   * The hardware serial number for the appliance with this license
     * key. Note that this 
     *                  field is only applicable to Stingray Appliances and
     * otherwise will have the value "".
     */
    public void setHwserial(java.lang.String hwserial) {
        this.hwserial = hwserial;
    }


    /**
     * Gets the cluster_size value for this SystemLicenseKeysLicenseKey.
     * 
     * @return cluster_size   * The maximum cluster size supported by the license key. Note
     * that this field may not 
     *                  exist for all license keys in which case its value
     * will be equal to '0'.
     */
    public int getCluster_size() {
        return cluster_size;
    }


    /**
     * Sets the cluster_size value for this SystemLicenseKeysLicenseKey.
     * 
     * @param cluster_size   * The maximum cluster size supported by the license key. Note
     * that this field may not 
     *                  exist for all license keys in which case its value
     * will be equal to '0'.
     */
    public void setCluster_size(int cluster_size) {
        this.cluster_size = cluster_size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemLicenseKeysLicenseKey)) return false;
        SystemLicenseKeysLicenseKey other = (SystemLicenseKeysLicenseKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.platforms==null && other.getPlatforms()==null) || 
             (this.platforms!=null &&
              java.util.Arrays.equals(this.platforms, other.getPlatforms()))) &&
            this.maxcpus == other.getMaxcpus() &&
            ((this.ip_address==null && other.getIp_address()==null) || 
             (this.ip_address!=null &&
              java.util.Arrays.equals(this.ip_address, other.getIp_address()))) &&
            ((this.mac_address==null && other.getMac_address()==null) || 
             (this.mac_address!=null &&
              java.util.Arrays.equals(this.mac_address, other.getMac_address()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              java.util.Arrays.equals(this.features, other.getFeatures()))) &&
            this.max_backends == other.getMax_backends() &&
            ((this.customer_info==null && other.getCustomer_info()==null) || 
             (this.customer_info!=null &&
              this.customer_info.equals(other.getCustomer_info()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            this.serial == other.getSerial() &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires()))) &&
            ((this.issued==null && other.getIssued()==null) || 
             (this.issued!=null &&
              this.issued.equals(other.getIssued()))) &&
            ((this.maintenance==null && other.getMaintenance()==null) || 
             (this.maintenance!=null &&
              this.maintenance.equals(other.getMaintenance()))) &&
            ((this.hwserial==null && other.getHwserial()==null) || 
             (this.hwserial!=null &&
              this.hwserial.equals(other.getHwserial()))) &&
            this.cluster_size == other.getCluster_size();
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
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getPlatforms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatforms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatforms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMaxcpus();
        if (getIp_address() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIp_address());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIp_address(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMac_address() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMac_address());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMac_address(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMax_backends();
        if (getCustomer_info() != null) {
            _hashCode += getCustomer_info().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        _hashCode += getSerial();
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        if (getIssued() != null) {
            _hashCode += getIssued().hashCode();
        }
        if (getMaintenance() != null) {
            _hashCode += getMaintenance().hashCode();
        }
        if (getHwserial() != null) {
            _hashCode += getHwserial().hashCode();
        }
        _hashCode += getCluster_size();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemLicenseKeysLicenseKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "System.LicenseKeys.LicenseKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platforms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "platforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_backends");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_backends"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maintenance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwserial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwserial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cluster_size"));
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
