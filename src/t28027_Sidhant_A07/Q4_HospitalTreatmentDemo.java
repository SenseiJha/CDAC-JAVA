
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    double calculateTreatmentCost() {
        return 1000.0;
    }
}

class InPatient extends Patient {
    int numberOfDays;
    double roomCharge;

    InPatient(int id, String name, int age,
              int numberOfDays, double roomCharge) {
        super(id, name, age);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    @Override
    double calculateTreatmentCost() {
        return super.calculateTreatmentCost()
                + numberOfDays * roomCharge;
    }
}

class OutPatient extends Patient {
    double consultationFee;
    double medicineCost;

    OutPatient(int id, String name, int age,
               double consultationFee, double medicineCost) {
        super(id, name, age);
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
    }

    @Override
    double calculateTreatmentCost() {
        return consultationFee + medicineCost;
    }
}

public class HospitalTreatmentDemo {
    public static void main(String[] args) {
        InPatient inPatient =
                new InPatient(101, "Rahul", 35, 3, 2000);

        OutPatient outPatient =
                new OutPatient(102, "Priya", 28, 500, 1200);

        System.out.println("In-Patient Details");
        System.out.println("Patient Name: " + inPatient.patientName);
        System.out.println("Treatment Cost: Rs. "
                + inPatient.calculateTreatmentCost());

        System.out.println("\nOut-Patient Details");
        System.out.println("Patient Name: " + outPatient.patientName);
        System.out.println("Treatment Cost: Rs. "
                + outPatient.calculateTreatmentCost());
    }
}
