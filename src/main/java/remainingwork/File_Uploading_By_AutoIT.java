package remainingwork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Uploading_By_AutoIT 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	
	WebElement choosefile = driver.findElement(By.id("fileupload1"));
	
	act.moveToElement(choosefile).click().perform();
	
	String workspacepath_or_projectpath = System.getProperty("user.dir");//current Project path
	
	Runtime.getRuntime().exec(workspacepath_or_projectpath+"\\File_uploading\\Demofile.exe");
	
	
	}
}
