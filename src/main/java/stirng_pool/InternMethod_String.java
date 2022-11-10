package stirng_pool;

public class InternMethod_String {
    public static void main(String[] args) {
        String word = "apple";

        String anotherWord = new String("apple");

        System.out.println(word == anotherWord); // false

        String newAnother = anotherWord.intern();

        System.out.println("newAnother = " + newAnother);
        System.out.println(newAnother == word); // true

        String str = new String("something").intern();
        String anotherStr = "something";
        System.out.println(str == anotherStr); // true
    }
}
