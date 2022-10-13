package OCA_book_practice;

public class StaticA {
    static final double G = 9.8;

    public static void mg(int m) {
        System.out.println("F = " + m*G);
        System.out.println("This is from A");
        System.out.println("-----------------");
    }

    public static void mgDif(int m) {
        System.out.println("F = " + m*G);
        System.out.println("This is from A");
        System.out.println("-----------------");
    }
}
