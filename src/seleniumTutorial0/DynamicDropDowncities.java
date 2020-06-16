package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowncities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[3]/li[7]/a")).click();
		// Find destination city using xpath with index:
		// driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[2]/li[3]/a)[2]")).click();
		// Find destination city using parent-child xpath:\
		driver.findElement(By
				.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //*[@id='dropdownGroup1']/div/ul[2]/li[3]/a"))
				.click();
	}
}