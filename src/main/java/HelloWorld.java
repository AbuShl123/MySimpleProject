import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        int a;

        for (int i = 0; i < 15; i++) {
            a = new Random().nextInt(4)+4;
            System.out.println(a);
        }
    }
}

