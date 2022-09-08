package interface_and_abstraction.rocket;

public class Rocket {

    public RocketHeader Header;
    public IEngine Engine;

    public int Weight() {
        return Header.getWeight() + Engine.getWeight();
    }
}
