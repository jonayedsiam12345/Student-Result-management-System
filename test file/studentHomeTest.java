import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import View.studentHome;


public class studentHomeTest {
    
    public studentHomeTest() {
    }
    
    studentHome SH;
    
    @Before
    public void setUp() {
        SH = new studentHome();
    }
    
    @Test
    public void TestStudentHome() {
        assertEquals(450, SH.SumOfMarks(90,90,90,90,90));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
