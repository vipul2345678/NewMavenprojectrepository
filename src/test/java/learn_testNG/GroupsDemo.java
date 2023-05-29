package learn_testNG;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups= {"smoke"})
	public void testcase1()
	{
	System.out.println("Test case 1");
	}
	@Test(groups= {"smoke","sanity"})
	public void testcase2()
	{
	System.out.println("Test case 2");
	}
	@Test(groups= {"sanity"})
	public void testcase3()
	{
	System.out.println("Test case 3");
	}
	@Test(groups= {"regression"})
	public void testcase4()
	{
	System.out.println("Test case 4");
	}
	@Test(groups= {"smoke","sanity","regression"})
	public void testcase5()
	{
	System.out.println("Test case 5");
	}
	@Test(groups= {"sanity","regression"})
	public void testcase6()
	{
	System.out.println("Test case 6");
	}
	@Test(groups= {"performance"})
	public void testcase7()
	{
	System.out.println("Test case 7");
	}
}
