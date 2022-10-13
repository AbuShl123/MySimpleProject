package interface_and_abstraction.writer;

public class Main {
    public static void main(String[] args) {
        TextWrite obj = new TextWrite();
        obj.iWriter = new StandardWriter();
        obj.writeText("Hello World");

        obj.iWriter = new CurlyBracketsWriter();
        obj.writeText("Hello World");

        obj.iWriter = new SquareBracketsWriter();
        obj.writeText("Hello world");

        StandardWriter standardWriter = new StandardWriter();

    }
}
