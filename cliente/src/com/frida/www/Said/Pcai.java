/**
 * Pcai.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class Pcai  implements java.io.Serializable {
    private java.lang.String folioPcai;

    private com.frida.www.Said.Ncai[] ncai;

    public Pcai() {
    }

    public Pcai(
           java.lang.String folioPcai,
           com.frida.www.Said.Ncai[] ncai) {
           this.folioPcai = folioPcai;
           this.ncai = ncai;
    }


    /**
     * Gets the folioPcai value for this Pcai.
     * 
     * @return folioPcai
     */
    public java.lang.String getFolioPcai() {
        return folioPcai;
    }


    /**
     * Sets the folioPcai value for this Pcai.
     * 
     * @param folioPcai
     */
    public void setFolioPcai(java.lang.String folioPcai) {
        this.folioPcai = folioPcai;
    }


    /**
     * Gets the ncai value for this Pcai.
     * 
     * @return ncai
     */
    public com.frida.www.Said.Ncai[] getNcai() {
        return ncai;
    }


    /**
     * Sets the ncai value for this Pcai.
     * 
     * @param ncai
     */
    public void setNcai(com.frida.www.Said.Ncai[] ncai) {
        this.ncai = ncai;
    }

    public com.frida.www.Said.Ncai getNcai(int i) {
        return this.ncai[i];
    }

    public void setNcai(int i, com.frida.www.Said.Ncai _value) {
        this.ncai[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pcai)) return false;
        Pcai other = (Pcai) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folioPcai==null && other.getFolioPcai()==null) || 
             (this.folioPcai!=null &&
              this.folioPcai.equals(other.getFolioPcai()))) &&
            ((this.ncai==null && other.getNcai()==null) || 
             (this.ncai!=null &&
              java.util.Arrays.equals(this.ncai, other.getNcai())));
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
        if (getFolioPcai() != null) {
            _hashCode += getFolioPcai().hashCode();
        }
        if (getNcai() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNcai());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNcai(), i);
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
        new org.apache.axis.description.TypeDesc(Pcai.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "pcai"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folioPcai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folioPcai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ncai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ncai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "ncai"));
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
