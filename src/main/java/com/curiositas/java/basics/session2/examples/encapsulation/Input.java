package com.curiositas.java.basics.session2.examples.encapsulation;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String read() {
        return scanner.nextLine();
    }
}
