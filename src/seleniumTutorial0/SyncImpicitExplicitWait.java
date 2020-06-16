package seleniumTutorial0;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncImpicitExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Phone, email or username']"));
		WebElement password = driver
				.findElement(By.xpath("//div[@class='clearfix field']//input[@placeholder='Password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

		sendEmail(driver, email, 10, "eMaIl@email.com");
		sendPassword(driver, password, 5, "P@$$w0rd");
		clickLogIn(driver, login, 3);
	}

	public static void sendEmail(WebDriver driver, WebElement element, int timeOut, String value) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void sendPassword(WebDriver driver, WebElement element, int timeOut, String value) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("value");
	}

	public static void clickLogIn(WebDriver driver, WebElement element, int timeOut) {
		new WebDriverWait(driver, timeOut).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
}