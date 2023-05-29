package learn_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
WebDriver driver=null;
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("BrowserName is "+browserName);
	if(browserName.equalsIgnoreCase("Chrome"))
	{WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	if(browserName.equalsIgnoreCase("FireFox"))
		{WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	if(browserName.equalsIgnoreCase("Edge"))
		{WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	}
	}
	@Test
	public void amazonAssertTitle()
	{
		driver.get("https://www.amazon.com/");
		String expectedTitle="Fails";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle, "Different from actual title");
	}



}


