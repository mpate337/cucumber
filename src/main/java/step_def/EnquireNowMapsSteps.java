package step_def;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnquireNowMapsSteps {
	
	WebDriver driver; 
	
	@Given("^user is already on the enquireNow map$")
	public void user_on_enquireNow_map() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://simartechnologies.com/004/Edu");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/header/div[2]/div[1]/div/nav/ul/li[7]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		}

	
	@Then("^user enters enquire now details with map$")
	public void fill_details_enquire_map(DataTable enquireData) {
		By loadingImage = By.id("spinner");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Home - Roicians", title);
		
		for(Map<String, String> data : enquireData.asMaps(String.class, String.class)) {
		
			driver.findElement(By.name("first_name")).sendKeys(data.get("first name"));
			driver.findElement(By.name("last_name")).sendKeys(data.get("last name"));
			driver.findElement(By.name("address")).sendKeys(data.get("address"));
			driver.findElement(By.name("phone")).sendKeys(data.get("number"));
			driver.findElement(By.name("email")).sendKeys(data.get("email id"));
			
			WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/section[2]/div/div/div/div/form/div[3]/button[2]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}
	
	@Then("^user enter background information with map$")
	public void fill_details_background_map(DataTable enquireData) {        
		for(Map<String, String> data : enquireData.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("skills")).sendKeys(data.get("skills"));
			driver.findElement(By.name("experience")).sendKeys(data.get("years of exp"));
			
			WebElement element = driver.findElement(By.xpath("/html/body/div/div[2]/section[2]/div/div/div/div/form/div[3]/button[2]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		}
	}
}
