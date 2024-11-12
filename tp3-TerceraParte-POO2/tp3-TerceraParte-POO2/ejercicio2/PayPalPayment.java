package ejercicio2;

/**
 * Implementación del método de pago con PayPal.
 */
public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con PayPal: $" + amount);
    }
}
