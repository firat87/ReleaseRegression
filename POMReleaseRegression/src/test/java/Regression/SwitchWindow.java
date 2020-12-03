package Regression;

import java.util.Set;


public class SwitchWindow extends BaseClass{
	
	public void Windows () {
		
		String mainWindow = BaseClass.driver.getWindowHandle();
		Set<String> totalwindowsIds = BaseClass.driver.getWindowHandles();
		int a=0;
		String[] myset = totalwindowsIds.toArray(new String[totalwindowsIds.size()]);	
			if(myset[a].contains(mainWindow)){
				BaseClass.driver.switchTo().window(myset[a+1]);
			}
			else{
				BaseClass.driver.switchTo().window(myset[a]);
			}
	}
	public void switchwindow (String cx, String frame1, String frame2){
		//WebDriver x;
		driver.switchTo().frame("cx");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame1");	
	}
	public void switchwindow2 (String cx, String frame1){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		driver.switchTo().frame("frame1");
	}
	

}
