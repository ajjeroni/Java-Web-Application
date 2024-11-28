public class Customer extends Server {
    private String name; // Customer's name
    private double balance; // Customer's balance

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double sum) {
        this.balance = sum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // Gamble function to win money (Random number 1 to 3)
    public void playSlots(int guessedNumber) {

        // User won = true; Lost = false
        if (gamble(guessedNumber)) {
            balance += 100;
        }

    }
}
