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

public class IntroToJunit {
	
	// public static void main(String[] args){
	//
	// }
	
	WebDriver driver;
	String url = "https://www.amazon.in";
	String prodName = "Nokia";
	
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
	public void titleValidation()
	{
		// Expected title - Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actTitle = driver.getTitle();
		

		//exp vs act
		Assert.assertEquals("Title is not matching", expTitle, actTitle);
		
	}
	
	@Test
	public void searchProduct() throws InterruptedException
	{
		
		
		WebElement searchBoxEle = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBoxEle.sendKeys(prodName);
        
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBtn.click();
        
        Thread.sleep(3000);
        
        WebElement searchResultText = driver.findElement(By.xpath("//span[text()='RESULTS']"));
        boolean expResult = true;
        boolean actResult = searchResultText.isDisplayed();
        Assert.assertEquals("The result is not get displayed", expResult, actResult);
        
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
