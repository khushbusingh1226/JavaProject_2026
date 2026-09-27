package DemoQa;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Formtextvalidation {
	public static void main (String [] args) {
		//Webdriver driver = new chromeDriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		System.out.println("Page Title: " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement elements = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//h5[text()='Elements']")));
		 // Scroll to element
        ((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView(true)",elements);
     // Click using JavaScript
        ((JavascriptExecutor) driver).executeScript("argument[0].click();", elements);
        System.out.println("Page Title: " + driver.getTitle());
		driver.close();
		
		
	}

}
