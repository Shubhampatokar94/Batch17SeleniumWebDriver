package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _3_EdgeInvocation {
	
	public static void main(String[] args) {
		
		System.setProperty("webDriver.edge.driver", System.getProperty("user.dir") + "/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		String titleExpected = "Facebook – log in or sign up";
		
		System.out.println("Web page title is -> " + title);
		
		// Validation
		if(title.equals(titleExpected))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title doesn't match");
		}
	}

}
