import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        String str = "abubakr";
        //            0123456
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
    }
}