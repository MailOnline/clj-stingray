/**
 * AlertingEventTypeEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * A set of conditions that when met causes an action to be run.
 */
public class AlertingEventTypeEventType  implements java.io.Serializable {
    /* The events that will trigger the associated actions. */
    private com.zeus.soap.zxtm._1_0.AlertingEventTypeEvent[] events;

    /* The names of all the custom events you want to trigger this
     * event type. */
    private java.lang.String[] customEvents;

    /* The names of all the actions mapped to this custom event. */
    private java.lang.String[] mappedActions;

    /* The names of all the Service Protection Classes that should
     * trigger this event type. If this is an empty array all objects of
     * this type will be matched. */
    private java.lang.String[] protectionNames;

    /* The names of all the Virtual Servers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched. */
    private java.lang.String[] vserverNames;

    /* The names of all the SLM Classes that should trigger this event
     * type. If this is an empty array all objects of this type will be matched. */
    private java.lang.String[] slmNames;

    /* The names of all the Locations that should trigger this event
     * type. If this is an empty array all objects of this type will be matched. */
    private java.lang.String[] locationNames;

    /* The names of all the Monitors that should trigger this event
     * type. If this is an empty array all objects of this type will be matched. */
    private java.lang.String[] monitorNames;

    /* The names of all the GLB Services that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched. */
    private java.lang.String[] serviceNames;

    /* The names of all the Rules that should trigger this event type.
     * If this is an empty array all objects of this type will be matched. */
    private java.lang.String[] ruleNames;

    /* The names of all the Cloud Credentials that should trigger
     * this event type. If this is an empty array all objects of this type
     * will be matched. */
    private java.lang.String[] cloudcredentialNames;

    /* The names of all the License Keys that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched. */
    private java.lang.String[] licensekeyNames;

    /* The names of all the Traffic Managers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched. */
    private java.lang.String[] zxtmNames;

    /* The names of all the Pools that should trigger this event type.
     * If this is an empty array all objects of this type will be matched. */
    private java.lang.String[] poolNames;

    public AlertingEventTypeEventType() {
    }

    public AlertingEventTypeEventType(
           com.zeus.soap.zxtm._1_0.AlertingEventTypeEvent[] events,
           java.lang.String[] customEvents,
           java.lang.String[] mappedActions,
           java.lang.String[] protectionNames,
           java.lang.String[] vserverNames,
           java.lang.String[] slmNames,
           java.lang.String[] locationNames,
           java.lang.String[] monitorNames,
           java.lang.String[] serviceNames,
           java.lang.String[] ruleNames,
           java.lang.String[] cloudcredentialNames,
           java.lang.String[] licensekeyNames,
           java.lang.String[] zxtmNames,
           java.lang.String[] poolNames) {
           this.events = events;
           this.customEvents = customEvents;
           this.mappedActions = mappedActions;
           this.protectionNames = protectionNames;
           this.vserverNames = vserverNames;
           this.slmNames = slmNames;
           this.locationNames = locationNames;
           this.monitorNames = monitorNames;
           this.serviceNames = serviceNames;
           this.ruleNames = ruleNames;
           this.cloudcredentialNames = cloudcredentialNames;
           this.licensekeyNames = licensekeyNames;
           this.zxtmNames = zxtmNames;
           this.poolNames = poolNames;
    }


    /**
     * Gets the events value for this AlertingEventTypeEventType.
     * 
     * @return events   * The events that will trigger the associated actions.
     */
    public com.zeus.soap.zxtm._1_0.AlertingEventTypeEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this AlertingEventTypeEventType.
     * 
     * @param events   * The events that will trigger the associated actions.
     */
    public void setEvents(com.zeus.soap.zxtm._1_0.AlertingEventTypeEvent[] events) {
        this.events = events;
    }


    /**
     * Gets the customEvents value for this AlertingEventTypeEventType.
     * 
     * @return customEvents   * The names of all the custom events you want to trigger this
     * event type.
     */
    public java.lang.String[] getCustomEvents() {
        return customEvents;
    }


    /**
     * Sets the customEvents value for this AlertingEventTypeEventType.
     * 
     * @param customEvents   * The names of all the custom events you want to trigger this
     * event type.
     */
    public void setCustomEvents(java.lang.String[] customEvents) {
        this.customEvents = customEvents;
    }


    /**
     * Gets the mappedActions value for this AlertingEventTypeEventType.
     * 
     * @return mappedActions   * The names of all the actions mapped to this custom event.
     */
    public java.lang.String[] getMappedActions() {
        return mappedActions;
    }


    /**
     * Sets the mappedActions value for this AlertingEventTypeEventType.
     * 
     * @param mappedActions   * The names of all the actions mapped to this custom event.
     */
    public void setMappedActions(java.lang.String[] mappedActions) {
        this.mappedActions = mappedActions;
    }


