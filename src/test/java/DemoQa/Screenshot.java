package DemoQa;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/index.htm");
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("screenshot.png"));
		// for particular web element
		WebElement web = driver.findElement(By.xpath("//h1[contains(text(),'Selenium Tutorial')]"));
		File src1 = web.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("screenshot1.png"));

		driver.close();
	}

}
