/**
 * Region.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class Region  implements java.io.Serializable {
    private java.lang.String idRegion;

    private java.lang.String pc1Siglas;

    private java.lang.String pc1Central;

    private java.lang.String pc2Siglas;

    private java.lang.String pc2Central;

    private com.frida.www.Said.Pcai[][] puertos1G;

    private com.frida.www.Said.Pcai[][] puertos10G;

    public Region() {
    }

    public Region(
           java.lang.String idRegion,
           java.lang.String pc1Siglas,
           java.lang.String pc1Central,
           java.lang.String pc2Siglas,
           java.lang.String pc2Central,
           com.frida.www.Said.Pcai[][] puertos1G,
           com.frida.www.Said.Pcai[][] puertos10G) {
           this.idRegion = idRegion;
           this.pc1Siglas = pc1Siglas;
           this.pc1Central = pc1Central;
           this.pc2Siglas = pc2Siglas;
           this.pc2Central = pc2Central;
           this.puertos1G = puertos1G;
           this.puertos10G = puertos10G;
    }


    /**
     * Gets the idRegion value for this Region.
     * 
     * @return idRegion
     */
    public java.lang.String getIdRegion() {
        return idRegion;
    }


    /**
     * Sets the idRegion value for this Region.
     * 
     * @param idRegion
     */
    public void setIdRegion(java.lang.String idRegion) {
        this.idRegion = idRegion;
    }


    /**
     * Gets the pc1Siglas value for this Region.
     * 
     * @return pc1Siglas
     */
    public java.lang.String getPc1Siglas() {
        return pc1Siglas;
    }


    /**
     * Sets the pc1Siglas value for this Region.
     * 
     * @param pc1Siglas
     */
    public void setPc1Siglas(java.lang.String pc1Siglas) {
        this.pc1Siglas = pc1Siglas;
    }


    /**
     * Gets the pc1Central value for this Region.
     * 
     * @return pc1Central
     */
    public java.lang.String getPc1Central() {
        return pc1Central;
    }


    /**
     * Sets the pc1Central value for this Region.
     * 
     * @param pc1Central
     */
    public void setPc1Central(java.lang.String pc1Central) {
        this.pc1Central = pc1Central;
    }


    /**
     * Gets the pc2Siglas value for this Region.
     * 
     * @return pc2Siglas
     */
    public java.lang.String getPc2Siglas() {
        return pc2Siglas;
    }


    /**
     * Sets the pc2Siglas value for this Region.
     * 
     * @param pc2Siglas
     */
    public void setPc2Siglas(java.lang.String pc2Siglas) {
        this.pc2Siglas = pc2Siglas;
    }


    /**
     * Gets the pc2Central value for this Region.
     * 
     * @return pc2Central
     */
    public java.lang.String getPc2Central() {
        return pc2Central;
    }


    /**
     * Sets the pc2Central value for this Region.
     * 
     * @param pc2Central
     */
    public void setPc2Central(java.lang.String pc2Central) {
        this.pc2Central = pc2Central;
    }


    /**
     * Gets the puertos1G value for this Region.
     * 
     * @return puertos1G
     */
    public com.frida.www.Said.Pcai[][] getPuertos1G() {
        return puertos1G;
    }


    /**
     * Sets the puertos1G value for this Region.
     * 
     * @param puertos1G
     */
    public void setPuertos1G(com.frida.www.Said.Pcai[][] puertos1G) {
        this.puertos1G = puertos1G;
    }

    public com.frida.www.Said.Pcai[] getPuertos1G(int i) {
        return this.puertos1G[i];
    }

    public void setPuertos1G(int i, com.frida.www.Said.Pcai[] _value) {
        this.puertos1G[i] = _value;
    }


    /**
     * Gets the puertos10G value for this Region.
     * 
     * @return puertos10G
     */
    public com.frida.www.Said.Pcai[][] getPuertos10G() {
        return puertos10G;
    }


    /**
     * Sets the puertos10G value for this Region.
     * 
     * @param puertos10G
     */
    public void setPuertos10G(com.frida.www.Said.Pcai[][] puertos10G) {
        this.puertos10G = puertos10G;
    }

    public com.frida.www.Said.Pcai[] getPuertos10G(int i) {
        return this.puertos10G[i];
    }

    public void setPuertos10G(int i, com.frida.www.Said.Pcai[] _value) {
        this.puertos10G[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Region)) return false;
        Region other = (Region) obj;
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
            ((this.puertos1G==null && other.getPuertos1G()==null) || 
             (this.puertos1G!=null &&
              java.util.Arrays.equals(this.puertos1G, other.getPuertos1G()))) &&
            ((this.puertos10G==null && other.getPuertos10G()==null) || 
             (this.puertos10G!=null &&
              java.util.Arrays.equals(this.puertos10G, other.getPuertos10G())));
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
        if (getPuertos1G() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPuertos1G());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPuertos1G(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPuertos10G() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPuertos10G());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPuertos10G(), i);
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
        new org.apache.axis.description.TypeDesc(Region.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "Region"));
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
        elemField.setFieldName("puertos1G");
        elemField.setXmlName(new javax.xml.namespace.QName("", "puertos1G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "puertos1G"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("puertos10G");
        elemField.setXmlName(new javax.xml.namespace.QName("", "puertos10G"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "puertos10G"));
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
