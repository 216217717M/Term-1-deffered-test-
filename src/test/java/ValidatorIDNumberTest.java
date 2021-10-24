/**APPLICATION DEVELOPMET PRACTICE 2
 * TERM1 ASSESSMENT 1
 * @author Tshepang Molefe 216417717
 *  22 oCTOBER 2021 ValidatorIDNumber
 */

package Testfolder;

//import com.mycompany.term1ass3.IDNumberValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
import za.ac.mycput.sicktestproject.ValidatorIDNumber;
public class ValidatorIDNumberTest {
    
    
    ValidatorIDNumber vdator = null;
    ValidatorIDNumber vdator2 = null;
    public ValidatorIDNumberTest() {
         
    }
    
@BeforeEach
    public void setUp() {
        vdator = new ValidatorIDNumber();
        vdator2 = new ValidatorIDNumber();
        vdator2 = vdator;
    }
    
@Test
    public void equalityTest()
    {
        assertEquals(vdator, vdator2);
    }
    
@Test
    public void failingTest()
    {
	fail("This test fails");
    }

//Timeout Test
 //Timeouts
// timed out after 1000 miliseconds    
@Test
@Timeout(3)
    public void timeoutTest() throws InterruptedException
    {
        Thread.sleep(1000);
    }
//disabled test
@Test
@Disabled
    public void disabledTest()
    {
    System.out.println("This test is disabled");
    }
  
    
    
 
    
}

