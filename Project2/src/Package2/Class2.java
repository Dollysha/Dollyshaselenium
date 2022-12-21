package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.navigate().to("https://www.amazon.in/");
	WebElement lnk=w.findElement(By.linkText("Mobiles"));
	lnk.click();
	Thread.sleep(2000);
	
	WebElement searchname=w.findElement(By.id("twotabsearchtextbox"));
	searchname.sendKeys("iphone14");
	
}
}
