package copyConstructor;

import java.util.Objects;

public class Cart {

    public static void main(String[] args) {
        Food food = new Food("apple", 5.00);

        Food oneMore = food.clone();

        System.out.println(food);
        System.out.println(oneMore);


    }

}
