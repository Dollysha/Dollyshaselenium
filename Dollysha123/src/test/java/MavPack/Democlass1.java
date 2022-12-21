package MavPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Democlass1 {
	
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.manage().window().maximize();
	wd.navigate().to("https://demoqa.com/");
	Thread.sleep(5000);
	Robot rc=new Robot();
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	WebElement wb=wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]"));//elements
	Thread.sleep(2000);
	Actions act=new Actions(wd);
	act.click(wb).build().perform();
	Thread.sleep(2000);
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	
	
	Thread.sleep(2000);
	WebElement we=wd.findElement(By.xpath("(//*[@class=\'header-right\'])[5]"));//interaction
	act.click(we).build().perform();
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	
	WebElement we2=wd.findElement(By.xpath("(//*[@class='left-pannel']/div[1]/div[5]/div/ul/li[4]/span"));//droppable
	act.click(we2).build().perform();
	Thread.sleep(2000);
	
	
	WebElement from=wd.findElement(By.id("draggable"));
	WebElement to=wd.findElement(By.id("droppable"));
	act.dragAndDrop(from, to).build().perform();
	Thread.sleep(3000);
	
    
	
	//wd.close();
}
}
