package DemoQa;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertValidation {

	public static void main(String[] args) throws InterruptedException {

	    WebDriverManager.firefoxdriver().setup();
	    
	    WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://qaplayground.com/practice/alerts-dialogs");
	    Thread.sleep(1000);
	    // simple Alert
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
	    WebElement simpleAlert=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()= 'Simple Alert']")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'})", simpleAlert);
	    Thread.sleep(1000);
	    simpleAlert.click();
	    Alert alert = driver.switchTo().alert();
	    String text = alert.getText();
	    System.out.println(text);
	    Thread.sleep(1000);
	    //alert.dismiss();
	    alert.accept();
	    driver.quit();
	    
	   //confirm alert
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1000));
	    WebElement confirmAlert = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = 'Confirm Alert']")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'})", confirmAlert);
	    confirmAlert.click();
	    Alert alert1 = driver.switchTo().alert();
	    Thread.sleep(3000);
	    String text1 = alert.getText();
	    System.out.println(text);
	    alert.accept();
	    Thread.sleep(1000);
	    String result = driver.findElement(By.xpath("//p[@data-testid='result-confirm']")).getText();
        System.out.println("Actual Result: " + result);
        //Assert.assertEquals(result, "Result: Accepted");
         
	 
	    
	    //prompt alert
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
	    WebElement promtAlert = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn-prompt-alert")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'})", promtAlert); 
	    promtAlert.click();
	    Alert alert2 = driver.switchTo().alert();
	    alert.sendKeys("text");
	    Thread.sleep(3000);
	    String text2 = alert.getText();
	    System.out.println(text);
	    alert.accept();
	    Thread.sleep(3000);
	    String result2 = driver.findElement(By.xpath("//p[@data-testid='result-prompt']")).getText();
        System.out.println("Actual Result: " + result);



		/*WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(800));
		WebElement test = explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@data-testid='result-prompt']")));
		test.click();

		FluentWait <WebDriver> webDriverFluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(300))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NosuchElementException.class);
webDriverFluentWait.until(ExpectedConditions.visibilityOf(test));	*/


	}    
	  
	}


