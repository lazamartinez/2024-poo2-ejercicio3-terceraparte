package ejercicio1;

/**
 * Clase que representa una reserva de vuelo.
 */
public class FlightBooking {
    private String seatSelection;
    private int baggageCount;
    private String mealType;
    private boolean premiumServices;

    private FlightBooking(Builder builder) {
        this.seatSelection = builder.seatSelection;
        this.baggageCount = builder.baggageCount;
        this.mealType = builder.mealType;
        this.premiumServices = builder.premiumServices;
    }

    public String getSeatSelection() {
        return seatSelection;
    }

    public int getBaggageCount() {
        return baggageCount;
    }

    public String getMealType() {
        return mealType;
    }

    public boolean hasPremiumServices() {
        return premiumServices;
    }

    @Override
    public String toString() {
        return "FlightBooking {" +
                "Seat='" + seatSelection + '\'' +
                ", Baggage=" + baggageCount +
                ", Meal='" + mealType + '\'' +
                ", Premium Services=" + premiumServices +
                '}';
    }

    /**
     * Builder para construir una instancia de FlightBooking.
     */
    public static class Builder {
        private String seatSelection;
        private int baggageCount;
        private String mealType;
        private boolean premiumServices;

        public Builder setSeatSelection(String seatSelection) {
            this.seatSelection = seatSelection;
            return this;
        }

        public Builder setBaggageCount(int baggageCount) {
            this.baggageCount = baggageCount;
            return this;
        }

        public Builder setMealType(String mealType) {
            this.mealType = mealType;
            return this;
        }

        public Builder setPremiumServices(boolean premiumServices) {
            this.premiumServices = premiumServices;
            return this;
        }

        public FlightBooking build() {
            return new FlightBooking(this);
        }
    }
}
