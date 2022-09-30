package pattern_factory_method.game.darkForces;

public class ForestMonster extends DarkProperties {

    public ForestMonster() {
        super("Forest Monster", 40, 24);
    }

    @Override
    public void attack() {
        System.out.println("forest monster attacks");
    }
}
