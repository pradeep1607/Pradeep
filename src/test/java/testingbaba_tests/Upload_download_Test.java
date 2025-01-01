package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Upload_download_page;

public class Upload_download_Test extends Baselibrary
{

	Upload_download_page ob;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob=new Upload_download_page ();
	}	
	
	@Test(priority=1)
	public void clickonElements() throws InterruptedException
	{
		ob.clickonElements();
	}
	@Test(priority=2)
	public void clickonselectfile() throws InterruptedException
	{
		ob.upload_download();
	}
	
	@Test(priority=3)
	public void uploadfile()
	{
		ob.uploadfile();
	}
	
	@AfterTest
	public void CloseWindow() throws InterruptedException
	{
		ob.CloseWindow();
	}
	
}
