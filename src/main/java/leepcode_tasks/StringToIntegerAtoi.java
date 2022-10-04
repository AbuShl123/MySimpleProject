package leepcode_tasks;

public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() < 1) return 0;
        char c = s.charAt(0);
        if ((c == '+' || c == '-') && (s.length() == 1 || !Character.isDigit(s.charAt(1))))
            return 0;
        if (Character.isLetter(c) || c == '.')
            return 0;

        StringBuilder num = new StringBuilder("" + c);
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            num.append(s.charAt(i));
        }

        try {
            return Integer.parseInt(num.toString());
        } catch (Exception e) {
            if (num.toString().startsWith("-")) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }
}
