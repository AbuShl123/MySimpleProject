package pattern_strategy.paying_application_java_example;

import pattern_strategy.paying_application_java_example.order.Order;
import pattern_strategy.paying_application_java_example.strategies.PayByCreditCard;
import pattern_strategy.paying_application_java_example.strategies.PayByPayPal;
import pattern_strategy.paying_application_java_example.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static final Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2000);
        priceOnProducts.put(2, 1780);
        priceOnProducts.put(3, 1990);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;

            do {
                System.out.println("Please select product: " + "\n" +
                        "1 - Mother Board \n" +
                        "2 - CPU \n" +
                        "3 - HDD \n" +
                        "4 - Memory");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Do you wish continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please select a payment method: " + "\n" +
                        "1 - PalPay " + "\n" +
                        "2 - Credit Card");
                String paymentMethod = reader.readLine();

                // Client creates different strategies based on input from user
                // application configuration etc.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);
            System.out.print("Pay: " + order.getTotalCost() + " units or continue shopping? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else  {
                    System.out.println("FAIL! Please check your data.");
                }
                order.setClosed();
            }
        }
    }
}
