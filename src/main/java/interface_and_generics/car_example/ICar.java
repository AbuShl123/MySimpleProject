package interface_and_generics.car_example;

public interface ICar <T extends Engine> {
    T getEngine();

    default void something(T t) {
        System.out.println("engine.getCapacity() = " + t.getCapacity());
    }
}
