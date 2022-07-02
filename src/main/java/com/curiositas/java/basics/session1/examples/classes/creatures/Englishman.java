package com.curiositas.java.basics.session1.examples.classes.creatures;

public class Englishman extends Human {
    @Override
    public String say() {
        return name() + " says \"Good afternoon!\"";
    }

    @Override
    public String name() {
        return "Englishman";
    }
}
