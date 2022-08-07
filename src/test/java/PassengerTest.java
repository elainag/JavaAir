import Person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
     Passenger passenger;

     @Before
    public void before() {
         passenger = new Passenger("Elaina", 2);
     }

     @Test
    public void canGetName(){
         assertEquals("Elaina", passenger.getName());
     }

     @Test
    public void canGetNumBags(){
         assertEquals(2, passenger.getNumBags());
     }



}
