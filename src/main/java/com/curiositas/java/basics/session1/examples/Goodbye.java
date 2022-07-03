package com.curiositas.java.basics.session1.examples;

public class Goodbye {
    public static void main(String[] args) {
        var greetingSubject = args[0];
        // We construct a resultive message using concatenation. Another example of the concatenation: "A" + "B"
        String greetingMessage = "Hello " + greetingSubject + "!";

        // And write it to the console
        System.out.println(greetingMessage);
    }
}
