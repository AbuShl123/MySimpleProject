package OCA_book_practice;

public class StaticB {
    static final double G = 9.8;

    public static void mg(int m) {
        System.out.println("F = " + m*G);
        System.out.println("this is from B");
        System.out.println("-----------------");
    }

    public static void mgDif(double m) {
        System.out.println("F = " + m*G);
        System.out.println("This is from A");
        System.out.println("-----------------");
    }
}
