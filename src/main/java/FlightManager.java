import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private Double startCapacity;

    public FlightManager(Flight flight){
        this.flight = flight;
        startCapacity = new Double(flight.returnPlane().returnPlaneType().getCapacity());
    }


    public double passengerBaggageAllowance() {
        Plane plane = this.flight.returnPlane();
        double weight = new Double(plane.getWeight());
//        double capacity = new Double(plane.getCapacity());
        double value = weight/startCapacity;
        return value;
    }

    public int getTotBaggageWeight() {
        ArrayList<Passenger> list = this.flight.returnPassengerList();
        int total=0;
        for (Passenger passenger:list){

            total += passenger.getBagCount();
        }
        return total;
    }
}
