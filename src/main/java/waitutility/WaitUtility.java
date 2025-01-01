package waitutility;

import org.openqa.selenium.WebElement;

public interface WaitUtility 
{

	public void elementtoBeClickable(WebElement ele,int time);
	public void elementtoBevisible(WebElement ele,int time);
	public void alertIsPresent(int time);
	
	
	
	
}
