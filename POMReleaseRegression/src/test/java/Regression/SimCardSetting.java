package Regression;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimCardSetting extends BaseClass{
	
	ObjectRepository elm = new ObjectRepository();
	SwitchWindow obj = new SwitchWindow();

	public void SimCardSecimi() throws InterruptedException{
		
		PageFactory.initElements(driver, elm);
		String mainWindow = driver.getWindowHandle();
		driver.switchTo().defaultContent();
		obj.switchwindow("cx","frame1","frame1");
		
		Select selectObject = new Select (driver.findElement(By.xpath("//select[@name='brand']")));
		selectObject.selectByValue("MC");
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, 15);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='prefix']")));
		Select selectObject2 = new Select (driver.findElement(By.xpath("//select[@name='prefix']")));
		selectObject2.selectByValue("543");
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='rsvstatus']")));
		Select selectObject3 = new Select (driver.findElement(By.xpath("//select[@name='rsvstatus']")));
		selectObject3.selectByValue("E");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		elm.gsmno.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		obj.Windows();
		elm.prefixgsmnno.sendKeys("107");
		Thread.sleep(1000);
		elm.findbutton.click();
		List<WebElement> gsms = driver.findElements(By.xpath("//input[@type='button']"));
		int i=0;
		gsms.get(i).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		elm.typebutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().window(mainWindow);
		obj.switchwindow("cx","frame1","frame1");
		elm.icci.click();
		obj.Windows();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='find' and @type='submit']")).click();
		elm.typebutton.click();
		elm.typebutton2.click();
		driver.switchTo().window(mainWindow);
		obj.switchwindow("cx","frame1","frame1");  
		driver.findElement(By.xpath("//input[@name='handset']")).click(); //Unexpected error
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		obj.Windows();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='handsetbrand']")).sendKeys("Alcatel HB 100");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='Bul']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("//a[href*='AL00004']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().window(mainWindow);
		obj.switchwindow("cx","frame1","frame1");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement element = driver.findElement(By.xpath("//input[contains(@onblur,'Imei numarasini')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value='123456789123456'", element);
		//driver.findElement(By.xpath("//input[contains(@onblur,'Imei numarasini')]")).sendKeys("123456789123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("oto");
		obj.switchwindow2("cx","frame1");
		WebElement paketsecimi=driver.findElement(By.xpath("//td[@class='passive' and @id='2' and @style='CURSOR: hand']"));
		paketsecimi.click();
	}
	
}
