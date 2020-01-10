import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class FlightManagerTest {
    Flight flight;
    Plane plane;

    Passenger passenger1;
    Passenger passenger2;

    FlightManager flightMNGR;


    @Before
    public void setUp(){
        plane = new Plane(PlaneType.APACHE);
        flight = new Flight("ABC123",plane,"EDI","LDN","16:00");

        passenger1 = new Passenger("Yousef",2);
        passenger2 = new Passenger("Kendrick",5);

        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);

        flightMNGR = new FlightManager(flight);
    }


    @Test
    public void canCalcAmountofBaggageperPassenger(){
        assertEquals(7.5,flightMNGR.passengerBaggageAllowance(),0.001);
    }

    @Test
    public void  calcTotPasengersBaggageWeight(){
        assertEquals(7, flightMNGR.getTotBaggageWeight());
    }





}
