package seleniumTutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wedDriverLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosba\\Desktop\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
		driver.findElement(By.id("header-search-input")).sendKeys("My first search on Yahoo! ...Mosbah");

	}
}