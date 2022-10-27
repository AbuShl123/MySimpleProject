package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practice1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("tree", "sky", "waterfall", "weather", "world"));
        Optional<String> text = list.stream().findFirst();
        System.out.println(text.isPresent());
        System.out.println(text);
    }
}
