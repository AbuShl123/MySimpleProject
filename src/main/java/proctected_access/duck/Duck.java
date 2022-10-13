package proctected_access.duck;

import proctected_access.swan.Swan;

public class Duck {
    public void swim() {
        Swan swan = new Swan();
        // swan.floatInWater();         // does not compile
        // System.out.print(swan.text); // does not compile
    }
}
