package DemoQa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectcustom {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://select2.org/getting-started/basic-usage");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        Thread.sleep(1000);
        // Open the Select2 dropdown
        wait.until(ExpectedConditions.elementToBeClickable(
                        By.cssSelector(".select2-selection--single")))
                .click();
//span[@class='select2-selection__rendered']

        // Search for an option
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".select2-search__field")))
                .sendKeys("California");
        Thread.sleep(1000);

        // Select the option
        wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//li[contains(text(),'California')]")))
                .click();
        Thread.sleep(1000);

// multiple select
        driver.findElement(By.cssSelector(".select2-selection--multiple")).click();

        driver.findElement(By.cssSelector(".select2-search__field"))
                .sendKeys("California");


        driver.findElement(By.xpath("//li[contains(text(),'California')]"))
                .click();



        driver.quit();
    }
}