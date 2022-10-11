package interface_and_abstraction.writer;

public class TextWrite {
    public IWriter iWriter;

    

    public void writeText(String text) {
        iWriter.write(text);
    }
}
