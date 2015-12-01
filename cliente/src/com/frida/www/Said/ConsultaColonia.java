/**
 * ConsultaColonia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class ConsultaColonia  implements java.io.Serializable {
    private java.lang.String folioSC;

    private java.lang.String tipoContrato;

    private java.lang.String tipoConcentracion;

    private java.lang.String claveOperador;

    private com.frida.www.Said.Region[] region;

    private com.frida.www.Said.Errores error;

    public ConsultaColonia() {
    }

    public ConsultaColonia(
           java.lang.String folioSC,
           java.lang.String tipoContrato,
           java.lang.String tipoConcentracion,
           java.lang.String claveOperador,
           com.frida.www.Said.Region[] region,
           com.frida.www.Said.Errores error) {
           this.folioSC = folioSC;
           this.tipoContrato = tipoContrato;
           this.tipoConcentracion = tipoConcentracion;
           this.claveOperador = claveOperador;
           this.region = region;
           this.error = error;
    }


    /**
     * Gets the folioSC value for this ConsultaColonia.
     * 
     * @return folioSC
     */
    public java.lang.String getFolioSC() {
        return folioSC;
    }


    /**
     * Sets the folioSC value for this ConsultaColonia.
     * 
     * @param folioSC
     */
    public void setFolioSC(java.lang.String folioSC) {
        this.folioSC = folioSC;
    }


    /**
     * Gets the tipoContrato value for this ConsultaColonia.
     * 
     * @return tipoContrato
     */
    public java.lang.String getTipoContrato() {
        return tipoContrato;
    }


    /**
     * Sets the tipoContrato value for this ConsultaColonia.
     * 
     * @param tipoContrato
     */
    public void setTipoContrato(java.lang.String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }


    /**
     * Gets the tipoConcentracion value for this ConsultaColonia.
     * 
     * @return tipoConcentracion
     */
    public java.lang.String getTipoConcentracion() {
        return tipoConcentracion;
    }


    /**
     * Sets the tipoConcentracion value for this ConsultaColonia.
     * 
     * @param tipoConcentracion
     */
    public void setTipoConcentracion(java.lang.String tipoConcentracion) {
        this.tipoConcentracion = tipoConcentracion;
    }


    /**
     * Gets the claveOperador value for this ConsultaColonia.
     * 
     * @return claveOperador
     */
    public java.lang.String getClaveOperador() {
        return claveOperador;
    }


    /**
     * Sets the claveOperador value for this ConsultaColonia.
     * 
     * @param claveOperador
     */
    public void setClaveOperador(java.lang.String claveOperador) {
        this.claveOperador = claveOperador;
    }


    /**
     * Gets the region value for this ConsultaColonia.
     * 
     * @return region
     */
    public com.frida.www.Said.Region[] getRegion() {
        return region;
    }


    /**
     * Sets the region value for this ConsultaColonia.
     * 
     * @param region
     */
    public void setRegion(com.frida.www.Said.Region[] region) {
        this.region = region;
    }

    public com.frida.www.Said.Region getRegion(int i) {
        return this.region[i];
    }

    public void setRegion(int i, com.frida.www.Said.Region _value) {
        this.region[i] = _value;
    }


    /**
     * Gets the error value for this ConsultaColonia.
     * 
     * @return error
     */
    public com.frida.www.Said.Errores getError() {
        return error;
    }


    /**
     * Sets the error value for this ConsultaColonia.
     * 
     * @param error
     */
    public void setError(com.frida.www.Said.Errores error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaColonia)) return false;
        ConsultaColonia other = (ConsultaColonia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folioSC==null && other.getFolioSC()==null) || 
             (this.folioSC!=null &&
              this.folioSC.equals(other.getFolioSC()))) &&
            ((this.tipoContrato==null && other.getTipoContrato()==null) || 
             (this.tipoContrato!=null &&
              this.tipoContrato.equals(other.getTipoContrato()))) &&
            ((this.tipoConcentracion==null && other.getTipoConcentracion()==null) || 
             (this.tipoConcentracion!=null &&
              this.tipoConcentracion.equals(other.getTipoConcentracion()))) &&
            ((this.claveOperador==null && other.getClaveOperador()==null) || 
             (this.claveOperador!=null &&
              this.claveOperador.equals(other.getClaveOperador()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              java.util.Arrays.equals(this.region, other.getRegion()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getFolioSC() != null) {
            _hashCode += getFolioSC().hashCode();
        }
        if (getTipoContrato() != null) {
            _hashCode += getTipoContrato().hashCode();
        }
        if (getTipoConcentracion() != null) {
            _hashCode += getTipoConcentracion().hashCode();
        }
        if (getClaveOperador() != null) {
            _hashCode += getClaveOperador().hashCode();
        }
        if (getRegion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaColonia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "consultaColonia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioSC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folioSC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("claveOperador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "claveOperador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "Region"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "errores"));
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
