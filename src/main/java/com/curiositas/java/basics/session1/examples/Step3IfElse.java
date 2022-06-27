package com.curiositas.java.basics.session1.examples;

public class Step3IfElse {

    private static final int lastNightHour = 5;
    private static final int lastMorningHour = 11;
    private static final int lastDayHour = 17;
    private static final int lastEveningHour = 22;

    private static final String morningGreetingPrefix = "Good morning ";
    private static final String dayGreetingPrefix = "Good afternoon ";
    private static final String eveningGreetingPrefix = "Good evening ";
    private static final String nightGreetingPrefix = "Good night ";

    public static void main(String[] args) {
        var hourOfDay = 0;

        if (args.length > 0) {
            hourOfDay = Integer.parseInt(args[0]);
        }

        String greetingPrefix;

        if (hourOfDay > lastNightHour && hourOfDay <= lastMorningHour) {
            greetingPrefix = morningGreetingPrefix;
        } else if (hourOfDay > lastMorningHour && hourOfDay <= lastDayHour) {
            greetingPrefix = dayGreetingPrefix;
        } else if (hourOfDay > lastDayHour && hourOfDay <= lastEveningHour) {
            greetingPrefix = eveningGreetingPrefix;
        } else {
            greetingPrefix = nightGreetingPrefix;
        }

        String greetingMessage = greetingPrefix + "World!";

        System.out.println(greetingMessage);
    }
}
