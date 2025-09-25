package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DashBoard_Module.Request_Regularization;
import Login_Module.Login_Page;
import PayRoll_Module.View_And_Download_Payroll;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Data_Driven_Reading;

public class TestClass 
{
	WebDriver driver;
	Data_Driven_Reading datadriven = new Data_Driven_Reading();

	@BeforeClass
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://54.172.43.105:4200/login");		
		

	}
	@Test(priority=1)
	public void LoginTest() throws IOException
	{
		Login_Page loginpage = new Login_Page(driver);
		
		loginpage.Username(datadriven.readData(0, 0));
		loginpage.Password(datadriven.readData(0, 1));
		loginpage.switchToUser();
		loginpage.LoginButton();
		
	}
	
	@Test(priority=2)
	public void AttendanceManagement() throws InterruptedException
	{
		Request_Regularization ReqReg = new Request_Regularization(driver);
		
		ReqReg.selectWorkingFrom("REMOTE");
		Thread.sleep(2000);
		ReqReg.selectMode("WEB");
		   Thread.sleep(3000);
		//ReqReg.clickClockIn();
		   Thread.sleep(3000);
		//ReqReg.clickClockOut();
		   Thread.sleep(3000);
		ReqReg.clickonDate("12092025");
		   Thread.sleep(3000);
		ReqReg.enterReason("ABC");
		   Thread.sleep(3000);
		ReqReg.btn();

	}
	
	@Test(priority=3)
	public void Payroll() throws InterruptedException
	{
		View_And_Download_Payroll payroll_View = new View_And_Download_Payroll(driver);
		payroll_View.select_payroll();
		   Thread.sleep(3000);
		payroll_View.select_month();
		   Thread.sleep(3000);
		payroll_View.select_year();
		   Thread.sleep(3000);
		payroll_View.view_Payroll();
		   Thread.sleep(3000);
		payroll_View.download_Payslip();

		
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
	    Thread.sleep(3000);
		driver.quit();
	}
	
		
	
  
}