    /**
     * Gets the protectionNames value for this AlertingEventTypeEventType.
     * 
     * @return protectionNames   * The names of all the Service Protection Classes that should
     * trigger this event type. If this is an empty array all objects of
     * this type will be matched.
     */
    public java.lang.String[] getProtectionNames() {
        return protectionNames;
    }


    /**
     * Sets the protectionNames value for this AlertingEventTypeEventType.
     * 
     * @param protectionNames   * The names of all the Service Protection Classes that should
     * trigger this event type. If this is an empty array all objects of
     * this type will be matched.
     */
    public void setProtectionNames(java.lang.String[] protectionNames) {
        this.protectionNames = protectionNames;
    }


    /**
     * Gets the vserverNames value for this AlertingEventTypeEventType.
     * 
     * @return vserverNames   * The names of all the Virtual Servers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public java.lang.String[] getVserverNames() {
        return vserverNames;
    }


    /**
     * Sets the vserverNames value for this AlertingEventTypeEventType.
     * 
     * @param vserverNames   * The names of all the Virtual Servers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public void setVserverNames(java.lang.String[] vserverNames) {
        this.vserverNames = vserverNames;
    }


    /**
     * Gets the slmNames value for this AlertingEventTypeEventType.
     * 
     * @return slmNames   * The names of all the SLM Classes that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public java.lang.String[] getSlmNames() {
        return slmNames;
    }


    /**
     * Sets the slmNames value for this AlertingEventTypeEventType.
     * 
     * @param slmNames   * The names of all the SLM Classes that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public void setSlmNames(java.lang.String[] slmNames) {
        this.slmNames = slmNames;
    }


    /**
     * Gets the locationNames value for this AlertingEventTypeEventType.
     * 
     * @return locationNames   * The names of all the Locations that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public java.lang.String[] getLocationNames() {
        return locationNames;
    }


    /**
     * Sets the locationNames value for this AlertingEventTypeEventType.
     * 
     * @param locationNames   * The names of all the Locations that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public void setLocationNames(java.lang.String[] locationNames) {
        this.locationNames = locationNames;
    }


    /**
     * Gets the monitorNames value for this AlertingEventTypeEventType.
     * 
     * @return monitorNames   * The names of all the Monitors that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public java.lang.String[] getMonitorNames() {
        return monitorNames;
    }


    /**
     * Sets the monitorNames value for this AlertingEventTypeEventType.
     * 
     * @param monitorNames   * The names of all the Monitors that should trigger this event
     * type. If this is an empty array all objects of this type will be matched.
     */
    public void setMonitorNames(java.lang.String[] monitorNames) {
        this.monitorNames = monitorNames;
    }


    /**
     * Gets the serviceNames value for this AlertingEventTypeEventType.
     * 
     * @return serviceNames   * The names of all the GLB Services that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public java.lang.String[] getServiceNames() {
        return serviceNames;
    }


    /**
     * Sets the serviceNames value for this AlertingEventTypeEventType.
     * 
     * @param serviceNames   * The names of all the GLB Services that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public void setServiceNames(java.lang.String[] serviceNames) {
        this.serviceNames = serviceNames;
    }


    /**
     * Gets the ruleNames value for this AlertingEventTypeEventType.
     * 
     * @return ruleNames   * The names of all the Rules that should trigger this event type.
     * If this is an empty array all objects of this type will be matched.
     */
    public java.lang.String[] getRuleNames() {
        return ruleNames;
    }


    /**
     * Sets the ruleNames value for this AlertingEventTypeEventType.
     * 
     * @param ruleNames   * The names of all the Rules that should trigger this event type.
     * If this is an empty array all objects of this type will be matched.
     */
    public void setRuleNames(java.lang.String[] ruleNames) {
        this.ruleNames = ruleNames;
    }


    /**
     * Gets the cloudcredentialNames value for this AlertingEventTypeEventType.
     * 
     * @return cloudcredentialNames   * The names of all the Cloud Credentials that should trigger
     * this event type. If this is an empty array all objects of this type
     * will be matched.
     */
    public java.lang.String[] getCloudcredentialNames() {
        return cloudcredentialNames;
    }


    /**
     * Sets the cloudcredentialNames value for this AlertingEventTypeEventType.
     * 
     * @param cloudcredentialNames   * The names of all the Cloud Credentials that should trigger
     * this event type. If this is an empty array all objects of this type
     * will be matched.
     */
    public void setCloudcredentialNames(java.lang.String[] cloudcredentialNames) {
        this.cloudcredentialNames = cloudcredentialNames;
    }


