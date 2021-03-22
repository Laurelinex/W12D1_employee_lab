import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Kevin", "000000X", 30000.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Kevin", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("000000X", developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.99, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(0.01);
        assertEquals(30001.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        developer.payBonus();
        assertEquals(300.01, developer.payBonus(), 0.01);
    }

}
