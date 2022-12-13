import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        System.out.println(list);

        List<Integer> oneList = new ArrayList<>(List.of(1));
        oneList.add(1, 4);
        System.out.println(oneList);
    }
}