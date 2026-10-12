
class BankAccount {
    int accountNo;
    String accountHolderName;
    double balance;

    BankAccount(int accountNo, String accountHolderName,
                double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNo, String name,
                   double balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100.0;
    }
}

class CurrentAccount extends BankAccount {
    double interestRate;

    CurrentAccount(int accountNo, String name,
                   double balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100.0;
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {
        SavingsAccount savings =
                new SavingsAccount(101, "Rahul", 50000, 6.0);

        CurrentAccount current =
                new CurrentAccount(102, "Priya", 80000, 2.0);

        System.out.println("Savings Account Interest: Rs. "
                + savings.calculateInterest());

        System.out.println("Current Account Interest: Rs. "
                + current.calculateInterest());
    }
}
