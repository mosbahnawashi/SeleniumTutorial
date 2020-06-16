package seleniumTutorial3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoadGlobalVariables {

	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		Login();
	}

	public static void Login() throws IOException

	{

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\mosba\\OneDrive\\Desktop\\QA\\eclipse workspace\\SeleniumTutorial\\datadriven.properties");

		prop.load(fis);

		if (prop.getProperty("browser").equals("firefox"))

		{

			driver = new FirefoxDriver();

		}

		else if (prop.getProperty("browser").equals("chrome"))

		{

			driver = new ChromeDriver();

		}

		else

		{

			driver = new InternetExplorerDriver();

		}

		driver.get(prop.getProperty("url"));
	}

}
