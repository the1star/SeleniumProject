package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.DisplayinformationloanPOM;
//import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_021Displayinformationloan {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private DisplayinformationloanPOM displayPOM;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	//	loginPOM = new LoginPOM(driver);
	//	loginPOM = new DisplayinformationloanPOM
		displayPOM=new DisplayinformationloanPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	@AfterMethod
	public void tearDown() throws Exception {
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		displayPOM.sendUserName("d1star");
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		displayPOM.clickLoginBtn();
		Thread.sleep(1000);
		screenShot.captureScreenShot("First");
		displayPOM.clickaccountsBtn();
		Thread.sleep(1000);
		displayPOM.clickLoanBtn();
		Thread.sleep(1000);
		displayPOM.clickLoanBtn();
		Thread.sleep(1000);
		displayPOM.clickiconBtn();
		Thread.sleep(1000);
		displayPOM.clickbackBtn();
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//td[contains(text(),'My loans')]")).getText();
		String expected="My loan";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		driver.quit();
	}
}


