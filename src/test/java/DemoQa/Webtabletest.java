package DemoQa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Webtabletest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        List< WebElement> Allrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        for(WebElement row : Allrows){
           System.out.println( "All rows text" + row.getText());
        }
        List<WebElement> secondcol = driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
        for(WebElement col : secondcol){
            System.out.println(col.getText());
        }
        // particular value UK exist
        String country = driver.findElement(
                By.xpath("//table/tbody/tr[td[1]='Island Trading']/td[3]")
        ).getText();

        System.out.println(country);


        driver.close();
    }
}
