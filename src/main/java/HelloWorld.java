import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(divWithoutDiv(5, 2));
        System.out.println(5/2);
    }

    public static int divWithoutDiv(int a, int b) {
        double f = 0;
        while (true) {
            if ((int) (f * b) == a) return (int) f;
            f+=0.1;


        }
    }
}