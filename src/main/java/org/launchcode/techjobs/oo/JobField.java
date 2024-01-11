package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.util.Objects.hash;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    //Custom methods
    @Override
    public String toString() { return value; }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public int getId() { return id; }

}
