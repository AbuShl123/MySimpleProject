package Encapsulation;

public class Person {
    // static field
    private static int currentYear = 2022;

    // instance field
    // final
    private final String firstname;
    private final String lastname;
    private final int birthYear;
    // non-final
    private String gender = "unanimous gender";
    private int age;
    /*
    age is changeable state
    everyone has right to change their gender (in some countries)
     */

    // constructor
    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        setAge();
    }

    public Person(String firstname, String lastname, int birthYear, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        setAge();
        setGender(gender);
    }

    // static method
    // currentYear
    public static void setDate(int year) {
        currentYear = year;
    }
    public static void newYear() {
        currentYear++;
    }
    public static void printCurrentYear() {
        System.out.println(currentYear);
    }

    // instance method
    // getter
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    // setter
    public void setAge() {
        age = currentYear - birthYear;
    }
    public void setGender(String gender) {
        boolean isValidGender = gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female");
        if (isValidGender) {
            this.gender = gender;
        }
    }
}
