public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }


    public double passengerBaggageAllowance() {
        Plane plane = this.flight.returnPlane();
        double weight = new Double(plane.getWeight());
        double capacity = new Double(plane.getCapacity());
        double value = weight/capacity;
        return value;
    }
}
