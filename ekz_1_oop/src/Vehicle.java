class Vehicle {
    protected String name;
    protected double speed;
    protected String fuelType;

    public Vehicle(String name, double speed, String fuelType) {
        this.name = name;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public double calculateTravelTime(double distance) {
        return distance / speed;
    }

    public boolean needsService() {
        return false; 
    }
}
