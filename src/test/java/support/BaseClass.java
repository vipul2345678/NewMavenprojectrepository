package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	@BeforeTest
		public void launchBrowser() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
