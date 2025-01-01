package testingbaba_pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class Link_Page extends Baselibrary {

	public Link_Page()	
	{
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//*[@data-target=\"#elements\"]")
	private WebElement elements;

	@FindBy(xpath = "//*[@href=\"#tab_6\"]")
	private WebElement links;

	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement demopage;

	@FindBy(xpath = "//*[@onclick=\"Created()\"]")
	private WebElement created;

	@FindBy(xpath = "//*[@onclick=\"Content()\"]")
	private WebElement nocontent;

	@FindBy(xpath = "//*[@onclick=\"Moved()\"]")
	private WebElement moved;

	@FindBy(xpath = "//*[@onclick=\"Request()\"]")
	private WebElement badrequest;

	@FindBy(xpath = "//*[@onclick=\"Unauthorized()\"]")
	private WebElement unauthorized;

	@FindBy(xpath = "//*[@onclick=\"Forbidden()\"]")
	private WebElement forbidden;

	@FindBy(xpath = "//*[@onclick=\"Found()\"]")
	private WebElement notfound;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement createdtext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement nocontenttext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement movedtext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement badrequesttext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement unauthorizedtext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement forbiddentext;

	@FindBy(xpath = "//*[@id=\"link-result\"]")
	private WebElement notfoundtext;

	public void closebtn() {
		clickme(closebtn);
	}

	public void clickonpractice() {
		clickme(practice);
	}

	public void clickonelements() {
		clickme(elements);
	}

	public void clickonlinks() {
		clickme(links);
	}

	public void getVerify_DemoPage() throws InterruptedException {

		clickme(demopage);

		Thread.sleep(2000);

		changewindow(1);
		driver.close();
		changewindow(0);
	}

	public void getVerify_Created() {

		clickme(created);

		String value = createdtext.getText();
		String actual = getReaddata("created");

		Assert.assertEquals(actual, value);
	}
	
	public void getVerify_NoContent() {
		
		clickme(nocontent);
		
		String value  = nocontenttext.getText();
		String actual = getReaddata("nocontent");
		
		Assert.assertEquals(actual, value);
	}
	
	public void getVerify_Moved() {
		
		clickme(moved);
		
		String value = movedtext.getText();
		String actual = getReaddata("moved");
		
		Assert.assertEquals(actual, value);
	}
		
	public void getVerify_BadRequest() {
		
		clickme(badrequest);
		
		String value = badrequesttext.getText();
		String actual = getReaddata("badrequest");
		
		Assert.assertEquals(actual, value);
	}
	
	public void getVerify_Unauthorized() {
		
		clickme(unauthorized);
		
		String value = unauthorizedtext.getText();
		String actual = getReaddata("unauthorized");
		
		Assert.assertEquals(actual, value);
	}
	
	public void getVerify_Forbidden() {
		
		clickme(forbidden);
		
		String value = forbiddentext.getText();
		String actual = getReaddata("forbidden");
		
		Assert.assertEquals(actual, value);
	}
	
	public void getVerify_Notfound() {
		
		clickme(notfound);
		
		String value = notfoundtext.getText();
		String actual = getReaddata("notfound");
		
		Assert.assertEquals(actual, value);
	}

	public void CloseWindow() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

}
