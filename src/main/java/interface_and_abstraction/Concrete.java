package interface_and_abstraction;

interface Interface1 {
    void run();

    default void go() {
        System.out.println("GO!");
    }
}

interface Interface2 {
    void run();

    default void go() {
        System.out.println("Going");
    }
}

abstract class Off implements Interface1, Interface2 {

    @Override
    public abstract void go();

//    @Override
//    public void go() {
//        System.out.println("aaa");
//    }                              <--   this is also possible


}


public class Concrete implements Interface1, Interface2{
    @Override
    public void run() {
        System.out.println("Doing something");
    } // it means that we are giving the same implementation to both interface's methods

    @Override
    public void go() {
        System.out.println("Don't go");
    }
}
