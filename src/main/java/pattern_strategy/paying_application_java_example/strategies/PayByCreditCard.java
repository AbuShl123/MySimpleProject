package pattern_strategy.paying_application_java_example.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete strategy. Implements credit card payment method.
 */
public class PayByCreditCard implements PayStrategy{
    private static final List<CreditCard> DATA_BASE;

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    static {
        DATA_BASE = new ArrayList<>();
        DATA_BASE.add(new CreditCard("9901 4992 8118 0230", "04/27", "07"));
        DATA_BASE.add(new CreditCard("4991 6606 1204 4404", "03/26", "31"));
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!cardIsPresent()) {
                System.out.print("Enter the card number: ");
                String number = READER.readLine();
                System.out.print("Enter the card expiration date 'mm/yy': ");
                String date = READER.readLine();
                System.out.print("Enter CVV code: ");
                String cvv = READER.readLine();
                CreditCard current = new CreditCard(number, date, cvv);
                if (DATA_BASE.contains(current)) {
                    this.card = current;
                } else {
                    System.out.println("Card not found!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * After card validation we can change customer's credit card
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
