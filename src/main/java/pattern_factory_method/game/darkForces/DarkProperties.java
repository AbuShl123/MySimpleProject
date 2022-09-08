package pattern_factory_method.game.darkForces;

public abstract class DarkProperties implements DarkForces{
    private final String name;
    public int health;
    public int damage;

    public DarkProperties(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "\nDarkProperties{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                "}";
    }
}
