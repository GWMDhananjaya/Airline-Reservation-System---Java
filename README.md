Airline Reservation System (Java)

The Airline Reservation System is a comprehensive application built using Java, designed to facilitate the management of essential airline operations such as flight reservations, client management, airplane details, and crew management. This project showcases a well-structured object-oriented programming (OOP) approach and follows the MVC (Model-View-Controller) architecture, ensuring maintainability and scalability.

https://github.com/user-attachments/assets/47369ac9-0f89-4a22-ba27-ffb85790ef10

Features

⚪ Airplane Management: Add and manage airplane details like models, seating capacity, etc.

⚪ Flight Scheduling: Create and manage flight details including departure, arrival times, and routes.

⚪ Reservation System: Handle client reservations, cancellations, and modifications.

⚪ Crew Management: Assign crew members to flights and manage their schedules.

⚪ Client Management: Store client details and their booking history.


Project Structure : 
The project is organized into two main components:

1. Models (src/main/java/models) .
These classes define the core entities of the system:

Airplane.java: Represents the airplane details (e.g., capacity, model).

⚪ Client.java: Stores information about the clients making flight reservations.

⚪ Crew.java: Manages crew details, including pilots and flight attendants.

⚪ Flight.java: Holds all flight-related information like destinations, flight times, etc.

⚪ Reservation.java: Stores and manages flight reservation data.

⚪ Person.java: A base class for handling common attributes (e.g., name, age) between clients and crew.

2. Services (src/main/java/services) .
The services layer contains business logic for each entity:

⚪ AirplaneService.java: Handles airplane-related operations like creating and managing airplanes.

⚪ ClientService.java: Manages client accounts and their reservations.

⚪CrewService.java: Handles all processes related to crew members.

⚪ FlightService.java: Manages flight schedules and flight assignments.

⚪ ReservationService.java: Processes flight reservations, modifications, and cancellations.


Technologies Used :

⚪ Java: Core programming language.

⚪ Object-Oriented Design: Used to manage airline operations in a modular way.

⚪ MVC Pattern: Ensures a clean separation between the application's data, logic, and presentation.

⚪ Version Control (Git): Git for source code management.

How to Run the Application

Clone the repository.

Navigate to the project directory:
    cd airline-reservation-system
    
Compile and run the application:
    javac -d build/classes src/main/java/**/*.java
    java -cp build/classes main.App
    
Contributing
We welcome contributions to enhance the system. Feel free to submit pull requests or open issues for any bugs or suggestions.
