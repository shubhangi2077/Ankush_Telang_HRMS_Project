package DashBoard_Module;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Request_Regularization 
{
	    public Request_Regularization(WebDriver driver) 
	    {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    WebDriver driver;
 
	    // ====== Locators ======
	    // Dropdown for Working From
	    
	    @FindBy(xpath = "//select[@formcontrolname=\"workFrom\"]")
	    private WebElement workingFromDropdown;
 
	    // Dropdown for Mode
	    
	    @FindBy(xpath = "//select[@formcontrolname=\"mode\"]")
	    private WebElement modeDropdown;
 
	    // Clock In button
	    @FindBy(xpath = "//button[text()='Clock In']")
	    private WebElement clockInBtn;
	    
	    @FindBy(xpath = "//button[text()='Clock Out']")
	    private WebElement clockoutBtn;
	    
	    @FindBy (xpath = "//input[@type='date'] ") 
	    WebElement date;
	    
	    @FindBy (xpath = "//input[@type='text'] ") 
	    WebElement datereason;
	    
	    @FindBy (xpath = "//button[text()='Request Regularization']")
        WebElement submitbtn ;
	    
	    
	   
	    // ====== Actions ======
	    public void selectWorkingFrom(String value) 
	    {
	        Select select = new Select(workingFromDropdown);
	        select.selectByVisibleText(value);
	    }
 
	    public void selectMode(String value)
	    {
	        Select select = new Select(modeDropdown);
	        select.selectByVisibleText(value);
	    }
	    
	    public void clickClockIn() 
	    {
	        clockInBtn.click();
	    }
	    public void clickClockOut() 
	    {
	    	clockoutBtn.click();
	    }
	    public void clickonDate(String calender) 
	    {
	    	date.sendKeys(calender);
	    }
	    public void enterReason(String reason) 
	    {
	    	datereason.sendKeys(reason);
	    }
	    public void btn() 
	    {
	        submitbtn.click();
	    }
}
 