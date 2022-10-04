import java.util.*;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException{
        int[] nums = {1,2,3};
        int[] arr = {1,2,3};
        System.out.println(arr.equals(nums));

        System.out.println(fibonacci(2));
    }

    private static int a = 0, b = 1;
    public static int fibonacci(int n) { // 0 1 1 2
        if (n == 0) return a;
        int c = b; // 1
        b = b+a; // 2
        a = c;  // 1
        return fibonacci(n-1);
    }
}