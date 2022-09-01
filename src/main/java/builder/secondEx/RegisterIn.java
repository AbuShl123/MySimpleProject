package builder.secondEx;

public class RegisterIn {
    public static void main(String[] args) {
        Profile user = new Profile("Abu989", 15);
        user.setDescription("i am a java learner");
        System.out.println(user);

        Profile user2 = new Profile("James_001", 32);
        System.out.println(user2);

        System.out.println();
        System.out.println(Profile.dataBase);

        try {
            Profile obj = new Profile("James_001", 14);
            System.out.println(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
