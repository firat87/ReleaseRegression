package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeftTransforAct extends BaseClass{
	
	SwitchWindow obj = new SwitchWindow();
	ObjectRepository obj2= new ObjectRepository();
		
	   public void KampanyaGirisi (){
			
			obj.switchwindow2("cx", "frame1");
			WebElement kullanicigiris=driver.findElement(By.xpath("//td[@class='passive' and @id='8' and @style='CURSOR: hand']"));
			kullanicigiris.click();	
			
		}
		public void KullaniciGirisi (){
			
			driver.switchTo().defaultContent();
			obj.switchwindow("cx", "frame1", "frame1");
			Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='reserveid']")));
			selectObject.selectByValue("K");
			obj.switchwindow2("cx", "frame1");
			WebElement vekilvasi=driver.findElement(By.xpath("//td[@class='passive' and @id='7' and @style='CURSOR: hand']"));
			vekilvasi.click();	
		}
		
		public void VekilVasi(){
			
			obj.switchwindow2("cx", "frame1");
			WebElement ozellikgiris=driver.findElement(By.xpath("//td[@class='passive' and @id='6' and @style='CURSOR: hand']"));
			ozellikgiris.click();	
		}
		public void OzellikGiris(){
			
			obj.switchwindow2("cx", "frame1");
			WebElement servisgiris=driver.findElement(By.xpath("//td[@class='passive' and @id='5' and @style='CURSOR: hand']"));
			servisgiris.click();	
		}
		public void ServisGiris() throws InterruptedException{
			driver.switchTo().defaultContent();
			obj.switchwindow("cx", "frame1", "frame1");
			driver.findElement(By.xpath("//input[@name='check0']")).click();
			driver.findElement(By.xpath("//input[@name='kaydet3']")).click();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		public void MakingActivation() throws InterruptedException{
			
			PageFactory.initElements(driver, obj2);
			obj.switchwindow2("cx", "frame1");
			//driver.findElement(By.xpath("//input[@id='biometric']")).click();
			obj2.savebutton.click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("cx");
			//System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		}
	public void MakingActivationforMNP() throws InterruptedException{
			
			PageFactory.initElements(driver, obj2);
			obj.switchwindow2("cx", "frame1");
			//driver.findElement(By.xpath("//input[@id='biometric']")).click();
			obj2.savebutton.click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			//driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("cx");
			//System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		}
		
	
		

}
