package Q1;

public class SavingAccount extends Account {
	
    public SavingAccount(double balance, double interest) {
        super(balance, interest);
    }

    
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println("Additional interest for savings account");
        balance += 50; // Additional interest specific to SavingsAccount
    }
}