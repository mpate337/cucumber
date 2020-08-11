package step_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchSteps {
	
	WebDriver driver; 
	
	@Given("^user is on walmart homepage$")
	public void user_on_walmart_homepage() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.walmart.ca/en");
	}
	
	@When("^user search for a product$")
	public void search_product() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[2]/form/div/input")).sendKeys("grapes");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[2]/form/div/button[2]")).click();
		
		Assert.assertEquals(true, driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div/div/div[7]/div[1]/div/div[1]")).isDisplayed());
	}
}
