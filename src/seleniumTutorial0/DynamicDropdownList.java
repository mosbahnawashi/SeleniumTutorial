package seleniumTutorial0;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.com/CheapFlightsHome");
		System.out.println(driver.findElement(By.id("cos_ui_picker")).getText());
		driver.findElement(By.id("cos_ui_picker")).click();
		
		/*
		 int i=1;
		 
		while(i<9)
		{
			driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div/div[3]/div[2]/span[2]")).click();
			i++;
		}
		*/
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div/div[3]/div[2]/span[2]")).click();

		}
		
		
		driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div/div[1]/div")).click();

		driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[12]/div/ul[2]/li[4]")).click();
		driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/span/div[3]/div/div/div[10]/span")).click();
		System.out.println(driver.findElement(By.id("cos_ui_picker")).getText());

	}
}