package frameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.OperationLoginOHM;
import pageObjectModel.OperationLogoutOHM;

public class KeywordDF {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		OperationLoginOHM loginOHM=new OperationLoginOHM(driver);
		OperationLogoutOHM logoutOHM=new OperationLogoutOHM(driver);

	FileInputStream inputStream=new FileInputStream("E:\\LoginCredentialsmay.xlsx");

	XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
	XSSFSheet sheet=workbook.getSheet("Keyword");

	int rows=sheet.getLastRowNum();
	System.out.println(rows);

	for(int r=1;r<=rows;r++)
	{
		XSSFRow row=sheet.getRow(r);
		XSSFCell key=row.getCell(1);
		System.out.println(key);
		switch (key.toString())
		{
		case"url" :
			loginOHM.url();
			break;
		case "username":
			loginOHM.username(null);
			break;
		case "password":
			loginOHM.password("admin123");
			break;
		case "login":
			logoutOHM.logout();
		case"userprofile":
			logoutOHM.userprofile();
		case "logout":
			logoutOHM.logout();
			default:
				System.out.println("INVALID KEYWORD");
		}

		}
	}
}


