package services;

import models.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public Reservation getReservationById(String id) {
        for (Reservation reservation : reservations) {
            if (reservation.getId().equals(id)) {
                return reservation;
            }
        }
        return null;
    }

    public void cancelReservation(String reservationId) {
        reservations.removeIf(reservation -> reservation.getId().equals(reservationId));
        System.out.println("Reservation " + reservationId + " has been cancelled.");
    }
}
