package Regression;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
    
	public void SettingDriver() throws AWTException{
		
		
		WebDriverManager.iedriver().setup();
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability("requireWindowFocus", true);
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"internet explorer");
		capabilities.setCapability(CapabilityType.BROWSER_VERSION,"11");
		capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "normal");
	    capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		capabilities.setCapability("ignoreZoomSetting", true);
		capabilities.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK,false);
		driver.get("https://iccbcf/TelsimGlobal/Menu/showLogin.jsp");	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_0);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	//public abstract void LogintoCRM() throws InterruptedException;
	//public abstract void MainMenu();
	
	}
	
		
	


