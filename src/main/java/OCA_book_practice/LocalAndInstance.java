package OCA_book_practice;

public class LocalAndInstance {
    int age; // instance variable (instance field) --> 0
    String name;
    static int hours; // static variable (static field) --> 0


    public void method(int day, boolean isNight) {
        String name;
        // System.out.println(name);
        System.out.println(this.name);
    }
}
