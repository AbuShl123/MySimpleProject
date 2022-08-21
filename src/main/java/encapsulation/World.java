package encapsulation;

public class World {
    public static void main(String[] args) {
        Person obj1 = new Person("John", "Mir", 2005, "male");

        System.out.println(obj1);
        obj1.setGender("female");
        System.out.println(obj1.getGender());
        obj1.setGender("Attack Helicopter");
        System.out.println(obj1.getGender());
    }
}
