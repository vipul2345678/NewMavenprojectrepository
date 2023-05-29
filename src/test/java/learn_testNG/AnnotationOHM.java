package learn_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationOHM {
WebDriver driver;
	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
	}
	@BeforeTest
	public void loginprocess() throws InterruptedException
	{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test
	public void testPIM()
	{
driver.findElement(By.linkText("PIM")).click();
System.out.println("Clicked on PIM Succesfully");
	}
	@Test
	public void pImReport()
	{
		driver.findElement(By.linkText("Reports")).click();
		System.out.println("Clicked on PIM Successfully");
		}
	@Test
	public void addEmployee()
	{
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on PIM SuccessFully");
	}
	@AfterTest
	public void logOutprocess() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	driver.findElement(By.linkText("Logout")).click();
	}
	@AfterSuite
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();

	}
}
