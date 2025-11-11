package Interface;

public interface bank {
    int DEPOSIT_LIMIT = 10000;  // Maximum deposit limit
    int MIN_BAL = 500;          // Minimum balance required

    void deposit(int amount);
}
