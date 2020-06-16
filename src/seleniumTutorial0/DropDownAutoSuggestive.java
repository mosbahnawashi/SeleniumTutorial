package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAutoSuggestive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://us.makemytrip.com/");
		
		WebElement source = driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/input"));
		source.clear();
		source.sendKeys("OS");
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[3]/span/input"));
		destination.clear();
		destination.sendKeys("MO");
		
		for(int i=1;i<4;i++)
		{
			destination.sendKeys(Keys.ARROW_DOWN);	
		}
		destination.sendKeys(Keys.ENTER);
		
		
	}
}