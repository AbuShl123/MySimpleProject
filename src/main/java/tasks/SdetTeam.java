package tasks;

public class SdetTeam {

    public static String course = "CYDEO";

    public static void doReplit() {
        System.out.println("We all solve tasks from replit");
    }


    Person person1 = new Person("Ali", 24);
    Person person2 = new Person("Amin", 16);
    Person person3 = new Person("Abu", 17);

    public void code() {
        System.out.println("Coding");
    }

    @Override
    public String toString() {
        return "SdetTeam{" +
                "person1=" + person1.name +
                ", person2=" + person2.name +
                ", person3=" + person3.name +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        SdetTeam sdetTeam = new SdetTeam();
        System.out.println(sdetTeam);
        System.out.println(SdetTeam.course);
    }
}