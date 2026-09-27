package DemoQa;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://qaplayground.com/practice/tabs-windows");
		Thread.sleep(1000);
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("btn-open-home-tab")));
		JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block:'center'});",button);
		button.click();
		String parentWindow = driver.getWindowHandle();

		System.out.println(driver.getCurrentUrl());

		
		for(String childwindow : driver.getWindowHandles())
		{
			if(!childwindow.equals(parentWindow))
				//switch to child window and close and move to parent window
				driver.switchTo().window(childwindow);
			Thread.sleep(1000);
			driver.close();
		
		}
		System.out.println("New tab URL: " + driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//switch from child to parent window
		driver.switchTo().window(parentWindow);
		System.out.println("New tab URL: " + driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		driver.quit();
		
	}
}


