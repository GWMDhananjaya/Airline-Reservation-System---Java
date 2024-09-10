package services;

import models.Crew;
import models.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public Flight getFlightById(String id) {
        for (Flight flight : flights) {
            if (flight.getId().equals(id)) {
                return flight;
            }
        }
        return null;
    }

    public void assignPilotAndCrewToFlight(String flightId, Crew pilot, List<Crew> cabinCrew) {
        Flight flight = getFlightById(flightId);
        if (flight != null) {
            flight.affecterVol(pilot, cabinCrew);
            System.out.println("Flight " + flightId + " has been assigned to pilot " + pilot.getName() + " and cabin crew.");
        } else {
            System.out.println("Flight " + flightId + " not found.");
        }
    }

    public void scheduleFlight(String flightId, String destination) {
        Flight flight = getFlightById(flightId);
        if (flight != null) {
            flight.planifierVol(destination);
        } else {
            System.out.println("Flight " + flightId + " not found.");
        }
    }

    public void cancelFlight(String flightId) {
        Flight flight = getFlightById(flightId);
        if (flight != null) {
            flight.annulerVol();
        } else {
            System.out.println("Flight " + flightId + " not found.");
        }
    }
}
