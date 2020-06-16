package seleniumTutorial0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		
		driver.findElement(By.xpath("//*[@id='contentcolumn']/form/p/input")).click();
		String alerttext1 = driver.switchTo().alert().getText();
		System.out.println(alerttext1);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='contentcolumn']/div[4]/table/tbody/tr/td[2]/form/input")).click();
		String alerttext2 = driver.switchTo().alert().getText();
		System.out.println(alerttext2);
		driver.switchTo().alert().accept();
		
		//String alerttext3 = driver.switchTo().alert().getText();
		//System.out.println(alerttext3);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//*[@id='contentcolumn']/div[7]/table/tbody/tr/td[2]/form/input")).click();
		String alerttext4 = driver.switchTo().alert().getText();
		System.out.println(alerttext4);
		driver.switchTo().alert().sendKeys("New Text Entered");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		//String alerttext5 = driver.switchTo().alert().getText();
		//System.out.println(alerttext5);
	}
}