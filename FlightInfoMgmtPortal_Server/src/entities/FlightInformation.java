package entities;

import java.io.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "flightInformation")
public class FlightInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String originAirport;
	private String destinationAirport;
	private String departureTime;
	private String arrivalTime;
	private String flightNumber;
	private String carrierName;
	

	public FlightInformation() {
		super();
	}

	public FlightInformation(String id, String originAirport, String destinationAirport, String departureTime, String arrivalTime,
			String flightNumber, String carrierName) {
		super();
		this.id = id;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightNumber = flightNumber;
		this.carrierName = carrierName;
	}
	
	@XmlElement
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	@XmlElement
	public String getOriginAirport() {
		return originAirport;
	}
	public void setOriginAirport(String originAirport) {
		this.originAirport = originAirport;
	}	
	@XmlElement
	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	@XmlElement
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	@XmlElement
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@XmlElement
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	@XmlElement
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}	
}