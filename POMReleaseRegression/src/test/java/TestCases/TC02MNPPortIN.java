package TestCases;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.sql.SQLException;
import org.testng.annotations.BeforeTest;
import Regression.BaseClass;
import Regression.HomePage;
import Regression.LeftTransforAct;
import Regression.Login;
import Regression.MNPRoadToActivation;
import Regression.MNPSim;
import Regression.RoadToActivation;
import Regression.RoadToActivation2;
import Regression.SelectTariff;

public class TC02MNPPortIN  {
	
	BaseClass obj = new BaseClass();
	Login obj2=new Login();
	HomePage obj3=new HomePage();
	RoadToActivation obj4 = new RoadToActivation();
	RoadToActivation2 obj5 = new RoadToActivation2();
	MNPSim obj6 = new MNPSim();
	SelectTariff obj7 = new SelectTariff();
	Regression.PaymentType obj8 = new Regression.PaymentType();
	Regression.BillingPeriod obj9 = new Regression.BillingPeriod();
	LeftTransforAct obj10=new LeftTransforAct();
	MNPRoadToActivation obj11 = new MNPRoadToActivation();
	
	@BeforeTest
	public void StartTest() throws AWTException{
	
		obj.SettingDriver();
	}
	@Test
	public void LoginStep() throws InterruptedException{
	
		obj2.LogintoCRM();		
	}
	@Test(dependsOnMethods={"LoginStep"})
	public void Menu() throws AWTException{
		//BaseClass obj = new BaseClass();
		obj3.MainMenu2();
	}
	@Test(dependsOnMethods={"Menu"})
	public void PortINRoad() throws AWTException, ClassNotFoundException, SQLException, InterruptedException{
		//BaseClass obj = new BaseClass();
		obj4.RtA();
	}
	@Test(dependsOnMethods={"PortINRoad"})
	public void PortINRoad2() {
		//BaseClass obj = new BaseClass();
		obj5.RoadtoActivation2();
	}
	@Test(dependsOnMethods={"PortINRoad2"})
	public void PortINRoad3() {
		//BaseClass obj = new BaseClass();
		obj5.ContinueToActivation();
	}
	@Test(dependsOnMethods={"PortINRoad3"})
	public void SimCardSettings() throws ClassNotFoundException, SQLException, InterruptedException {
		//BaseClass obj = new BaseClass();
		obj6.MNPSimProperties();
	}
	@Test(dependsOnMethods={"SimCardSettings"})
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
		obj10.MakingActivationforMNP();
		
	}
	@Test(dependsOnMethods={"Activation"})
	public void MNPActivation() throws InterruptedException{
		obj11.MakingActivation2();
		obj11.MakingActivation3();
		
	}
	
	
	

}
