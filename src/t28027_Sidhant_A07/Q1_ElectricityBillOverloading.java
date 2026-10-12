
class ElectricityBill {
    int consumerNo;
    String consumerName;
    int unitsConsumed;

    ElectricityBill(int consumerNo, String consumerName,
                    int unitsConsumed) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    double calculateBill() {
        return unitsConsumed * 8.0;
    }

    double calculateBill(double rate) {
        return unitsConsumed * rate;
    }

    double calculateBill(double rate, int units) {
        return units * rate;
    }
}

public class ElectricityBillOverloading {
    public static void main(String[] args) {
        ElectricityBill bill =
                new ElectricityBill(101, "Rahul", 150);

        System.out.println("Consumer Number: " + bill.consumerNo);
        System.out.println("Consumer Name: " + bill.consumerName);

        System.out.println("Default Bill: Rs. "
                + bill.calculateBill());

        System.out.println("Bill at Rs. 6/unit: Rs. "
                + bill.calculateBill(6.0));

        System.out.println("Bill for 200 units at Rs. 5/unit: Rs. "
                + bill.calculateBill(5.0, 200));
    }
}
