package regex;

public class ReplaceWithRegex {
    public static void main(String[] args) {
        String word;

        word = "hello my dear friend, how are you doing? ";
        System.out.println(word);

        word = word.replaceAll("[a-z&&[^a-o]]", "");

        System.out.println(word);
    }
}
