package Session_3;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	
	WebDriver driver;
	String url = "http://demo.automationtesting.in/Register.html";
	String firstname = "Tom";
	String lastname = "Peter";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void NameValidation()
	{
	
		WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lastNameField = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		firstNameField.sendKeys(firstname);
		lastNameField.sendKeys(lastname);
	}
	
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.quit();
	}

}



