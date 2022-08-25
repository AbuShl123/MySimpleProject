package some_memes;

public class A {
    public void foo() {
        System.out.println("something");
    }
}
class B extends A {

    @Override
    public void foo() {
        super.foo();
    }


}
class Main {
    public static void main(String[] args) {
        B object = new B();
        object.foo();
    }
}