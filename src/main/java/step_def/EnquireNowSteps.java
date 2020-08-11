package step_def;

import java.util.List;

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

public class EnquireNowSteps {
	
	WebDriver driver; 
	
	@Given("^user is already on the enquireNow$")
	public void user_on_contactUs() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://simartechnologies.com/004/Edu");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/header/div[2]/div[1]/div/nav/ul/li[7]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		}

	
	@Then("^user enters enquire now details$")
	public void fill_details_enquire(DataTable enquireData) {
		By loadingImage = By.id("spinner");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Home - Roicians", title);
		
		List<List<String>> enquireValues = enquireData.raw();
		
		driver.findElement(By.name("first_name")).sendKeys(enquireValues.get(0).get(0));
		driver.findElement(By.name("last_name")).sendKeys(enquireValues.get(0).get(1));
		driver.findElement(By.name("address")).sendKeys(enquireValues.get(0).get(2));
		driver.findElement(By.name("phone")).sendKeys(enquireValues.get(0).get(3));
		driver.findElement(By.name("email")).sendKeys(enquireValues.get(0).get(4));

	}
	
	@Then("^user enter background information$")
	public void fill_details_background(DataTable enquireData) {        
		List<List<String>> enquireValues = enquireData.raw();
		
		driver.findElement(By.name("skills")).sendKeys(enquireValues.get(0).get(0));
		driver.findElement(By.name("experience")).sendKeys(enquireValues.get(0).get(1));
	}
}
