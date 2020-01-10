import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlaneTest {
    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.APACHE);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, plane.getCapacity());
    }

    @Test
    public void canGetWeight(){
        assertEquals(30, plane.getWeight());
    }

    @Test
    public void canReduceCapacity(){
        plane.reduceCapacity(1);
        assertEquals(3,plane.getCapacity());
    }




}
