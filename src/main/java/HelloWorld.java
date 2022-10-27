import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {

    public static String findUnique(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!sb.toString().contains(str.substring(i,i+1))) sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i > -1; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String sortFromAlphanumeric(String str) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if ((Character.isLetter(str.charAt(i)) ^ Character.isLetter(str.charAt(i+1)))
            || i == str.length()-2) {
                int num = i == str.length()-2 ? 2 : 1;
                String sub = str.substring(j, i+num);
                String[] list = sub.split("");
                Arrays.sort(list);
                for (String v : list) {
                    sb.append(v);
                }
                j = i+1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Abubakr"));

        System.out.println(sortFromAlphanumeric("DC501GCCCA098911"));
    }
}