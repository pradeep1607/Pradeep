package testingbaba_pages;

import baselibrary.Baselibrary;

public class Login_page extends Baselibrary
{
      public void getTitle()
      {
    	 String title = driver.getTitle();
    	 System.out.println(title);
    	  
      }
      
      public void CloseWindow() throws InterruptedException {
  		Thread.sleep(1000);
  		driver.quit();
      }
}
