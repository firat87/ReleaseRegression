package Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectTariff extends BaseClass {
	
	SwitchWindow obj = new SwitchWindow();
	ObjectRepository obj2= new ObjectRepository();
		
	public void Selection(){
		
		PageFactory.initElements(BaseClass.driver, obj2);
		String mainWindow = driver.getWindowHandle();
		driver.switchTo().defaultContent();
		obj.switchwindow("cx","frame1","frame1");
		obj2.icci.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.Windows();
		
		driver.findElement(By.cssSelector("//a[href*='11900']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(mainWindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.switchwindow("cx","frame1","frame1");
		driver.findElement(By.xpath("//input[@name='handset']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		obj.Windows();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("//a[href*='PPHCN01']")).click(); //Unexpected Error
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(mainWindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.Windows();
		driver.findElement(By.xpath("//input[@name='close']")).click();	
		driver.switchTo().window(mainWindow);
		obj.switchwindow2("cx", "frame1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement odemetipi=driver.findElement(By.xpath("//td[@class='passive' and @id='3' and @style='CURSOR: hand']"));
		odemetipi.click();
	}
}



