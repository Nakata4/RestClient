/**
 * Name.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Client.Demo;

public class Name  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private java.lang.String first;

    private java.lang.String last;

    private java.lang.String title;

    public Name() {
    }

    public Name(
           java.util.HashMap additionalProperties,
           java.lang.String first,
           java.lang.String last,
           java.lang.String title) {
           this.additionalProperties = additionalProperties;
           this.first = first;
           this.last = last;
           this.title = title;
    }


    /**
     * Gets the additionalProperties value for this Name.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this Name.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the first value for this Name.
     * 
     * @return first
     */
    public java.lang.String getFirst() {
        return first;
    }


    /**
     * Sets the first value for this Name.
     * 
     * @param first
     */
    public void setFirst(java.lang.String first) {
        this.first = first;
    }


    /**
     * Gets the last value for this Name.
     * 
     * @return last
     */
    public java.lang.String getLast() {
        return last;
    }


    /**
     * Sets the last value for this Name.
     * 
     * @param last
     */
    public void setLast(java.lang.String last) {
        this.last = last;
    }


    /**
     * Gets the title value for this Name.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Name.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Name)) return false;
        Name other = (Name) obj;
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
            ((this.first==null && other.getFirst()==null) || 
             (this.first!=null &&
              this.first.equals(other.getFirst()))) &&
            ((this.last==null && other.getLast()==null) || 
             (this.last!=null &&
              this.last.equals(other.getLast()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
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
        if (getFirst() != null) {
            _hashCode += getFirst().hashCode();
        }
        if (getLast() != null) {
            _hashCode += getLast().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Name.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Name"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "additionalProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
