/**
 * Billing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Client.Demo;

public class Billing  implements java.io.Serializable {
    private java.util.HashMap additionalProperties;

    private Client.Demo.Card card;

    public Billing() {
    }

    public Billing(
           java.util.HashMap additionalProperties,
           Client.Demo.Card card) {
           this.additionalProperties = additionalProperties;
           this.card = card;
    }


    /**
     * Gets the additionalProperties value for this Billing.
     * 
     * @return additionalProperties
     */
    public java.util.HashMap getAdditionalProperties() {
        return additionalProperties;
    }


    /**
     * Sets the additionalProperties value for this Billing.
     * 
     * @param additionalProperties
     */
    public void setAdditionalProperties(java.util.HashMap additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    /**
     * Gets the card value for this Billing.
     * 
     * @return card
     */
    public Client.Demo.Card getCard() {
        return card;
    }


    /**
     * Sets the card value for this Billing.
     * 
     * @param card
     */
    public void setCard(Client.Demo.Card card) {
        this.card = card;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Billing)) return false;
        Billing other = (Billing) obj;
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
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard())));
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
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Billing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Billing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "additionalProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Demo.Client", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://Demo.Client", "Card"));
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
