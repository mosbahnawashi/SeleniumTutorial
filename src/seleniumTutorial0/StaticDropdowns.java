package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cheaptickets.com/");

		Select s1 = new Select(driver.findElement(By.id("package-1-children-hp-package")));
		s1.selectByValue("5");

		Select s2 = new Select(driver.findElement(By.id("package-1-adults-hp-package")));

		s2.selectByValue("5");
	}
}