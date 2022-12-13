package interface_and_generics.cats_example;

public interface IPushable<T extends Animal> {
    void push(T object);
}
