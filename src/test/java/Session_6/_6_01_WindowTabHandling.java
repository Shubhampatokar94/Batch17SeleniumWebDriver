package Session_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6_01_WindowTabHandling {
	
    WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
	}
	
	@Test
	public void tabHandling_1_() throws InterruptedException
	{
		System.out.println("tabHandling_1_ By using Set");
		
		WebElement clickButtonForTab = driver.findElement(By.id("tabButton"));
		clickButtonForTab.click();
		
		System.out.println("Current window title is : " + driver.getTitle());
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId1 = it.next();
		
		System.out.println("Parent window id is - " + parentWindowId);
		
		driver.switchTo().window(childWindowId1);
		
		System.out.println("Child1 window title is - " + driver.getTitle());
		System.out.println("Child1 window id is - " + childWindowId1);
		WebElement textInTheNextTab = driver.findElement(By.id("sampleHeading"));
		System.out.println("After opening the tab text available on the page is -> " + textInTheNextTab.getText());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent window title is - " + driver.getTitle());
		System.out.println("Parent window id is - " + parentWindowId);

	}
	
	@Test
	public void tabHandling_2_()
	{
		System.out.println("tabHandling_2_ By using ArrayList");
		
		WebElement clickButtonForTab = driver.findElement(By.id("tabButton"));
		clickButtonForTab.click();
		
		System.out.println("Current window title is : " + driver.getTitle());
		
		ArrayList<String> handles = new ArrayList<String> (driver.getWindowHandles());
		
		String parentWindowId = handles.get(0);
		String childWindowId1 = handles.get(1);
		
		System.out.println("Parent window id is - " + parentWindowId);
		
		driver.switchTo().window(childWindowId1);
		
		System.out.println("Child1 window title is - " + driver.getTitle());
		System.out.println("Child1 window id is - " + childWindowId1);
		WebElement textInTheNextTab = driver.findElement(By.id("sampleHeading"));
		System.out.println("After opening the tab text available on the page is -> " + textInTheNextTab.getText());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent window title is - " + driver.getTitle());
		System.out.println("Parent window id is - " + parentWindowId);
	}
	
	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
