package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class Example1 {
    static String dataBase = "Abu, Michael, James, Lizzy, Jessica";

    public static boolean checkAge (int age) {
        System.out.println("just like that");
        return age >= 17;
    }

    public static boolean checkName(String name) {
        if (dataBase.contains(name)) return false;
        dataBase += name + ", ";
        return true;
    }

    public static boolean f(Predicate<Integer> p) {
        return p.test(5);
    }

    public static void main(String[] args) {
        Predicate<Integer> ab = (Integer b) -> {return (b > 10 ? b < 1000 : b < 5);};
        System.out.println(ab.test(8));

        Predicate<Integer> cd = Example1::checkAge;
        System.out.println(cd.test(23));

        System.out.println("========================");
        Predicate<String> str = s -> s.contains("Hello");
        System.out.println(str.test("hello mister Faff")); // f
        System.out.println(str.test("Hello this beautiful day!")); // t
        System.out.println(str.test("no/")); //

        System.out.println("========================");
        Predicate<String> name = Example1::checkName;

        System.out.println("========================");
        System.out.println(f(a -> {return a == 5;}));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please print a name: ");
            String user = sc.next();
            if (name.test(user)) {
                System.out.println("Your profile created successfully"); break;
            } else
                System.out.println("This name already exists, please enter another name");
        }

        System.out.println(name.test("wtf"));
        System.out.println(name.test("Jessy"));
        System.out.println(name.test("Jessica"));
    }
}
