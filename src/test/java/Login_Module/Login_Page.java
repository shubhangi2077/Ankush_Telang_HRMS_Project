package Login_Module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	WebDriver driver;
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@placeholder='Enter your username']")
	WebElement txt_username; 
	
	@FindBy(xpath="//*[@type='password']")
	WebElement txt_password;
	
	@FindBy(xpath=	"//*[@class='switch-btn']")
	WebElement txt_switch_to_user;
	
	@FindBy(xpath="//*[@class='login-btn']")
	WebElement txt_login;

	
	
	public void Username(String name)
	{
		txt_username.sendKeys(name);
	}
	
	public void Password(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	public void switchToUser()
	{
		txt_switch_to_user.click();
	}
	public void LoginButton()
	{
		txt_login.click();;
	}

}
