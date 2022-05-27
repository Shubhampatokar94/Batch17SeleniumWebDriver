package Session_8;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_JavaScriptDemo {
	
	WebDriver driver;
	WebDriverWait wait;
	JavaScriptUtil javaScriptUtil;
	String URL = "https://www.google.com";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		wait = new WebDriverWait(driver, 15);
		javaScriptUtil = new JavaScriptUtil(driver);
	}
	
	@Test
	public void tc_01()
	{
		//System.out.println(System.getProperty("user.dir"));
		WebElement searchBox = driver.findElement(By.name("q"));
		
		// Drawing border around the element
		javaScriptUtil.drawBorder(searchBox);
		
		// flashing the element
		javaScriptUtil.flash(searchBox);
		
		
		
	}
	

}
