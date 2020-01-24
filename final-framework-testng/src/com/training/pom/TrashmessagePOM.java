package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrashmessagePOM {
	public TrashmessagePOM(WebDriver driver) {
		//	this.driver = driver; 
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//input[@id='cyclosUsername']")
		private WebElement userName; 

		@FindBy(id="cyclosPassword")
		private WebElement password;


		@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']") 
		private WebElement loginBtn; 

		@FindBy(xpath="//span[contains(text(),'Personal')]") 
		private WebElement personalBtn; 

		@FindBy(xpath="//span[contains(text(),'Messages')]") 
		private WebElement messagesBtn; 

		@FindBy(xpath="//tr[@class='unreadMessage ClassColor1']//img[@class='moveToTrash']") 
		private WebElement deleteBtn; 
	
		public void sendUserName(String userName) {
			this.userName.clear();
			this.userName.sendKeys(userName);
		}
		public void clickloginBtn() {
			this.loginBtn.click(); 
		}
		
		
		public void clickpersonalBtn() {
			this.personalBtn.click(); 
		}

		public void clickmessageBtn() {
			this.messagesBtn. click(); 
		}
		
		public void clicdeleteBtn() {
			this.deleteBtn. click(); 
		}
}
