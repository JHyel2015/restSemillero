package com.clearminds.rjhg.servicios;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.rjhg.dtos.Estudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		System.out.println("Rest insertar: " + estudiante);
	}
}
