package DemoQa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://the-internet.herokuapp.com/hovers");

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(image1).perform();

		System.out.println("Hovered on image");

		Thread.sleep(2000);
		

		// Second image
		WebElement image2 = driver.findElement(
		        By.xpath("(//img[@alt='User Avatar'])[2]")
		);
		actions.moveToElement(image2).perform();

		Thread.sleep(2000);

		// Third image
		WebElement image3 = driver.findElement(
		        By.xpath("(//img[@alt='User Avatar'])[3]")
		);
		actions.moveToElement(image3).perform();
		
		driver.quit();
	}

}
