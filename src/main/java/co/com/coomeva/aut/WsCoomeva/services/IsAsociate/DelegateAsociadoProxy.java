package co.com.coomeva.aut.WsCoomeva.services.IsAsociate;

public class DelegateAsociadoProxy implements co.com.coomeva.aut.WsCoomeva.services.IsAsociate.DelegateAsociado {
  private String _endpoint = null;
  private co.com.coomeva.aut.WsCoomeva.services.IsAsociate.DelegateAsociado delegateAsociado = null;
  
  public DelegateAsociadoProxy() {
    _initDelegateAsociadoProxy();
  }
  
  public DelegateAsociadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDelegateAsociadoProxy();
  }
  
  private void _initDelegateAsociadoProxy() {
    try {
      delegateAsociado = (new co.com.coomeva.aut.WsCoomeva.services.IsAsociate.DelegateAsociadoServiceLocator()).getIsAsociate();
      if (delegateAsociado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)delegateAsociado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)delegateAsociado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (delegateAsociado != null)
      ((javax.xml.rpc.Stub)delegateAsociado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.coomeva.aut.WsCoomeva.services.IsAsociate.DelegateAsociado getDelegateAsociado() {
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado;
  }
  
  public boolean exists(java.lang.String id) throws java.rmi.RemoteException{
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado.exists(id);
  }
  
  public model.logic.bussiness.coomeva.com.co.Asociado consultarDatosBasicos(model.logic.bussiness.coomeva.com.co.Asociado o) throws java.rmi.RemoteException{
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado.consultarDatosBasicos(o);
  }
  
  public model.logic.bussiness.coomeva.com.co.CupoTarjeta consultarCupo(model.logic.bussiness.coomeva.com.co.CupoTarjeta o) throws java.rmi.RemoteException{
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado.consultarCupo(o);
  }
  
  public model.logic.bussiness.coomeva.com.co.DatosAsociado consultarAsociado(model.logic.bussiness.coomeva.com.co.DatosAsociado o) throws java.rmi.RemoteException{
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado.consultarAsociado(o);
  }
  
  public model.logic.bussiness.coomeva.com.co.DatosAsociado consultarAsociadoMultiactiva(model.logic.bussiness.coomeva.com.co.DatosAsociado o) throws java.rmi.RemoteException{
    if (delegateAsociado == null)
      _initDelegateAsociadoProxy();
    return delegateAsociado.consultarAsociadoMultiactiva(o);
  }
  
  
}