package Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoadToActivation2 extends BaseClass{
	
	ObjectRepository elm = new ObjectRepository();
	
	public void RoadtoActivation2 (){
		
		PageFactory.initElements(driver, elm);
		driver.switchTo().frame("cx");
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='idtype']")));
		WebElement option = selectObject.getFirstSelectedOption();
		//WebElement elm = driver.findElement(By.xpath("//select[@name='idtype']"));
		if(option.getText().contains("")){
		selectObject.selectByValue("n");
			elm.Devam.click();
			driver.switchTo().alert().accept();
		}else{
		elm.Devam.click();
		driver.switchTo().alert().accept();
		}}
		
		public void ContinueToActivation(){
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().defaultContent();
			driver.switchTo().frame("cx");
			WebElement aboneislemleri=driver.findElement(By.xpath("//td[@class='passive' and @id='2' and @style='CURSOR: hand']"));
			aboneislemleri.click();
			}
			
		}
	

			


