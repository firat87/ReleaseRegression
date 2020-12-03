package Regression;


import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.PageFactory;

import DatabaseAccess.CustomerAM;



public class RoadToActivation extends BaseClass{
	
	SwitchWindow obj = new SwitchWindow();
	ObjectRepository obj2 = new ObjectRepository();
	public static String cust = null;
	

	public void RtA () throws ClassNotFoundException, SQLException, InterruptedException{
		
	PageFactory.initElements(driver, obj2);
	String customerid = null;
	BaseClass.driver.switchTo().defaultContent();
	driver.switchTo().frame("cx");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("cx");
	Thread.sleep(1000);
	cust=CustomerAM.CustomerNo(customerid);
	obj2.customer.sendKeys(cust);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='customerno']")).click();
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	Thread.sleep(5000);
	String mainWindow = driver.getWindowHandle();
	System.out.println(mainWindow);
	obj.Windows();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().setPosition(new Point(0,-100));
	if(!driver.getTitle().toString().contains("secure")){
		obj2.tamam.click();}else{
			
	obj2.actionicon.click();
	obj2.link.click();
	obj2.tamam.click();
	}
	driver.switchTo().window(mainWindow);
	driver.switchTo().defaultContent();
	}
	

}
