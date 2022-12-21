package Definition;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class stepDefinition {
	WebDriver wd;
	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	  
	}
	@When("Enter the valid username{string}")
	public void enter_the_valid_username_admin(String string) {
		wd.findElement(By.name("username")).sendKeys(string);
		
	   
	}
	@When("Enter the valid password{string}")
	public void enter_the_valid_password_admin123(String string) throws InterruptedException {
		wd.findElement(By.name("password")).sendKeys(string);
		  Thread.sleep(3000);
	   
	}
	@When("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		  Thread.sleep(3000);
	}
	@Then("I should get the title\"OrangeHRM\"")
	public void i_should_get_the_title_orange_hrm() {
		assertEquals(wd.getTitle(), "String");
	  
	}
}