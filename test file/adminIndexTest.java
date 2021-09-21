import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Controller.adminIndex;


public class adminIndexTest {
    
    public adminIndexTest() {
    }
    
    adminIndex AI;
    
    @Before
    public void setUp() {
        AI = new adminIndex();
    }
    
    @Test
    public void checkUserNameTest() {
        assertSame("correct", AI.checkUserName("Admin"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
