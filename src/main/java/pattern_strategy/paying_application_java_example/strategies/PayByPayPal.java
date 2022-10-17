package pattern_strategy.paying_application_java_example.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 * concrete strategy implements PayPal payment method
 */
public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("amanda1982", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    /**
     * collect customer's data
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Enter the user's name: ");
                this.email = READER.readLine();
                System.out.print("Enter the user's password: ");
                this.password = READER.readLine();

                if (verify()) {
                    System.out.println("Data verification has been successful");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Save customer data for future shopping elements
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal");
            return true;
        } else {
            return false;
        }
    }


    public boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
