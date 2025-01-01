package testingbaba_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Demo {
	{
		
	String path = "C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\drivers\\chromedriver.exe";
	System.setProperty("webdriver,chrome,driver","path");
    WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipcart.com/");
}


}
