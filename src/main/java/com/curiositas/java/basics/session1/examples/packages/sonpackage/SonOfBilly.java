package com.curiositas.java.basics.session1.examples.packages.sonpackage;

import com.curiositas.java.basics.session1.examples.packages.Billy;

public class SonOfBilly extends Billy {
    public void forceSonToCallAllAvailableMethods() {
        tellProtected();
        tellPublic();
    }
}
