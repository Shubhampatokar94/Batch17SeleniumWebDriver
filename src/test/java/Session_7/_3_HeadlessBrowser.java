package Session_7;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _3_HeadlessBrowser {
	
	WebDriver driver;
	
	@Before
	public void setUp()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
//		options.addArguments("--incognito");
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking","enable-automation"));
//		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
//		options.addArguments("window-size=1920,1080");
//		options.addArguments("window-size=800,600");
//		options.addArguments("--ignore-certificate-errors");
//		options.addArguments("--disable-extension");
//		options.addArguments("start-maximized");
//		options.addExtensions(new File("extension_3_9_4_0.crx"));
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.co.in");
	}
	
	@Test
	public void dropDown()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Automation Testing");
		WebElement searchButton = driver.findElement(By.name("btnk"));
		searchButton.sendKeys(Keys.ENTER);
		
		System.out.println("After search the new page title is : " + driver.getTitle());
		
		WebElement firstLink = driver.findElement(By.xpath("//h3[contains(text(),'What is automation testing?')]"));
		firstLink.click();
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
