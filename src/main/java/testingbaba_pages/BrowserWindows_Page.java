package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class BrowserWindows_Page extends Baselibrary{
	public BrowserWindows_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement closebtn;

	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//*[@data-target=\"#alerts\"]")
	private WebElement alerts_frame_windows;
	
	@FindBy(xpath="//*[@href=\"#tab_11\"]")
	private WebElement 	browserwindows;
	
	@FindBy(xpath="//*[@href=\"https://www.google.co.in/\"]")
	private WebElement newtab;
	
	@FindBy(xpath="//*[@onclick=\"win1open()\"]")
	private WebElement newwindow;
	
	@FindBy(xpath="//*[@onclick=\"win2open()\"]")
	private WebElement newwindowmessage;
	
	@FindBy(xpath="//*[text()]")
	private WebElement newwindowmessagetext;
	
	public void closebtn() throws InterruptedException
	
	{
		Thread.sleep(1000);
		clickme(closebtn);
	}
	
	public void clickonpractic() throws InterruptedException
	{
		Thread.sleep(1000);
		clickme(practice);
	}
	
	public void alert_frame_window() throws InterruptedException
	{
		Thread.sleep(1000);
		clickme(alerts_frame_windows);
	}
	
	public void getVerify_browserwindows() throws InterruptedException
	{
		Thread.sleep(1000);
		clickme(browserwindows);
	}
	
	public void getVerify_newtab() throws InterruptedException
	
	{
		Thread.sleep(1000);
		clickme(newtab);
		changewindow(1);
		driver.close();
		changewindow(0);
	}
	
	public void getVerify_NewWindowmessage() throws InterruptedException
	
	{
		Thread.sleep(1000);
		
		clickme(newwindowmessage);
		changewindow(1);
	    String value = newwindowmessage.getText();
	    driver.close();
	    changewindow(0);
	    String actual = getReaddata("newwindowmessage");
	    
	    Assert.assertEquals(actual, value);
	} 
	    public void CloseWindow() throws InterruptedException {
	 		Thread.sleep(4000);
	 		driver.quit();
	 	}
	     	        
	    
	  	    

}
