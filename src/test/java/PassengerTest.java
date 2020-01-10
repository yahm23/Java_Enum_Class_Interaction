import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PassengerTest {
    Passenger passenger1;


    @Before
    public void setup(){
        passenger1 = new Passenger("Yousef",2);
    }


    @Test
    public void hasName(){
        assertEquals("Yousef", passenger1.getName());
    }

    @Test
    public void correctBags(){
        assertEquals(2, passenger1.getBagCount());
    }




}
