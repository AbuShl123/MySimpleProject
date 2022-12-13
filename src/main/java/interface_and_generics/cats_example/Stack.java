package interface_and_generics.cats_example;

public class Stack<T extends Animal> implements IPushable<T> {

    public Stack() {
        System.out.println("stack");
    }

    @Override
    public void push(T object) {

    }

}
