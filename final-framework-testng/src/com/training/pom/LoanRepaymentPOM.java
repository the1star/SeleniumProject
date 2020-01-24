package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanRepaymentPOM {private WebDriver driver ; 

public LoanRepaymentPOM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@id='cyclosUsername']")
private WebElement userName; 

@FindBy(id="cyclosPassword")
private WebElement password;


@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']") 
private WebElement loginBtn; 

@FindBy(xpath="//input[@id='memberUsername']") 
private WebElement memberusername; 


/*@FindBy(xpath="//input[@id='memberName']") 
private WebElement membername; */


@FindBy(xpath="//tr[8]//td[1]//fieldset[1]//table[1]//tbody[1]//tr[1]//td[4]//input[1]") 
private WebElement grantloanBtn; 

@FindBy(xpath="//input[@id='amount']") 
private WebElement enteramount; 

@FindBy(xpath="//textarea[@id='description']") 
private WebElement enterdescription;


@FindBy(xpath="//body[@class='main']/div[@class='layoutMain']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/form[@name='grantLoanForm']/table[@class='defaultTableContent']/tbody/tr/td[@class='tdContentTableForms innerBorder']/table[@class='defaultTable']/tbody/tr/td[1]/input[1]") 
private WebElement submitBtn; 

@FindBy(xpath="//table[@class='defaultTable']//input[@class='button']") 
private WebElement clicksubmitbtnloanBtn;

@FindBy(xpath="//tr[8]//td[1]//fieldset[1]//table[1]//tbody[1]//tr[1]//td[2]//input[1]") 
private WebElement viewloanBtn;

@FindBy(xpath="//span[contains(text(),'Logout')]") 
private WebElement clickadminlogoutBtn;


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


public void sendmemberusername(String memberusername) {
//	this.memberusername.clear();
	this.memberusername.sendKeys(memberusername);
}



/*public void sendmembername(String membername) {
	//this.userName.clear();
	this.membername.sendKeys(membername);
}
*/

public void clickgrantloanBtn() {
	this.grantloanBtn.click(); 
}

public void sendenteramount(String enteramount) {
	this.enteramount.clear();
	this.enteramount.sendKeys(enteramount);
}

public void sendenterdescription(String enterdescription) {
	this.enterdescription.clear();
	this.enterdescription.sendKeys(enterdescription);
}

public void clicksubmitBtnBtn() {
	this.submitBtn.click(); 
}

public void clickclicksubmitbtnloanBtn() {
	this.clicksubmitbtnloanBtn.click(); 
}

public void clickviewloanBtn() {
	this.viewloanBtn.click(); 
}

public void clickclickadminlogoutBtn() {
	this.clickadminlogoutBtn.click(); 
}










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