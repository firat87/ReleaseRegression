package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cancellation extends BaseClass {
	
	public void SubsCancellation () throws InterruptedException{
		
		
		SwitchWindow object = new SwitchWindow();
		ObjectRepository obj = new ObjectRepository();
		PageFactory.initElements(driver, obj);
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='reasoncode']")));
		selectObject.selectByValue("KND_IST_IPTAL");
		Select selectObject2 = new Select (driver.findElement(By.xpath("//select[@name='treason']")));
		selectObject2.selectByValue("DIGER");
		
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("iptal islem");	
		String mainWindow = driver.getWindowHandle();
		obj.savebutton.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		object.Windows();
		driver.findElement(By.xpath("//input[@name='okBtn']")).sendKeys(Keys.ENTER);
		//driver.switchTo().window(mainWindow);
		
		

	}

}
