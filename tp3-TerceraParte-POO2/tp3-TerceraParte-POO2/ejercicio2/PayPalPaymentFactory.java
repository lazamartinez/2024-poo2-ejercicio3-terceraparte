package ejercicio2;

/**
 * Factory para crear instancias de PayPalPayment.
 */
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

