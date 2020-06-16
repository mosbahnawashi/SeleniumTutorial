package seleniumTutorial0;

//import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.navigate().to("http://www.msn.com");
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//*[@id='onlineId1']")).sendKeys("mosbahalnawashi");
		//driver.findElement(By.xpath("//*[@id='passcode1']")).sendKeys("Mera0Adam");
		//driver.findElement(By.xpath("//*[@id='signIn']")).click();
		
		
		driver.findElement(By.id("username")).sendKeys("mosbah.alnawashi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("wrongpassword");
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.id("error")).getText());
		
		// Close browser // driver.close();

		// New way:

		/*
		 * File file = new File(
		 * "C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		 * System.setProperty("webdriver.chrome.driver",
		 * file.getAbsolutePath()); WebDriver driverChrome = new ChromeDriver();
		 * driverChrome.navigate().to("http://www.chrome.com");
		 */
	}
}
