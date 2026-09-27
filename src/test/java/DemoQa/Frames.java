package DemoQa;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) throws InterruptedException {

        //Initiate the Webdriver
        WebDriver driver = new ChromeDriver();

        //adding implicit wait of 12 secs
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //Opening the webpage where we will access iframes
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

        //switch to an iframe with first iframe index
        driver.switchTo().frame(0);

        // identify the text inside the iframe and retrieve with getText()
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(" Text is: " + text);

        //switch back the driver out of the iframe to the main page
        driver.switchTo().defaultContent();

        //quitting the browser
        driver.quit();
    }
}
