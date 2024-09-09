package models;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private List<Reservation> reservations;

    public Client(String id, String name) {
        super(id, name, "Client");
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Flight flight) {
        Reservation reservation = new Reservation(flight);
        reservations.add(reservation);
    }

    public void annulerReservation(String reservationId) {
        reservations.removeIf(reservation -> reservation.getId().equals(reservationId));
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }
    
}
