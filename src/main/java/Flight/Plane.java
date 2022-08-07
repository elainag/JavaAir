package Flight;

public class Plane {

    private int capacity;
    private int totalWeight;
    private PlaneType planeType;

    public Plane(int capacity, int totalWeight, PlaneType planeType) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.planeType = planeType;
    }
    public PlaneType canGetPlane() {
        return planeType;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getTotalWeight() {
        return totalWeight;
    }
}
