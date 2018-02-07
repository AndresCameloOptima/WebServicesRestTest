package co.coomeva.wsresttest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import model.logic.bussiness.coomeva.com.co.Asociado;
import model.logic.bussiness.coomeva.com.co.DatosAsociado;

@Path("/isAsociado")
public class ServicioAsociado {

	@GET
	@Path("/datosBasicosAsociado")
	@Produces({MediaType.APPLICATION_JSON})
	public Asociado consultaDatosBasicoAsociado(@QueryParam("id") String id){
		AsociadoController client = new AsociadoController();
		  Asociado asociado = null;
		try {
			if (!(id == null || id.isEmpty())) {
			 asociado = client.getDatosBasicos(id);
			 System.out.println("" +asociado.getFullName());
			}
		} catch (Exception e) {
		   e.printStackTrace();
		}
		 
		return asociado;
	}
	
	@GET
	@Path("/consultaAsociado")
	@Produces({MediaType.APPLICATION_JSON})
	public DatosAsociado consultaAsociado(@QueryParam("id") String id){
		AsociadoController client = new AsociadoController();
		DatosAsociado asociado = null;
		try {
			if (!(id == null || id.isEmpty())) {
			 asociado = client.consultaAsociado(id);
			 System.out.println("" +asociado.getNombre());
			}
		} catch (Exception e) {
		   e.printStackTrace();
		}
		 
		return asociado;
	}
	
}
