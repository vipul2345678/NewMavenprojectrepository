package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutUsingPageFactory {
WebDriver driver;

public LogoutUsingPageFactory(WebDriver wd)
{
driver=wd;
PageFactory.initElements(driver, this); //this method will create WebElements
}

	@FindBy(xpath="//p[@class='oxd-userdropdown-name']") WebElement userprofile;
	@FindBy(linkText = "Logout") WebElement logout;

	public void userprofile() throws InterruptedException
	{
		userprofile.click();
		Thread.sleep(2000);
	}
	public void logout() throws InterruptedException
	{
		logout.click();
		Thread.sleep(2000);
	}

	public void logoutprocess() throws InterruptedException
	{
		userprofile();
		logout();
	}


}
