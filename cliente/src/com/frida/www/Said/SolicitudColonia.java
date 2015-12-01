/**
 * SolicitudColonia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class SolicitudColonia  implements java.io.Serializable {
    private java.lang.String tipoContrato;

    private java.lang.String tipoConcentracion;

    private java.lang.String movimiento;

    private java.lang.String folioSC;

    private java.lang.String[] siglas;

    private java.lang.String claveOperador;

    public SolicitudColonia() {
    }

    public SolicitudColonia(
           java.lang.String tipoContrato,
           java.lang.String tipoConcentracion,
           java.lang.String movimiento,
           java.lang.String folioSC,
           java.lang.String[] siglas,
           java.lang.String claveOperador) {
           this.tipoContrato = tipoContrato;
           this.tipoConcentracion = tipoConcentracion;
           this.movimiento = movimiento;
           this.folioSC = folioSC;
           this.siglas = siglas;
           this.claveOperador = claveOperador;
    }


    /**
     * Gets the tipoContrato value for this SolicitudColonia.
     * 
     * @return tipoContrato
     */
    public java.lang.String getTipoContrato() {
        return tipoContrato;
    }


    /**
     * Sets the tipoContrato value for this SolicitudColonia.
     * 
     * @param tipoContrato
     */
    public void setTipoContrato(java.lang.String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }


    /**
     * Gets the tipoConcentracion value for this SolicitudColonia.
     * 
     * @return tipoConcentracion
     */
    public java.lang.String getTipoConcentracion() {
        return tipoConcentracion;
    }


    /**
     * Sets the tipoConcentracion value for this SolicitudColonia.
     * 
     * @param tipoConcentracion
     */
    public void setTipoConcentracion(java.lang.String tipoConcentracion) {
        this.tipoConcentracion = tipoConcentracion;
    }


    /**
     * Gets the movimiento value for this SolicitudColonia.
     * 
     * @return movimiento
     */
    public java.lang.String getMovimiento() {
        return movimiento;
    }


    /**
     * Sets the movimiento value for this SolicitudColonia.
     * 
     * @param movimiento
     */
    public void setMovimiento(java.lang.String movimiento) {
        this.movimiento = movimiento;
    }


    /**
     * Gets the folioSC value for this SolicitudColonia.
     * 
     * @return folioSC
     */
    public java.lang.String getFolioSC() {
        return folioSC;
    }


    /**
     * Sets the folioSC value for this SolicitudColonia.
     * 
     * @param folioSC
     */
    public void setFolioSC(java.lang.String folioSC) {
        this.folioSC = folioSC;
    }


    /**
     * Gets the siglas value for this SolicitudColonia.
     * 
     * @return siglas
     */
    public java.lang.String[] getSiglas() {
        return siglas;
    }


    /**
     * Sets the siglas value for this SolicitudColonia.
     * 
     * @param siglas
     */
    public void setSiglas(java.lang.String[] siglas) {
        this.siglas = siglas;
    }


    /**
     * Gets the claveOperador value for this SolicitudColonia.
     * 
     * @return claveOperador
     */
    public java.lang.String getClaveOperador() {
        return claveOperador;
    }


    /**
     * Sets the claveOperador value for this SolicitudColonia.
     * 
     * @param claveOperador
     */
    public void setClaveOperador(java.lang.String claveOperador) {
        this.claveOperador = claveOperador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitudColonia)) return false;
        SolicitudColonia other = (SolicitudColonia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoContrato==null && other.getTipoContrato()==null) || 
             (this.tipoContrato!=null &&
              this.tipoContrato.equals(other.getTipoContrato()))) &&
            ((this.tipoConcentracion==null && other.getTipoConcentracion()==null) || 
             (this.tipoConcentracion!=null &&
              this.tipoConcentracion.equals(other.getTipoConcentracion()))) &&
            ((this.movimiento==null && other.getMovimiento()==null) || 
             (this.movimiento!=null &&
              this.movimiento.equals(other.getMovimiento()))) &&
            ((this.folioSC==null && other.getFolioSC()==null) || 
             (this.folioSC!=null &&
              this.folioSC.equals(other.getFolioSC()))) &&
            ((this.siglas==null && other.getSiglas()==null) || 
             (this.siglas!=null &&
              java.util.Arrays.equals(this.siglas, other.getSiglas()))) &&
            ((this.claveOperador==null && other.getClaveOperador()==null) || 
             (this.claveOperador!=null &&
              this.claveOperador.equals(other.getClaveOperador())));
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
        if (getTipoContrato() != null) {
            _hashCode += getTipoContrato().hashCode();
        }
        if (getTipoConcentracion() != null) {
            _hashCode += getTipoConcentracion().hashCode();
        }
        if (getMovimiento() != null) {
            _hashCode += getMovimiento().hashCode();
        }
        if (getFolioSC() != null) {
            _hashCode += getFolioSC().hashCode();
        }
        if (getSiglas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiglas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiglas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClaveOperador() != null) {
            _hashCode += getClaveOperador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitudColonia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "solicitudColonia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoConcentracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoConcentracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioSC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folioSC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siglas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "siglaCentral"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claveOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveOperador"));
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
