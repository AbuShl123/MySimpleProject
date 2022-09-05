package interface_and_abstraction;

interface Interface1 {
    void run();
}

interface Interface2 {
    void run();
}


public class Concrete implements Interface1, Interface2{
//    @Override
//    public void run() {
//        System.out.println("Doing something");
//    } // it means that we are giving the same implementation to both interface's methods

    @Override
    public void run() {

    }


}
