package TestCases;

import java.awt.AWTException;
import java.sql.SQLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC04SubscriberCancellation  {
	
	Regression.BaseClass obj = new Regression.BaseClass();
	Regression.Login obj2= new Regression.Login();
	Regression.HomePage obj3 = new Regression.HomePage();
	Regression.TypeGSM obj4 = new Regression.TypeGSM();
	Regression.SairIslem obj5 = new Regression.SairIslem();
	Regression.Cancellation obj6 = new Regression.Cancellation();
	
	@BeforeTest
	public void Settings() throws AWTException{
		
		obj.SettingDriver();
	}	
	
	@Test
	public void Login() throws InterruptedException{
		
		obj2.LogintoCRM();
		
	}
	
	@Test(dependsOnMethods={"Login"})
	public void Menu() throws InterruptedException {
		
		obj3.MainMenu3();
		
	}
	@Test(dependsOnMethods={"Menu"})
	public void Search() throws InterruptedException, ClassNotFoundException, SQLException {
		
		obj4.Search();
		
	}
	
	@Test(dependsOnMethods={"Search"})
	public void Sair() throws InterruptedException {
		
		obj5.Abone›ptali();
		
	}
	@Test(dependsOnMethods={"Sair"})
	public void Cancel() throws InterruptedException {
		
		obj6.SubsCancellation();
		
	}

}
