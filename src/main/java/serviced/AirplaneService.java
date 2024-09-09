package services;

import models.Airplane;
import models.Flight;

import java.util.HashMap;
import java.util.Map;

public class AirplaneService {
    private Map<String, Airplane> airplanes = new HashMap<>();

    public void addAirplane(Airplane airplane) {
        airplanes.put(airplane.getId(), airplane);
    }

    public Airplane getAirplane(String id) {
        return airplanes.get(id);
    }

    public void assignFlightToAirplane(String airplaneId, Flight flight) {
        Airplane airplane = airplanes.get(airplaneId);
        if (airplane != null && airplane.verifierDisponibilite()) {
            airplane.affecterVol();
            System.out.println("Flight " + flight.getId() + " assigned to airplane " + airplaneId);
        } else {
            System.out.println("Airplane " + airplaneId + " is not available.");
        }
    }
}
