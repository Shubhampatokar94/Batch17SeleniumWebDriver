package Session_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("http://demo.automationtesting.in/Register.html");
				
				System.out.println("Landing Page title is - " + driver.getTitle());
				
				WebElement UserFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				UserFirstName.sendKeys("Tom");
				
				WebElement UserLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				UserLastName.sendKeys("Peter");
				
				WebElement UserAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
				UserAdress.sendKeys("301, bakers street NYC");
				
				WebElement MaleRadio = driver.findElement(By.xpath("//input[@value='Male']"));
				MaleRadio.click();
				
				WebElement moviesCheckBox = driver.findElement(By.id("checkbox2"));
				moviesCheckBox.click();
				
				
				Thread.sleep(3000);
				
				
				driver.quit();
	}

}
