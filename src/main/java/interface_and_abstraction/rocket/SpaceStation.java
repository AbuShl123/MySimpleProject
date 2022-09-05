package interface_and_abstraction.rocket;

public class SpaceStation {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket();
        rocket1.Engine = new HatersEngine();
        rocket1.Header = new RocketHeader();

        int result = specialNasaMethod(rocket1.Engine.getPower(), rocket1.Weight());

        if (result > 200) {
            rocket1.Engine.start();
        } else {
            System.out.println("Sorry, this engine does not work, need another one");
        }

        Rocket rocket2 = new Rocket();
        rocket2.Engine = new CryEngine();
        rocket2.Header = new RocketHeader();

        int result2 = specialNasaMethod(rocket2.Engine.getPower(), rocket2.Weight());

        if (result2 > 200) {
            rocket1.Engine.start();
        } else {
            System.out.println("Sorry, this engine does not powerful enough, need another one");
        }
    }

    public static int specialNasaMethod(int power, int mass) {
        return (mass/power * 10) + 82;
    }
}
