import Flight.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(5,200);
    }
    @Test
    public void canGetCapacity(){
        assertEquals(5, plane.getCapacity());
    }
    @Test
    public void canGetTotalWeight(){
        assertEquals(200, plane.getTotalWeight());
    }

}
