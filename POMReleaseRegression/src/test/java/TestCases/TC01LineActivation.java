package TestCases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.sql.SQLException;
import org.testng.annotations.BeforeTest;
import Regression.BaseClass;
import Regression.HomePage;
import Regression.LeftTransforAct;
import Regression.Login;
import Regression.RoadToActivation;
import Regression.RoadToActivation2;
import Regression.SelectTariff;
import Regression.SimCardSetting;

public class TC01LineActivation  {
	
    BaseClass obj = new BaseClass();
	Login obj2 = new Login();
	HomePage obj3= new HomePage();
	RoadToActivation obj4 = new RoadToActivation();
	RoadToActivation2 obj5 = new RoadToActivation2();
	SimCardSetting obj6 = new SimCardSetting();
	SelectTariff obj7 = new SelectTariff();
	Regression.PaymentType obj8 = new Regression.PaymentType();
	Regression.BillingPeriod obj9 = new Regression.BillingPeriod();
	LeftTransforAct obj10=new LeftTransforAct();
	
	@BeforeTest
	public void StartTest() throws AWTException{
		obj.SettingDriver();
	}
	
	@Test
	public void LoginStep() throws InterruptedException{
		
		obj2.LogintoCRM();
	    
	}
	@Test(dependsOnMethods={"LoginStep"})
	public void MenuSelection() throws InterruptedException{
		
		obj3.MainMenu();
	}	
	@Test(dependsOnMethods={"MenuSelection"})
	public void RTA() throws ClassNotFoundException, SQLException, InterruptedException{
	
		obj4.RtA();
	}
	@Test(dependsOnMethods={"RTA"})
	public void RTA2(){
		
		obj5.RoadtoActivation2();
	}	
	
	@Test(dependsOnMethods={"RTA2"})
	public void RTA3(){
		
		obj5.ContinueToActivation();
	}	
	
	@Test(dependsOnMethods={"RTA3"})
	public void Sim() throws InterruptedException{
		
		obj6.SimCardSecimi();
	}
	@Test(dependsOnMethods={"Sim"})
	public void Tariff() {
		
		obj7.Selection();
	}	
	
	@Test(dependsOnMethods={"Tariff"})
	public void Payment() {
		
		obj8.Odeme();
	}
	@Test(dependsOnMethods={"Payment"})
	public void BillingPeriod() throws InterruptedException {
		
		obj9.Billing();
		
	}	
	@Test(dependsOnMethods={"BillingPeriod"})
	public void CampaignEntry() {
		
		obj10.KampanyaGirisi();
		
	}
	@Test(dependsOnMethods={"CampaignEntry"})
	public void UserInfo() {
		
		obj10.KullaniciGirisi();
	}
	@Test(dependsOnMethods={"UserInfo"})
	public void VekilVasi() {
		
		obj10.VekilVasi();
	}
	@Test(dependsOnMethods={"VekilVasi"})
	public void FeatureProperty() {
		
		obj10.OzellikGiris();
	}
	@Test(dependsOnMethods={"FeatureProperty"})
	public void Services() throws InterruptedException {
		
		obj10.ServisGiris();
		
	}
	@Test(dependsOnMethods={"Services"})
	public void Activation() throws InterruptedException{
		obj10.MakingActivation();
		
	}
	

}
