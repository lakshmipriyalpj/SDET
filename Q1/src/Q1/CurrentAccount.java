package Q1;

public class CurrentAccount extends Account {
    public CurrentAccount(double balance, double interest) {
        super(balance, interest);
    }

   
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println("Additional interest for current account");
        balance -= 10; // Additional interest specific to CurrentAccount
    }
}