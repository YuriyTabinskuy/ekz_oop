class Bike extends Vehicle {
    private int numWheels;

    public Bike(String name, double speed, String fuelType, int numWheels) {
        super(name, speed, fuelType);
        this.numWheels = numWheels;
    }

    @Override
    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    @Override
    public boolean needsService() {
        return numWheels != 2; 
    }
}