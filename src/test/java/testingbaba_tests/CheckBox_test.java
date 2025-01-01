package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.CheckBox_page;
import testingbaba_pages.TextBox_Page;

public class CheckBox_test extends Baselibrary
{

	
	CheckBox_page ob;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob=new CheckBox_page();
	}
	
	@Test(priority = 1)
	public void clickonElements()
	{
		ob.clickonelements();
	}
	
	@Test(priority=2)
	public void clickoncheckbox()
	{
		ob.clickoncheckbox();
	}
	
	@Test(priority=3)
    public void clickonmobilecheckbox()
    {
		ob.clickonmobilecheckbox();
    }
	
	@Test(priority=4)
	public void clickonlaptopcheckbox()
	{
		ob.clickonlaptopcheckbox();
	}
	
	@Test(priority=5)
	public void clickondesktopbox()
	{
		ob.clickondesktopbox();
	}
	
	@Test(priority=6)
	
	public void clickonRadiobutton()
	{
		ob.RadioButton();
	}
	
	@Test(priority=7)
	public void clickonyes()
	{
		ob.clickonyes();
	}
	
	@Test(priority = 8)
	public void clickonimpressive()
	{
		ob.clickonimpressive();
	}
	
	@Test(priority = 9)
	public void clickonno()
	{
		ob.clickonno();
	}
	
	@AfterTest
	public void closeWindow() throws InterruptedException {
		ob.CloseWindow();
	}
}
