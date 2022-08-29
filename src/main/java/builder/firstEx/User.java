package builder.firstEx;

import java.util.Calendar;

public class User {
    private final String nickname;
    private final int age;
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final String description;
    private final long phoneNumber;
    private final String gender;

    protected User(ProfileBuilder profileBuilder) {
        nickname = profileBuilder.nickname;
        age = profileBuilder.age;
        birthYear = profileBuilder.birthYear;
        birthMonth = profileBuilder.birthMonth;
        birthDay = profileBuilder.birthDay;
        description = profileBuilder.description;
        phoneNumber = profileBuilder.phoneNumber;
        gender = profileBuilder.gender;
    }

    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public int getBirthDay() {
        return birthDay;
    }
    public String getDescription() {
        return description;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public String getGender() {
        return gender;
    }

    public String getMainUserInfo() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", birthMonth=" + birthMonth +
                ", birthDay=" + birthDay +
                ", description='" + description + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}

