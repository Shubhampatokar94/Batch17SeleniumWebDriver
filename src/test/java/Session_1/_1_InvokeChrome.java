package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_InvokeChrome {
	
	public static void main(String[] args) {
		
		// Automation
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\eclipse-workspace\\Batch17SeleniumWebDriver\\chromedriver.exe");
		
		//System.setProperty("webDriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		
//		String title = driver.getTitle();
//		
//		String titleExpected = "Facebook – log in or sign up";
//		
//		System.out.println("Web page title is -> " + title);
//		
//		// Validation
//		if(title.equals(titleExpected))
//		{
//			System.out.println("Title matched");
//		}
//		else
//		{
//			System.out.println("Title doesn't match");
//		}
//		
//		driver.navigate().to("https://www.amazon.in");
//		//System.out.println("title for amazon is -> " + driver.getTitle());
//		if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
//		{
//			System.out.println("Amazon title is correct");
//		}
//		else
//		{
//			System.out.println("Amazon title is incorrect");
//		}
//		
//		driver.navigate().back();
//		
//		System.out.println("Title after navigating back is -> " + driver.getTitle());
//		
//		driver.navigate().forward();
//		
//		System.out.println("Title after navigating forward is -> " + driver.getTitle());
//		
//		
//		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
		
		
	}

}
