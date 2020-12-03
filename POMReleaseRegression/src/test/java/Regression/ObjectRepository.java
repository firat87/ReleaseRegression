package Regression;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
	
	@FindBy(name="username")
	public WebElement usernameinfo;
	@FindBy(name="password")
	public WebElement passwordinfo;
	@FindBy(xpath="//input[@src='/TelsimGlobal/Menu/image3.gif']")
	public WebElement icon;
	@FindBy(name="buttongsmno")
	public WebElement gsmno;
	@FindBy(name="selgsmno")
	public WebElement prefixgsmnno;
	@FindBy(name="find")
	public WebElement findbutton;
	@FindBy(xpath="//input[@type='button']")
	public WebElement typebutton;
	@FindBy(name="simcardICCI")
	public WebElement icci;
	@FindBy(xpath="//input[@value='DEVAM']")
	public WebElement typebutton2;
	@FindBy(name="kaydet")
	public WebElement savebutton;
	@FindBy(name="customerid")
	public WebElement customer;
	@FindBy(xpath="//input[@value='Tamam']")
	public WebElement tamam;
	@FindBy(xpath="//img[@class='actionIcon']")
	public WebElement actionicon;
	@FindBy(id="overridelink")
	public WebElement link;
	@FindBy(id="mernissorgu")
	public WebElement Devam;
	@FindBy(name="brand")
	public WebElement brand;
	@FindBy(name="prefix")
	public WebElement prefix;
	@FindBy(name="rsvstatus")
	public WebElement reserv;
	@FindBy(name="icci")
	public WebElement icci2;
	@FindBy(name="handset")
	public WebElement handset;
	@FindBy(name="handsetbrand")
	public WebElement handsetbrand;
	@FindBy(xpath="//input[@value='Sair iþlem']")
	public WebElement sairislem;
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitbutton;
	@FindBy(xpath="//input[@name='gsmno']")
	public WebElement gsmnumber;
	@FindBy(xpath="//input[@name='description']")
	public WebElement aciklama;
	@FindBy(name="submitbtn")
	public WebElement submit;

}
