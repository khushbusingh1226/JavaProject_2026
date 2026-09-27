package DemoQa;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		WebElement dragDrop = driver.findElement(By.xpath("//a[text()= 'Drag and Drop']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", dragDrop);
		dragDrop.click();
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.xpath("//div[Header[text() ='A']]"));
		WebElement Destination = driver.findElement(By.xpath("//div[Header[text() ='B']]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(Destination).release().build().perform();
		Thread.sleep(5000);
		String textAfterDrop = Destination.getText();
        System.out.println(textAfterDrop);
		//act.dragAndDrop(source, Destination);
		driver.quit();
		
		
	}

}
