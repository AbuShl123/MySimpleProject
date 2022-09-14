package tasks.shape;

public abstract class Animal {

    public abstract void sound();

}

class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("moo-moo");
        doMilk();
    }


    public void doMilk() {
        System.out.println("doing milk");
    }
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Burk-burk");
    }
}

