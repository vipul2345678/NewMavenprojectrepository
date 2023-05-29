package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallingPOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		OperationLoginOHM loginOHM=new OperationLoginOHM(driver);
	LogoutUsingPageFactory logoutPF=new LogoutUsingPageFactory(driver);
		loginOHM.url();
	loginOHM.username("Admin");
	loginOHM.password("admin123");
	loginOHM.loginbtn();




	}





}
