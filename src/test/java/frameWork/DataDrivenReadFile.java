package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import support.BaseClass;

public class DataDrivenReadFile extends BaseClass
{
	
				
			//-----------FileRead--------------
	@Test			
	public void LoginFromExcel() throws IOException, InterruptedException {
		
		
		FileInputStream fis=new FileInputStream("E:\\LoginCredentialsmay.xlsx");
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sheet=wb.getSheet("Data");
				
				int rows=sheet.getLastRowNum();
				System.out.println("Total No. of rows :"+rows);
				
				for(int r=1;r<=rows;r++) 
				{
					XSSFRow row=sheet.getRow(r);
					XSSFCell username=row.getCell(0);
					XSSFCell password=row.getCell(1);
		
					
					
					System.out.println("username--->"+username+"   "+ "password---->"+password);
				
				//-----------FileRead------------
					driver.findElement(By.name("username")).sendKeys(username.toString());
				driver.findElement(By.name("password")).sendKeys(password.toString());
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(2000);
				
				try {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				System.out.println("VALID");
				
				Thread.sleep(2000);
				
				}
				catch(Exception e) 
				{
					Thread.sleep(1000);
					WebElement errorContainer=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxdalert-content-text']"));
					String errormsg=errorContainer.getText();
					System.out.println("errormsg");
					
					
				}
				}
				fis.close();
					
	}

	
	}
