package Session_5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _7_DropDownHandlingWithoutSelectClass {
	
WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void dropDownHandlingWithoutSelectClass()
	{
		List<WebElement> yearList = driver.findElements(By.xpath("//select[@id='yearbox']/option"));
		
		System.out.println("The all options from year list dropdown are : ");
		for (int i = 0; i < yearList.size(); i++) {
		
			System.out.println(yearList.get(i).getText());
		    if (yearList.get(i).getText().equals("1954")) 
		    {
		    	yearList.get(i).click();
		    }
		}
		
	}
	
	@Test
	public void dropDownHandlingSelectClassXpath()
	{
		String yearValue = "1921";
		
		WebElement yearSelection = driver.findElement(By.xpath("//select[@id='yearbox']/option[text()='"+yearValue+"']"));
		
		yearSelection.click();
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		// To halt the execution for sometime (Demonstration purposes)
	    Thread.sleep(3000);
	    driver.quit();
	}

}
