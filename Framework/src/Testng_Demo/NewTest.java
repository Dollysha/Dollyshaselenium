package Testng_Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	    
		
	}
	
	@Test(priority=0)
  public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	    Thread.sleep(3000);
	    System.out.println("The browser is opened");
  }
	//@Test(enabled=false)
	@Test(priority=1)
	public void Admin() throws InterruptedException {
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dashboard1")).click();
		Thread.sleep(3000);
	}
		@Test(priority=2)
		public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Logout")).click();
		  Thread.sleep(3000);
	}
	

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
