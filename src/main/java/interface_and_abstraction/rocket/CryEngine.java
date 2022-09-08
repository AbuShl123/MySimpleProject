package interface_and_abstraction.rocket;

public class CryEngine extends EngineProperties implements IEngine{
    public String companyName = "CryCountry++";
    public String advertisement = "ads";
    // above fields will not be seen if we will instantiate the object through the IEngine interface.

    public CryEngine() {
        super(500, 100); // initializing weight and power
    }

    @Override
    public void start() {
        System.out.println("Haters are crying, using this energy starting launching");
    }

    @Override
    public void stop() {
        System.out.println("Good content was pushed out, haters calmed down");
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getPower() {
        return weight;
    }
}
