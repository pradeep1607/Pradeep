package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class Buttons_Page extends Baselibrary {

	public Buttons_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;

	@FindBy(xpath = "//*[@href=\"#tab_5\"]")
	private WebElement buttons;

	@FindBy(xpath = "//*[@ondblclick=\"doubletext()\"]")
	private WebElement doubleclick;

	@FindBy(xpath = "//*[@onclick=\"clicktext()\"]")
	private WebElement singleclick;

	@FindBy(xpath = "//*[@oncontextmenu=\"righttext()\"]")
	private WebElement rightclick;

	@FindBy(xpath = "//*[@id=\"double-content\"]")
	private WebElement doubleclicktext;

	@FindBy(xpath = "//*[@id=\"click-content\"]")
	private WebElement singleclicktext;

	@FindBy(xpath = "//*[@id=\"right-content\"]")
	private WebElement rightclicktext;

	public void closebtn() {
		clickme(closebtn);
	}

	public void clickonpractice() {
		clickme(practice);
	}

	public void clickonelements() {
		clickme(elements);
	}

	public void clickonbuttons() {
		clickme(buttons);
	}

	public void getVerify_DoubleClick() {

		doubleclick(doubleclick);

		String value = doubleclicktext.getText();
		String actual = getReaddata("doubleclick");
		Assert.assertEquals(actual, value);
	}

	public void getVerify_SingleClick() {

		clickme(singleclick);

		String value = singleclicktext.getText();
		String actual = getReaddata("singleclick");
		Assert.assertEquals(actual, value);
	}

	public void getVerify_RightClick() {

		rightclick(rightclick);

		String value = rightclicktext.getText();
		String actual = getReaddata("rightclick");
		Assert.assertEquals(actual, value);
	}

	public void CloseWindow() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}

