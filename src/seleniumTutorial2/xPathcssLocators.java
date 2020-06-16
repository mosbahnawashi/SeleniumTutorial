package seleniumTutorial2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathcssLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mosba\\Desktop\\QA\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/"); //URL in the browser
		//driver.findElement(By.className("inputtext")).sendKeys("helloworld");
		/*driver.findElement(By.id("email")).sendKeys("Thisis my first code");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgot account?")).click();*/
		driver.findElement(By.id("username")).sendKeys("mygmail@gmail.com");
		driver.findElement(By.id("password")).sendKeys("mynewpassword");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		
	}

}
