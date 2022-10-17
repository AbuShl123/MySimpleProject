package pattern_strategy.paying_application_java_example.strategies;

public interface PayStrategy {
    void collectPaymentDetails();

    boolean pay(int paymentAmount);
}
