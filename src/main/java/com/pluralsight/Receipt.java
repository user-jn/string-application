package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        System.out.println();

        String itemName = "apples";
        double itemPrice = 2.0;
        int quantity = 3;

        double totalPrice = itemPrice * quantity;

        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);

    }
}

