package br.com.solimar.sidosp.m2.service;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.solimar.sidosp.core.domain.Coleta;
import br.com.solimar.sidosp.core.domain.Doador;

@Path("/coleta")
public class ColetaService {

	@POST
	@Path("/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response insert(ColetaWrapper coletaWrapper) throws URISyntaxException {


		Coleta coleta = coletaWrapper.getColeta();
		System.out.println("OK "+coleta.getExames().get(0).getNome());
		
		
		return Response.status(200).build();
	}

}
