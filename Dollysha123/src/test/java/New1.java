import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
        WebDriver wd= new ChromeDriver();
        wd.get("https://demoqa.com/droppable");
        Thread.sleep(3000);
	    WebElement we1=wd.findElement(By.id("draggable"));
	    WebElement we2=wd.findElement(By.id("droppable"));
	    Thread.sleep(5000);
	    Actions ac=new Actions(wd);
	    ac.dragAndDrop(we1, we2).perform();
	    
	}
	
}
