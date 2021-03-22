import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Janet", "123456AB", 80200.00, "Sales");
    }

    @Test
    public void canGetName() {
        assertEquals("Janet", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("123456AB", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(80200.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(0, director.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget() {
        director.setBudget(200000.00);
        assertEquals(200000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20000.00);
        assertEquals(100200.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        director.payBonus();
        assertEquals(1604, director.payBonus(), 0.01);
    }

}
