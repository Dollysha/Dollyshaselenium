package MavPack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class Assertconditions {
  @Test(priority = 0)
  public void yogeesh() {
	  
	  AssertJUnit.assertEquals("aditya", "aditya");//if tushar=aditya then run all cases otherwise not
	  System.out.println("This is first case");
  }
  
  @Test(priority = 1,dependsOnMethods = "yogeesh",alwaysRun = true)
  public void pratiksha() {
	  System.out.println("This is second case");
  }
  @Test(priority = 2,dependsOnMethods = "yogeesh")
  public void meghna() {
	  System.out.println("This is third case");
  } 
  @Test(priority=3)
  public void prashant() {
	  System.out.println("This is fourth case");
  }
	  
  /*@BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }*/

}
