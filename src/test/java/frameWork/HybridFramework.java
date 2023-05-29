package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManagerJsonOutput.Result;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.OperationLoginOHM;
import pageObjectModel.OperationLogoutOHM;

public class HybridFramework {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		OperationLoginOHM loginOHM=new OperationLoginOHM(driver);
		OperationLogoutOHM logoutOHM=new OperationLogoutOHM(driver);
		
	FileInputStream Inputstream=new FileInputStream("E:\\LoginCredentialsmay.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(Inputstream);
		XSSFSheet DataSheet=wb.getSheet("Data");
		XSSFSheet KeySheet=wb.getSheet("Keyword");

		int Datarows=DataSheet.getLastRowNum();
		System.out.println("Rows NO.of DDF :"+Datarows);
		
		int Keyrows=KeySheet.getLastRowNum();
		System.out.println("Rows NO.of KeywordDF :"+Keyrows);
		for(int dr=1;dr<=Datarows;dr++)
		{
			XSSFRow Datarow=DataSheet.getRow(dr);
			XSSFCell username=Datarow.getCell(0);
			XSSFCell password=Datarow.getCell(1);
			XSSFCell result=Datarow.createCell(2);
		
			for(int kr=1;kr<=Keyrows;kr++)
			{
				XSSFRow Keyrow=KeySheet.getRow(kr);
				XSSFCell key=Keyrow.getCell(1);
				System.out.println(key);
				switch (key.toString())
				{
				case"url" :
					loginOHM.url();
					break;
				case "username":
					loginOHM.username(username.toString());
					break;
				case "password":
					loginOHM.password(password.toString());
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
			System.out.println("pass");
			result.setCellValue("PASS");
		}
}
}