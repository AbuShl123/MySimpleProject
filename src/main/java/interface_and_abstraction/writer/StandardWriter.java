package interface_and_abstraction.writer;

public class StandardWriter implements IWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
