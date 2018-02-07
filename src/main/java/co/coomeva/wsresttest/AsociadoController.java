package co.coomeva.wsresttest;

import javax.xml.rpc.Stub;

import co.com.coomeva.aut.WsCoomeva.services.IsAsociate.DelegateAsociadoServiceLocator;
import co.com.coomeva.aut.WsCoomeva.services.IsAsociate.IsAsociateSoapBindingStub;
import model.logic.bussiness.coomeva.com.co.Asociado;
import model.logic.bussiness.coomeva.com.co.DatosAsociado;

public class AsociadoController {

  IsAsociateSoapBindingStub stub;
  
  public AsociadoController (){
	  try {
	       DelegateAsociadoServiceLocator asociadoServiceLocator = new DelegateAsociadoServiceLocator();
	       stub = (IsAsociateSoapBindingStub)asociadoServiceLocator.getIsAsociate(); 
  	} catch (Exception e) {
     e.printStackTrace();
	}
  }  
	
  public Asociado getDatosBasicos(String id) throws Exception{
		 Asociado asociado = new Asociado();
         asociado.setFullName("");
         asociado.setId(id);
         asociado.setName("");
         asociado.setOfficesCity("");
         asociado.setOfficesCod("");
         asociado.setOfficesNom("");
         asociado.setSurName("");
       
	   return stub.consultarDatosBasicos(asociado);
	 }
  
  
  public DatosAsociado consultaAsociado(String id) throws Exception{
	  DatosAsociado datosAsociado = new DatosAsociado();
	  datosAsociado.setId(id);
	  return stub.consultarAsociado(datosAsociado);
  }
  
  
  public static void main(String[] args) {
	  try {
		  AsociadoController client = new AsociadoController();
		  Asociado a=  client.getDatosBasicos("79854772");
		  System.out.println("" +a.getFullName());
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
	

} 
