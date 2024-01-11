package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() throws ClassNotFoundException {
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob3.getName(), "Product tester");
        assertEquals(testJob3.getEmployer().toString(), "ACME");
        assertEquals(testJob3.getLocation().toString(), "Desert");
        assertEquals(testJob3.getPositionType().valueToString(), "Quality Control");
        assertEquals(testJob3.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job testJob3 = new Job("testJob", new Employer("Ameren"), new Location("Saint Louis"), new PositionType("Operations"), new CoreCompetency("Active Directory"));
        Job testJob2 = new Job("testJob", new Employer("Ameren"), new Location("Saint Louis"), new PositionType("Operations"), new CoreCompetency("Active Directory"));
        assertNotEquals(testJob2, testJob3);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob4 = new Job();
        String newLine = System.lineSeparator();
        assertTrue(testJob4.toString().startsWith(newLine));
        assertTrue(testJob4.toString().endsWith(newLine));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob5 = new Job("testJob", new Employer("Ameren"), new Location("Saint Louis"), new PositionType("Operations"), new CoreCompetency("Active Directory"));
        assertTrue(testJob5.toString().contains("ID: " + testJob5.getId()));
        assertTrue(testJob5.toString().contains("Name: " + testJob5.getName()));
        assertTrue(testJob5.toString().contains("Employer: " + testJob5.getEmployer()));
        assertTrue(testJob5.toString().contains("Location: " + testJob5.getLocation()));
        assertTrue(testJob5.toString().contains("Position Type: " + testJob5.getPositionType()));
        assertTrue(testJob5.toString().contains("Core Competency: " + testJob5.getCoreCompetency()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job();
        assertTrue(testJob.toString().contains("Name: Data not available"));
        assertTrue(testJob.toString().contains("Employer: Data not available"));
        assertTrue(testJob.toString().contains("Location: Data not available"));
        assertTrue(testJob.toString().contains("Position Type: Data not available"));
        assertTrue(testJob.toString().contains("Core Competency: Data not available"));
    }





}
