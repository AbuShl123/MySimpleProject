package tasks.shape;

public class World {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.sound();
        cow.doMilk();


        Dog dog = new Dog();
        dog.sound();


        Animal cowAnimal = new Cow();
        cowAnimal.sound();


        Animal dogAnimal = new Dog();
        dogAnimal.sound();
    }
}
