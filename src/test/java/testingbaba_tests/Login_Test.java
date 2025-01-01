package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Login_page;

public class Login_Test extends Baselibrary
{

	Login_page ob ;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl("https://erial.in/", "chrome");
		ob = new Login_page();
	}
	
	@Test
	public void Toverify_titleOf_testingbaba()
	{
		ob.getTitle();
	}
	
//	@AfterTest
//	public void CloseWindow() throws InterruptedException {
//		ob.CloseWindow();
//	}
}
