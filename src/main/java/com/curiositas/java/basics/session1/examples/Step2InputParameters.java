package com.curiositas.java.basics.session1.examples;

public class Step2InputParameters {
    public static void main(String[] args) {
        var greetingSubject = "World";

        if (args.length > 0) {
            greetingSubject = args[0];
        }

        String greetingMessage = "Hello " + greetingSubject + "!";

        System.out.println(greetingMessage);
    }
}
