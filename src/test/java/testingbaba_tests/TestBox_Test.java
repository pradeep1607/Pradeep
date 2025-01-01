package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.TextBox_Page;

public class TestBox_Test extends Baselibrary
{

	
	TextBox_Page ob;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob=new TextBox_Page();
	}
	
	@Test(priority = 0)
	public void Toverify_titleOf_testingbaba()
	{
		driver.getTitle();// check this 
	}
	
	@Test(priority = 1)
	public void clickon_elements() 
	{
		ob.clickonelements();
	}
	
	@Test(priority = 2)
	public void clickontextbox() 
	{
		ob.clickontextbox();
	}
	
	@Test(priority=3)
	public void filldetails() 
	{
		ob.filldetails();
	}
	@Test(priority = 4)
	public void getVerify()
	{
		ob.getVerify();
	}
	@Test(priority = 5, dependsOnMethods = "getVerify")
	
	@AfterTest
	public void closeWindow() throws InterruptedException {
		ob.CloseWindow();
	}	
}
