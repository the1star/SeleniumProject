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
import com.training.pom.MessagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_024Messagetest {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private MessagePOM messPOM;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		messPOM = new MessagePOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		
	}
	@Test
	public void validLoginTest() throws InterruptedException {

		messPOM.sendUserName("d1star");

		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();


		messPOM.clickloginBtn();
		Thread.sleep(1000);

		messPOM.clickpersonalBtn();
		Thread.sleep(1000);

		messPOM.clickmessageBtn();
		Thread.sleep(1000);

		messPOM.clickmsgBtn();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//td[@class='tdHeaderTable']")).getText();
		String expected="Message details";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		driver.quit();		screenShot.captureScreenShot("First");

	}

}
