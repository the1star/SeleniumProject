package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayinformationloanPOM {
	private WebDriver driver ; 
	
	public DisplayinformationloanPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cyclosUsername']")
	private WebElement userName; 
	
    @FindBy(id="cyclosPassword")
	private WebElement password;


	@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']") 
	private WebElement loginBtn; 
	
	
	@FindBy(xpath="//span[@class='menuText'][contains(text(),'Account')]") 
	private WebElement accounts; 
	
	@FindBy(xpath="//span[contains(text(),'Loans')]") 
	private WebElement loan; 
	
	@FindBy(xpath="//img[@class='details view']")
	private WebElement viewloan;
	/*
	@FindBy(xpath="//input[@class='button']") 
	private WebElement search;
	*/
	@FindBy(xpath="//img[@class='details view']") 
	private WebElement icon;
	
	@FindBy(xpath="//input[@id='backButton']") 
	private WebElement back;
	
	
	
	/*	@FindBy(xpath="//input[@class='button']") 
	private WebElement search;
	*/
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickaccountsBtn() {
		this.accounts.click(); 
	}
	public void clickLoanBtn() {
		this.loan.click(); 
	}
	/*
	public void sendmemberUserName(String musername) {
		this.musername.clear();
		this.musername.sendKeys(musername);
	}
	*/
	public void clickiconBtn() {
		this.icon.click(); 
	}
	
 
	
	public void clickbackBtn() {
		this.back.click(); 
	}
	
	
}
