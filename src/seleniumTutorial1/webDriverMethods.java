package seleniumTutorial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosba\\Desktop\\QA\\Software\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.cnn.com/");
		
		
		//System.out.println(driver.getPageSource());
		System.out.println("We are in: "+driver.getCurrentUrl());
		
		driver.getTitle();
		driver.get("https://www.ustraveldocs.com/jo/jo-niv-ds160info.asp");
		driver.navigate().back();
		driver.getTitle();

		driver.navigate().forward();
		
		
		//driver.close(); // Closes the current browser. Active browser opened by Selenium scripts.
		//driver.quit(); Closes all browsers opened by Selenium scripts. 
		//Used one you hit links and open multiple child windows.
	}

}
