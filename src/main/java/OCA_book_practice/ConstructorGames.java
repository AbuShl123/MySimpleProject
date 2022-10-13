package OCA_book_practice;

public class ConstructorGames {
    int length;
    int height;
    String name;
    public ConstructorGames(int length, int theHeight) {
        length = this.length; // are you silly?
        height = theHeight;
        this.name = "white"; // redundant
    }
}
