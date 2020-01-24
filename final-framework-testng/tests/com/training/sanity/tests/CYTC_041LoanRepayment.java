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
import com.training.pom.LoanRepaymentPOM;
//import com.training.pom.DisplayinformationloanPOM;
//import com.training.pom.RepayloanPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CYTC_041LoanRepayment {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private LoanRepaymentPOM LoanRepaymentPOM;


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoanRepaymentPOM = new LoanRepaymentPOM(driver);
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
		
		LoanRepaymentPOM.sendUserName("admin");
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='1']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='2']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='3']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='4']")).click();

		LoanRepaymentPOM.clickLoginBtn();
		//Thread.sleep(1000);
		
		LoanRepaymentPOM.sendmemberusername("Dhwani");
		Thread.sleep(1000);
		
		//LoanRepaymentPOM.sendmembername("Dhwani");
		//Thread.sleep(1000);

		LoanRepaymentPOM.clickgrantloanBtn();
		Thread.sleep(1000);
		
		LoanRepaymentPOM.sendenteramount("10");
		Thread.sleep(1000);

		LoanRepaymentPOM.sendenterdescription("home loan");
		Thread.sleep(1000);
		
		
		LoanRepaymentPOM.clicksubmitBtnBtn();
		Thread.sleep(1000);
		

		LoanRepaymentPOM.clickclicksubmitbtnloanBtn();
		Thread.sleep(1000);
		
		Alert alert1=driver.switchTo().alert();
		//Thread.sleep(1000);
		alert1.accept(); 
		
		LoanRepaymentPOM.clickviewloanBtn();

		
	//	LoanRepaymentPOM.clickclicksubmitbtnloanBtn();
		
		
		
		
		
	//	LoanRepaymentPOM.clickviewloanBtn();

		
	//	LoanRepaymentPOM.clickclicksubmitbtnloanBtn();
		Thread.sleep(1000);
		
		LoanRepaymentPOM.clickclickadminlogoutBtn();

		
		Alert alert4=driver.switchTo().alert();
		Thread.sleep(2000);
		alert4.accept(); 
		
		Thread.sleep(3000);
		
		
		
		
		
		LoanRepaymentPOM.sendUserName("d1star");
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
		LoanRepaymentPOM.clickLoginBtn();
		Thread.sleep(1000);

		LoanRepaymentPOM.clickaccountBtn();
		Thread.sleep(1000);

		LoanRepaymentPOM.clickloanBtn();
		Thread.sleep(1000);

		LoanRepaymentPOM.clickviewBtn();
		Thread.sleep(1000);

		LoanRepaymentPOM.sendamounttext("1");
		Thread.sleep(1000);

		LoanRepaymentPOM.clickrepayBtn();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept(); 
		
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(1000);
		alert3.accept();
		Thread.sleep(2000);
		
		String actual=driver.findElement(By.xpath("//td[contains(text(),'Loan details')]")).getText();
		String expected="Loan details";
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		screenShot.captureScreenShot("First");

		driver.quit();
	//	screenShot.captureScreenShot("First");

}
}
