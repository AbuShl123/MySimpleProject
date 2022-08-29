package builder.firstEx;

import builder.InvalidAgeException;
import builder.InvalidNicknameException;

public class Main {
    public static void main(String[] args) {
        User obj = new ProfileBuilder("abu989", 2005, 3, 6).build();

        System.out.println(obj.getMainUserInfo());

        User obj2;
        try {
            obj2 = new ProfileBuilder("abu989", 2003, 5, 12).build();
        } catch (InvalidNicknameException e) {
            System.out.println(e.getMessage());
        }

        User obj3;

        try {
            obj3 = new ProfileBuilder("nick_21", 2010, 8, 30).build();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }
}
