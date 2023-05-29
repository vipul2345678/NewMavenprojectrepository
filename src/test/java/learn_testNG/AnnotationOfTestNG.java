package learn_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOfTestNG {
@BeforeSuite
public void beforeSuite()
{
	System.out.println("This Before Suite Section");
}
@BeforeTest
public void beforeTest()
{
System.out.println("This Before Test Section");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("This Before Class Section");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("This Before Method Section");
}
@Test
public void test1()
{
System.out.println("This Test1 Section");
}
@Test
public void test2()
{
System.out.println("This Test2 Section");
}
@AfterMethod
public void AfterMethod()
{
	System.out.println("This afterMethod Section");
}
@AfterClass
public void AfterClass()
{
	System.out.println("This afterClass Section");
}
@AfterTest
public void AfterTest()
{
	System.out.println("This afterTest Section");
}
@AfterSuite
public void AfterSuite()
{
	System.out.println("This afterSuite Section");
}







}
