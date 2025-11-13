package Interface;

public class withdraw {

    public void performWithdraw(bankimpl account, int amount) {
        if (account.balance - amount >= bank.MIN_BAL) {
            account.balance -= amount;
            System.out.println("Balance after withdrawal: " + account.balance);
        } else {
            System.err.println("Insufficient balance! Minimum balance should be " + bank.MIN_BAL);
        }
    }
}
