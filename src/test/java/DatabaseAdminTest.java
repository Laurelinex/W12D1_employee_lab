import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before() {
        admin = new DatabaseAdmin("Larry", "BIS67GG", 30000.99);
    }

    @Test
    public void canGetName() {
        assertEquals("Larry", admin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("BIS67GG", admin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000.99, admin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(0.01);
        assertEquals(30001.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        admin.payBonus();
        assertEquals(300.01, admin.payBonus(), 0.01);
    }

}
