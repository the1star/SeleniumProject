package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='cyclosUsername']")
	private WebElement userName; 
	
    @FindBy(id="cyclosPassword")
	private WebElement password;

	
/*	driver.findElement(By.name("q")).sendKeys("Divyakant sharma");
	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
	*/
	@FindBy(xpath="//div[@id='virtualKeyboard']//div//input[@class='button']") 
	private WebElement loginBtn; 
	
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
