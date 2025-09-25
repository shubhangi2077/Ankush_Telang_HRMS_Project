package remainingwork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class File_Uploading_By_Robot_Class 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		WebDriverManager.chromedriver().setup();


		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.navigate().to("https://foundit.in/upload");

		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();

		JavascriptExecutor jse =(JavascriptExecutor)driver;

		jse.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='file-upload']")));

		//1- copy the file path into the click board (cntrl +c)

		//StringSelection filepathselection = new StringSelection("C:\\Users\\ANKUSH TELANG\\Downloads\\Ankush Resume.pdf");//Local System path

		//OR 

		String workspacepath_or_projectpath =  System.getProperty("user.dir");//current Project path
		StringSelection filepathselection = new StringSelection(workspacepath_or_projectpath+"\\File_uploading\\QA_CV.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathselection, null);

		Thread.sleep(3000);

		//2- paste (cntrl +v)

		Robot rb = new Robot();

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		//3- click on return/enter key

		Thread.sleep(3000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);


	}




}
