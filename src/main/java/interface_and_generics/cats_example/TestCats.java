package interface_and_generics.cats_example;

public class TestCats {
    public static void main(String[] args) {
        IPushable<Cat> cats = new Stack<>();
        cats.push(new Cat());

        IPushable<Animal> animals = new Stack<>();
        animals.push(new Cat());
    }
}
