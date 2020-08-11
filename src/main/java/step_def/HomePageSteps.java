package step_def;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
	
	WebDriver driver; 
	
	@Given("^user is already on the homepage$")
	public void user_on_homepage() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://simartechnologies.com/004/Edu/");
	}
	
	@When("^title of homepage is Home - Roicians$")
	public void title_of_homepage() {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Home - Roicians", title);
	}
}
