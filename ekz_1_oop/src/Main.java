public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 120, "Petrol", 450);
        Bike bike = new Bike("Mountain Bike", 30, "None", 2);
        Truck truck = new Truck("Freightliner", 80, "Diesel", 15);

        
        System.out.println("Car travel time for 240 km: " + car.calculateTravelTime(240) + " hours");
        System.out.println("Bike travel time for 30 km: " + bike.calculateTravelTime(30) + " hours");
        System.out.println("Truck travel time for 500 km: " + truck.calculateTravelTime(500) + " hours");

        
        System.out.println("Car needs service: " + car.needsService());
        System.out.println("Bike needs service: " + bike.needsService());
        System.out.println("Truck needs service: " + truck.needsService());
    }
}