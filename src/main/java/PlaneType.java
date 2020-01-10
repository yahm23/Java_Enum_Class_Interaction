public enum PlaneType {
    BOEING747(200,100),
    APACHE(4,30),
    JET(10,60);


private final int capacity;
private final int weight;

PlaneType(int capacity,int weight){
    this.capacity =capacity;
    this.weight = weight;
}

public int getCapacity(){
    return this.capacity;
}

public int getWeight() {
    return this.weight;
}



}
