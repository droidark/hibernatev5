/**
 * ObjetoSaidConsultaContratacionColoniaRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class ObjetoSaidConsultaContratacionColoniaRequest  implements java.io.Serializable {
    private com.frida.www.Said.SolicitudColonia consulContrata;

    public ObjetoSaidConsultaContratacionColoniaRequest() {
    }

    public ObjetoSaidConsultaContratacionColoniaRequest(
           com.frida.www.Said.SolicitudColonia consulContrata) {
           this.consulContrata = consulContrata;
    }


    /**
     * Gets the consulContrata value for this ObjetoSaidConsultaContratacionColoniaRequest.
     * 
     * @return consulContrata
     */
    public com.frida.www.Said.SolicitudColonia getConsulContrata() {
        return consulContrata;
    }


    /**
     * Sets the consulContrata value for this ObjetoSaidConsultaContratacionColoniaRequest.
     * 
     * @param consulContrata
     */
    public void setConsulContrata(com.frida.www.Said.SolicitudColonia consulContrata) {
        this.consulContrata = consulContrata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoSaidConsultaContratacionColoniaRequest)) return false;
        ObjetoSaidConsultaContratacionColoniaRequest other = (ObjetoSaidConsultaContratacionColoniaRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consulContrata==null && other.getConsulContrata()==null) || 
             (this.consulContrata!=null &&
              this.consulContrata.equals(other.getConsulContrata())));
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
        if (getConsulContrata() != null) {
            _hashCode += getConsulContrata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoSaidConsultaContratacionColoniaRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", ">objetoSaidConsultaContratacionColoniaRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consulContrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consulContrata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "solicitudColonia"));
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
