package com.curiositas.java.basics.session1.examples;

import com.curiositas.java.basics.session1.examples.classes.creatures.*;
import com.curiositas.java.basics.session1.examples.classes.timesofday.TimeOfDay;

import java.util.ArrayList;

public class Step8_2TimeOfDay {
    public static void main(String[] args) {
        writeGreetingsOnTheDifferentTimesOfDay();
    }

    private static void writeGreetingsOnTheDifferentTimesOfDay() {
        for (var timeOfDay : TimeOfDay.values()) {
            System.out.println(timeOfDay.getGreeting());
        }
    }
}
