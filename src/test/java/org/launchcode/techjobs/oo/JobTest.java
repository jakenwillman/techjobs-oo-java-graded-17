package org.launchcode.techjobs.oo;
import org.junit.Test;
import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.*;

public class JobTest {
    //TODO: Create your unit tests here

    // Define test called testSettingJobId() and annotate it with @Test
    @Test
    public void testSettingJobId() {
        // Create two job objects using the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        // Use assertNotEquals to verify the IDs of both objects are unique and not matching
        assertNotEquals(job1.getId(), job2.getId());
    }

    // Define a test call testJobConstructorSetsAllFields
    @Test
    public void testJobConstructorSetsAllFields() {
        // Declare and initialize a new Job object with the data provided
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals to test each field
        // Check if the id is a positive integer using assertTrue as we expect the result to be a boolean (a number greater than 0)
        assertTrue(job.getId() > 0);
        // Use assertEquals for the following checks, as we expect the strings to match exactly to the value of each field
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        // Generate two Job objects that have identical fields EXCEPT for id.
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // use assertFalse to check that the equals method returns false because the Jobs IDs are different
        assertFalse(job1.equals(job2));
    }
}
