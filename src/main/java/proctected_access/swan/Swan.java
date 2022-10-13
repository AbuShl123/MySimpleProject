package proctected_access.swan;

import proctected_access.bird.Bird;

public class Swan extends Bird {
    public void swim() {
        this.floatInWater();
        System.out.println(this.text);
    }

    public void superBird() {
        super.floatInWater();
        System.out.println(super.text);
    }

    public void helpOtherSwanSwim() {
        Swan swan = new Swan();
        swan.floatInWater();
        System.out.println(swan.text);
    }

    public void helpOtherBirdSwim() {
        Bird bird = new Bird();
        // bird.floatInWater();             // does not compile!
        // System.out.println(bird.text);   // does not compile!
    }

    public void setText(String text) {
        this.text = text;
    }
}
