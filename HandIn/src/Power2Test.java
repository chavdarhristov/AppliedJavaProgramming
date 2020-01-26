import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.*;

public class Power2Test {

	   @Test
	   public void test1()
	   {
		   PowerFunction first = new PowerFunction();
	      assertEquals(64, first.power2(2, 6));
	   }
	  
	   @Test
	   public void testEven()
	   {
		   PowerFunction pow = new PowerFunction();
	      
	      assertEquals(64, pow.power2(2, 6));
	   }
	   
	   @Test
	   public void testOdd()
	   {
		   PowerFunction pow = new PowerFunction();
	      
	      assertEquals(128, pow.power2(2, 7));
	   }

	}