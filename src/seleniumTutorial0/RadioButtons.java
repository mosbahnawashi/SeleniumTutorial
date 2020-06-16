package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		int count = driver.findElements(By.xpath("//*[@id='travelOptions']")).size();
		
		for (int i = 0; i <= count; i++) {
			// driver.findElements(By.xpath("//*[@id='travelOptions']")).get(i).click();
			String text = driver.findElements(By.xpath("//*[@id='travelOptions']")).get(i).getAttribute("value");
			System.out.println(text);
			if (text.equals("Round Trip")) {
				driver.findElements(By.xpath("//*[@id='travelOptions']")).get(i).click();
			}
		}
	}
}