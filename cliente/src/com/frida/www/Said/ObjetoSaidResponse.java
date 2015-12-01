/**
 * ObjetoSaidResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.frida.www.Said;

public class ObjetoSaidResponse  implements java.io.Serializable {
    private com.frida.www.Said.ObjectSc objSc;

    public ObjetoSaidResponse() {
    }

    public ObjetoSaidResponse(
           com.frida.www.Said.ObjectSc objSc) {
           this.objSc = objSc;
    }


    /**
     * Gets the objSc value for this ObjetoSaidResponse.
     * 
     * @return objSc
     */
    public com.frida.www.Said.ObjectSc getObjSc() {
        return objSc;
    }


    /**
     * Sets the objSc value for this ObjetoSaidResponse.
     * 
     * @param objSc
     */
    public void setObjSc(com.frida.www.Said.ObjectSc objSc) {
        this.objSc = objSc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoSaidResponse)) return false;
        ObjetoSaidResponse other = (ObjetoSaidResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objSc==null && other.getObjSc()==null) || 
             (this.objSc!=null &&
              this.objSc.equals(other.getObjSc())));
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
        if (getObjSc() != null) {
            _hashCode += getObjSc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoSaidResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", ">objetoSaidResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.frida.com/Said", "objectSc"));
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
