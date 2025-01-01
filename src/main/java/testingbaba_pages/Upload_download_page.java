package testingbaba_pages;

import javax.lang.model.util.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Upload_download_page extends Baselibrary
{
	String path="C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\testdata\\config.properties";
	public Upload_download_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement element;
	
	@FindBy(xpath="//*[text()='upload and download']")
	private WebElement upload_download;
	
	@FindBy(xpath="//*[text()='Select a file']")
	private WebElement selectfile;
	
	
	public void clickonElements() throws InterruptedException
	{
		Thread.sleep(1000);
		element.click();
	}
	public void upload_download() throws InterruptedException
	{    Thread.sleep(1000);
		upload_download.click();
	}
	public void uploadfile()
	{
		try {
			selectfile.click();
			Thread.sleep(1000);
			uploadfile(path);
		} catch (Exception e) {
			System.out.println("issue in upload file "+e);
		}
	}
		public void CloseWindow() throws InterruptedException {
			Thread.sleep(1000);
			driver.quit();
		}
	

}
