package testingbaba_pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.Baselibrary;

public class CheckBox_page extends Baselibrary
{

	public CheckBox_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@ data-target=\"#elements\"]")
    private WebElement elements;
	
	@FindBy(xpath="//*[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
	private WebElement checkbox_frame;
	
	@FindBy(xpath="//*[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath="//*[@id=\"text\"]")
	private WebElement mobiletext;
	
	@FindBy (xpath="//*[@id=\"mylaptop\"]")
	private WebElement laptopcheckbox;
	
	@FindBy(xpath="//*[@id=\"text1\"]")
	private WebElement laptoptext;
	
	@FindBy(xpath="//*[@id=\"mydesktop\"]")
	private WebElement desktopcheckbox;
	
	@FindBy(xpath="//*[@id=\"text2\"]")
    private WebElement desktoptext;
	
	@FindBy(xpath="//*[@id=\"v-pills-tab\"]/a[3]")
	private WebElement RadioButton;
	
	@FindBy(xpath="//*[@id=\"yes\"]")
	private WebElement clickonyes;
	
	@FindBy(xpath="//*[@id=\"radio-content\"]")
	private WebElement clickonyestext;
	
	@FindBy(xpath="//*[@id=\"tab_3\"]/div[2]/label")
	private WebElement clickonimpressive;
	
	@FindBy(xpath="//*[@id=\"radio-content\"]")
	private WebElement clickonimpressivetext;
	
	
	@FindBy(xpath="//*[@id=\"no\"]")
	private WebElement clickonno;
	
	@FindBy(xpath="//*[@id=\"radio-content\"]")
	private WebElement clickonnotext;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

        public void clickonelements()
       {
	
	   clickme(elements);
       }
        
        public void clickoncheckbox()
        {
        	clickme(checkbox);
        }
        
        public void clickonmobilecheckbox()
        {
        	driver.switchTo().frame(checkbox_frame);
        	clickme(mobilecheckbox);
        	String expected = mobiletext.getText();
        	String actual=getReaddata("mobile");
        	driver.switchTo().defaultContent();
        	Assert.assertEquals(actual, expected);
        }
	   public void clickonlaptopcheckbox()
	   {   driver.switchTo().frame(checkbox_frame);
		   clickme(laptopcheckbox);
		   String expected = laptoptext.getText();
		   String actual = getReaddata("laptop");
		   driver.switchTo().defaultContent();
		   Assert.assertEquals(actual, expected);
		   
	   }
        public void clickondesktopbox()
        {   driver.switchTo().frame(checkbox_frame);
        	clickme(desktopcheckbox);
        	String expected = desktoptext.getText();
        	String actual = getReaddata("desktop");
        	driver.switchTo().defaultContent();
        	Assert.assertEquals(actual, expected); 	
        }
	   
        public void RadioButton()
        {
        	clickme(RadioButton);
        }
        
	   public void clickonyes()
	   {
		   clickme(clickonyes);
		   String expected = clickonyestext.getText();
		   String actual = getReaddata("yes");
		   Assert.assertEquals(actual, expected);
		   
	   }
	   
	   public void clickonimpressive()
	   {
		   clickme(clickonimpressive);
		   String expected = clickonimpressive.getText();
		   String actual = getReaddata("inpressive");
		   Assert.assertEquals(actual, expected);
	   }
	   
	   public void clickonno()
	   {
		   clickme(clickonno);
		   String expected = clickonno.getText();
		   String actual = getReaddata("no");
		   Assert.assertEquals(actual, expected);
	   }   
	   public void CloseWindow() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();  
	   }   
	   
	   
	   
	   
        
        
        
        
        
        
}
