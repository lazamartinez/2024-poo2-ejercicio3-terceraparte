package ejercicio1;

/**
 * Clase principal para demostrar el uso del patrón Builder.
 */
public class FlightBookingBuilderDemo {
    public static void main(String[] args) {
        // Crear una reserva personalizada utilizando el Builder
        FlightBooking booking = new FlightBooking.Builder()
                .setSeatSelection("Ventana")
                .setBaggageCount(2)
                .setMealType("Vegetariana")
                .setPremiumServices(true)
                .build();

        // Mostrar los detalles de la reserva
        System.out.println(booking);
    }
}
