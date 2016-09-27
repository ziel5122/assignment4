package com.friendtrest.acceptance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;

public class SubmitRating {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://hosting.otterlabs.org/zielinskiaustinr/friendtrest_site/index.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://hosting.otterlabs.org/zielinskiaustinr/friendtrest_site/index.html");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.id("score_button"));

	element.click();

	WebElement rating = driver.findElement(By.id("rating"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("javascript:document.getElementById('rating').value=9;");
	
	       
 
        //Close the browser
        driver.quit();
    }
}
