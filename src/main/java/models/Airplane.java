package models;

public class Airplane {
    private String id;
    private boolean available;

    public Airplane(String id) {
        this.id = id;
        this.available = true;
    }

    public void affecterVol() {
        if (available) {
            available = false;
        }
    }

    public boolean verifierDisponibilite() {
        return available;
    }

    // Add the getId() method
    public String getId() {
        return id;
    }
    
}
