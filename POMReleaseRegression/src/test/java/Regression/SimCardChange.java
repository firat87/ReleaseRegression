package Regression;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class SimCardChange extends BaseClass {
	
	
	public void SimCard() throws ClassNotFoundException, SQLException, InterruptedException, AWTException{
		
		Regression.SwitchWindow window = new Regression.SwitchWindow();
		ObjectRepository obj = new ObjectRepository();
		PageFactory.initElements(driver, obj);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		String mainWindoww = driver.getWindowHandle();
		System.out.println(mainWindoww);
		obj.icci.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		window.Windows();
		Robot robot = new Robot();
		
		if(!driver.getTitle().toString().contains("secure")){
			
			obj.icci2.clear();
			obj.icci2.sendKeys(DatabaseAccess.IcciforSim.icciforSimCard());	
			driver.findElement(By.xpath("//input[@value='BUL']")).click();
			obj.typebutton.sendKeys(Keys.ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}else{
		obj.actionicon.click();
	    obj.link.click();
		obj.icci2.clear();
		obj.icci2.sendKeys(DatabaseAccess.IcciforSim.icciforSimCard());	
		driver.findElement(By.xpath("//input[@value='BUL']")).click();
		obj.typebutton.sendKeys(Keys.ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
		driver.switchTo().window(mainWindoww);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		driver.findElement(By.xpath("//input[@name='degistir']")).click();
		
	}

}
