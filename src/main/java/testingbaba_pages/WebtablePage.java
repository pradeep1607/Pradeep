package testingbaba_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;

public class WebtablePage extends Baselibrary
{

	public WebtablePage()
	{
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@ data-target=\"#elements\"]")
    private WebElement elements;
	
	@FindBy(xpath="//*[text()='web tables']")
	private WebElement webtable;
	
	@FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
	private WebElement webtableframe;
	
	@FindBy(xpath="//*[text()='Name:']/following::input[@name='name']")
	private WebElement Input_name;
	
	@FindBy(xpath="//*[text()='Email:']/following::input[@name='email']")
	private WebElement Input_email;
	
	
	@FindBy(xpath="//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[1]")
	private List<WebElement> name_clmn_data;
	
	
	@FindBy(xpath="//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[2]")
	private List<WebElement> email_clmn_data;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//*[@name=\"edit_name\"]")
	private WebElement editname;
	
	@FindBy(xpath="//*[@name=\"edit_email\"]")
	private WebElement editemail;
	
	@FindBy(xpath="//*[text()='Update']")
	private WebElement updatebtn;
	
	
	
     
    public void clickonelements() throws InterruptedException
    {
	 Thread.sleep(1000);
	 clickme(elements);
    }
    
    public void clickonwebtable() throws InterruptedException
    {
    	Thread.sleep(1000);
    	webtable.click();
    	driver.switchTo().frame(webtableframe);	
    }
    
    public void filldetails() throws InterruptedException
    {
    	for(int i=1;i<=10; i++)
    	{    Thread.sleep(1000);
    		Input_name.sendKeys(getReaddata(1, 0, i));
    		Input_email.sendKeys(getReaddata(1,1,i));
    		save.click();
    	}
    }
    
    	public void verifyname() throws InterruptedException
    	{
    	    Thread.sleep(1000);
    		SoftAssert sf = new SoftAssert();
    	    int i = 1;
    		for(WebElement namevalue:name_clmn_data)
    		{
    			String nametext = namevalue.getText();
    			sf.assertEquals(nametext, getReaddata(1,0,i));
    			i++;
    		}
    		 sf.assertAll();
    	}
    
       public void verifyemailid() throws InterruptedException
       {    
    	   Thread.sleep(1000);
    	   SoftAssert sf = new SoftAssert();
            int i = 1;
    	   for(WebElement emailvalue:email_clmn_data)
    	   {
    		  String emailtaxt = emailvalue.getText();
    		  sf.assertEquals(emailtaxt, getReaddata(1,1,i));
    		  i++;
    		  
    	   } driver.switchTo().defaultContent();
    	   sf.assertAll();
       }
   
       public void updateName_email() throws InterruptedException
       
       {
    	   Thread.sleep(1000);
    	   driver.switchTo().frame(webtableframe);
    	   
    	   try {
    		   
    		  List<WebElement> edits = driver.findElements(By.xpath("//*[text()='Edit']"));
    		   int i =1;
    		   for(WebElement edit:edits)
    		   {   Thread.sleep(1000);
    			   
    			   edit.click();
    			   editname.clear();
    			   editname.sendKeys(getReaddata(1,2,i));
    			   editemail.clear();
    			   editemail.sendKeys(getReaddata(1,3,i));
    			   updatebtn.click();
    			   i++;
    			   
    		   }
    		   
    		  driver.switchTo().defaultContent(); 
			
		} catch (Exception e) {
			System.out.println();
		}
       }   
    	   public void verifupdateName() throws InterruptedException 
       	{
       	    Thread.sleep(1000);
       		SoftAssert sf = new SoftAssert();
       	    int i = 1;
       		for(WebElement namevalue:name_clmn_data)
       		{
       			String nametext = namevalue.getText();
       			sf.assertEquals(nametext, getReaddata(1,2,i));
       			i++;
       		}
       		 sf.assertAll();
       
       	}
    	   public void verifyupdateEmail() throws InterruptedException
    	   {
    		   Thread.sleep(1000);
    		   SoftAssert sf = new SoftAssert();
    		   int i = 1;
    		   for(WebElement emailvalue:email_clmn_data)
    		   {
    			   String emailtaxt = emailvalue.getText();
    	    		  sf.assertEquals(emailtaxt, getReaddata(1,3,i));
    	    		  i++;
    	    		  
    	    	   } driver.switchTo().defaultContent();
    	    	   sf.assertAll();
    			   
    			   
    		   }
    	   
    	       public void CloseWindow() throws InterruptedException {
    			Thread.sleep(1000);
    			driver.quit();
    	       }
    
    

    
    
}