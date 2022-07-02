package com.curiositas.java.basics.session1.examples.classes.creatures;

public class Pigeon extends Flying {
    @Override
    public String say() {
        return name() + " says \"Coo\"";
    }

    @Override
    public String name() {
        return "Pigeon";
    }
}
