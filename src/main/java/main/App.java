package main;

import models.*;
import services.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Services
        AirplaneService airplaneService = new AirplaneService();
        ClientService clientService = new ClientService();
        CrewService crewService = new CrewService();
        FlightService flightService = new FlightService();
        // Remove the unused variable
        // ReservationService reservationService = new ReservationService();

        // Create and add entities
        Airplane airplane1 = new Airplane("A1");
        airplaneService.addAirplane(airplane1);

        Client client1 = new Client("C1", "John Doe");
        clientService.addClient(client1);

        Crew pilot = new Crew("P1", "Captain Smith", "Pilot");
        crewService.addCrew(pilot);

        Crew cabinCrew1 = new Crew("CC1", "Alice", "Cabin Crew");
        Crew cabinCrew2 = new Crew("CC2", "Bob", "Cabin Crew");
        crewService.addCrew(cabinCrew1);
        crewService.addCrew(cabinCrew2);

        Flight flight1 = new Flight("F1", "Paris");
        flightService.addFlight(flight1);

        // Assign pilot and crew to flight
        List<Crew> cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrew1);
        cabinCrew.add(cabinCrew2);
        flightService.assignPilotAndCrewToFlight("F1", pilot, cabinCrew);

        // Reserve a flight for a client
        clientService.reserveFlightForClient("C1", flight1);

        // Assign flight to airplane
        airplaneService.assignFlightToAirplane("A1", flight1);

        // Schedule the flight
        flightService.scheduleFlight("F1", "New York");

        // Get client reservations
        System.out.println("Client " + client1.getName() + " reservations:");
        for (Reservation reservation : client1.obtenirReservations()) {
            System.out.println("- Flight to " + reservation.getFlight().getDestination());
        }
    }
}
