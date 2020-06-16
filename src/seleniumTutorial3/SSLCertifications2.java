package seleniumTutorial3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertifications2 {

	public static void main(String[] args) {

// general profile

		DesiredCapabilities ch = DesiredCapabilities.chrome();

//ch.acceptInsecureCerts();

		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//local browser setting

		ChromeOptions c = new ChromeOptions();

		c.merge(ch);

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(c);

		driver.manage().window().maximize();

		driver.get("https://stackoverflow.com/");
	}

}