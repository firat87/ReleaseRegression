package Regression;

import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import DatabaseAccess.ProperICCI;


public class MNPSim extends BaseClass {
	
	SwitchWindow obj = new SwitchWindow();
	ObjectRepository obj2 = new ObjectRepository();
	
	public void MNPSimProperties() throws ClassNotFoundException, SQLException, InterruptedException{
		
			PageFactory.initElements(BaseClass.driver, obj2);
		    String mainWindow = driver.getWindowHandle();
			driver.switchTo().defaultContent();
			obj.switchwindow("cx", "frame1", "frame2");
			Thread.sleep(2000);
			//Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='brand']")));
			Select selectObject = new Select (obj2.brand);
			selectObject.selectByValue("MC");
			Thread.sleep(2000);
			WebDriverWait wait1 = new WebDriverWait(driver, 15);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='prefix']")));
			Select selectObject2 = new Select (obj2.prefix);
			selectObject2.selectByValue("533");
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='rsvstatus']")));
			Thread.sleep(2000);
			Select selectObject3 = new Select (obj2.reserv);
			selectObject3.selectByValue("E");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);
			obj2.gsmno.sendKeys(Keys.ENTER);
			Thread.sleep(7000);
			obj.Windows();
			
			ProperICCI value = new ProperICCI();
			Random rand = new Random();
			int num = rand.nextInt(9000000) + 1000000;
			String number = Integer.toString(num);
			obj2.prefixgsmnno.sendKeys(number);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			obj2.findbutton.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			obj2.typebutton2.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.switchTo().window(mainWindow);
			obj.switchwindow("cx", "frame1", "frame1");
			obj2.icci.click();
			obj.Windows();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String simcardicci = null;
			obj2.icci2.clear();
			obj2.icci2.sendKeys(value.DBIcci(simcardicci));
			
			driver.findElement(By.xpath("//input[@value='BUL']")).click();
			obj2.typebutton.click();
			obj2.typebutton2.sendKeys(Keys.ENTER);
			driver.switchTo().window(mainWindow);
			obj.switchwindow("cx", "frame1", "frame1");
			obj2.handset.click(); //Unexpected error
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			obj.Windows();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			obj2.handsetbrand.sendKeys("Alcatel HB 100");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='Bul']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("//a[href*='AL00004']")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.switchTo().window(mainWindow);
			obj.switchwindow("cx", "frame1", "frame1");
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//input[contains(@onblur,'Imei numarasini')]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].value='123456789123456'", element);
			Thread.sleep(1000);
			obj2.usernameinfo.sendKeys("oto");
			obj.switchwindow2("cx", "frame1");
			WebElement paketsecimi=driver.findElement(By.xpath("//td[@class='passive' and @id='2' and @style='CURSOR: hand']"));
			paketsecimi.click();
		
		
	}

}
