package leepcode_tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOf_A_PhoneNumber {
    public static List<String> letterCombinations(String digits) {  // "23"
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

    public List<String> letterCombin(String digits) {
        List<String> res = new ArrayList<>();
        outComes(digits, 0, new StringBuilder(), res);
        return res;
    }

    void outComes(String digit, int p, StringBuilder sb, List<String> res) {
        String chars = getChar(digit.charAt(p)); // abc
        for (char e : chars.toCharArray()) {
            sb.append(e); // a
            outComes(digit, p+1, sb, res);
            sb.setLength(sb.length()-1);
        }
    }

    String getChar(char digit){
        String letters = "";
        switch (digit) {
            case '2': letters = "abc"; break;
            case '3': letters = "def"; break;
            case '4': letters = "ghi"; break;
            case '5': letters = "jkl"; break;
            case '6': letters = "mno"; break;
            case '7': letters = "pqrs"; break;
            case '8': letters = "tuv"; break;
            case '9': letters = "wxyz"; break;
        }
        return letters;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }
}
