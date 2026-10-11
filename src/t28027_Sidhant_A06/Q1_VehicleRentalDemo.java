
abstract class Vehicle {
    String vehicleNo;
    String brand;
    double rentalRate;

    Vehicle(String vehicleNo, String brand, double rentalRate) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate per Day: Rs. " + rentalRate);
    }

    abstract double calculateRental(int days);
}

class Car extends Vehicle {
    int numberOfSeats;
    double insuranceCharge;

    Car(String vehicleNo, String brand, double rentalRate,
        int numberOfSeats, double insuranceCharge) {
        super(vehicleNo, brand, rentalRate);
        this.numberOfSeats = numberOfSeats;
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    double calculateRental(int days) {
        return (rentalRate * days) + insuranceCharge;
    }

    void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Insurance Charge: Rs. " + insuranceCharge);
    }
}

public class VehicleRentalDemo {
    public static void main(String[] args) {
        Car car = new Car("KA01AB1234", "Hyundai", 2000, 5, 500);

        int days = 3;

        System.out.println("Vehicle Details");
        car.displayCarDetails();

        System.out.println("Rental Duration: " + days + " days");
        System.out.println("Total Rental: Rs. "
                + car.calculateRental(days));
    }
}
