package org.launchcode.techjobs.oo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // First constructor to initialize a unique id
    public Job() {
        id = nextId;
        nextId++;
    }
    // Second constructor takes 5 parameters and assigns values to all the fields.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call to the first constructor to set the id
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Create a toString method that generates a lineSeparator before and after the job information to pass the test
    // Modified the toString method to make the testToStringContainsCorrectLabelsAndData test pass
    // The String should contain a label for each field followed by the corresponding data stored in it. Each on their own line.
    // Using a ternary conditional check if the fields are missing data. If true print "Data not available" to pass testToStringHandlesEmptyField
    public String toString() {
        return lineSeparator() +
                "ID: " + id + lineSeparator() +
                "Name: " + (name.isEmpty() ? "Data not available" : name) + lineSeparator() +
                "Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer) + lineSeparator() +
                "Location: " + (location.getValue().isEmpty() ? "Data not available" : location) + lineSeparator() +
                "Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType) + lineSeparator() +
                "Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency) +
                lineSeparator();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
