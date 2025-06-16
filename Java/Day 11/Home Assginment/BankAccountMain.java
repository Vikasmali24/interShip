class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displaySavingsDetails() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountMain {
	
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.accountNumber = "SA123456789";
        sa.holderName = "Rahul Sharma";
        sa.balance = 50000.0;
        sa.interestRate = 4.5;

        sa.displaySavingsDetails();
    }
}
