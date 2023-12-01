package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsLoginValid {

	WebDriver driver;
	
	
	@Before
	public void setup() {
		
		System.out.println("Test started");
	}
	
	@After
	private void teardown() {
		System.out.println("Test Ended");


	}
	@Given("User Launch the URL {string}")
	public void user_launch_the_url(String string) {
		driver = new ChromeDriver();
	    driver.get("https://www.swiggy.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}

	@When("click SignIn button")
	public void click_sign_in_button() {
	   driver.findElement(By.xpath("//a[@class='x4bK8']")).click();
	}

	@When("click on create an account link")
	public void click_on_create_an_account_link() {
		driver.findElement(By.xpath("//a[normalize-space()='create an account']")).click();
	   
	}

	@Then("User should navigate to Sign Up page")
	public void user_should_navigate_to_sign_up_page() {
	    String pageTitle = driver.findElement(By.xpath("//div[@class='_1Tg1D']")).getText();
	    System.out.println(pageTitle);
	    Assert.assertEquals(pageTitle, "Sign up");
	}

	
	@Given("User Launch the browser")
	public void user_launch_the_browser() {
	    
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    
	}

	@Then("User navigate to My Account page")
	public void user_navigate_to_my_account_page() {
	    
	}

}
