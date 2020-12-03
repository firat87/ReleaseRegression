package Regression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MNPRoadToActivation extends BaseClass{
	
public void MakingActivation2() throws InterruptedException{
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("ax");
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("//a[@title='Aktivasyon']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		List<WebElement> myList=driver.findElements(By.xpath("//input"));
		
		int x=myList.size();
		 for (int y=0; y<myList.size(); y++){
			 if(myList.get(y).getAttribute("value").contains(RoadToActivation.cust)){
				 String customerid=myList.get(y).getAttribute("value");
				 driver.findElement(By.xpath("//input[@value='"+customerid+"']")).click();
			 }
		 }
		 myList.get(x-1).click();
		 Thread.sleep(2000);
	}
	
	public void MakingActivation3() throws InterruptedException{
		
		SwitchWindow obj = new SwitchWindow();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("cx");
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='preferDate00']")));
		selectObject.selectByValue("08:00-16:00");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='4-Gönder']")).click();
		String mainWindow = driver.getWindowHandle();
		obj.Windows();
		System.out.println(driver.findElement(By.tagName("h3")).getText());	
		driver.close();
		driver.switchTo().window(mainWindow);
	}

}
