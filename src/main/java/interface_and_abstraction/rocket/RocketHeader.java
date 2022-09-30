package interface_and_abstraction.rocket;

public class RocketHeader {
    public int cosmonauts;
    public int massShell;

    public RocketHeader() {
        cosmonauts = 3;
        massShell = 5000;
    }

    public int getWeight() {
        return (cosmonauts * 80) + massShell;
    }

    public void sendMessage(String message) {
        System.out.println("Message: ");
        System.out.println(message);
        System.out.println("Is sent");
    }
}
