package Regression;

import org.openqa.selenium.By;


public class HomePage extends BaseClass{


	public void MainMenu() {
		
		driver.switchTo().frame("ax");
		driver.switchTo().frame("menu").findElement(By.xpath("//a[@title='A K T � V A S Y O N']")).click();
		
	}
	public void MainMenu2(){
		 
		driver.switchTo().frame("bx");
		driver.findElement(By.xpath("//input[@value='MNP']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("ax");
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("//a[@title='MNP Ba�vuru Ekrani']")).click();
 }

  public void MainMenu3() throws InterruptedException{
	  
	  
	  driver.switchTo().frame("ax");
	  //driver.switchTo().frame("menu").findElement(By.xpath("//*[text()[contains(.,'YENI SORGULAMA')]]")).sendKeys(Keys.ENTER);
	  driver.switchTo().frame("menu");
	  driver.findElement(By.xpath("//a[@title='M��teri-Abone Listesi']")).click();
	  Thread.sleep(2000);
	  //WebElement element = driver.findElement(By.xpath("//input[contains(@onblur,'Imei numarasini')]"));
	  
  }

  
} 
