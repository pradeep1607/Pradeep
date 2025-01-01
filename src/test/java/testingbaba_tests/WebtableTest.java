package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import cucumber.api.java.After;
import testingbaba_pages.WebtablePage;

public class WebtableTest extends Baselibrary
{
    WebtablePage ob;
    @BeforeTest
    public void getLaunchUrl_tesingbaba()
    {
    	
    	getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
    	ob=new WebtablePage();	
    }
	@Test(priority =1)
	public void clickonwebElements() throws InterruptedException
	{
		ob.clickonelements();
	}
	@Test(priority=2)
	public void clickonWebtable() throws InterruptedException
	{
		ob.clickonwebtable();
	}
	@Test(priority=3)
	public void filldetails() throws InterruptedException
	{
		ob.filldetails();
	}
	@Test(priority = 4)
	public void verifyname() throws InterruptedException
	{
		ob.verifyname();
	}
	
	@Test(priority=5)
	public void verifyemailid() throws InterruptedException
	{
		ob.verifyemailid();
	}
	
		@Test(priority=6)
		public void updateName_email() throws InterruptedException
		{
			ob.updateName_email();
		}
	
		@Test(priority = 7)
		public void verifyupdatename() throws InterruptedException
		{
			ob.verifupdateName();
		}
		
		@Test(priority=8)
		public void verifyupdateEmail() throws InterruptedException
		{
			ob.verifyupdateEmail();
		}
		
		@AfterTest
		public void CloseWindow()throws InterruptedException
		{
			ob.CloseWindow();
		}
		
}
