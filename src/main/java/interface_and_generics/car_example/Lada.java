package interface_and_generics.car_example;

public class Lada implements ICar<V8Engine> {

    @Override
    public V8Engine getEngine() {
        return new V8Engine();
    }
}
