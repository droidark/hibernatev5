package com.frida.www.Said;

public class SaidServicioProxy implements com.frida.www.Said.SaidServicio_PortType {
  private String _endpoint = null;
  private com.frida.www.Said.SaidServicio_PortType saidServicio_PortType = null;
  
  public SaidServicioProxy() {
    _initSaidServicioProxy();
  }
  
  public SaidServicioProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaidServicioProxy();
  }
  
  private void _initSaidServicioProxy() {
    try {
      saidServicio_PortType = (new com.frida.www.Said.SaidServicio_ServiceLocator()).getSaidServicioSoap11();
      if (saidServicio_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saidServicio_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saidServicio_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saidServicio_PortType != null)
      ((javax.xml.rpc.Stub)saidServicio_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.frida.www.Said.SaidServicio_PortType getSaidServicio_PortType() {
    if (saidServicio_PortType == null)
      _initSaidServicioProxy();
    return saidServicio_PortType;
  }
  
  public com.frida.www.Said.ObjetoSaidConsultaContratacionColoniaResponse objetoSaidConsultaContratacionColonia(com.frida.www.Said.ObjetoSaidConsultaContratacionColoniaRequest objetoSaidConsultaContratacionColoniaRequest) throws java.rmi.RemoteException{
    if (saidServicio_PortType == null)
      _initSaidServicioProxy();
    return saidServicio_PortType.objetoSaidConsultaContratacionColonia(objetoSaidConsultaContratacionColoniaRequest);
  }
  
  public com.frida.www.Said.ObjetoSaidResponse objetoSaid(com.frida.www.Said.ObjetoSaidRequest objetoSaidRequest) throws java.rmi.RemoteException{
    if (saidServicio_PortType == null)
      _initSaidServicioProxy();
    return saidServicio_PortType.objetoSaid(objetoSaidRequest);
  }
  
  
}