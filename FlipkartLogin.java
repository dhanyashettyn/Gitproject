package amazonExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin 
{

	public static void main(String[] args) 
	{
		String baseUrl = "https://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver_win110\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //To wait for 10sec for any web element
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);  //To load the page
		driver.get(baseUrl);
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.elementToBeClickable(closeButton)); // To wait more time on partiular web element.
		closeButton.click();

	}

}
