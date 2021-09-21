import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import View.registeredStudent;


public class registeredStudentTest {
    
    public registeredStudentTest() {
    }
    
    registeredStudent RS;
    
    @Before
    public void setUp() {
        RS = new registeredStudent();
    }
    
    @Test
    public void checkNameTest() {
        assertSame("valid", RS.checkName("sas"));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
