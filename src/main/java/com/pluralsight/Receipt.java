package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        //1. Create variables for an item name (String) and item price (double)
        //2. Create a quantity variable (int)

        String itemName = "Abc cookies";
        double itemPrice = 4.99;
        int numItems = 3;

        //3. Build and print: EX. "You bought 3 apples for $7.10"

        //need a total variable with calculations

         double totalPrice = numItems * itemPrice;

         //display
        System.out.printf("You bought " + numItems + " " + itemName + " for $%.2f!", totalPrice);



    }
}

