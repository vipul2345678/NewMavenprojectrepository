package learn_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemoCross {
	WebDriver driver=null;

		@BeforeTest
		public void setUp()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

			WebDriverManager.edgedriver().setup();
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


