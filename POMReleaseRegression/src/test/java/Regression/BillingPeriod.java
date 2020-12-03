package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillingPeriod extends BaseClass {
	
	SwitchWindow obj = new SwitchWindow();
	
	public void Billing() throws InterruptedException{
		
		String mainWindow4 = driver.getWindowHandle();
		driver.switchTo().defaultContent();
		obj.switchwindow("cx", "frame1", "frame1");
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='billingperiod']")));
		selectObject.selectByValue("11");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.switchTo().window(mainWindow4);
		obj.switchwindow2("cx", "frame1");
		WebElement kampanyagiris=driver.findElement(By.xpath("//td[@class='passive' and @id='9' and @style='CURSOR: hand']"));
		kampanyagiris.click();
	}
	
		

}
