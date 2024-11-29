package main.java.com.test.store.model;

import java.util.Random;

public class Server implements Slot {
    private ShoppingCart cart;

    public void updateBalance() {

    }

    public void createShoppingCart() {
        cart = new ShoppingCart();
    }

    public void addProduct(Product p) {
        cart.addItem(p);
    }

    @Override
    public boolean gamble(int guessedNumber) {
        Random rand = new Random();
        int num = rand.nextInt(3) + 1;

        return guessedNumber == num;
    }

}
