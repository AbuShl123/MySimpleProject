package string_builder;

public class Practicing2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.insert(0, "a");
        sb.insert(0, "the ");
        System.out.println(sb);
    }
}