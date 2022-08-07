import Person.CabinCrewMember;
import Person.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    Rank rank;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("George", Rank.FlightAttendant);
    }
    @Test
    public void canGetName() {
        assertEquals("George", cabinCrewMember.getName());
    }
    @Test
    public void canGetRank(){
        assertEquals(Rank.FlightAttendant, cabinCrewMember.getRank());
    }
}
