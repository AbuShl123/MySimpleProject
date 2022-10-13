package proctected_access;

import proctected_access.bird.Bird;
import proctected_access.swan.Swan;

public class Test {
    public static void main(String[] args) {
        Swan swan = new Swan(); // no access to super class' protected members
        Bird bird = new Bird(); // no access to protected members

        swan.setText("swimming");
        swan.superBird();

    }
}
