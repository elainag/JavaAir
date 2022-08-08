import Flight.Plane;
import Flight.Flight;
import Person.CabinCrewMember;
import Person.Pilot;
import Person.Passenger;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrew1;
    CabinCrewMember cabinCrew2;
    CabinCrewMember cabinCrew3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;


    @Before
    public void before(){
        ArrayList<CabinCrewMember> cabinCrew = new ArrayList<>();
        cabinCrew1 = new CabinCrewMember("Sid", Rank.FlightAttendant);
        cabinCrew2 = new CabinCrewMember("Jan", Rank.FlightAttendant);
        cabinCrew3 = new CabinCrewMember("Amy", Rank.FlightAttendant);
        cabinCrew.add(cabinCrew1);
        cabinCrew.add(cabinCrew2);
        cabinCrew.add(cabinCrew3);
        ArrayList<Passenger> passengers = new ArrayList<>();
        passenger1 = new Passenger("Sue", 2);
        passenger1 = new Passenger("Tom", 1);
        passenger1 = new Passenger("Ellie", 3);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        flight = new Flight("FN123", "Heathrow", "Edinburgh", "22:00");
        }





    @Test
    public void canGetFlightNumber(){
        assertEquals("FN123", flight.getFlightNumber());
    }
    @Test
    public void canGetDestination(){
        assertEquals("Heathrow", flight.getDestination());
    }
    @Test
    public void canGetDeparting(){
        assertEquals("Edinburgh", flight.getDeparting());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("22:00", flight.getDepartureTime());
    }
    @Test
    public void canConfirmNoCabinCrewAssignedToFlight(){
        assertEquals(0, flight.getCabinCrew());
    }
    @Test
    public void canAddCabinCrewToFlight(){
       flight.addCabinCrew(cabinCrew2);
        assertEquals(1,flight.getCabinCrew());
    }
    @Test
    public void getPassengerCount(){
        assertEquals(0, flight.getPassengersCount());
    }
    @Test
    public void canAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengersCount());
    }


}
