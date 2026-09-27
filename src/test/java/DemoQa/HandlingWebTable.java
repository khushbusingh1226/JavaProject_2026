package DemoQa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

class HandlingWebTable {
        public static void main(String[] args) throws InterruptedException {

            // Initiate the Webdriver
            WebDriver driver = new ChromeDriver();

            // adding implicit wait of 15 secs
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            // Open the webpage to identify table
            driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

            // Locate the table element
            WebElement table1 = driver.findElement
                    (By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table"));

            // Find all rows in the table
            List<WebElement> r = table1.findElements(By.xpath(".//tr"));

            // Looping through rows and get cell values
            for (WebElement rw : r) {
                List<WebElement> cell = rw.findElements(By.xpath(".//td"));
                for (WebElement c : cell) {
                    String value = c.getText();
                    System.out.println("Cells values: " + value);
                }
            }
            List<WebElement> salaryElements = driver.findElements(
                    By.xpath("//table[@class='table table-striped mt-3']/tbody/tr/td[5]")
            );

            int maxSalary = Integer.MIN_VALUE;

            for (WebElement element : salaryElements) {
                int salary = Integer.parseInt(element.getText().trim());

                if (salary > maxSalary) {
                    maxSalary = salary;
                }
            }

            System.out.println("Maximum Salary: " + maxSalary);

            // Closing browser
            driver.quit();
        }
    }

