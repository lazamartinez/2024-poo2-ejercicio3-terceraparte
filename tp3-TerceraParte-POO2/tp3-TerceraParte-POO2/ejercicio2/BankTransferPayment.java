package ejercicio2;

/**
 * Implementación del método de pago con transferencia bancaria.
 */
public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago con transferencia bancaria: $" + amount);
    }
}
