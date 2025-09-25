//package remainingwork;
//
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Data_Driven_Test2 
//{
//	static WebDriver driver;
//	static Data_Driven_Reading ok = new Data_Driven_Reading();
//	static Data_Driven_Writing ok2 = new Data_Driven_Writing();
//
//	
////------------------------------------------------Browser Initialization----------------------------------------------------------------	
//	
//	public static void initializeBrowser() throws InterruptedException, IOException 
//	{
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust");
//		Thread.sleep(2000);
//	}
////-------------------------------------Writing data---------------------------------------------------------------
//	
//	
////------------------------------------------------Finding Elements----------------------------------------------------------------	
//
//	public static void locateElements() throws IOException
//	{
//
//		
//		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		firstname.sendKeys(ok.readData(1, 0));
//		
//		WebElement lastname = driver.findElement(By.xpath("//*[@placeholder='Last Name']"));
//		lastname.sendKeys(ok.readData(1, 1));
//
//		WebElement postalcode = driver.findElement(By.xpath("//*[@placeholder='Post Code']"));
//		postalcode.sendKeys(ok.readData(1, 2));
//	}
//	
////------------------------------------------------Calling Methods----------------------------------------------------------------	
//
//
//	public static void main(String[] args) throws InterruptedException, IOException 
//	{
//		initializeBrowser();
//		locateElements();
//		
//		ok.readData(1,0);
//		ok.readData(1,1);
//		ok.readData(1,2);
//
//	}
//}
