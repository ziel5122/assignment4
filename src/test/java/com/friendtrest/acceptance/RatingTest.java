package com.friendtrest.acceptance;

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

public class RatingTest {
	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() {
		driver.get("http://hosting.otterlabs.org/zielinskiaustinr/friendtrest_site/index.html");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testCloseWhenEmpty() {
		//WebElement element = driver.findElement(By.id("score_button"));
        	//element.click();

		WebElement close_submit = driver.findElement(By.id("close_submit"));

		//(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(close_submit));
	
		close_submit.click();

		WebElement result = driver.findElement(By.id("result"));
		assertEquals("closed", result.getText());
	}
    
}
