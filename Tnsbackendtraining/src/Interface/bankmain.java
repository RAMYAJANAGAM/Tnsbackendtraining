package Interface;

public class bankmain {
    public static void main(String[] args) {
        bankimpl account = new bankimpl();  // Creating bank account object
        withdraw wd = new withdraw();       // Creating withdraw object

        account.deposit(5000);              // Deposit money
        wd.performWithdraw(account, 2000);  // Withdraw money
    }
}
