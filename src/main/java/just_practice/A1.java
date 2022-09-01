package just_practice;

import java.util.ArrayList;
import java.util.List;

public interface A1 {
     String getName();
}

interface A2 {
    String getName();
}

abstract class aa implements A1, A2{

}

abstract class a implements A1 {
//    protected String getName() {
//
//    } not true
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
        a = list.get(0);
        System.out.println(a);
    }
}