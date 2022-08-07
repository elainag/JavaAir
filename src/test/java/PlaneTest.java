import Flight.Plane;
import Flight.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(5,200, PlaneType.Concorde);
    }
    @Test
    public void canGetCapacity(){
        assertEquals(5, plane.getCapacity());
    }
    @Test
    public void canGetTotalWeight(){
        assertEquals(200, plane.getTotalWeight());
    }
    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.Concorde, plane.canGetPlane());
    }

}
