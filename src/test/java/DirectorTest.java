import org.junit.Before;
import org.junit.Test;
import staff.management.Director;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tony", "GH862341S", 50000, "CodeClan HO", 1000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0);
    }
}
