package interface_and_abstraction.rocket;

public abstract class EngineProperties {
    public final int weight;
    public final int power;

    public EngineProperties(int weight, int power) {
        this.weight = weight;
        this.power = power;
    }
}
