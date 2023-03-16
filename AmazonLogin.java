package amazonExplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String baseUrl = "https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver_win110\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(closeButton));
		closeButton.click();

	}

}
