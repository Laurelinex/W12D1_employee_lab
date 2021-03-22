import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Barry", "A38666", 40500.00, "Sales");
    }

    @Test
    public void canGetName() {
        assertEquals("Barry", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("A38666", manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(500.00);
        assertEquals(41000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(405, manager.payBonus(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfNegAmount() {
        manager.raiseSalary(-500);
        assertEquals(40500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeNameIfNotNull() {
        manager.setName("Francesca");
        assertEquals("Francesca", manager.getName());
    }

    @Test
    public void cannotChangeNameIfNull() {
        manager.setName("");
        assertEquals("Barry", manager.getName());
    }

    @Test
    public void checkIfSetNameRemovesWhiteSpace() {
        manager.setName("  Al");
        assertEquals("Al", manager.getName());
    }

}
