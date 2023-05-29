package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationLoginOHM {


	WebDriver driver;
	public OperationLoginOHM(WebDriver driver)
	{
		this.driver=driver;
	}

	//repository of WebElement
	By username= By.name("username");
	By password= By.name("password");
	By login=By.xpath("//button[@type='submit']");

public void url() throws InterruptedException
{
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
}

public void username(String un)
{
driver.findElement(username).sendKeys(un);
}

public void password(String pw)
{
driver.findElement(password).sendKeys(pw);
}

public void loginbtn()
{
driver.findElement(login).click();
}
public void loginprocess(String un, String pw) throws InterruptedException
{
url();
username(un);
password(pw);
loginbtn();

}

}