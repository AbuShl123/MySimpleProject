package pattern_factory_method.game.darkForces;

public class OldTree extends DarkProperties {

    public OldTree() {
        super("Old Tree", 100, 4);
    }

    @Override
    public void attack() {
        System.out.println("Old tree scares you!");
    }
}
