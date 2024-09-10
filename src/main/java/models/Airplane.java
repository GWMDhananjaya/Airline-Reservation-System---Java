package models;

public class Airplane {
    // Fields to store the airplane ID and its availability status
    private String id;
    private boolean available;

    // Constructor to initialize the airplane with an ID and set it as available by default
    public Airplane(String id) {
        this.id = id;
        this.available = true;
    }

    // Method to assign a flight to the airplane, marking it as unavailable
    public void affecterVol() {
        if (available) {
            available = false;
        }
    }

    // Method to check if the airplane is available for new flights
    public boolean verifierDisponibilite() {
        return available;
    }

    // Method to get the airplane ID
    public String getId() {
        return id;
    }
}
