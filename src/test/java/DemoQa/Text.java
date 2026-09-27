package DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        WebElement  searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("Selenium");
        searchbox.sendKeys(Keys.ENTER);
        Thread.sleep(50000);
        driver.quit();


	}

}
