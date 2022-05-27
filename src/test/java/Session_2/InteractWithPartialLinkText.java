package Session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text");
		
		System.out.println("Landing Page title is - " + driver.getTitle());
		
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Name locator"));
		partialLinkText.click();		
		
		Thread.sleep(3000);
		
		
		driver.quit();

	}

}
