public class Plane {
    private PlaneType type;
    private Integer planeCapacity;


    public Plane(PlaneType type){
        this.type= type;
        planeCapacity = this.type.getCapacity();
    }

    public int getCapacity() {
        return this.planeCapacity;
    }

    public int getWeight() {
        return this.type.getWeight();
    }

    public void reduceCapacity(int amount) {
        this.planeCapacity -=amount;

    }

    public PlaneType returnPlaneType(){
        return this.type;
    }
}
