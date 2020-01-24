package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepayloanPOM {private WebDriver driver ; 

public RepayloanPOM(WebDriver driver) {
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
private WebElement accountBtn; 

@FindBy(xpath="//span[contains(text(),'Loans')]") 
private WebElement loanBtn; 

@FindBy(xpath="//img[@class='details view']") 
private WebElement viewBtn; 

@FindBy(xpath="//input[@id='amountText']") 
private WebElement amounttext;


@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']") 
private WebElement repayBtn;



/*@FindBy(xpath="//input[@id='backButton']") 
private WebElement backBtn;
*/

public void sendUserName(String userName) {
	this.userName.clear();
	this.userName.sendKeys(userName);
}

public void clickLoginBtn() {
	this.loginBtn.click(); 
}

public void clickaccountBtn() {
	this.accountBtn.click(); 
}

public void clickloanBtn() {
	this.loanBtn.click(); 
}

public void clickviewBtn() {
	this.viewBtn.click(); 
}

public void sendamounttext(String amounttext) {
	this.amounttext.clear();
	this.amounttext.sendKeys(amounttext);
}

public void clickrepayBtn() {
	this.repayBtn.click(); 
}






/*public void clickbackBtn() {
	this.backBtn.click(); 
}
*/

}
