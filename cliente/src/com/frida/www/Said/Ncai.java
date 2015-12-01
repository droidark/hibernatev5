/**
 * Ncai.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class Ncai  implements java.io.Serializable {
    private java.lang.String folioNcai;

    private java.lang.String ncaId;

    private java.lang.String ncaiSiglas;

    private java.lang.String ncaiCentral;

    private java.lang.String equipoAcceso;

    private java.lang.String codigoConfirmacion;

    public Ncai() {
    }

    public Ncai(
           java.lang.String folioNcai,
           java.lang.String ncaId,
           java.lang.String ncaiSiglas,
           java.lang.String ncaiCentral,
           java.lang.String equipoAcceso,
           java.lang.String codigoConfirmacion) {
           this.folioNcai = folioNcai;
           this.ncaId = ncaId;
           this.ncaiSiglas = ncaiSiglas;
           this.ncaiCentral = ncaiCentral;
           this.equipoAcceso = equipoAcceso;
           this.codigoConfirmacion = codigoConfirmacion;
    }


    /**
     * Gets the folioNcai value for this Ncai.
     * 
     * @return folioNcai
     */
    public java.lang.String getFolioNcai() {
        return folioNcai;
    }


    /**
     * Sets the folioNcai value for this Ncai.
     * 
     * @param folioNcai
     */
    public void setFolioNcai(java.lang.String folioNcai) {
        this.folioNcai = folioNcai;
    }


    /**
     * Gets the ncaId value for this Ncai.
     * 
     * @return ncaId
     */
    public java.lang.String getNcaId() {
        return ncaId;
    }


    /**
     * Sets the ncaId value for this Ncai.
     * 
     * @param ncaId
     */
    public void setNcaId(java.lang.String ncaId) {
        this.ncaId = ncaId;
    }


    /**
     * Gets the ncaiSiglas value for this Ncai.
     * 
     * @return ncaiSiglas
     */
    public java.lang.String getNcaiSiglas() {
        return ncaiSiglas;
    }


    /**
     * Sets the ncaiSiglas value for this Ncai.
     * 
     * @param ncaiSiglas
     */
    public void setNcaiSiglas(java.lang.String ncaiSiglas) {
        this.ncaiSiglas = ncaiSiglas;
    }


    /**
     * Gets the ncaiCentral value for this Ncai.
     * 
     * @return ncaiCentral
     */
    public java.lang.String getNcaiCentral() {
        return ncaiCentral;
    }


    /**
     * Sets the ncaiCentral value for this Ncai.
     * 
     * @param ncaiCentral
     */
    public void setNcaiCentral(java.lang.String ncaiCentral) {
        this.ncaiCentral = ncaiCentral;
    }


    /**
     * Gets the equipoAcceso value for this Ncai.
     * 
     * @return equipoAcceso
     */
    public java.lang.String getEquipoAcceso() {
        return equipoAcceso;
    }


    /**
     * Sets the equipoAcceso value for this Ncai.
     * 
     * @param equipoAcceso
     */
    public void setEquipoAcceso(java.lang.String equipoAcceso) {
        this.equipoAcceso = equipoAcceso;
    }


    /**
     * Gets the codigoConfirmacion value for this Ncai.
     * 
     * @return codigoConfirmacion
     */
    public java.lang.String getCodigoConfirmacion() {
        return codigoConfirmacion;
    }


    /**
     * Sets the codigoConfirmacion value for this Ncai.
     * 
     * @param codigoConfirmacion
     */
    public void setCodigoConfirmacion(java.lang.String codigoConfirmacion) {
        this.codigoConfirmacion = codigoConfirmacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ncai)) return false;
        Ncai other = (Ncai) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folioNcai==null && other.getFolioNcai()==null) || 
             (this.folioNcai!=null &&
              this.folioNcai.equals(other.getFolioNcai()))) &&
            ((this.ncaId==null && other.getNcaId()==null) || 
             (this.ncaId!=null &&
              this.ncaId.equals(other.getNcaId()))) &&
            ((this.ncaiSiglas==null && other.getNcaiSiglas()==null) || 
             (this.ncaiSiglas!=null &&
              this.ncaiSiglas.equals(other.getNcaiSiglas()))) &&
            ((this.ncaiCentral==null && other.getNcaiCentral()==null) || 
             (this.ncaiCentral!=null &&
              this.ncaiCentral.equals(other.getNcaiCentral()))) &&
            ((this.equipoAcceso==null && other.getEquipoAcceso()==null) || 
             (this.equipoAcceso!=null &&
              this.equipoAcceso.equals(other.getEquipoAcceso()))) &&
            ((this.codigoConfirmacion==null && other.getCodigoConfirmacion()==null) || 
             (this.codigoConfirmacion!=null &&
              this.codigoConfirmacion.equals(other.getCodigoConfirmacion())));
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
        if (getFolioNcai() != null) {
            _hashCode += getFolioNcai().hashCode();
        }
        if (getNcaId() != null) {
            _hashCode += getNcaId().hashCode();
        }
        if (getNcaiSiglas() != null) {
            _hashCode += getNcaiSiglas().hashCode();
        }
        if (getNcaiCentral() != null) {
            _hashCode += getNcaiCentral().hashCode();
        }
        if (getEquipoAcceso() != null) {
            _hashCode += getEquipoAcceso().hashCode();
        }
        if (getCodigoConfirmacion() != null) {
            _hashCode += getCodigoConfirmacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ncai.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "ncai"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioNcai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folioNcai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncaId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipoAcceso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipoAcceso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConfirmacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoConfirmacion"));
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
