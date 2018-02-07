package co.coomeva.wsresttest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class ApplicationConfig extends  Application{

	@Override
	public Set<Class<?>> getClasses(){
		
		Set<Class<?>> rs = new HashSet<Class<?>>();
		rs.add(ServicioAsociado.class);
		return rs;
		
	}
}
