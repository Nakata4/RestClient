/**
 * Date.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Client.Demo;

public class Date  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private java.lang.String date;

    private java.lang.String timezone;

    private java.lang.Integer timezoneType;

    public Date() {
    }

    public Date(
           java.util.HashMap additionalProperties,
           java.lang.String date,
           java.lang.String timezone,
           java.lang.Integer timezoneType) {
           this.additionalProperties = additionalProperties;
           this.date = date;
           this.timezone = timezone;
           this.timezoneType = timezoneType;
    }


    /**
     * Gets the additionalProperties value for this Date.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this Date.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the date value for this Date.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Date.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the timezone value for this Date.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this Date.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the timezoneType value for this Date.
     * 
     * @return timezoneType
     */
    public java.lang.Integer getTimezoneType() {
        return timezoneType;
    }


    /**
     * Sets the timezoneType value for this Date.
     * 
     * @param timezoneType
     */
    public void setTimezoneType(java.lang.Integer timezoneType) {
        this.timezoneType = timezoneType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Date)) return false;
        Date other = (Date) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalProperties==null && other.getAdditionalProperties()==null) || 
             (this.additionalProperties!=null &&
              this.additionalProperties.equals(other.getAdditionalProperties()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.timezoneType==null && other.getTimezoneType()==null) || 
             (this.timezoneType!=null &&
              this.timezoneType.equals(other.getTimezoneType())));
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
        if (getAdditionalProperties() != null) {
            _hashCode += getAdditionalProperties().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getTimezoneType() != null) {
            _hashCode += getTimezoneType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Date.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Date"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "additionalProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezoneType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "timezoneType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
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
