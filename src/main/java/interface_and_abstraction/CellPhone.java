package interface_and_abstraction;

public interface CellPhone {
    void sendMessage(String message);
}

class IPhone implements CellPhone {
    @Override
    public void sendMessage(String message) {
        sendMessageOperator(message);
    }

    public void sendMessageOperator(String message) {
        System.out.println("Message was sent");
    }
}

class Main {
    public static void main(String[] args) {
        CellPhone obj = new IPhone();
        // obj.sendMessageOperator(); this gives an error, because this method is private!!
        obj.sendMessage("Hello, how are you?"); // proof that it still exists

        // we can say this is one more example of encapsulation
    }
}
