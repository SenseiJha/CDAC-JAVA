
import java.util.InputMismatchException;
import java.util.Scanner;

class ElectricityBill {
    int consumerNo;
    String consumerName;
    int unitsConsumed;
    double billAmount;

    ElectricityBill(int consumerNo, String consumerName) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
    }

    void readDetails(Scanner sc) {
        System.out.print("Enter units consumed: ");
        unitsConsumed = sc.nextInt();

        if (unitsConsumed < 0) {
            throw new IllegalArgumentException(
                "Units consumed cannot be negative."
            );
        }
    }

    void calculateBill() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 200) {
            billAmount = (100 * 3.0)
                       + (unitsConsumed - 100) * 5.0;
        } else {
            billAmount = (100 * 3.0)
                       + (100 * 5.0)
                       + (unitsConsumed - 200) * 8.0;
        }
    }

    void displayBill() {
        System.out.println("\nElectricity Bill");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricityBill bill =
                new ElectricityBill(101, "Rahul");

        try {
            bill.readDetails(sc);
            bill.calculateBill();
            bill.displayBill();

        } catch (InputMismatchException e) {
            System.out.println(
                "Error: Please enter a valid integer for units."
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println(
                "Electricity bill processing completed."
            );
            sc.close();
        }
    }
}
