package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import testingbaba_pages.Buttons_Page;

public class Buttons_Test extends Baselibrary {

	Buttons_Page ob;

	@BeforeTest
	public void getLaunchUrl_Testingbaba() {
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob = new Buttons_Page();
	}

	@Test
	public void ToVerify_Closebtn() {
		ob.closebtn();
	}

	@Test(priority = 1)
	public void ToVerify_Practice() {
		ob.clickonpractice();
	}

	@Test(priority = 2)
	public void ToVerify_Elements() {
		ob.clickonelements();
	}
	
	@Test(priority = 3)
	public void ToVerify_Buttons() {
		ob.clickonbuttons();
	}
	
	@Test(priority = 4)
	public void ToVerify_DoubleClick() {
		ob.getVerify_DoubleClick();
	}
	
	@Test(priority = 5)
	public void ToVerify_SingleClick() {
		ob.getVerify_SingleClick();
	}
	
	@Test(priority = 6)
	public void ToVerify_RightClick() {
		ob.getVerify_RightClick();
	}

	@AfterTest
	public void closeWindow() throws InterruptedException {
		ob.CloseWindow();
	}

}

