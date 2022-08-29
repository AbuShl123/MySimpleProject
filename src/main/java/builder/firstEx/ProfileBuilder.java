package builder.firstEx;

import builder.InvalidAgeException;
import builder.InvalidNicknameException;

import java.util.Calendar;

public final class ProfileBuilder {
    Calendar time = Calendar.getInstance();

    // static fields
    public static String nicknameMemory = "";

    // instance fields
    public final String nickname;
    public final int age;
    public final int birthYear;
    public final int birthMonth;
    public final int birthDay;
    // non-final
    public String description;
    public long phoneNumber;
    public String gender;

    // constructor
    public ProfileBuilder(String nickname, int birthYear, int birthMonth, int birthDay) {
        this.nickname = nickname;
        if (nicknameMemory.contains(nickname)) {
            throw new InvalidNicknameException("\"" + nickname + "\" - nickname already exists");
        }
        nicknameMemory += ", " + nickname;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        age = getAge();
        if (age < 13) {
            throw new InvalidAgeException("User should be older than 13 to register in the application");
        }
    }

    // methods
    private int getAge() {
        int age = time.get(Calendar.YEAR) - birthYear;
        if (time.get(Calendar.MONTH) < birthMonth ) {
            --age;
        }
        else if (time.get(Calendar.DAY_OF_MONTH) < birthDay) {
            --age;
        }
        return age;
    }

    // building methods
    public ProfileBuilder description(String description) {
        this.description = description;
        return this;
    }
    public ProfileBuilder phoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public ProfileBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
