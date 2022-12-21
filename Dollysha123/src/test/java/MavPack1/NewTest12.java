package MavPack1;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest12 {
	WebDriver dr;
	@BeforeTest
	public void beforeTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.navigate().to("https://rahulshettyacademy.com/practice-project");
		WebElement wb=dr.findElement(By.linkText("More"));
		Actions act=new Actions(dr);
		Thread.sleep(6000);
		act.moveToElement(wb).build().perform();
		Robot rc=new Robot();
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
		//dr.findElement(By.xpath("//*[@class='nav-outer clearfix']/nav/div[2]/ul/li[1]"));
		//dr.findElement(By.xpath("//*[@class='pull-left logo-outer']"));
		//dr.findElement(By.xpath("//*[@class='navigation clearfix']"));
		//dr.findElement(By.xpath("//*[@class='theme-btn register-btn']"));
		dr.findElement(By.xpath("//*[@class='clearfix']/div[2]/ul/li[1]"));
		
	}
  @Test
  public void f() {
  }
  @AfterTest
	public void afterTest(){
	  
		
	}
}
