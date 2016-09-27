package feature.day;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubmitSteps {

	WebDriver driver = new ChromeDriver();
		
	@Before
	public void first() {
        	driver.get("http://hosting.otterlabs.org/zielinskiaustinr/friendtrest_site/index.html");
        }

	@When("^I submit a rating of (\\d.\\d)$")
	public void i_submit_a_rating_of(double value) {
		WebElement rating = driver.findElement(By.id("rating"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:document.getElementById('rating').value=" + value + ";");
	
		WebElement close_submit = driver.findElement(By.id("close_submit"));
		close_submit.click();
	} 

	@Then("^the HTML should read submitted (\\d.\\d)$")
	public void the_HTML_should_read_submitted(double value) {
		WebElement result = driver.findElement(By.id("result"));
                assertEquals("submitted " + value, result.getText());	
	}

	@After
	public void tearDown() {
        	driver.quit();
	}
}        
