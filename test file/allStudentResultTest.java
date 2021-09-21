import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.allStudentResult;


public class allStudentResultTest {
    
    public allStudentResultTest() {
    }
    allStudentResult ASR;
    
    @Before
    public void setUp() {
        ASR = new allStudentResult();
    }
    
    @Test
    public void checkStatusTest() {
        assertSame("failed",ASR.checkStatus(90, 90, 50, 60, 50));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
