package PayRoll_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
	 
	public class View_And_Download_Payroll 
	{

		WebDriver driver;
		public View_And_Download_Payroll(WebDriver driver)
		{
			this.driver=driver;

			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//*[text()='Payroll']")
		WebElement txt_payroll;

		@FindBy(xpath="//*[@class='form-control ng-pristine ng-invalid ng-touched']")
		WebElement txt_month;

		@FindBy(xpath="//select[@formcontrolname=\"year\"]")
		WebElement txt_year;

		@FindBy(xpath="//button[@class=\"btn btn-secondary mx-2\"] ")
		WebElement txt_view_payroll_button;

		@FindBy(xpath="//*[text()=' Download Payslip ']")
		WebElement txt_download_payslip_button;


		public void select_payroll() throws InterruptedException
		{
			Thread.sleep(2000);

			txt_payroll.click();
		}

		public void select_month() throws InterruptedException
		{
			Thread.sleep(1000);

			Select select= new Select(txt_month);

			select.selectByVisibleText("Jan");
			
			Thread.sleep(1000);
		}

		public void select_year() throws InterruptedException
		{
		    Thread.sleep(1000);

			Select slt=new Select(txt_year);

			slt.selectByVisibleText("2025");
		}

		public void view_Payroll() throws InterruptedException
		{
			Thread.sleep(2000);

			txt_view_payroll_button.click();
		}

		public void download_Payslip() throws InterruptedException
		{
			Thread.sleep(2000);

			txt_download_payslip_button.click();
		}
	 
	}

	 


