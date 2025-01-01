package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class DyanamicProperties_Page extends Baselibrary {

	public DyanamicProperties_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[@href=\"#tab_9\"]")
	private WebElement dynamicproperties;
	
	@FindBy(xpath = "//*[@id=\"Enable\"]")
	private WebElement beforecolourvisibletext;
	
	@FindBy(xpath = "//*[@id=\"Visible\"]")
	private WebElement aftercolourvisibletext;
	
	public void closebtn() {
		clickme(closebtn);
	}

	public void clickonpractice() {
		clickme(practice);
	}

	public void clickonelements() {
		clickme(elements);
	}
	
	public void clickondynamicproperties() {
		clickme(dynamicproperties);
	}
	
	public void getVerify_ColourChangeNegative() {
		elementtoBevisible(aftercolourvisibletext, 5);
		boolean flag = beforecolourvisibletext.isEnabled();
		Assert.assertEquals(flag, true);
	}
	
	public void getVerify_ColourChangePositive() {
		
		elementtoBevisible(aftercolourvisibletext, 5);
		boolean flag = beforecolourvisibletext.isEnabled();
		Assert.assertEquals(flag, true);
	}
	
	public void CloseWindow() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
