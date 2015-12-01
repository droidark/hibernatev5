/**
 * ObjetoSaidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class ObjetoSaidRequest  implements java.io.Serializable {
    private com.frida.www.Said.SolicitudPCAI pcai;

    public ObjetoSaidRequest() {
    }

    public ObjetoSaidRequest(
           com.frida.www.Said.SolicitudPCAI pcai) {
           this.pcai = pcai;
    }


    /**
     * Gets the pcai value for this ObjetoSaidRequest.
     * 
     * @return pcai
     */
    public com.frida.www.Said.SolicitudPCAI getPcai() {
        return pcai;
    }


    /**
     * Sets the pcai value for this ObjetoSaidRequest.
     * 
     * @param pcai
     */
    public void setPcai(com.frida.www.Said.SolicitudPCAI pcai) {
        this.pcai = pcai;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoSaidRequest)) return false;
        ObjetoSaidRequest other = (ObjetoSaidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pcai==null && other.getPcai()==null) || 
             (this.pcai!=null &&
              this.pcai.equals(other.getPcai())));
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
        if (getPcai() != null) {
            _hashCode += getPcai().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoSaidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", ">objetoSaidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pcai");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pcai"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "solicitudPCAI"));
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
