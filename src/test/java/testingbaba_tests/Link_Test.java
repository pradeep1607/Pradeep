package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Link_Page;


public class Link_Test extends Baselibrary {

	Link_Page ob;

	@BeforeTest
	public void getLaunchUrl_Testingbaba() {
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob = new Link_Page();
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
	public void ToVerify_Links() {
		ob.clickonlinks();
	}

	@Test(priority = 4)
	public void ToVerify_DemoPage() throws InterruptedException {
		ob.getVerify_DemoPage();
	}
	
	@Test(priority = 5)
	public void ToVerify_Created() {
		ob.getVerify_Created();
	}
	
	@Test(priority = 6)
	public void ToVerify_NoContent() {
		ob.getVerify_NoContent();
	}
	
	@Test(priority = 7)
	public void ToVerify_Moved() {
		ob.getVerify_Moved();
	}
	
	@Test(priority = 8)
	public void ToVerify_BadRequest() {
		ob.getVerify_BadRequest();
	}
	
	@Test(priority = 9)
	public void Toverify_Unauthorized() {
		ob.getVerify_Unauthorized();
	}
	
	@Test(priority = 10)
	public void ToVerify_Forbidden() {
		ob.getVerify_Forbidden();
	}
	
	@Test(priority = 11)
	public void Toverify_NotFound() {
		ob.getVerify_Notfound();
	}

	@AfterTest
	public void closeWindow() throws InterruptedException {
		ob.CloseWindow();
	}

}
