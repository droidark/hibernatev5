/**
 * ObjetoSaidConsultaContratacionColoniaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class ObjetoSaidConsultaContratacionColoniaResponse  implements java.io.Serializable {
    private com.frida.www.Said.ConsultaColonia consulContratacion;

    public ObjetoSaidConsultaContratacionColoniaResponse() {
    }

    public ObjetoSaidConsultaContratacionColoniaResponse(
           com.frida.www.Said.ConsultaColonia consulContratacion) {
           this.consulContratacion = consulContratacion;
    }


    /**
     * Gets the consulContratacion value for this ObjetoSaidConsultaContratacionColoniaResponse.
     * 
     * @return consulContratacion
     */
    public com.frida.www.Said.ConsultaColonia getConsulContratacion() {
        return consulContratacion;
    }


    /**
     * Sets the consulContratacion value for this ObjetoSaidConsultaContratacionColoniaResponse.
     * 
     * @param consulContratacion
     */
    public void setConsulContratacion(com.frida.www.Said.ConsultaColonia consulContratacion) {
        this.consulContratacion = consulContratacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoSaidConsultaContratacionColoniaResponse)) return false;
        ObjetoSaidConsultaContratacionColoniaResponse other = (ObjetoSaidConsultaContratacionColoniaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consulContratacion==null && other.getConsulContratacion()==null) || 
             (this.consulContratacion!=null &&
              this.consulContratacion.equals(other.getConsulContratacion())));
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
        if (getConsulContratacion() != null) {
            _hashCode += getConsulContratacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoSaidConsultaContratacionColoniaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", ">objetoSaidConsultaContratacionColoniaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consulContratacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consulContratacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "consultaColonia"));
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
