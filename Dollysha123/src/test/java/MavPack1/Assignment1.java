package MavPack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment1 {
	WebDriver wd;
  @BeforeTest
  public void beforeTest() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
      WebDriver wd= new ChromeDriver();
      wd.manage().window().maximize();
      wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      Thread.sleep(3000);
      
      
      wd.findElement(By.name("username")).sendKeys("Admin");
	  Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
		Thread.sleep(2000);
	    wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	    Thread.sleep(2000);
  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
  Thread.sleep(2000);
  String ActualTitle=wd.getTitle();
  System.out.println(ActualTitle);
  Thread.sleep(2000);
 wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
  Thread.sleep(2000);
 Robot rc=new Robot();
 rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
 wd.findElement(By.linkText("Alice.Duval")).click();
  }
  
		@Test
		public void testing() {
			 
		      
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
