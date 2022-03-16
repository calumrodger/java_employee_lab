import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Director;
import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee manager;
    Employee developer;
    Employee databaseAdmin;
    Employee director;
    String newName;


    @Before
    public void before(){
    manager = new Manager ("Bob", "FG146182A", 30000, "CodeClan");
    developer = new Developer ("John", "JW216572A", 25000);
    databaseAdmin = new DatabaseAdmin("Sandra", "FG789043D", 18000);
    director = new Director("Tony", "GH862341S", 50000, "CodeClan HO", 1000000);
    }

    @Test
    public void canRaiseManagerSalary(){
    manager.raiseSalary(5000);
    assertEquals(35000, manager.getSalary());
    }

    @Test
    public void cannotProvideNegativeSalaryRaise(){
    manager.raiseSalary(-1000);
    assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canRaiseDeveloperSalary(){
    developer.raiseSalary(5000);
    assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canRaiseDatabaseAdminSalary(){
    databaseAdmin.raiseSalary(5000);
    assertEquals(23000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseDirectorSalary(){
    director.raiseSalary(5000);
    assertEquals(55000, director.getSalary());
    }

    @Test
    public void canPayManagerBonus(){
        assertEquals(300.00, manager.payBonus(), 0);
    }

    @Test
    public void canPayDeveloperBonus(){
        assertEquals(250.00, developer.payBonus(), 0);
    }

    @Test
    public void canPayDatabaseAdminBonus(){
        assertEquals(180.00, databaseAdmin.payBonus(), 0);
    }

    @Test
    public void canPayDirectorBonus(){
        assertEquals(1000.00, director.payBonus(), 0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Tommy");
        assertEquals("Tommy", manager.getName());
    }

    @Test
    public void canPreventNullInNameChange(){
        manager.setName(newName);
        assertEquals("Bob", manager.getName());
    }


}
