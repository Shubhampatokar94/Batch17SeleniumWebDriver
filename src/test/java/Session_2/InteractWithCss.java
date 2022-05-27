package Session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCss {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
					driver.get("https://www.google.co.in/");
					
					System.out.println("Landing Page title is - " + driver.getTitle());
					
					
					WebElement searchTextBox = driver.findElement(By.cssSelector("input.gLFyf"));
					
					searchTextBox.sendKeys("selenium WebDriver");
					
					Thread.sleep(3000);
					
					
					driver.quit();
		}

}


