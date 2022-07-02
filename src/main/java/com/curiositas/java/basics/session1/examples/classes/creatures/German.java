package com.curiositas.java.basics.session1.examples.classes.creatures;

public class German extends Englishman{
    @Override
    public String say() {
        return name() + " says \"Guten Tag!\"";
    }

    @Override
    public String name() {
        return "German";
    }
}
