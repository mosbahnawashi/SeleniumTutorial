package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		boolean tf=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
		System.out.println(tf);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		boolean tf1=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
		System.out.println(tf1);
		
		System.out.println(driver.findElements(By.xpath("//input[contains(@id,'ctl00_mainContent_chk_')]")).size());
	}
}