package main;

import models.*;
import services.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Initialize services to manage different entities (airplanes, clients, crew, flights)
        AirplaneService airplaneService = new AirplaneService();
        ClientService clientService = new ClientService();
        CrewService crewService = new CrewService();
        FlightService flightService = new FlightService();
        // Removed the unused ReservationService to keep the code clean
        // ReservationService reservationService = new ReservationService();

        // Create a new airplane and add it to the airplane service
        Airplane airplane1 = new Airplane("A1");
        airplaneService.addAirplane(airplane1);

        // Create a new client and add it to the client service
        Client client1 = new Client("C1", "John Doe");
        clientService.addClient(client1);

        // Create a pilot and add them to the crew service
        Crew pilot = new Crew("P1", "Captain Smith", "Pilot");
        crewService.addCrew(pilot);

        // Create two cabin crew members and add them to the crew service
        Crew cabinCrew1 = new Crew("CC1", "Alice", "Cabin Crew");
        Crew cabinCrew2 = new Crew("CC2", "Bob", "Cabin Crew");
        crewService.addCrew(cabinCrew1);
        crewService.addCrew(cabinCrew2);

        // Create a flight to Paris and add it to the flight service
        Flight flight1 = new Flight("F1", "Paris");
        flightService.addFlight(flight1);

        // Assign the pilot and cabin crew to the flight
        List<Crew> cabinCrew = new ArrayList<>();
        cabinCrew.add(cabinCrew1);
        cabinCrew.add(cabinCrew2);
        flightService.assignPilotAndCrewToFlight("F1", pilot, cabinCrew);

        // Reserve the flight for the client
        clientService.reserveFlightForClient("C1", flight1);

        // Assign the flight to the airplane
        airplaneService.assignFlightToAirplane("A1", flight1);

        // Update the flight's destination and schedule it for New York
        flightService.scheduleFlight("F1", "New York");

        // Display the client's flight reservations
        System.out.println("Client " + client1.getName() + " reservations:");
        for (Reservation reservation : client1.obtenirReservations()) {
            System.out.println("- Flight to " + reservation.getFlight().getDestination());
        }
    }
}
