package org.launchcode.techjobs.oo;

import java.util.Objects;

// Modify to extend the JobField class
// remove any and all redundant code that matches what's now contained within the new base class JobField
public class Employer extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }

    // Replace the original constructors using super and passing in the (value)
    public Employer(String value) {
        super(value);
    }
}

    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
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
