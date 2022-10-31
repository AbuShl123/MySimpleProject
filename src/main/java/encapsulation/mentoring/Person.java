package encapsulation.mentoring;

public class Person {

    // fields
    private String name;
    private int age;


    // methods
    public void setName(String newName) { // newName = "abu"
        name = newName;
    }

    public String getName() {
        return name;
    }

}

/*
    Encapsulation in java it is when we create private fields and also create getters or setters for those fields.
 */

class Test {
    public static void main(String[] args) {
        Person object = new Person();

        object.setName("abu");
        System.out.println(object.getName());

        object.setName("Bekhruz");
        System.out.println(object.getName());
    }
}
