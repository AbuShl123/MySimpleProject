package OCA_book_practice;

public class MethodOverloadingGames {
    public void f(int e) {
        System.out.println("int");
    }

    public void f(Integer e) {
        System.out.println("Integer");
    }

    public void fly(String s) {
        System.out.println("string... ");
    }

    public void fly(Object o) {
        System.out.println("object...");
    }

    public void play(Long l) {
        System.out.println(l);
    }

    public void play(Long... longs) {
        System.out.println(longs);
    }

    public static void main(String[] args) {
        MethodOverloadingGames l = new MethodOverloadingGames();
        l.f(3);
        l.f((Integer) 34);
        l.f( (int) (Object) 12);
        l.f( (Integer) (Object) 34);

        l.fly("Word");
        l.fly(456);
        l.fly(new StringBuilder("Word").toString());
        l.fly('b');

        // l.play(23); // this does not compile because it should firstly convert int to long then long to Long, which is two conversions and java doesn't support it

        l.play(345L);
        l.play(45L, 45L ,45L);


    }
}
