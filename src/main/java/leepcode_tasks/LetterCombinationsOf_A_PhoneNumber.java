package leepcode_tasks;

import java.util.*;

public class LetterCombinationsOf_A_PhoneNumber {
    /*
    [a,b,c] -> [b,c,ad,ae,af] -> [ad,ae,af,bd,be,bf,cd,ce,cf] ->
     */

    public static List<String> letterCombinations(String digits) {  // "23"
        LinkedList<String> ans = new LinkedList<>();
        if (digits.isEmpty()) return ans;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "opqr", "tuv", "wxyz"};

        ans.add("");

        for (int i = 0; i < digits.length(); i++) { // 23
            int x = digits.charAt(i) - '0';

            while (ans.peek().length() == i) {
                String t = ans.remove();
                for (char c : mapping[x].toCharArray()) {
                    ans.add(t + c);
                }
            }
        }
        return ans;
    }


    public static List<String> letCom(String digits) {
        Map<Integer, Character[]> map = new HashMap<>(
                Map.of(
                        2, new Character[] {'a', 'b', 'c'},
                        3, new Character[] {'d', 'e', 'f'},
                        4, new Character[] {'g', 'h', 'i'},
                        5, new Character[] {'j', 'k', 'l'},
                        6, new Character[] {'m', 'n', 'o'},
                        7, new Character[] {'p', 'q', 'r', 's'},
                        8, new Character[] {'t', 'u', 'v'},
                        9, new Character[] {'w', 'x', 'y', 'z'})
        );
        List<String> l = new ArrayList<>();
        int len = digits.length();
        if (len == 0) return l;
        for (char a : map.get(digits.charAt(0)-'0')) {
            if (len == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                l.add(sb.toString());
                continue;
            }
            for (char b : map.get(digits.charAt(1)-'0')) {
                if (len == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a).append(b);
                    l.add(sb.toString());
                    continue;
                }
                for (char c : map.get(digits.charAt(2)-'0')) {
                    if (len == 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a).append(b).append(c);
                        l.add(sb.toString());
                        continue;
                    }
                    for (char d : map.get(digits.charAt(3)-'0')) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(a).append(b).append(c).append(d);
                        l.add(sb.toString());
                    }
                }
            }
        }

        return l;
    }


    public static void main(String[] args) {
        System.out.println(letterCombinations("29"));
    }
}
