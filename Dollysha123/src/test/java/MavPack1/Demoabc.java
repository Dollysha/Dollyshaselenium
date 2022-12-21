package MavPack1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Demoabc {
	WebDriver wb;
	public String URL1="https://demoqa.com/upload-download";
	public String URL2="https://demoqa.com/alerts";
	public String URL3="https://demoqa.com/browser-windows";
  @Test(enabled=false)
  public void uploading_a_file() {
	  wb.get(URL1);
	  wb.findElement(By.id("uploadFile")).sendKeys("C:/Users/dolly/OneDrive/Desktop/CSRF.pdf");//uploading a file shift+rightclick to copy path
	  
  }
  
  @SuppressWarnings("deprecation")
@Test(enabled=false)
  public void Alerts() throws InterruptedException {
	 wb.get(URL2); 
	 wb.findElement(By.id("alertButton")).click();//clicking on the alert button
	 Alert alt=wb.switchTo().alert();//switch to that alert pop-up
	 System.out.println(alt.getText());; 
	Thread.sleep(3000);
	 alt.accept();//accept is for clicking ok or yes
	 Thread.sleep(3000);
	
	 wb.findElement(By.id("timerAlertButton")).click();//clicking on the popup with timer
     //wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Implicit wait
	 WebDriverWait wdw=new WebDriverWait(wb, 180);//explicit wait for 180 seconds
	 wdw.until(ExpectedConditions.alertIsPresent());//you are telling the web driver to accept or press ok only after the pop up appears
     System.out.println("Alert= "+alt.getText());; 
	 Thread.sleep(1000);
	 alt.accept();//clicking ok
	 Thread.sleep(3000);
	  
	 wb.findElement(By.id("confirmButton")).click();//clicking on confirm button
	 Thread.sleep(1000);
	 alt.dismiss();
	 Thread.sleep(3000);
	 
	 wb.findElement(By.id("promtButton")).click();//clicking on confirm button
	 Thread.sleep(3000);
	 alt.sendKeys("Dollysha");
	 alt.accept();
	 
  }
  @Test(enabled=true)
  public void Windows() throws AWTException, InterruptedException {
	  wb.get(URL3);
	 Thread.sleep(1000);
	 // wb.manage().window().maximize();
	  Robot rc=new Robot();
	
	  
	  
	 // wb.findElement(By.id("tabButton")).click();
	// Thread.sleep(3000);
	 //rc.keyPress(MenuKeyEvent.VK_CONTROL);
	 //rc.keyPress(MenuKeyEvent.VK_TAB);
	 //rc.keyRelease(MenuKeyEvent.VK_CONTROL);
	  
	  
	  
	String parentwindow=wb.getWindowHandle();//this one gets window handle(id)of parent window
	System.out.println(parentwindow);
	rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	WebElement we=wb.findElement(By.id("windowButton"));//clicking on a new window
	
	for(int i=0;i<=2;i++) { //for clicking on the new window 3 times
		 we.click();
		 
	  Thread.sleep(1000);
	 }
 Set<String> allWindow =wb.getWindowHandles();//for storing the opened windows 
 System.out.println(allWindow);//getting all ids
 System.out.println(allWindow.size());//getting how many ids are present
	  
	String lastwindow="";
 for(String handle:allWindow)	
	{
		wb.switchTo().window(handle);
		wb.get("https://www.google.co.in/");
		
		lastwindow=handle;
		Thread.sleep(3000);
		wb.switchTo().window(parentwindow);
		wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wb.close();
		wb.switchTo().window(lastwindow);
		wb.get("https://mail.google.com/mail/");
	}
	 // wb.findElement(By.id("messageWindowButton")).click();
	  //Thread.sleep(2000);
	  
	  
  }

  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
