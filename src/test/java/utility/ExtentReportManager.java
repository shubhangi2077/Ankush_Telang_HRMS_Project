package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;   //UI of the reports
	public ExtentReports extentreports;         //common info in the report
	public ExtentTest extentTests;              //Creating  testcase entries and updating the status of the report
	
	@Override
	public void onStart(ITestContext context) 
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/Extent_Reports/HRMS_Report.html");//ProjectPath
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Add to cart functionality");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extentreports = new ExtentReports();
		extentreports.attachReporter(sparkReporter);
		
		extentreports.setSystemInfo("Computer Name","localhost");
		extentreports.setSystemInfo("Environment","QA");
		extentreports.setSystemInfo("Tester name","Ankush");
		extentreports.setSystemInfo("Browser name","chrome");
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	//create a new entry in the report
		extentTests = extentreports.createTest(result.getName());  //
		extentTests.log(Status.PASS,"Test case PASSED is :"+ result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		extentTests = extentreports.createTest(result.getName());  //
		extentTests.log(Status.FAIL,"Test case FAILED is :"+ result.getName());
		extentTests.log(Status.FAIL,"Test case FAILED caused is :"+ result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		extentTests = extentreports.createTest(result.getName());  //
		extentTests.log(Status.SKIP,"Test case SKIPPED is :"+ result.getName());

		    
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		extentreports.flush();
	}
	
	

}
