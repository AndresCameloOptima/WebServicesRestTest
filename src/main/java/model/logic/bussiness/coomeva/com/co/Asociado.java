/**
 * Asociado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model.logic.bussiness.coomeva.com.co;

public class Asociado  implements java.io.Serializable {
    private java.lang.String fullName;

    private java.lang.String id;

    private java.lang.String lastName;

    private java.lang.String name;

    private java.lang.String officesCity;

    private java.lang.String officesCod;

    private java.lang.String officesNom;

    private java.lang.String surName;

    public Asociado() {
    }

    public Asociado(
           java.lang.String fullName,
           java.lang.String id,
           java.lang.String lastName,
           java.lang.String name,
           java.lang.String officesCity,
           java.lang.String officesCod,
           java.lang.String officesNom,
           java.lang.String surName) {
           this.fullName = fullName;
           this.id = id;
           this.lastName = lastName;
           this.name = name;
           this.officesCity = officesCity;
           this.officesCod = officesCod;
           this.officesNom = officesNom;
           this.surName = surName;
    }


    /**
     * Gets the fullName value for this Asociado.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Asociado.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the id value for this Asociado.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Asociado.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lastName value for this Asociado.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Asociado.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the name value for this Asociado.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Asociado.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the officesCity value for this Asociado.
     * 
     * @return officesCity
     */
    public java.lang.String getOfficesCity() {
        return officesCity;
    }


    /**
     * Sets the officesCity value for this Asociado.
     * 
     * @param officesCity
     */
    public void setOfficesCity(java.lang.String officesCity) {
        this.officesCity = officesCity;
    }


    /**
     * Gets the officesCod value for this Asociado.
     * 
     * @return officesCod
     */
    public java.lang.String getOfficesCod() {
        return officesCod;
    }


    /**
     * Sets the officesCod value for this Asociado.
     * 
     * @param officesCod
     */
    public void setOfficesCod(java.lang.String officesCod) {
        this.officesCod = officesCod;
    }


    /**
     * Gets the officesNom value for this Asociado.
     * 
     * @return officesNom
     */
    public java.lang.String getOfficesNom() {
        return officesNom;
    }


    /**
     * Sets the officesNom value for this Asociado.
     * 
     * @param officesNom
     */
    public void setOfficesNom(java.lang.String officesNom) {
        this.officesNom = officesNom;
    }


    /**
     * Gets the surName value for this Asociado.
     * 
     * @return surName
     */
    public java.lang.String getSurName() {
        return surName;
    }


    /**
     * Sets the surName value for this Asociado.
     * 
     * @param surName
     */
    public void setSurName(java.lang.String surName) {
        this.surName = surName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asociado)) return false;
        Asociado other = (Asociado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.officesCity==null && other.getOfficesCity()==null) || 
             (this.officesCity!=null &&
              this.officesCity.equals(other.getOfficesCity()))) &&
            ((this.officesCod==null && other.getOfficesCod()==null) || 
             (this.officesCod!=null &&
              this.officesCod.equals(other.getOfficesCod()))) &&
            ((this.officesNom==null && other.getOfficesNom()==null) || 
             (this.officesNom!=null &&
              this.officesNom.equals(other.getOfficesNom()))) &&
            ((this.surName==null && other.getSurName()==null) || 
             (this.surName!=null &&
              this.surName.equals(other.getSurName())));
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
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOfficesCity() != null) {
            _hashCode += getOfficesCity().hashCode();
        }
        if (getOfficesCod() != null) {
            _hashCode += getOfficesCod().hashCode();
        }
        if (getOfficesNom() != null) {
            _hashCode += getOfficesNom().hashCode();
        }
        if (getSurName() != null) {
            _hashCode += getSurName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Asociado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("co.com.coomeva.bussiness.logic.model", "Asociado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officesCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officesCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officesCod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officesCod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officesNom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "officesNom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surName"));
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
