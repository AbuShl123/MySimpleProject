package copyConstructor;

public class Food implements Cloneable{
    String name;
    double price;

    public Food(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Food(Food food) {
        this.name = food.name;
        this.price = food.price;
    }

    @Override
    public Food clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Food) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
