package services;

import models.Client;
import models.Flight;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public void reserveFlightForClient(String clientId, Flight flight) {
        for (Client client : clients) {
            if (client.getId().equals(clientId)) {
                client.reserverVol(flight);
                System.out.println("Client " + clientId + " reserved flight " + flight.getId());
                return;
            }
        }
        System.out.println("Client " + clientId + " not found.");
    }

    public Client getClientById(String id) {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }
}
