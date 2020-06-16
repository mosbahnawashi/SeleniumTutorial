package seleniumTutorial2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

//System.setProperty("webdriver.ie.driver","E:\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");

		WebDriver driver = new ChromeDriver();

//WebDriver driver = new InternetExplorerDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();

// driver.get("https://instagram.com/");

		driver.findElement(By.cssSelector("a[href='https://support.google.com/accounts?hl=en-GB']")).click();

// driver.findElement(By.xpath(".//*[@id='react-root']/section/main/article/div[2]/div[3]/div/a[2]/img")).click();

		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentid = it.next();

		String childid = it.next();

		driver.switchTo().window(childid);

		WebDriverWait myWait = new WebDriverWait(driver, 5);

		myWait.until(ExpectedConditions.numberOfWindowsToBe(driver.getWindowHandles().size()));

		System.out.println(driver.getTitle());

	}

}