public class Passenger {
    private String name;
    private Integer bags;

    public Passenger(String name, Integer bags){
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return this.name;
    }

    public int getBagCount() {
        return this.bags;
    }
}
