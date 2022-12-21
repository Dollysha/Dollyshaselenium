package MavPack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver wd;
  
  @BeforeTest
  public void beforetest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
      WebDriver wd= new ChromeDriver();
      wd.manage().window().maximize();
      wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(3000);
      
	}
  @Test
  public void testing() {
	  String ActualTitle=wd.getTitle();
      System.out.println(ActualTitle);
      String ExpectedTitle="OrangeHRM";
      Assert.assertEquals(ActualTitle, ExpectedTitle);
  }

  

  //@AfterTest
 // public void aftertest() {
  }


