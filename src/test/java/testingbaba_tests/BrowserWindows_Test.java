package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.BrowserWindows_Page;

public class BrowserWindows_Test extends Baselibrary {

	
	BrowserWindows_Page ob;
	
	@BeforeTest
	public void getLaunchUrl_Testingbaba() {
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob = new BrowserWindows_Page();
	}

	@Test
	public void ToVerify_Closebtn() throws InterruptedException {
		ob.closebtn();
	}

	@Test(priority = 1)
	public void ToVerify_Practice() throws InterruptedException {
		
		ob.clickonpractic();
	}
	
	@Test(priority=2)
	public void ToVerify_alerts_frame_windows() throws InterruptedException
	{
		
		ob.alert_frame_window();
	}
	
	@Test(priority=3)
	public void ToVerify_browserwindows() throws InterruptedException
	{
		
		ob.getVerify_browserwindows();
	}
	
	@Test(priority=4)
	public void ToVerify_newtab() throws InterruptedException
	{
		
		ob.getVerify_newtab();
	}
	@Test(priority=5)
	public void ToVerify_newwindow() throws InterruptedException
	{
		
		ob.changewindow(0);
	}

	@Test(priority=6)
	public void getVerify_NewWindowmessage() throws InterruptedException
	{
		
		ob.getVerify_NewWindowmessage();
	}
	
	@AfterTest
	public void CloseWindow() throws InterruptedException {
		ob.CloseWindow();
	}
}
