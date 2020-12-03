package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ResumeforCancellation extends BaseClass {
	
	
	public void IhyaComplete(){
		
		ObjectRepository obj = new ObjectRepository();
		PageFactory.initElements(driver, obj);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		obj.aciklama.sendKeys("ihya");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		obj.submit.click();
		
		
	}

}
