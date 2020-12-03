package Regression;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SairIslem extends BaseClass{
	
	public void Abone›ptali() throws InterruptedException{
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		driver.findElement(By.cssSelector("a[href*='TRANSCODE=150']")).sendKeys(Keys.ENTER);
	}
	
	public void SimCardChange() throws InterruptedException, AWTException{
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		driver.findElement(By.cssSelector("a[href*='TRANSCODE=301']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void ResumeTransaction() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		driver.findElement(By.cssSelector("a[href*='TRANSCODE=402']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}


}
