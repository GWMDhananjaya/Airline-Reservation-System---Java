package models;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    
    // Fields to store flight details: ID, destination, pilot, cabin crew, and clients
    private String id;
    private String destination;
    private Crew pilot;
    private List<Crew> cabinCrew;
    private List<Client> clients;

    // Constructor to initialize the flight with an ID and destination
    public Flight(String id, String destination) {
        this.id = id;
        this.destination = destination;
        this.cabinCrew = new ArrayList<>(); // Initialize empty list for cabin crew
        this.clients = new ArrayList<>();   // Initialize empty list for clients
    }

    // Getter for flight ID
    public String getId() {
        return id;
    }

    // Getter for flight destination
    public String getDestination() {
        return destination;
    }

    // Setter for flight destination
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Getter for pilot
    public Crew getPilot() {
        return pilot;
    }

    // Setter for pilot
    public void setPilot(Crew pilot) {
        this.pilot = pilot;
    }

    // Getter for cabin crew list
    public List<Crew> getCabinCrew() {
        return cabinCrew;
    }

    // Method to add a cabin crew member to the flight
    public void addCabinCrew(Crew crew) {
        this.cabinCrew.add(crew);
    }

    // Getter for client list
    public List<Client> getClients() {
        return clients;
    }

    // Method to add a client to the flight
    public void addClient(Client client) {
        this.clients.add(client);
    }

    // Method to assign a pilot and cabin crew to the flight
    public void affecterVol(Crew pilot, List<Crew> cabinCrew) {
        this.pilot = pilot;
        this.cabinCrew.addAll(cabinCrew); // Adds the entire list of cabin crew members
    }

    // Method to display flight details, including the pilot and cabin crew
    public void obtenirVol() {
        System.out.println("Flight ID: " + id + ", Destination: " + destination);
        System.out.println("Pilot: " + (pilot != null ? pilot.getName() : "None")); // Displays pilot if assigned
        System.out.println("Cabin Crew: " + (cabinCrew.isEmpty() ? "None" : ""));
        for (Crew crew : cabinCrew) { // Displays each cabin crew member
            System.out.println("- " + crew.getName());
        }
    }

    // Method to reschedule the flight to a new destination
    public void planifierVol(String newDestination) {
        setDestination(newDestination); // Update destination
        System.out.println("Flight " + id + " has been scheduled to " + newDestination);
    }

    // Method to cancel the flight, clearing pilot, crew, and clients
    public void annulerVol() {
        this.pilot = null;             // Remove pilot assignment
        this.cabinCrew.clear();        // Clear all cabin crew assignments
        this.clients.clear();          // Clear all client reservations
        System.out.println("Flight " + id + " has been cancelled.");
    }
}
