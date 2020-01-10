import java.util.ArrayList;

public class Flight {
    private String flightNum;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String destination;
    private String departureAP;
    private String departureTime;

    public Flight(String flightNum, Plane plane, String destination, String departureAP, String departureTime){
        this.flightNum = flightNum;
        this.plane = plane;
        this.destination = destination;
        this.departureAP = departureAP;
        this.departureTime = departureTime;

        this.passengers = new ArrayList<Passenger>();
    }


    public int countPassengers() {
        return this.passengers.size();
    }

    public int getSeats() {
        return this.plane.getCapacity();
    }



    public void bookPassenger(Passenger passenger) {
        if(this.plane.getCapacity()>0){
            this.plane.reduceCapacity(1);
            this.passengers.add(passenger);
        }
    }

    public Plane returnPlane(){
        return this.plane;
    }

    public ArrayList<Passenger> returnPassengerList(){
        return this.passengers;
    }
}
