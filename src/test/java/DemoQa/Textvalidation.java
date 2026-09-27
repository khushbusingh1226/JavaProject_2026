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

public class Textvalidation {
	public static void main(String []args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		  System.out.println(driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// click Elements
		WebElement elementsMenu = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//h5[text()='Elements']")
		        )
		);

		// scroll CENTER (better than scrollIntoView default)
		((JavascriptExecutor) driver)
		        .executeScript("arguments[0].scrollIntoView({block: 'center'});", elementsMenu);

		Thread.sleep(500);

		// JS click (bypasses overlay issues)
		((JavascriptExecutor) driver)
		        .executeScript("arguments[0].click();", elementsMenu);

		// validate LEFT MENU is loaded (correct check)
		WebElement sidebar = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(
		                By.xpath("//div[@class='header-text' and text()='Elements']")
		        )
		);

		if (sidebar.isDisplayed()) {
		    System.out.println("Elements page opened successfully");
		    System.out.println(driver.getTitle());
		}

		driver.quit();
	}
}

