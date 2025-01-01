package testingbaba_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class TextBox_Page extends Baselibrary
{

	String excelpath="C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\testdata\\testdata_pradeep.xlsx";
	String configpath="C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\testdata\\config.properties";
	  
	public TextBox_Page() 
	{
		
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	  //  @FindBy(xpath="//*[text()='×']")
	  //  private WebElement closebtn;
	     
	  //  @FindBy(xpath="//*[text()='Practice']")
	  //  private WebElement practice;
	     
	    @FindBy(xpath="//*[@ data-target=\"#elements\"]")
	     private WebElement elements;
	     
	    
	     
	     @FindBy(xpath = "//*[@href=\"#tab_1\"]")
	 	private WebElement textbox;

	 	@FindBy(xpath = "//*[@id=\"fullname1\"]")
	 	private WebElement fullname;

	 	@FindBy(xpath = "//*[@id=\"fullemail1\"]")
	 	private WebElement email;

	 	@FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
	 	private WebElement c_add;

	 	@FindBy(xpath = "//*[@id=\"paddresh1\"]")
	 	private WebElement p_add;

	 	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
	 	private WebElement submit;
	 	@FindBy(xpath="//*[@class=\"col-md-6 mt-5\"]/label")
	 	private List<WebElement> listofdata;


	   // public void closebtn()
	     {
	   
	  // 	 closebtn.click();
	     }
	  //  public void clickonpractice()
	     {
	   	 
	  // 	 practice.click();
	     }
	     public void clickonelements()
	     {
	    	
	    	 clickme(elements);
	     }
	     public void clickontextbox()
	     {
	    	
	    	 textbox.click();
	     }
	     
	     public void filldetails()
	     {
	    	 
	    	clickme(textbox);
	        sendkeys(fullname,getReaddata(0, 0, 1));
	        sendkeys(email,getReaddata(0, 1, 1));
	        sendkeys(c_add,getReaddata(0, 2, 1));
	        sendkeys(p_add,getReaddata(0, 3, 1));
	 		clickme(submit);
	 		
	     }	 
	     
	     public void getVerify()
	     {
	    	 SoftAssert sf = new SoftAssert();
	    	 ArrayList<String>expected=new ArrayList<String>();
	    	 expected.add(getReaddata(0, 0, 1));
	    	 expected.add(getReaddata(0, 1, 1));
	    	 expected.add(getReaddata(0, 2, 1));
	    	 expected.add(getReaddata(0, 3, 1));
	    	 ArrayList<String>actual=new ArrayList<String>();
	    	 for(int i=1; i<=listofdata.size()-1;i=i+2)
	    	 {
	    		actual.add(listofdata.get(i).getText());		
	    	 }
	    	 for(int i=0;i<=actual.size()-1;i++)
	    	 {
	    		// Assert.assertEquals(actual.get(i), expected.get(i));
	    		sf.assertEquals(actual.get(i), expected.get(i));
	    	 }
	            sf.assertAll();
	    	  
	     }
	
	     public void CloseWindow() throws InterruptedException {
	 		Thread.sleep(4000);
	 		driver.quit();
	 	}
	     
          
	        
         }

				


	 	
	     

