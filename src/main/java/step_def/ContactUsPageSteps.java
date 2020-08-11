package step_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUsPageSteps {
	
	WebDriver driver; 
	
	@Given("^user is already on the contactUs$")
	public void user_on_contactUs() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://simartechnologies.com/004/Edu");
		
		WebElement element = driver.findElement(By.xpath("/html/body/div/header/div[2]/div[1]/div/nav/ul/li[6]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		}
	
	@When("^title of contactUs is Contact - Roicians$")
	public void title_of_contactUs() {
		By loadingImage = By.id("spinner");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Contact - Roicians", title);
	}
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	 //3. \\\"([^\\\"]*)\\\"
	
	@Then("^user enters \\\"([^\\\"]*)\\\" , \\\"([^\\\"]*)\\\" , \\\"([^\\\"]*)\\\" , \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void fill_details(String name, String email, String sub, String number, String message) {
		driver.findElement(By.xpath("//*[@id=\"form_name\"]")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"form_email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"form_subject\"]")).sendKeys(sub);
		driver.findElement(By.xpath("//*[@id=\"form_phone\"]")).sendKeys(number);
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys(message);
	}
}
