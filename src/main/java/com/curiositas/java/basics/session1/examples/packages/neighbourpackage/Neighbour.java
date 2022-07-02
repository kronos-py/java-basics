package com.curiositas.java.basics.session1.examples.packages.neighbourpackage;

import com.curiositas.java.basics.session1.examples.packages.Billy;

public class Neighbour {
    public void forceNeighbourToCallAllAvailableMethods() {
        new Billy().tellPublic();
    }
}
