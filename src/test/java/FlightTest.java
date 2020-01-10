import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;

public class FlightTest {
    Flight flight;
    Plane plane;

    Passenger passenger1;
    Passenger passenger2;

    FlightManager flightMNGR;



    @Before
    public void setUp(){
        plane = new Plane(PlaneType.APACHE);
        flight = new Flight("ABC123",plane,"EDI","LDN","16:00");

        flightMNGR = new FlightManager(flight);
    }

    @Test
    public void startsWithN0passengers(){
        assertEquals(0,flight.countPassengers());

    }

    @Test
    public void getAvailableSeats(){
        assertEquals(4,flight.getSeats());
    }

    @Test
    public void bookAPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(1,flight.countPassengers());
        assertEquals(3,flight.getSeats());
    }

//
//    @Test
//    public void allPassengersReturned
//
//






}
