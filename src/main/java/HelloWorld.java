import java.util.*;

public class HelloWorld {
    // static field
    static int legs = 2;

    // instance fields
    public int a;
    public int b;
    public String name;


    // instance method
    public void run() {
        System.out.println("running");
    }


    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.name = "Abu";


        HelloWorld obj2 = new HelloWorld();
        obj2.name = "Amin";


        System.out.println(HelloWorld.legs);
        System.out.println(obj.legs);
        System.out.println(obj2.legs);

        obj2.legs = 3;
        System.out.println(obj2.legs);
        System.out.println(obj.legs);
        System.out.println(HelloWorld.legs);

    }
}