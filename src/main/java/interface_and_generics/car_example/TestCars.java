package interface_and_generics.car_example;

public class TestCars {
    public static void main(String[] args) {
        Lada lada = new Lada();

        ICar<V8Engine> vEightCar = lada;

//      ICar<Engine> someCar = lada; compilation fails

//      ArrayList<Object> list = new ArrayList<String>(); compile time error


    }
}
