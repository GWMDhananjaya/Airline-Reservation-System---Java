package models;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    
    private String id;
    private String destination;
    private Crew pilot;
    private List<Crew> cabinCrew;
    private List<Client> clients;

    public Flight(String id, String destination) {
        this.id = id;
        this.destination = destination;
        this.cabinCrew = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Crew getPilot() {
        return pilot;
    }

    public void setPilot(Crew pilot) {
        this.pilot = pilot;
    }

    public List<Crew> getCabinCrew() {
        return cabinCrew;
    }

    public void addCabinCrew(Crew crew) {
        this.cabinCrew.add(crew);
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void affecterVol(Crew pilot, List<Crew> cabinCrew) {
        this.pilot = pilot;
        this.cabinCrew.addAll(cabinCrew);
    }

    public void obtenirVol() {
        System.out.println("Flight ID: " + id + ", Destination: " + destination);
        System.out.println("Pilot: " + (pilot != null ? pilot.getName() : "None"));
        System.out.println("Cabin Crew: " + (cabinCrew.isEmpty() ? "None" : ""));
        for (Crew crew : cabinCrew) {
            System.out.println("- " + crew.getName());
        }
    }

    public void planifierVol(String newDestination) {
        setDestination(newDestination);
        System.out.println("Flight " + id + " has been scheduled to " + newDestination);
    }

    public void annulerVol() {
        this.pilot = null;
        this.cabinCrew.clear();
        this.clients.clear();
        System.out.println("Flight " + id + " has been cancelled.");
    }
}
