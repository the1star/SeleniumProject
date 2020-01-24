package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneytransferPOM {
	public MoneytransferPOM(WebDriver driver) {
	//	this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='cyclosUsername']")
	private WebElement userName; 

	@FindBy(id="cyclosPassword")
	private WebElement password;


	@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']") 
	private WebElement loginBtn; 

	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Account')]") 
	private WebElement accountBtn; 

	@FindBy(xpath="//span[contains(text(),'Member Payment')]") 
	private WebElement mpaymentBtn; 

	@FindBy(xpath="//input[@id='memberUsername']") 
	private WebElement validname; 
	
	@FindBy(xpath="//input[@id='memberName']") 
	private WebElement validreciept; 
	
	@FindBy(xpath="//input[@id='amount']") 
	private WebElement amount;


	@FindBy(xpath="//textarea[@id='description']") 
	private WebElement description;


	@FindBy(xpath="//input[@id='submitButton']") 
	private WebElement submitBtn;
	
	@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']") 
	private WebElement finalBtn;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	public void clickloginBtn() {
		this.loginBtn.click(); 
	}
	
	
	public void clickaccountBtn() {
		this.accountBtn.click(); 
	}

	public void clickmpaymentBtn() {
		this.mpaymentBtn. click(); 
	}

	public void clickvalidnameBtn() {
		this.validname.sendKeys("Selenium");                   
	}
	
	public void clickvalidrecieptBtn() {
		this.validreciept.sendKeys("Selenium");                   
	}
	
	public void sendamounttext(String amounttext) {
	//	this.amount.clear();
		this.amount.sendKeys(amounttext);
		
	}

	public void senddiscription(String discription1) {
	//	this.userName.clear();
		this.description.sendKeys(discription1);
	}
	
	public void clicksubmitBtn() {
		this.submitBtn. click(); 
	}
	
	public void clickfinalBtn() {
		this.finalBtn. click(); 
	}
/*
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	*/
	

}
