/**
 * CupoTarjeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model.logic.bussiness.coomeva.com.co;

public class CupoTarjeta  implements java.io.Serializable {
    private java.lang.String cardId;

    private java.lang.String id;

    private long valorCupo;

    public CupoTarjeta() {
    }

    public CupoTarjeta(
           java.lang.String cardId,
           java.lang.String id,
           long valorCupo) {
           this.cardId = cardId;
           this.id = id;
           this.valorCupo = valorCupo;
    }


    /**
     * Gets the cardId value for this CupoTarjeta.
     * 
     * @return cardId
     */
    public java.lang.String getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this CupoTarjeta.
     * 
     * @param cardId
     */
    public void setCardId(java.lang.String cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the id value for this CupoTarjeta.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CupoTarjeta.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the valorCupo value for this CupoTarjeta.
     * 
     * @return valorCupo
     */
    public long getValorCupo() {
        return valorCupo;
    }


    /**
     * Sets the valorCupo value for this CupoTarjeta.
     * 
     * @param valorCupo
     */
    public void setValorCupo(long valorCupo) {
        this.valorCupo = valorCupo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CupoTarjeta)) return false;
        CupoTarjeta other = (CupoTarjeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardId==null && other.getCardId()==null) || 
             (this.cardId!=null &&
              this.cardId.equals(other.getCardId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.valorCupo == other.getValorCupo();
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
        if (getCardId() != null) {
            _hashCode += getCardId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += new Long(getValorCupo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CupoTarjeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("co.com.coomeva.bussiness.logic.model", "CupoTarjeta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorCupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorCupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
