package OCA_book_practice;

public class Overriding_Overloading {
    public void fly() {
        System.out.println("Flying");
    }

    public void age() {
        System.out.println("age");
    }


    public Object jump() {
        System.out.println("object jumps");
        return null;
    }

    void defaultAccessMethod() {
        System.out.println("default access method");
    }

    private void privateMethod() { // this method cannot be overridden
        System.out.println("This method is private.");
    }
}

class child extends Overriding_Overloading {
    public int fly(int height) {
        System.out.println("Flying to " + height + "m height");
        return height;
    }

//    public int age() { // compiler error --> int is not child of void
//        System.out.println("age");
//        return 0;
//    }

    public String jump() { // String is child of Object
        // in overriding, the return type of child method have to be similar to the return type of
        // parent method, or have to be a child of return type of parent method.
        System.out.println("String jumps");
        return null;
    }


    protected void defaultAccessMethod() {
        // since the method from parent has default access modifier, we can override it with
        // default, protected or public access modifiers because these access modifiers are wider than default
        System.out.println("default access method which is protected now");
    }


}
