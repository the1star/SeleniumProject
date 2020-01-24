package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
//import com.training.pom.DisplayinformationloanPOM;
import com.training.pom.RepayloanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_022Repayloan {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private RepayloanPOM repayPOM;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		repayPOM = new RepayloanPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		repayPOM.sendUserName("d1star");
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		repayPOM.clickLoginBtn();
		Thread.sleep(1000);

		repayPOM.clickaccountBtn();
		Thread.sleep(1000);

		repayPOM.clickloanBtn();
		Thread.sleep(1000);

		repayPOM.clickviewBtn();
		Thread.sleep(1000);

		repayPOM.sendamounttext("1");
		Thread.sleep(1000);

		repayPOM.clickrepayBtn();
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept(); 
		
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.accept();
		Thread.sleep(2000);
		
		String actual=driver.findElement(By.xpath("//td[contains(text(),'Loan details')]")).getText();
		String expected="Loan details";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);

		driver.quit();
		screenShot.captureScreenShot("First");

}
}
