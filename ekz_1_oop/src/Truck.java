class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, double speed, String fuelType, double loadCapacity) {
        super(name, speed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean needsService() {
        return loadCapacity > 20; 
    }
}