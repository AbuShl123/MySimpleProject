package proctected_access.swan;

import proctected_access.bird.Bird;

import java.util.List;

public class LittleSwan extends Swan{
    public void littleSwim() {
        floatInWater();
        System.out.println(text);
    }

    public void testOthers() {
        Bird bird = new Bird(); // no access to protected members
        Swan swan = new Swan(); // no access to protected members
        LittleSwan littleSwan = new LittleSwan(); // has since in the same class
        System.out.println(littleSwan.text);
        littleSwan.floatInWater();
    }
}
