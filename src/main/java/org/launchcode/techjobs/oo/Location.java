package org.launchcode.techjobs.oo;

import java.util.Objects;

// Modify to extend the JobField class
// remove any and all redundant code that matches what's now contained within the new base class JobField
public class Location extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

//    public Location(String value) {
//        this(); // call to the empty constructor to initialize the id field
//        this.value = value;
//    }

    // Replace the original constructors using super and passing in the (value)
    public Location(String value) {
        super(value);
    }
}

//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
