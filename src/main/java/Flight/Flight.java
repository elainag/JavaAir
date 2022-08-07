package Flight;

import Person.CabinCrewMember;
import Person.Passenger;
import Person.Pilot;

import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departing;
    private String departureTime;

    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String departing, String departureTime
    ) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departing = departing;
        this.departureTime = departureTime;
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getDestination() {
        return destination;
    }
    public String getDeparting() {
        return departing;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public int getCabinCrew(){
        return cabinCrew.size();
    }
    public void addCabinCrew(CabinCrewMember cabinCrew) {
       this.cabinCrew.add(cabinCrew);
    }
    public int getPassengersCount() {
        return passengers.size();
    }
    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
