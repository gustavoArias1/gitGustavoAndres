/**
 * GestionarComicRest.java
 */
package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author mr-robot
 * @version 
 */
@Path("/GestionarComic")
public class GestionarComicRest {
	@EJB
	private IGestionarComicLocal gestionarComicEJB;
	
	@GET
    @Path("/saludo")
    @Produces
	public String primerRest() {
		return "Prueba inicial servicios rest en el semillero java hbt";
	}
	
	@GET
    @Path("/consultarComic")
    @Produces(MediaType.APPLICATION_JSON)
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		if(idComic!=null) {
			return gestionarComicEJB.consultarComic(idComic.toString());
		}
		
		return null;
	}
}