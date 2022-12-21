package MavPack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class groupstestng {
	//smoke testing and regression testing
	//
  @Test(groups="smoke",priority=0)
  public void testcase1() {
	  System.out.println("This is my first smoke test");  	  
  }
  
  @Test(groups="regression",priority=1)
  public void testcase2() {
	  System.out.println("This is my first regression test"); 	  
  }
  
  @Test(groups="smoke",priority=2)
  public void testcase3() {
	  System.out.println("This is my second smoke test");	  	  
  }
  
  
  
  /*@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }*/

}
