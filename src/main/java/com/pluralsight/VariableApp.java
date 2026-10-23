package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {

        //exercise 1
        //step 1

        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // Example:
        // System.out.println("The answer is " + answer);

        //declare your favorite color

        String favColor = "purple";
        int yearStartedClass = 2026;
        char middleInitial = 'A';
        boolean hasPets = true;
        String niceMessage = "Sometimes you don't realize " + "how much someone means to you until " + "you look back and see how much brighter they made the simplist days";

        //display
        System.out.println("My favorite color is " + favColor + ""
                + "\nI started Year Up in " +yearStartedClass + "."
                + "\nMy middle initial is " + middleInitial + ".");

        //boolean expression question #4
        if (hasPets) {
            System.out.println("I have pets!");
        }
        else {
            System.out.println("I don't have pet!");
        }
        System.out.println(niceMessage + ".");

        //step 2
        int numDaysInWeek = 7;
        double priceCoffee = 5.99;
        char favLetter = 'A';
        boolean isRaining = false;

        //display
        System.out.println("\nThere are " + numDaysInWeek + " days in a week."
                + "\nThe price of coffee is $" + priceCoffee + "."
                + "\nMy favorite letter is " + favLetter + ".");

        //display boolean

        if (isRaining) {
            System.out.println("It's raining today.");
        }
        else {
            System.out.print("It's not raining today.");
        }

    }
}

