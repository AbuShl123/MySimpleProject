package builder.secondEx;

import builder.InvalidAgeException;
import builder.InvalidNicknameException;

import java.util.ArrayList;

public class Profile {
    // static fields
    public static ArrayList<String> dataBase = new ArrayList<>();

    // instance fields
    private final String profileName;
    private final int age;
    // non-final
    private String description;
    private long phoneNumber;

    // constructor
    public Profile(String profileName, int age) {
        this.profileName = profileName;
        this.age = age;
        checkName(profileName);
        checkAge(age);
        dataBase.add(profileName + " " + age);
    }

    // check methods
    private void checkName(String profileName) {
        for (String v : dataBase) {
            if (v.contains(profileName)) {
                throw new InvalidNicknameException("profile name already exists");
            }
        }
    }

    private void checkAge(int age) {
        if (age < 13) {
            throw new InvalidAgeException("your age is too young to sign up this application");
        }
    }

    // setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getProfileName() {
        return profileName;
    }
    public int getAge() {
        return age;
    }
    public String getDescription() {
        return description;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        String a = "Profile{" +
                "profileName='" + profileName + '\'' +
                ", age=" + age;
        if (description != null) {
            a += ", description='" + description + '\'';
        }
        if (phoneNumber != 0) {
            a+= ", phoneNumber=" + phoneNumber;
        }
        return a + '}';
    }
}
