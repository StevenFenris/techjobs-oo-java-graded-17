package org.launchcode.techjobs.oo;

import java.util.Objects;

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
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        id = nextId;
        nextId++;
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




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
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

    public String toString(){
        String nextLine = System.lineSeparator();
        String returnedString = nextLine;
        String notAvail = "Data not available";



        returnedString += "ID: " + id + nextLine;
        if (name == null || name == ""){
            returnedString += "Name: " + notAvail + nextLine;
        }else returnedString += "Name: " + name + nextLine;
        if (employer == null || employer.getValue() == ""){
            returnedString += "Employer: " + notAvail + nextLine;
        }else returnedString += "Employer: " + employer + nextLine;
        if (location == null || location.getValue() == ""){
            returnedString += "Location: " + notAvail + nextLine;
        }else returnedString += "Location: " + location + nextLine;
        if (positionType == null || positionType.valueToString() == ""){
            returnedString += "Position Type: " + notAvail + nextLine;
        }else returnedString += "Position Type: " + positionType + nextLine;
        if (coreCompetency == null || coreCompetency.getValue() == ""){
            returnedString += "Core Competency: " + notAvail + nextLine;
        }else returnedString += "Core Competency: " + coreCompetency + nextLine;

        return returnedString;
    }
}

