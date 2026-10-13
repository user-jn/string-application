package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        System.out.println();

        String itemName = "apples";
        double itemPrice = 2.0;
        int quantity = 3;

        double totalPrice = itemPrice * quantity;

        // Print the quantity, item name, and total price formatted to 2 decimal places
        System.out.printf("You bought %d %s for $%.2f%n", quantity, itemName, totalPrice);

    }
}

