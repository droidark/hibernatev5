/**
 * Regiones.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class Regiones  implements java.io.Serializable {
    private java.lang.String idRegion;

    private java.lang.String pc1Siglas;

    private java.lang.String pc1Central;

    private java.lang.String pc2Siglas;

    private java.lang.String pc2Central;

    private com.frida.www.Said.Centrales[] central;

    public Regiones() {
    }

    public Regiones(
           java.lang.String idRegion,
           java.lang.String pc1Siglas,
           java.lang.String pc1Central,
           java.lang.String pc2Siglas,
           java.lang.String pc2Central,
           com.frida.www.Said.Centrales[] central) {
           this.idRegion = idRegion;
           this.pc1Siglas = pc1Siglas;
           this.pc1Central = pc1Central;
           this.pc2Siglas = pc2Siglas;
           this.pc2Central = pc2Central;
           this.central = central;
    }


    /**
     * Gets the idRegion value for this Regiones.
     * 
     * @return idRegion
     */
    public java.lang.String getIdRegion() {
        return idRegion;
    }


    /**
     * Sets the idRegion value for this Regiones.
     * 
     * @param idRegion
     */
    public void setIdRegion(java.lang.String idRegion) {
        this.idRegion = idRegion;
    }


    /**
     * Gets the pc1Siglas value for this Regiones.
     * 
     * @return pc1Siglas
     */
    public java.lang.String getPc1Siglas() {
        return pc1Siglas;
    }


    /**
     * Sets the pc1Siglas value for this Regiones.
     * 
     * @param pc1Siglas
     */
    public void setPc1Siglas(java.lang.String pc1Siglas) {
        this.pc1Siglas = pc1Siglas;
    }


    /**
     * Gets the pc1Central value for this Regiones.
     * 
     * @return pc1Central
     */
    public java.lang.String getPc1Central() {
        return pc1Central;
    }


    /**
     * Sets the pc1Central value for this Regiones.
     * 
     * @param pc1Central
     */
    public void setPc1Central(java.lang.String pc1Central) {
        this.pc1Central = pc1Central;
    }


    /**
     * Gets the pc2Siglas value for this Regiones.
     * 
     * @return pc2Siglas
     */
    public java.lang.String getPc2Siglas() {
        return pc2Siglas;
    }


    /**
     * Sets the pc2Siglas value for this Regiones.
     * 
     * @param pc2Siglas
     */
    public void setPc2Siglas(java.lang.String pc2Siglas) {
        this.pc2Siglas = pc2Siglas;
    }


    /**
     * Gets the pc2Central value for this Regiones.
     * 
     * @return pc2Central
     */
    public java.lang.String getPc2Central() {
        return pc2Central;
    }


    /**
     * Sets the pc2Central value for this Regiones.
     * 
     * @param pc2Central
     */
    public void setPc2Central(java.lang.String pc2Central) {
        this.pc2Central = pc2Central;
    }


    /**
     * Gets the central value for this Regiones.
     * 
     * @return central
     */
    public com.frida.www.Said.Centrales[] getCentral() {
        return central;
    }


    /**
     * Sets the central value for this Regiones.
     * 
     * @param central
     */
    public void setCentral(com.frida.www.Said.Centrales[] central) {
        this.central = central;
    }

    public com.frida.www.Said.Centrales getCentral(int i) {
        return this.central[i];
    }

    public void setCentral(int i, com.frida.www.Said.Centrales _value) {
        this.central[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Regiones)) return false;
        Regiones other = (Regiones) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idRegion==null && other.getIdRegion()==null) || 
             (this.idRegion!=null &&
              this.idRegion.equals(other.getIdRegion()))) &&
            ((this.pc1Siglas==null && other.getPc1Siglas()==null) || 
             (this.pc1Siglas!=null &&
              this.pc1Siglas.equals(other.getPc1Siglas()))) &&
            ((this.pc1Central==null && other.getPc1Central()==null) || 
             (this.pc1Central!=null &&
              this.pc1Central.equals(other.getPc1Central()))) &&
            ((this.pc2Siglas==null && other.getPc2Siglas()==null) || 
             (this.pc2Siglas!=null &&
              this.pc2Siglas.equals(other.getPc2Siglas()))) &&
            ((this.pc2Central==null && other.getPc2Central()==null) || 
             (this.pc2Central!=null &&
              this.pc2Central.equals(other.getPc2Central()))) &&
            ((this.central==null && other.getCentral()==null) || 
             (this.central!=null &&
              java.util.Arrays.equals(this.central, other.getCentral())));
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
        if (getIdRegion() != null) {
            _hashCode += getIdRegion().hashCode();
        }
        if (getPc1Siglas() != null) {
            _hashCode += getPc1Siglas().hashCode();
        }
        if (getPc1Central() != null) {
            _hashCode += getPc1Central().hashCode();
        }
        if (getPc2Siglas() != null) {
            _hashCode += getPc2Siglas().hashCode();
        }
        if (getPc2Central() != null) {
            _hashCode += getPc2Central().hashCode();
        }
        if (getCentral() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCentral());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCentral(), i);
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
        new org.apache.axis.description.TypeDesc(Regiones.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "regiones"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc1Siglas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pc1Siglas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc1Central");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pc1Central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc2Siglas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pc2Siglas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pc2Central");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pc2Central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("central");
        elemField.setXmlName(new javax.xml.namespace.QName("", "central"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "centrales"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
