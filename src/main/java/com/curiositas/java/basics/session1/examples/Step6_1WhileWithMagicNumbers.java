package com.curiositas.java.basics.session1.examples;

import java.util.Random;

/**
 * A console program which rolls dice 3 times
 * Take into account that there are magic numbers - the numbers which has no context. If you have no context, you can't guess their meaning
 */
public class Step6_1WhileWithMagicNumbers {
    public static void main(String[] args) {

        var time = 0;

        var randomizer = new Random();

        System.out.println("Let's roll the dice 3 times!");

        // while is another option to make a loop
        while (time < 3) { // 3 is a magic number. Why only 3 times?
            time++;
            var diceResult = randomizer.nextInt(1, 6); // Other 2 magic numbers! What do mean 1 and 6?
            System.out.println(time + " time rolling the dice! The result is " + diceResult);
        }
    }
}
