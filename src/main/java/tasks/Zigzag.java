package tasks;

import java.util.HashMap;
import java.util.Map;

public class Zigzag {
    public static String convert(String s, int numRows) {
        // "PAYPALISHIRING", 4
        /*
        P i   n
        A l S i G
        Y a H r
        P   I
        */
        if (numRows == 1) return s;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 1, v = 1, e = numRows; i < numRows; i++, v+=2, e--) {
            map.put(i+1, v);
            m.put(i, e);
        }
        map.put(1, map.get(numRows));
        m.put(numRows, 1);
        System.out.println(map);
        System.out.println(m);
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            for (int x = 1, index = i-1; index <= s.length()-1; x++) {
                str.append(s.charAt(index));
                if (x%2 != 0) {
                    index += map.get(m.get(i))+1; continue;
                }
                index += map.get(i)+1;
            }
        }
        return str.toString();
    }
}
