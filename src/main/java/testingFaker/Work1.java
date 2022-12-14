package testingFaker;

import net.datafaker.Faker;

public class Work1 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name());
    }
}
