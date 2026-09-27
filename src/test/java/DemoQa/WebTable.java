package DemoQa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args)
    {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

      driver.manage().window().maximize();
      driver.get("https://www.w3schools.com/html/html_tables.asp");
      List<WebElement>rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        for(WebElement row : rows)

        {
            System.out.println(row.getText());
        }

      List <WebElement> companyrow = driver.findElements(By.xpath("//table[ @id=\"customers\"]//tr//td[1]"));
        {
           for(WebElement comprow:companyrow)
           {
               System.out.println(comprow.getText());
           }
        }

        for (int i = 1; i < rows.size(); i++) {

            List<WebElement> cols =
                    rows.get(i).findElements(By.tagName("td"));

            String company = cols.get(0).getText();

            if (company.equals("Island Trading")) {
                System.out.println(cols.get(2).getText());
                break;
            }
        }
      driver.getCurrentUrl();
      System.out.println(driver.getCurrentUrl());
      driver.close();
    }
}
