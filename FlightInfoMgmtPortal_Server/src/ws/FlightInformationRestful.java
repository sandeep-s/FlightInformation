package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.FlightInformation;

@Path("flightInformation")

public class FlightInformationRestful {
	
	@GET
	@Path("findall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FlightInformation> findAll() {
		List<FlightInformation> result = new ArrayList<FlightInformation>();
		result.add(new FlightInformation("1","MAS", "AMS","03:00", "05:00", "6E344", "Indigo"));
		result.add(new FlightInformation("2","AMS", "MAS","13:00", "05:00", "6E345", "KLM"));
		result.add(new FlightInformation("3","BOM", "MAS","03:00", "15:00", "6E346", "SpiceJet"));
		result.add(new FlightInformation("4","DEL", "HYD","13:00", "15:00", "6E347", "Emirates"));
		result.add(new FlightInformation("5","HYD", "AMS","23:00", "01:00", "6E348", "AirIndia"));
		return result;
	}	
}