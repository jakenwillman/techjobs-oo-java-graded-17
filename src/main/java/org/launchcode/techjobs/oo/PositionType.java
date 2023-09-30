package org.launchcode.techjobs.oo;

import java.util.Objects;


// Modify to extend the JobField class
// remove any and all redundant code that matches what's now contained within the new base class JobField
public class PositionType extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }

//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

    // Replace the original constructors using super and passing in the (value)
    public PositionType(String value) {
        super(value);
    }
}

//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    public String toString() {
//        return value;
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
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
