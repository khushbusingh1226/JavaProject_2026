package DemoQa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://the-internet.herokuapp.com/broken_images");
		Thread.sleep(3000);
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total images :" + " " + images.size());

		for (WebElement img : images) {
			String imageURL = img.getAttribute("src");
            //System.out.println(imageURL);
            HttpURLConnection connection = (HttpURLConnection) new URL(imageURL).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responsecode = connection.getResponseCode();
            
            if(responsecode>=400)
            System.out.println(imageURL + " " + "Broken Image" );
            else System.out.println(imageURL + " " + "valid Image" );

            	
		}

		driver.quit();

	}

}
