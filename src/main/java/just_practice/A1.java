package just_practice;

import java.util.ArrayList;
import java.util.List;

public interface A1 {
    default void getName() {
        System.out.println("name from the interface A1");
    }
}

interface A2 {
    default void getName() {
        System.out.println("name from the interface A2");
    }
}

class TwoImplement implements A1, A2 {

    @Override
    public void getName() {
        A2.super.getName();
    }


//    @Override
//    public String getName(String value) {
//        return null;
//    }
//
//    @Override
//    public String getName() {
//        return null;
//    } //|> there are two abstract methods with the same method but different parameters



//    @Override
//    public String getName() {
//        return null;
//    }  |> if there are two identical abstract methods in implemented interfaces


}

class aa implements A1, A2{
    @Override
    public void getName() {
        A1.super.getName(); // releases the implementation of A1 interface
    }
}

abstract class a implements A1 {
//    protected String getName() {
//
//    }
}

class P {
    private void f() {
        System.out.println("hehe");
    }

    public static void main(String[] args) {
        P obj = new PP();
        obj.f();
    }
}

class PP extends P {
    public PP (){
        this("Abc");
    }
    public PP(String name) {
        n = name;
    }
    public void f() {
        System.out.println("not hehe");
    }
    private String n;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        int a;
        a = list.get(0); // this throws an exception
        System.out.println(a);
    }
}