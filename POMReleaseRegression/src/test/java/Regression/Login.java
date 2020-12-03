package Regression;


import org.openqa.selenium.support.PageFactory;


public  class Login extends BaseClass {

	ObjectRepository elm = new ObjectRepository();

    
	public void LogintoCRM() throws InterruptedException {
		
		PageFactory.initElements(BaseClass.driver, elm);
		//ObjectRepository elm = new ObjectRepository();
		
		// TODO Auto-generated method stub
		if(!driver.getTitle().toString().contains("secure")){
			elm.usernameinfo.sendKeys("alim.sirin");
			Thread.sleep(1000);
			elm.passwordinfo.sendKeys("1710Lina2016");
			Thread.sleep(1000);
			elm.icon.click();
	}else{
		elm.actionicon.click();
		elm.link.click();
		//driver.findElement(By.xpath("//input[@value='Tamam']")).click();
		elm.usernameinfo.sendKeys("alim.sirin");
		Thread.sleep(1000);
		elm.passwordinfo.sendKeys("1710Lina2016");
		Thread.sleep(1000);
		elm.icon.click();}
}}
	
	
	


