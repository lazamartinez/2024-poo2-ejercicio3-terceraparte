package ejercicio2;

/**
 * Factory para crear instancias de BankTransferPayment.
 */
public class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}

