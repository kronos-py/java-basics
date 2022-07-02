package com.curiositas.java.basics.session1.examples.classes.creatures;

public abstract class Human implements Creature {
    @Override
    public String move() {
        return name() + " walk with feet";
    }
}
