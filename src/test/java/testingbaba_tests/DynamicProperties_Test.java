package testingbaba_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.DyanamicProperties_Page;

public class DynamicProperties_Test extends Baselibrary {

	DyanamicProperties_Page ob ;


	@BeforeTest
	public void getLaunchUrl_Testingbaba() {
		getLaunchUrl(getReaddata("url"), getReaddata("browsername"));
		ob = new DyanamicProperties_Page();
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
	public void ToVerify_DynamicProperties() {
		ob.clickondynamicproperties();
	}
	
	@Test(priority = 4)
	public void Toverify_ColourChangeNegative() {
		ob.getVerify_ColourChangeNegative();
	}
	
	@Test(priority = 5)
	public void Toverify_ColourChangePositive() {
		ob.getVerify_ColourChangePositive();
	}
	
	@AfterTest
	public void closeWindow() throws InterruptedException {
		ob.CloseWindow();
	}
	
	
}
