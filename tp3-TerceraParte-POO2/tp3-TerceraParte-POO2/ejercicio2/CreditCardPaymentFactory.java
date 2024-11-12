package ejercicio2;

/**
 * Factory para crear instancias de CreditCardPayment.
 */
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

