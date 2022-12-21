package MavPack1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class JSE {//JAVA SCRIPT EXECUTOR
	WebDriver wb;
	Actions act;
  @Test
  public void Testcase1() throws InterruptedException {
	  JavascriptExecutor js=(JavascriptExecutor)wb;//it is replacing webdriver with java script executor
	 Thread.sleep(3000);
	// js.executeScript("document.getElementsByName(\"username\")[0].value='Admin'");
	 //document.getElementsByClassName('oxd-input oxd-input--active')[0].value="Admin"
	js.executeScript("document.getElementById(\"userName\").value=(\"Dollysha\")\n"
			+ "");
	 
	// js.executeScript("document.getElementsByName(\"password\")[0].value='admin123");
	 //document.getElementsByClassName('oxd-input oxd-input--active')[1].value="admin123"
	 js.executeScript("document.getElementById(\"userEmail\").value=(\"dollysha@gmail.com\")");
	
	js.executeScript("document.getElementById(\"currentAddress\").value=(\"chowk lucknow\")\n"
			+ "");
	 
	 
	 js.executeScript("document.getElementById(\"permanentAddress\").value=(\"chowk lucknow\")");
	 
	 
	 //js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click()");
	js.executeScript("document.getElementById(\"submit\").click()");
	 
	js.executeScript("window.scrollBy(0,500)");
	System.out.println(js.executeScript("return document.title"));
	System.out.println(js.executeScript("return document.domain"));
	//System.out.println(js.executeScript("return document.documentElement.innerText"));
	//System.out.println(js.executeScript("return document.getElementById('submit').innerText"));
	
	wb.findElement(By.id("submit")).click();
	
	//js.executeScript("history.go[0]");
	 // js.executeScript("window.history.forward[0]");
  //do for buttons also left click,double click etc
  
  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get("https://demoqa.com/text-box");
	  
  }

}
