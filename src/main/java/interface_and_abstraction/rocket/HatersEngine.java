package interface_and_abstraction.rocket;

public class HatersEngine extends EngineProperties implements IEngine {

    public String getCop = "ExtremeCodeTV EngineCreator";
    public String advertisement = "ads";
    // above fields will not be seen if class were instantiated through the interface;
    // BUT! They are not disappearing or being removed, their access just becomes private;

    public HatersEngine() {
        super(322, 415);
    }

    @Override
    public void start() {
        System.out.println("Haters' back are firing. Traction at maximum.");
    }

    @Override
    public void stop() {
        System.out.println("Pushing out a good content. Haters' backs are cooling down");
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getPower() {
        return power;
    }
}

