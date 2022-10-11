import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        Character[] c = new Character[3];
        System.out.println(Arrays.toString(c));
        StringBuilder sb = new StringBuilder();
        sb.append(c[0]);
        System.out.println(sb);
    }
}