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

        System.out.println(countNumberOfLetter("The graph above demostrates the changes in population for different kind of turtles in India from " +
                "1980 to 2012. " +
                "All species start with the same point - 100 units. If to consider the turtles in general, its " +
                "population is commonly stable and do not have too much pickes or valleys during 32 years. But if " +
                "to look at certain types of turtles, they may rise or decrease in amount with the time. In this graph, " +
                "Olive Ridley Turtles steadfastly are increasing the population from 1980 until 1996. But then, from " +
                "1996 to 2012 it remains generally stable. The opposite is abserved for Leatherback Turtles: " +
                "although its population goes up until 1988, then it surely decreases in amount until 1992, then it " +
                "stays stable for 8 years, but then again decreas in 2002. After that, again it tries to recover, but " +
                "ufortuanely ends up with the lowest point in the graph." +
                "Also interesting to mention about Green Turtles. They're unlike other kinds of turtles, slowly and " +
                "smoothly changing the values. First reducing population to 82 point in 2000 year, then keeping stable " +
                "until the end. "));
    }

    public static int countNumberOfLetter(String text) {
        text = text.replaceAll("\\p{Punct}", "").replace("   ", " ").replace("  ", " ").replace("  ", " ");
        text = text.strip();
        System.out.println(text);
        return text.split(" ").length;
    }
}
