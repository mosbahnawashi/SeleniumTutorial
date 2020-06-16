package interviewQuestionsFollowUp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.yahoo.com");
		driver.navigate().to("https://www.msn.com");
		//.navigate().back();
		//driver.navigate().forward();
		
		//driver.close();
		//driver.quit();
		driver.get("https://www.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // id, name frame web element.
		
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		// How to switch selenium control to the 3rd window opened by your test?
		String parent=driver.getWindowHandle();
		 
		// This will return the number of windows opened by Webdriver and will return Set of Strings
		Set<String>s1=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		I1.next();// Gets child window id
		I1.next(); // Get 2nd child window
		String windowId3 = I1.next(); // Gets 3rd child window
		driver.switchTo().window(windowId3);
		
		//	How to handle https certifications?
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		 
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		// Set the driver path
		//System.setProperty("webdriver.chrome.driver","Chrome driver path");
		 
		// Open browser with capability
		// driver=new ChromeDriver(cap);

	}

}
