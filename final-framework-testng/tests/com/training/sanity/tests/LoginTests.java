package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() {
		loginPOM.sendUserName("admin");
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
	//	driver.findElement(By.xpath("//body[@class='login']/div[@id='topContainer']/div[@class='topContainerBorder']/div[@id='topTable']/div[@id='tdContents']/table[@class='loginTable']/tbody/tr/td[@class='loginFormContainer']/table[@class='nested loginFormTable']/tbody/tr/td[@class='loginForm']/form[@id='cyclosLogin']/table[@class='nested']/tbody/tr/td/div[@id='virtualKeyboard']/div/input[3]")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();
	//	driver.findElement(By.xpath("//input[6]")).click();
	//	driver.findElement(By.xpath("//input[8]")).click();
	//	driver.findElement(By.xpath("//input[6]")).click();
		loginPOM.clickLoginBtn(); 
		
		
	//	loginPOM.sendPassword("0000");
	//	loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
}
