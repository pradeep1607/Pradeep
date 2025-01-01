package applicationutility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility
{

	
	
	
	public void doubleclick(WebElement ele);
	public void rightclick(WebElement ele);
	public void uploadfile(String path);
	public void selectdropdown_byvalue(WebElement ele,String value);
	public void selectdropdown_byIndex(WebElement ele,int indexno);
	public void selectdropdown_byvisibletext(WebElement ele,String value);
	
	
	public void changewindow(int tabno);
	public void mouseover(WebElement ele);
	public void mouseover_click(WebElement ele,String linktext);
	String getReaddata(String excelpath2, int sheetno, int colno, int rowno);
	public void clickme(WebElement ele);
	public void sendkeys(WebElement ele,String value);
	public String getdatetime();
	
	
	
	public void accept_alert();
	public void dismiss_alert();
	public void sendkeys_alerts(String value);
	
}
