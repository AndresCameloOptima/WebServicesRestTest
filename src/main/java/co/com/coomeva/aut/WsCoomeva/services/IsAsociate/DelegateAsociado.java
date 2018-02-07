/**
 * DelegateAsociado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.coomeva.aut.WsCoomeva.services.IsAsociate;

public interface DelegateAsociado extends java.rmi.Remote {
    public boolean exists(java.lang.String id) throws java.rmi.RemoteException;
    public model.logic.bussiness.coomeva.com.co.Asociado consultarDatosBasicos(model.logic.bussiness.coomeva.com.co.Asociado o) throws java.rmi.RemoteException;
    public model.logic.bussiness.coomeva.com.co.CupoTarjeta consultarCupo(model.logic.bussiness.coomeva.com.co.CupoTarjeta o) throws java.rmi.RemoteException;
    public model.logic.bussiness.coomeva.com.co.DatosAsociado consultarAsociado(model.logic.bussiness.coomeva.com.co.DatosAsociado o) throws java.rmi.RemoteException;
    public model.logic.bussiness.coomeva.com.co.DatosAsociado consultarAsociadoMultiactiva(model.logic.bussiness.coomeva.com.co.DatosAsociado o) throws java.rmi.RemoteException;
}
