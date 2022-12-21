package MavPack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doll12 {
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
		Thread.sleep(1000);
    	WebElement wb1=wd.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
    	act.click(wb1).build().perform();
    	Thread.sleep(2000);
    	
    	
    	wd.navigate().to("https://demoqa.com/text-box");
	WebElement l=wd.findElement(By.id("userName"));
  l.sendKeys("Dollysha1");
	WebElement l1=wd.findElement(By.id("userEmail"));
	l1.sendKeys("Dollysha1@gmail.com");
	WebElement l2=wd.findElement(By.id("currentAddress"));
	l2.sendKeys("chowk lucknow");
	WebElement l3=wd.findElement(By.id("permanentAddress"));
	l3.sendKeys("chowk lucknow");
	WebElement btn=wd.findElement(By.id("submit"));
	btn.click();
	rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
		
		/*wd.navigate().to("https://demoqa.com/checkbox");
	WebElement wb2=wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]/span"));
		act.click(wb2).build().perform();
		Thread.sleep(1000);
	WebElement l4=wd.findElement(By.xpath("//*[@class='rct-checkbox']"));
	act.click(l4).build().perform();
	Thread.sleep(1000);
	
	wd.navigate().to("https://demoqa.com/radio-button");
	Thread.sleep(1000);
	WebElement l5=wd.findElement(By.xpath("//*[@class='custom-control custom-radio custom-control-inline']/label[1]"));
	act.click(l5).build().perform();
	Thread.sleep(1000);
	WebElement l6=wd.findElement(By.id("impressiveRadio"));
	act.click(l6).build().perform();
	Thread.sleep(1000);*/
	
	/*wd.navigate().to("https://demoqa.com/webtables");
	Thread.sleep(1000);
	WebElement we3=wd.findElement(By.id("addNewRecordButton"));
	act.click(we3).build().perform();
	Thread.sleep(1000);
	WebElement l7=wd.findElement(By.id("firstName"));
	l7.sendKeys("Dollysha1");
	WebElement l8=wd.findElement(By.id("lastName"));
	l8.sendKeys("Rastogi");
	WebElement l9=wd.findElement(By.id("userEmail"));
	l9.sendKeys("abc@gmail.com");
	WebElement l10=wd.findElement(By.id("age"));
	l10.sendKeys("30");
	WebElement l11=wd.findElement(By.id("salary"));
	l11.sendKeys("200001");
	WebElement l12=wd.findElement(By.id("department"));
	l12.sendKeys("Tester");
	WebElement btn3=wd.findElement(By.id("submit"));
	act.click(btn3).build().perform();
	Thread.sleep(1000);
	
	//WebElement we4=wb.findElement(B"));//update&delete left
	//act.click(we4).build().perform();
	//Thread.sleep(1000);*/
	
	//wd.navigate().to("https://demoqa.com/buttons");
	//WebElement we5=wd.findElement(By.xpath("//*[@class='btn btn-primary'][1]"));
	//act.doubleClick(we5).perform();
	//rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(1000);
	//WebElement we6=wd.findElement(By.id("rightClickBtn"));
	//act.contextClick(we6).perform();
	//rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(1000);
	//WebElement we7=wd.findElement(By.xpath("//*[@class='mt-4'][2]/button"));
	//act.click(we7).build().perform();
	//rc.keyPress(KeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(1000);
	
	wd.navigate().to("https://demoqa.com/links");
	
	//WebElement we8=wd.findElement(By.id("simpleLink"));
	//act.click(we8).build().perform();
	//Thread.sleep(1000);
	
	//WebElement we9=wd.findElement(By.id("dynamicLink"));
	//act.click(we9).build().perform();
	//Thread.sleep(1000);
	
	//WebElement we10=wd.findElement(By.id("created"));
	//act.click(we10).build().perform();
	//Thread.sleep(1000);
	
	
	//WebElement we11=wd.findElement(By.id("no-content"));
	//act.click(we11).build().perform();
	//Thread.sleep(1000);
	
	
	/*WebElement we12=wd.findElement(By.id("moved"));
	act.click(we12).build().perform();
	Thread.sleep(1000);
	
	WebElement we13=wd.findElement(By.id("bad-request"));
	act.click(we13).build().perform();
	Thread.sleep(1000);
	
	WebElement we14=wd.findElement(By.id("unauthorized"));
	act.click(we14).build().perform();
	Thread.sleep(1000);
	
	WebElement we15=wd.findElement(By.id("forbidden"));
	act.click(we15).build().perform();
	Thread.sleep(1000);
	
	WebElement we16=wd.findElement(By.id("invalid-url"));
	act.click(we16).build().perform();
	Thread.sleep(1000);*/
	
	
	//wd.navigate().to("https://demoqa.com/broken");
	//String parent=wd.getWindowHandle();
	//WebElement we17=wd.findElement(By.xpath("//*[@class='col-12 mt-4 col-md-6']/div/a"));
	//act.click(we17).build().perform();
	//Thread.sleep(2000);
	//wd.switchTo().window(parent);
	
	/*wd.navigate().to("https://demoqa.com/broken");
	WebElement we18=wd.findElement(By.xpath("//*[@class='col-12 mt-4 col-md-6']/div/a[2]"));
	act.click(we18).build().perform();
	Thread.sleep(2000);*/
	
	
	wd.navigate().to("https://demoqa.com/upload-download");
	WebElement we19=wd.findElement(By.id("downloadButton"));
	act.click(we19).build().perform();
	Thread.sleep(2000);
	
	//wd.close();
	
}
}