package com.curiositas.java.basics.session1.examples;

import java.util.Scanner;

/**
 * A console program which plays Rock-Paper-Scissors game with the user
 */
public class Step4Switch {
    public static void main(String[] args) {

        // This variable is an object of the Scanner class. It helps us to read what a user has written to the console
        Scanner scanner = new Scanner(System.in);

        // Invite a user to the game
        System.out.println("Let's play a game! Choose rock/paper/scissors");

        // A program always choose a rock :-)
        var computerChoice = "rock";

        // Read user's choice
        String inputLine = scanner.nextLine();

        // Let's play the game
        switch (inputLine) {
            case "rock" -> System.out.println("It's a draw!");
            case "paper" -> System.out.println("Your paper has won my " + computerChoice + "!");
            case "scissors" -> System.out.println("My " + computerChoice + " has won your scissors!");
            default -> System.out.println(inputLine + " is a wrong word. Choose between rock/paper/scissors. All letters should be in lowercase");
        }
    }
}
