package TestCases;

import java.awt.AWTException;
import java.sql.SQLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Regression.ResumeforCancellation;

public class TC06Ihya {
	
	Regression.BaseClass obj = new Regression.BaseClass();
	Regression.Login obj2= new Regression.Login();
	Regression.HomePage obj3 = new Regression.HomePage();
	Regression.TypeGSM obj4 = new Regression.TypeGSM();
	Regression.SairIslem obj5 = new Regression.SairIslem();
	ResumeforCancellation obj6 = new ResumeforCancellation();
	
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
		
		obj4.SearchforIhya();
		
	}

	@Test(dependsOnMethods={"Search"})
	public void Ihya() throws InterruptedException{
		
		obj5.ResumeTransaction();
		
	}
	@Test(dependsOnMethods={"Ihya"})
	public void Ihya2(){
		obj6.IhyaComplete();
	}
}
