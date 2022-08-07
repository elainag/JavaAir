import Person.Pilot;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    Rank rank;

    @Before
    public void before(){
        pilot = new Pilot("Mary", "s12345", Rank.Captain);
    }

    @Test
    public void getPilotName(){
        assertEquals("Mary", pilot.getName());
    }

    @Test
    public void getPilotLicenseNumber(){
        assertEquals("s12345", pilot.getLicenseNumber());
    }
    @Test
    public void getPilotRank(){
        assertEquals(Rank.Captain, pilot.getRank());
    }
}
