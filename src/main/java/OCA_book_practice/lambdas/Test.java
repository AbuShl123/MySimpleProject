package OCA_book_practice.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));


        print(animals, new CheckIfHopper()); // prints only hoppers
        print(animals, new CheckIfSwimmer()); // prints only swimmers

        print(animals, Animal::isCanSwim); // prints only swimmers
        print(animals, Animal::isCanHop); // prints only hoppers
        print(animals, e -> ! e.isCanSwim()); // prints only non-swimmers!

        print2(animals, e -> !e.isCanHop()); // prints only not hoppers -> but we are using predicate
    }

    public static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {     // the general check
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }

    public static void print2(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {     // the general check
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
