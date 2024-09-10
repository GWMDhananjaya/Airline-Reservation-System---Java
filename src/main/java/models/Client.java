package models;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    // List to store the client's flight reservations
    private List<Reservation> reservations;

    // Constructor that initializes the client with an ID, name, and creates an empty list of reservations
    public Client(String id, String name) {
        super(id, name, "Client"); // Calls the constructor of the parent class Person
        this.reservations = new ArrayList<>();
    }

    // Method to make a flight reservation for the client
    public void reserverVol(Flight flight) {
        Reservation reservation = new Reservation(flight);
        reservations.add(reservation); // Adds the new reservation to the list
    }

    // Method to cancel a reservation using the reservation ID
    public void annulerReservation(String reservationId) {
        reservations.removeIf(reservation -> reservation.getId().equals(reservationId)); // Removes the reservation if the IDs match
    }

    // Method to get the list of reservations for the client
    public List<Reservation> obtenirReservations() {
        return reservations;
    }
}
