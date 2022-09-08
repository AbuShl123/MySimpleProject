package interface_and_abstraction.writer;

public class SquareBracketsWriter implements IWriter {
    @Override
    public void write(String text) {
        System.out.println("[" + text + "]");
    }
}
