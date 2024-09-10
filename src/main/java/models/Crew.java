package models;

public class Crew extends Person {
    // Constructor to initialize a crew member with an ID, name, and role
    public Crew(String id, String name, String role) {
        super(id, name, role); // Calls the constructor of the parent class Person
    }
}
