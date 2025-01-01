package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import applicationutility.ApplicationUtility;
import excelutility.ExcelUtility;
import propertyutility.Propertyutility;
import screenshotutility.Screenshotutility;
import waitutility.WaitUtility;

public class Baselibrary implements Screenshotutility, ExcelUtility,WaitUtility ,Propertyutility,ApplicationUtility
{
	String configpath="C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\testdata\\config.properties";
	String excelpath="C:\\Users\\Admin\\eclipse-workspace\\13Aug_newAutomationbatch_pradeep\\testdata\\testdata_pradeep.xlsx";
	 public static WebDriver driver;
	public void getLaunchUrl(String url, String browsername)
	{
		String loc=System.getProperty("user.dir");
		String chromepath =loc+"\\drivers\\chromedriver.exe";
		String firefoxpath =loc+"\\drivers\\gecodriver.exe";
		try 
		{
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", chromepath);
			     driver = new ChromeDriver();
			     driver.get(url);
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			     driver.manage().window().maximize();
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", firefoxpath);
				driver=new FirefoxDriver(); 
				driver.get(url);
			    driver.manage().window().maximize(); 
			}
			driver.findElement(By.xpath("//*[text()='×']")).click();
			driver.findElement(By.xpath("//*[text()='Practice']")).click();
		} catch (Exception e)
		{
			System.out.println("Issue in get launch url "+e);
		}
	}
	
	@Override
	public String getReaddata(String key) {
		String value="";
		try {
			FileInputStream fis = new FileInputStream(configpath);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (Exception e) 
		{
			System.out.println("Issue in Get read data");
		}
		return value;
	}
	//@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}
	@Override
	public String getReaddata(int sheetno, int colno, int rowno) {
		String value="";
		try {
			FileInputStream fis = new FileInputStream(excelpath);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			value=wb.getSheetAt(sheetno).getRow(rowno).
					getCell(colno).getStringCellValue();
		//	value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} catch (Exception e)
		{
			System.out.println("Issue in Get read data from excel "+e);
		}
		return value;
			}
	@Override
	public void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	@Override
	public void rightclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	@Override
	public void uploadfile(String path) {
		try {
			StringSelection sel=new StringSelection(path);
			Clipboard clip =Toolkit.getDefaultToolkit().getSystemClipboard();
			clip.setContents(sel, null);	
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(250);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Issue in file uploading "+e);
			
		}
		
	
	}
	@Override
	public void selectdropdown_byvalue(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
		
	}
	@Override
	public void selectdropdown_byIndex(WebElement ele, int indexno) {
		Select sel = new Select(ele);
		sel.selectByIndex(indexno);
		
	}
	@Override
	public void selectdropdown_byvisibletext(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		
	}
	@Override
	public void changewindow(int tabno) {
		Set<String> set = driver.getWindowHandles();
		ArrayList<String>tabs=new ArrayList<String>(set);
		driver.switchTo().window(tabs.get(tabno));
		
		
	}
	@Override
	public void mouseover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	@Override
	public void mouseover_click(WebElement ele, String linktext) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
		driver.findElement(By.linkText(linktext)).click();
		
		
				
	}
	public String getReaddata1(int sheetno, int colno, int rowno) 
	{
		
		return null;
	}
	@Override
	public String getReaddata(String excelpath2, int sheetno, int colno, int rowno) {
		
		return null;
	}
    @Override
	public void elementtoBeClickable(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
    @Override
	public void elementtoBevisible(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(ele));

		
	}
    @Override
	public void alertIsPresent(int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.alertIsPresent());

		
	}

	@Override
	public void clickme(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
        ele.click();
		
	}

	@Override
	public void sendkeys(WebElement ele, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
		
	}
    @Override
	public void getScreenshot(String foldername, String filename) {
		try {
			String loc=System.getProperty("user.dir");
			String finalpath=loc+"\\screenshot\\"+foldername+"\\"+filename+".png";
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			 File src =efw.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File(finalpath));
			
		} catch (Exception e) {
			System.out.println("Issue in Get Screen shot");
		}
		
	}
    
    @AfterMethod
    public void getResultAnalysis(ITestResult result)
    {
    	String date=getDateTime();
    	String methodname=result.getMethod().getMethodName();
    	methodname=methodname+""+date;
    	try {
			if(result.getStatus()==ITestResult.SUCCESS)
			{
				getScreenshot("passed",methodname );
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				getScreenshot("failed", methodname);
			}
			else
			{
				getScreenshot("skiped" ,methodname );
			}
				
			
		} catch (Exception e) {
			System.out.println("Issue in Get Screenshot method"+e);
		}
    }

	public String getDateTime() {
		String date="";
		try {
			Date db = new Date();
			SimpleDateFormat sf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String date1=sf.format(db);
					
		} catch (Exception e) {
			// TODO: handle exception
		}
		return date;
		
	}

	@Override
	public String getdatetime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept_alert() {
		driver.switchTo().alert().accept();
		
	}

	@Override
	public void dismiss_alert() {
		driver.switchTo().alert().dismiss();
		
	}

	@Override
	public void sendkeys_alerts(String value) {
		driver.switchTo().alert().sendKeys(value);
		
	}
    
    
    
    
    
    
    
    
    
}
