package seleniumTutorial0;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// Initialize browser

		// Internet Explorer:
		File file = new File("C:\\Program Files\\Java\\selenium\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		WebDriver driverIE = new InternetExplorerDriver();
		// driverIE.get("http://www.msn.com");
		driverIE.get("https://www.facebook.com");
		// driverIE.get("https://www.yahoo.com");
		// driverIE.navigate().to("https://www.bankofamerica.com");
		// driverIE.navigate().back();
		// driverIE.navigate().forward();

		// System.out.println(driverIE.getPageSource());
		System.out.println(driverIE.getTitle());
		System.out.println(driverIE.getCurrentUrl());

		driverIE.findElement(By.id("email")).sendKeys("mosbah.alnawashi@gmail.com");
		driverIE.findElement(By.id("pass")).sendKeys("MARLBOR0$$");
		//driverIE.findElement(By.id("u_0_2")).submit();
		driverIE.findElement(By.linkText("Forgot account?")).click();

		// Close browser
		// driverIE.close();
	}
}