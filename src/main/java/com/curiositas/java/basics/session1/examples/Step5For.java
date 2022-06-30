package com.curiositas.java.basics.session1.examples;

/**
 * A console program which implements a countdown
 */
public class Step5For {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A countdown starts!");
        // The line below force the program to sleep for 2 seconds. Please, newer use it in the real code!
        Thread.sleep(2000);

        // for is a loop. Initially it has a variable "i" with a value 3, then checks the stop-condition, do the for body and decrease i on 1 (i-- is equal to i=i-1)
        // In other words, "i" is a counter
        for (int i = 3; i > 0; i--) {
            // Just wait for a second...
            Thread.sleep(1000);
            System.out.println(i + "...");
            if (i == 2) {
                Thread.sleep(1000);
                System.out.println("Oops! Something went wrong...");
                break;
            }
        }

        Thread.sleep(2000);
        System.out.println("A countdown starts again!");
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println(i + "...");
        }

        Thread.sleep(1000);
        System.out.println("Tada!");

    }
}
