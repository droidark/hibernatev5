/**
 * Centrales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class Centrales  implements java.io.Serializable {
    private java.lang.String ncaiId;

    private java.lang.String ncaiSiglas;

    private java.lang.String ncaiCentral;

    public Centrales() {
    }

    public Centrales(
           java.lang.String ncaiId,
           java.lang.String ncaiSiglas,
           java.lang.String ncaiCentral) {
           this.ncaiId = ncaiId;
           this.ncaiSiglas = ncaiSiglas;
           this.ncaiCentral = ncaiCentral;
    }


    /**
     * Gets the ncaiId value for this Centrales.
     * 
     * @return ncaiId
     */
    public java.lang.String getNcaiId() {
        return ncaiId;
    }


    /**
     * Sets the ncaiId value for this Centrales.
     * 
     * @param ncaiId
     */
    public void setNcaiId(java.lang.String ncaiId) {
        this.ncaiId = ncaiId;
    }


    /**
     * Gets the ncaiSiglas value for this Centrales.
     * 
     * @return ncaiSiglas
     */
    public java.lang.String getNcaiSiglas() {
        return ncaiSiglas;
    }


    /**
     * Sets the ncaiSiglas value for this Centrales.
     * 
     * @param ncaiSiglas
     */
    public void setNcaiSiglas(java.lang.String ncaiSiglas) {
        this.ncaiSiglas = ncaiSiglas;
    }


    /**
     * Gets the ncaiCentral value for this Centrales.
     * 
     * @return ncaiCentral
     */
    public java.lang.String getNcaiCentral() {
        return ncaiCentral;
    }


    /**
     * Sets the ncaiCentral value for this Centrales.
     * 
     * @param ncaiCentral
     */
    public void setNcaiCentral(java.lang.String ncaiCentral) {
        this.ncaiCentral = ncaiCentral;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Centrales)) return false;
        Centrales other = (Centrales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ncaiId==null && other.getNcaiId()==null) || 
             (this.ncaiId!=null &&
              this.ncaiId.equals(other.getNcaiId()))) &&
            ((this.ncaiSiglas==null && other.getNcaiSiglas()==null) || 
             (this.ncaiSiglas!=null &&
              this.ncaiSiglas.equals(other.getNcaiSiglas()))) &&
            ((this.ncaiCentral==null && other.getNcaiCentral()==null) || 
             (this.ncaiCentral!=null &&
              this.ncaiCentral.equals(other.getNcaiCentral())));
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
        if (getNcaiId() != null) {
            _hashCode += getNcaiId().hashCode();
        }
        if (getNcaiSiglas() != null) {
            _hashCode += getNcaiSiglas().hashCode();
        }
        if (getNcaiCentral() != null) {
            _hashCode += getNcaiCentral().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Centrales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "centrales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncaiId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncaiId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncaiSiglas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncaiSiglas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncaiCentral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncaiCentral"));
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
