class Car extends Vehicle {
    private double trunkCapacity;

    public Car(String name, double speed, String fuelType, double trunkCapacity) {
        super(name, speed, fuelType);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public boolean needsService() {
        return trunkCapacity < 400; 
    }
}