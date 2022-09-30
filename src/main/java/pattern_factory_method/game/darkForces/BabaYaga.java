package pattern_factory_method.game.darkForces;

public class BabaYaga extends DarkProperties {

    public BabaYaga() {
        super("Baba Yaga", 10, 15);
    }

    @Override
    public void attack() {
        System.out.println("Baba Yaga traps you to hut to chicken legs");
    }
}
