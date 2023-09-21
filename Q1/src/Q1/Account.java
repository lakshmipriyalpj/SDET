package Q1;

public class Account {
	protected double balance;
    protected double interest;

    public Account(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double calculatedInterest = balance * interest;
        System.out.println("Interest calculated: " + calculatedInterest);
        balance += calculatedInterest;
    }

    public void displayBalance() {
        System.out.println("Account balance: " + balance);
    }
    
    public static void main(String[] args) {
        // Create an object of the SavingsAccount class
        SavingAccount savingsAccount = new SavingAccount(1000, 0.05);
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();

        System.out.println("-----------------------");

        // Create an object of the CurrentAccount class
        CurrentAccount currentAccount = new CurrentAccount(2000, 0.03);
        currentAccount.calculateInterest();
        currentAccount.displayBalance();
    }
}
