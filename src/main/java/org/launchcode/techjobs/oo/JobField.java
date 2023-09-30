package org.launchcode.techjobs.oo;

import java.util.Objects;

// Declare each of the common fields shared between Employer, Location, Core Competency, and Position Type classes
// Make the JobField class an abstract class to prevent the creation of a JobField object
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    // Code the common repeated constructors
    // 1st constructor
    public JobField() {
        id = nextId;
        nextId++;
    }
    // 2nd constructor
    public JobField(String value) {
        this();
        this.value = value;
    }

    // Use generate to create all the appropriate getters and setters that are reused between the other classes
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Generate the reused equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Create the commonly reused toString method
    @Override
    public String toString() {
        return value;
    }
}


