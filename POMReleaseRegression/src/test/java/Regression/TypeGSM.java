package Regression;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import DatabaseAccess.SearchGSM;


public class TypeGSM extends BaseClass{
	
	public static String gsm;
	ObjectRepository obj = new ObjectRepository();
	
	public void Search() throws ClassNotFoundException, SQLException{
		
		PageFactory.initElements(driver, obj);
		BaseClass.driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
	    gsm=SearchGSM.DBData();
		obj.gsmnumber.sendKeys(gsm);
		obj.submitbutton.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		obj.sairislem.sendKeys(Keys.ENTER);
				
	}
	
	public void SearchforIhya(){
		
		BaseClass.driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		PageFactory.initElements(driver, obj);
		obj.gsmnumber.sendKeys(gsm);
		obj.submitbutton.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		obj.sairislem.sendKeys(Keys.ENTER);
				
	}


}
