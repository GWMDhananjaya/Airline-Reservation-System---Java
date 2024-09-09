package models;

import java.util.UUID;

public class Reservation {
    private String id;
    private Flight flight;

    public Reservation(Flight flight) {
        this.id = UUID.randomUUID().toString();
        this.flight = flight;
    }

    public String getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }
    
}