    /**
     * Gets the licensekeyNames value for this AlertingEventTypeEventType.
     * 
     * @return licensekeyNames   * The names of all the License Keys that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public java.lang.String[] getLicensekeyNames() {
        return licensekeyNames;
    }


    /**
     * Sets the licensekeyNames value for this AlertingEventTypeEventType.
     * 
     * @param licensekeyNames   * The names of all the License Keys that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public void setLicensekeyNames(java.lang.String[] licensekeyNames) {
        this.licensekeyNames = licensekeyNames;
    }


    /**
     * Gets the zxtmNames value for this AlertingEventTypeEventType.
     * 
     * @return zxtmNames   * The names of all the Traffic Managers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public java.lang.String[] getZxtmNames() {
        return zxtmNames;
    }


    /**
     * Sets the zxtmNames value for this AlertingEventTypeEventType.
     * 
     * @param zxtmNames   * The names of all the Traffic Managers that should trigger this
     * event type. If this is an empty array all objects of this type will
     * be matched.
     */
    public void setZxtmNames(java.lang.String[] zxtmNames) {
        this.zxtmNames = zxtmNames;
    }


    /**
     * Gets the poolNames value for this AlertingEventTypeEventType.
     * 
     * @return poolNames   * The names of all the Pools that should trigger this event type.
     * If this is an empty array all objects of this type will be matched.
     */
    public java.lang.String[] getPoolNames() {
        return poolNames;
    }


    /**
     * Sets the poolNames value for this AlertingEventTypeEventType.
     * 
     * @param poolNames   * The names of all the Pools that should trigger this event type.
     * If this is an empty array all objects of this type will be matched.
     */
    public void setPoolNames(java.lang.String[] poolNames) {
        this.poolNames = poolNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlertingEventTypeEventType)) return false;
        AlertingEventTypeEventType other = (AlertingEventTypeEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents()))) &&
            ((this.customEvents==null && other.getCustomEvents()==null) || 
             (this.customEvents!=null &&
              java.util.Arrays.equals(this.customEvents, other.getCustomEvents()))) &&
            ((this.mappedActions==null && other.getMappedActions()==null) || 
             (this.mappedActions!=null &&
              java.util.Arrays.equals(this.mappedActions, other.getMappedActions()))) &&
            ((this.protectionNames==null && other.getProtectionNames()==null) || 
             (this.protectionNames!=null &&
              java.util.Arrays.equals(this.protectionNames, other.getProtectionNames()))) &&
            ((this.vserverNames==null && other.getVserverNames()==null) || 
             (this.vserverNames!=null &&
              java.util.Arrays.equals(this.vserverNames, other.getVserverNames()))) &&
            ((this.slmNames==null && other.getSlmNames()==null) || 
             (this.slmNames!=null &&
              java.util.Arrays.equals(this.slmNames, other.getSlmNames()))) &&
            ((this.locationNames==null && other.getLocationNames()==null) || 
             (this.locationNames!=null &&
              java.util.Arrays.equals(this.locationNames, other.getLocationNames()))) &&
            ((this.monitorNames==null && other.getMonitorNames()==null) || 
             (this.monitorNames!=null &&
              java.util.Arrays.equals(this.monitorNames, other.getMonitorNames()))) &&
            ((this.serviceNames==null && other.getServiceNames()==null) || 
             (this.serviceNames!=null &&
              java.util.Arrays.equals(this.serviceNames, other.getServiceNames()))) &&
            ((this.ruleNames==null && other.getRuleNames()==null) || 
             (this.ruleNames!=null &&
              java.util.Arrays.equals(this.ruleNames, other.getRuleNames()))) &&
            ((this.cloudcredentialNames==null && other.getCloudcredentialNames()==null) || 
             (this.cloudcredentialNames!=null &&
              java.util.Arrays.equals(this.cloudcredentialNames, other.getCloudcredentialNames()))) &&
            ((this.licensekeyNames==null && other.getLicensekeyNames()==null) || 
             (this.licensekeyNames!=null &&
              java.util.Arrays.equals(this.licensekeyNames, other.getLicensekeyNames()))) &&
            ((this.zxtmNames==null && other.getZxtmNames()==null) || 
             (this.zxtmNames!=null &&
              java.util.Arrays.equals(this.zxtmNames, other.getZxtmNames()))) &&
            ((this.poolNames==null && other.getPoolNames()==null) || 
             (this.poolNames!=null &&
              java.util.Arrays.equals(this.poolNames, other.getPoolNames())));
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
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMappedActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappedActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappedActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProtectionNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtectionNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtectionNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVserverNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVserverNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVserverNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSlmNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSlmNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSlmNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonitorNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitorNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitorNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuleNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloudcredentialNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloudcredentialNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloudcredentialNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLicensekeyNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLicensekeyNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLicensekeyNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZxtmNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZxtmNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZxtmNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoolNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoolNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoolNames(), i);
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
        new org.apache.axis.description.TypeDesc(AlertingEventTypeEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Alerting.EventType.EventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "Alerting.EventType.Event"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappedActions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappedActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protectionNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserverNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserverNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slmNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slmNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruleNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloudcredentialNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cloudcredentialNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensekeyNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licensekeyNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zxtmNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zxtmNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poolNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "poolNames"));
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
