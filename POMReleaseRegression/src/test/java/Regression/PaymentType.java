package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentType extends BaseClass {
	
	SwitchWindow obj = new SwitchWindow();
	
	public void Odeme(){
		
		driver.switchTo().defaultContent();
		obj.switchwindow("cx", "frame1", "frame1");
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='paytype']")));
		selectObject.selectByValue("Diger");
		driver.findElement(By.xpath("//input[@name='ödeme þeklini seç']")).click();
		driver.findElement(By.xpath("//input[@name='pi']")).click();
		driver.findElement(By.xpath("//input[@name='Seç']")).click();
		obj.switchwindow2("cx", "frame1");
		WebElement faturadonemi=driver.findElement(By.xpath("//td[@class='passive' and @id='4' and @style='CURSOR: hand']"));
		faturadonemi.click();
	}

}
