import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("moon", "weather", "coat", "rain"));

        String[] arr = list.toArray(new String[0]) ;

        System.out.println(Arrays.toString(arr));

        System.out.println("bb".compareTo("zz"));
    }
}