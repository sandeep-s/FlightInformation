package ws;

import entities.*;
import java.util.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import model.*;

@Path("flightinfo") 
public class FlightInformationRestful {
	
	@GET
	@Path("/findall")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		FlightInfoModel fim = new FlightInfoModel();
		return Response
				.ok()
				.entity(new GenericEntity<List<Flightinfo>>(fim.findAll() {
				})
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Methods",
						"GET,POST, PUT, DELETE, OPTIONS, HEAD").build();
		
	}
	
	@GET
	@Path("/find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response find(@PathParam(value = "id") String id) {
		FlightInfoModel fim = new FlightInfoModel();
		FlightInfo fm = fim.find(Integer.valueOf(id));
		if(fm == null)
			return null;
		return Response
				.ok()
				.entity(new GenericEntity<List<Flightinfo>>(fim.findAll() {
				})
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Methods",
						"GET,POST, PUT, DELETE, OPTIONS, HEAD").build();
		
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Flightinfo fm) {
		FlightInfoModel fim = new FlightInfoModel();
		fim.create(fm);		
		return Response
				.ok()
				.entity(new GenericEntity<List<Flightinfo>>(fim.findAll() {
				})
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Methods",
						"GET,POST, PUT, DELETE, OPTIONS, HEAD").build();
		
	}
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam(value = "id") String id) {
		FlightInfoModel fim = new FlightInfoModel();
		fim.delete(fim.find(Integer.valueOf(id)));
		if(fm == null)
			return null;
		return Response
				.ok()
				.entity(new GenericEntity<List<Flightinfo>>(fim.findAll() {
				})
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Methods",
						"GET,POST, PUT, DELETE, OPTIONS, HEAD").build();
		
	}
	
	@PUT
	@Path("/edit")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response edit(Flightinfo fm) {
		FlightInfoModel fim = new FlightInfoModel();
		fim.update(fm);		
		return Response
				.ok()
				.entity(new GenericEntity<List<Flightinfo>>(fim.findAll() {
				})
				.header("Access-Control-Allow-Origin","*")
				.header("Access-Control-Allow-Methods",
						"GET,POST, PUT, DELETE, OPTIONS, HEAD").build();
		
	}
}