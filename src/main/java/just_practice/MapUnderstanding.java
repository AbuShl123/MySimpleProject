package just_practice;

import java.util.HashMap;
import java.util.Map;

public class MapUnderstanding {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,1);
        map.put(3,3);
        map.put(4,5);
        map.put(1, map.get(map.size()+1)); // 1 == 5;

        System.out.println(map.size());
        System.out.println(map.get(1));

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 2, v = 1; i <= 8; i++, v+=2) {
            map2.put(i, v);
        }
        map2.put(1, map2.get(map2.size()+1));
        System.out.println(map2);

        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for (int i = 1, v = 1, e = 5; i <= 5; i++, v+=2, e--) {
            m1.put(i, v);
            m2.put(i, e);
        }
        m1.put(1, 5);
        System.out.println(m1);
        System.out.println(m2);
    }
}
