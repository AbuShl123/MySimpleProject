package builder.example;

public class User {
    final String name;
    final int age;

    String address;
    long phoneNumbers;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User address(String address) {
        this.address = address;
        return this;
    }

    public User phoneNumber(long phoneNumber) {
        this.phoneNumbers = phoneNumber;
        return this;
    }
}
