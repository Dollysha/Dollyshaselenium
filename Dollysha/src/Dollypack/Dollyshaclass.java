package Dollypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dollyshaclass {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		//WebDriver wd =new ChromeDriver();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@name=\'username']")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
	    wd.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	    Thread.sleep(3000);
	    wd.close();
		
	}

}
