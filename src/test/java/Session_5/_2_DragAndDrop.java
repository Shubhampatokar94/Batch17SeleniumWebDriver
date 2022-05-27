package Session_5;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_DragAndDrop {
	
WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void dropDown_1() throws InterruptedException
	{
		driver.get("https://demoqa.com/droppable");
		WebElement element1 = driver.findElement(By.id("draggable"));
		//WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable' and text()='Drag me']"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		//WebElement dropArea = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		
		// To halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);
		
		//act.clickAndHold(element1).moveToElement(dropArea).build().perform();
		act.dragAndDrop(element1, dropArea).build().perform();
		
		WebElement droppedTextElement = driver.findElement(By.xpath("//div[@id='droppable']/p[text()='Dropped!']"));

		Assert.assertEquals("The action is not performed", "Dropped!", droppedTextElement.getText());
	}
	
	@Test
	public void dropDown_2() throws InterruptedException
	{
		driver.get("https://jqueryui.com/droppable/");
//		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		driver.switchTo().frame(frameEle);
		
		// Alternate way
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		WebElement element1 = driver.findElement(By.id("draggable"));
		//WebElement element1 = driver.findElement(By.xpath("//div[@id='draggable']]"));
		WebElement dropArea = driver.findElement(By.id("droppable"));
		//WebElement dropArea = driver.findElement(By.xpath("//div[@id='droppable']]));
		Actions act = new Actions(driver);
		
		// To halt the execution for sometime (demonstration purposes)
	    Thread.sleep(3000);
	    
	    //act.clickAndHold(element1).moveToElement(dropArea).build().perform();
	  	act.dragAndDrop(element1, dropArea).build().perform();
	
	@After
	public void teardown() throws InterruptedException
	{
	    // To halt the execution for sometime (demonstration purposes)
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}


}
