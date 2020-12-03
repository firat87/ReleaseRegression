package TestCases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.sql.SQLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import Regression.BaseClass;
import Regression.HomePage;
import Regression.Login;
import Regression.TypeGSM;

public class TC03TransferCrossCustomer  {

	BaseClass obj = new BaseClass();
	Login obj2 = new Login();
	HomePage obj3 = new HomePage();
	TypeGSM obj4 = new TypeGSM();

	@BeforeTest
	public void Start() throws AWTException{
		
		obj.SettingDriver();
		
	}
	@Test
	public void LoginStep() throws InterruptedException{
		
	    obj2.LogintoCRM();
	    
	}
	@Test(dependsOnMethods={"LoginStep"})
	public void Menu() throws InterruptedException{
		
		obj3.MainMenu3();
	}
	@Test(dependsOnMethods={"Menu"})
	public void Inquiry() throws ClassNotFoundException, SQLException{
		
		obj4.Search();
	}
	@AfterClass
	public void Finish(){
		BaseClass.driver.quit();
	}
}
