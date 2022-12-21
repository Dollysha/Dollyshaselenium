package MavPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	public String URL1="https://www.google.com/";
	public String URL2="https://www.amazon.com/";
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL1);
		//driver.navigate().to(URL2);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    
		
	}
	
	@Test
  public void actions() throws InterruptedException, AWTException {
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
		//link.click();
		//Actions act=new Actions(driver);
		//act.contextClick().build().perform();
		//act.keyDown(URL1);
		//Robot rc=new Robot();
		//rc.keyPress(MenuKeyEvent.VK_DOWN);
		//Thread.sleep(3000);
		//rc.keyPress(MenuKeyEvent.VK_CONTROL);
		//rc.keyPress(MenuKeyEvent.VK_TAB);
		//rc.keyPress(MenuKeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.contextClick(link).build().perform();
	    Robot rc=new Robot();
	    Thread.sleep(3000);
	    rc.keyPress(MenuKeyEvent.VK_DOWN);
	    rc.keyPress(MenuKeyEvent.VK_ENTER);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	    rc.keyPress(MenuKeyEvent.VK_TAB);
	    rc.keyRelease(MenuKeyEvent.VK_CONTROL);
	    rc.keyRelease(MenuKeyEvent.VK_TAB);
		
	    //WebElement link1=driver.findElement(By.xpath("//*[contains(text(),'Create an account')]"));
	   // Thread.sleep(3000);
		
	   // Actions act1=new Actions(driver);
		//act1.click(link1).build().perform();
  }
	

 //@AfterTest
  //public void afterTest() {
 //driver.close();
	
  }
//}

  