abstract class Accounts {
    double balance;
    long accountNumber;
    String accountHoldersName;
    String address;

    abstract void withdrawal(double amount);

    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(long accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.rateOfInterest = rateOfInterest;
        this.balance = 0;
    }

    @Override
    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    void calculateAmount(int years) {
        double interest = balance * rateOfInterest * years;
        balance += interest;
        System.out.println("Amount after " + years + " years with interest: " + balance);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(726932761,"Rashmit Saha","Kolkata",0.8);
        savings.deposit(1000);
        savings.withdrawal(500);
        savings.display();
        savings.calculateAmount(5);
    }
}
