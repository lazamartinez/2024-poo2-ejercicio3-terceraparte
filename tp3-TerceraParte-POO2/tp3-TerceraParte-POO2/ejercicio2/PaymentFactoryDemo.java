package ejercicio2;

/**
 * Clase principal para demostrar el uso del patrón Factory Method.
 */
public class PaymentFactoryDemo {
    public static void main(String[] args) {
        // Crear un método de pago utilizando el Factory Method

        PaymentFactory factory = new CreditCardPaymentFactory();
        Payment payment = factory.createPayment();
        payment.processPayment(150.75);

        factory = new PayPalPaymentFactory();
        payment = factory.createPayment();
        payment.processPayment(75.50);

        factory = new BankTransferPaymentFactory();
        payment = factory.createPayment();
        payment.processPayment(300.00);
    }
}

