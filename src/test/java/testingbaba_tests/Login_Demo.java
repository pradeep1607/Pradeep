package testingbaba_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Demo {
	
	
	public static void main(String[] args) {
		String path = "C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\drivers\\chromedriver.exe";
		System.setProperty("webdriver,chrome,driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
