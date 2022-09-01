package just_practice;

import java.util.function.Predicate;

public class Pred {
    public static void main(String[] args) {
        System.out.println(f(a -> a == 5));
    }

   public static boolean f(Predicate<Integer> p) {
        return p.test(5);
   }
}
