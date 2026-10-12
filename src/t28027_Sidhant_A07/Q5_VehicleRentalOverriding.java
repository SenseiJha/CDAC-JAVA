
class Vehicle {
    String vehicleNo;
    String brand;
    double baseRate;

    Vehicle(String vehicleNo, String brand, double baseRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRental() {
        return baseRate;
    }
}

class Car extends Vehicle {
    int numberOfDays;
    double insuranceCharge;

    Car(String vehicleNo, String brand, double baseRate,
        int numberOfDays, double insuranceCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    double calculateRental() {
        return baseRate * numberOfDays + insuranceCharge;
    }
}

class Bike extends Vehicle {
    int numberOfDays;
    double helmetCharge;

    Bike(String vehicleNo, String brand, double baseRate,
         int numberOfDays, double helmetCharge) {
        super(vehicleNo, brand, baseRate);
        this.numberOfDays = numberOfDays;
        this.helmetCharge = helmetCharge;
    }

    @Override
    double calculateRental() {
        return baseRate * numberOfDays + helmetCharge;
    }
}

public class VehicleRentalOverriding {
    public static void main(String[] args) {
        Car car = new Car("KA01AB1234", "Hyundai",
                          2000, 3, 500);

        Bike bike = new Bike("KA02CD5678", "Honda",
                             500, 2, 100);

        System.out.println("Car Rental");
        System.out.println("Vehicle Number: " + car.vehicleNo);
        System.out.println("Brand: " + car.brand);
        System.out.println("Rental Amount: Rs. "
                + car.calculateRental());

        System.out.println("\nBike Rental");
        System.out.println("Vehicle Number: " + bike.vehicleNo);
        System.out.println("Brand: " + bike.brand);
        System.out.println("Rental Amount: Rs. "
                + bike.calculateRental());
    }
}

