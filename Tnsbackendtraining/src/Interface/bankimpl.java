package Interface;

public class bankimpl implements bank {
    double balance = 0;

    @Override
    public void deposit(int amount) {
        if (amount <= DEPOSIT_LIMIT) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.err.println("Deposit limit exceeds!");
        }
    }
}


