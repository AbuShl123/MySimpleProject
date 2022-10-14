import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HelloWorld {
    public static String reverse(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = name.length()-1; i > -1; i--) {
            sb.append(name.charAt(i));
        }
        return sb.toString();
    }

    public static int fib(int n) {
        int[] arr = new int[n+2];
        arr[0] = 0; arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }


    public static void main(String[] args) {

        String[] arr = new String[] {"I", "How", "ab", "street",  "moon", "I"};

        Arrays.sort(arr, Comparator.comparingInt(e -> e.length()));
        System.out.println(Arrays.toString(arr));

        System.out.println(fib(2));

        System.out.println(reverse("Monday"));

        int a = 13;
        int b = 40;

        a += b; // 53
        b = a-b; // 13
        a -= b;
        System.out.println(a + " " + b);

        String word = "www.go";
        System.out.println(word.matches(".*[aeiou].*"));

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,4,2,3,3,4,5,6,7,8,9,7,5,5,6,4,2,3,4,3,6,5,78,9,7));

        System.out.println(list.parallelStream().anyMatch(e -> e % 2 == 0));

    }
}