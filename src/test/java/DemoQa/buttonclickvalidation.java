package DemoQa;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonclickvalidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://qaplayground.com/practice/buttons");
		Actions action = new Actions(driver);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		// WebElement buttonclick = driver.findElement(By.id("btn-goto-home"));
		// buttonclick.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		// location button
		WebElement locationbtn = driver.findElement(By.id("btn-find-location"));
		Point point = locationbtn.getLocation();
		System.out.println("X - Coordinate" + point.getX());
		System.out.println("Y - Coordinate" + point.getY());
		// button color
		WebElement btnColor = driver.findElement(By.xpath("//button[@data-testid=\"btn-find-color\"]"));
		String bgcolor = btnColor.getCssValue("Background-color");
		System.out.println("Background- color" + bgcolor);

		// dimension of buttion
		WebElement btnsize = driver.findElement(By.xpath("//button[text()='Do you know my size?']"));
		Dimension size = btnsize.getSize();
		System.out.println("height of button" + " " + size.height);
		System.out.println("width of button" + " " + size.width);

		// disable button
		WebElement disable = driver.findElement(By.xpath("//button[@aria-disabled='true']"));
		boolean status = disable.isEnabled();
		// Assert.assertFalse(status);
		System.out.println("Ststus of button " + status);
		//doubleclick
		WebElement dobleclick = driver.findElement(By.xpath("//button[@aria-label='Double Click Me']"));
		action.doubleClick(dobleclick).perform();
		// Thread.sleep(2000);
		
		//Right click
		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		action.contextClick(rightClick).perform();
		WebElement holdBtn = driver.findElement(By.xpath("//button[text()='Click and Hold!']"));
		action.clickAndHold(holdBtn).pause(Duration.ofSeconds(100)).release().perform();
		driver.quit();

	}

}
