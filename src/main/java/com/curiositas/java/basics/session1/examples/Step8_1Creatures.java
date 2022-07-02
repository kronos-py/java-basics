package com.curiositas.java.basics.session1.examples;

import com.curiositas.java.basics.session1.examples.classes.creatures.*;
import com.curiositas.java.basics.session1.examples.classes.timesofday.TimeOfDay;

import java.util.ArrayList;

public class Step8_1Creatures {
    public static void main(String[] args) {
        makeCreaturesAndForceThemSayingAndWalking();
    }

    private static void makeCreaturesAndForceThemSayingAndWalking() {
        var creatures = new ArrayList<Creature>();

        var englishman = new Englishman();
        creatures.add(englishman);

        var german = new German();
        creatures.add(german);

        var duck = new Duck();
        creatures.add(duck);

        var pigeon = new Pigeon();
        creatures.add(pigeon);

        creatures.forEach(creature -> System.out.println(creature.say()));
        creatures.forEach(creature -> System.out.println(creature.move()));
    }
}
