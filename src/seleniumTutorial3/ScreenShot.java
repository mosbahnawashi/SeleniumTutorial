package seleniumTutorial3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//


//
public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://stackoverflow.com/");

		// To take screenshot while running test

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\Mosbah Alnawashi\\Desktop\\MosbahScreenshot.png"));

	}

}