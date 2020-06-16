package seleniumTutorial0;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// FireFox:
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Open browser:
		driver.get("https://www.bankofamerica.com");
		driver.navigate().to("http://www.msn.com");

		System.out.println(driver.getTitle());

		// Close browser
		// driver.close();

	}

}
