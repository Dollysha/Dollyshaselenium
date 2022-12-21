package MavPack1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Mavfile {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
        WebDriver wd= new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       // Thread.sleep(3000);
       // String ActualTitle=wd.getTitle();
       // System.out.println(ActualTitle);
        //String ExpectedTitle="OrangeHRM1";
        //Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(3000);
	WebElement we1=wd.findElement(By.xpath("//[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
	Assert.assertEquals(true, we1.isDisplayed());
	System.out.println("Assertion Passed");
	Thread.sleep(3000);
	wd.close();
	}
}
