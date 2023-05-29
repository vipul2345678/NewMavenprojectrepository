package learn_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	@DataProvider(name="searchdataset")
	public Object[][] searchdata()
	{
		Object[][] searchphone=new Object[3][2];
		searchphone[0][0]="iphone";
		searchphone[0][1]="14 pro max";
		searchphone[1][0]="oppo";
		searchphone[1][1]="Reno 2z";
		searchphone[2][0]="one plus";
		searchphone[2][1]="Nord";
		return searchphone;
	}

	@Test
	public void flipkartSearch(String brand, String phoneVarient) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement Loginpopup=driver.findElement(By.xpath("//button[@class='_2kpz61 _2doB4z']"));
		if(Loginpopup.isDisplayed())
		{
			Loginpopup.click();
		}
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(brand+" "+phoneVarient);
		driver.findElement(By.xpath("//button[@type=submit']")).click();





	}








}
