package br.com.solimar.sidosp.m2.service;

import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.solimar.sidosp.m2.business.ColetaBC;
import br.com.solimar.sidosp.m2.domain.Coleta;

@Path("/coleta")
public class ColetaService {
	
	@Inject
	private ColetaBC coletaBC;
	

	@POST
	@Path("/")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response insert(Coleta coleta) throws URISyntaxException {

		coletaBC.insert(coleta);
				
		return Response.status(200).build();
	}

	
	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON})
	public Response getColeta(@PathParam("id") Long num) {
		
		Coleta coleta = coletaBC.find(num);
		System.out.println("Coleta "+coleta.getData());
		return Response.status(200).entity(coleta).build();

	}
}
