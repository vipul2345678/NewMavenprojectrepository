package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OperationLogoutOHM {
	WebDriver driver;
	WebDriverWait Wait;
	public OperationLogoutOHM(WebDriver driver)
	{
		this.driver=driver;
	}

	//repository of WebElement
	By userprofile= By.xpath("//div[@class='oxd-topbar-header-userarea']/child::ul[1]/child::li[1]/child::span[1]/child::p[@class='oxd-userdropdown-name']");
	By logout= By.linkText("Logout");

public void userprofile() throws InterruptedException
{
	Wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement up=Wait.until(ExpectedConditions.visibilityOfElementLocated(userprofile));
up.click();
	Thread.sleep(2000);
}
public void logout() throws InterruptedException
{
driver.findElement(logout).click();
	Thread.sleep(2000);
}




}
