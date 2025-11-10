package JavaProgram;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extendsReports {
	
	@Test
	public void tc1() {
		ExtentSparkReporter sp=new ExtentSparkReporter("./target/ExtentReport.html");
		// Customize report
		sp.config().setDocumentTitle("Automation Report");  // Title of the report
		sp.config().setReportName("UI Test Results");       // Report name
		sp.config().setTheme(Theme.DARK);
		
		
		// Create ExtentReports object and attach SparkReporter
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sp);
		
		
		extent.setSystemInfo("Tester", "Shailaja");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows 10");
		
		 // 5️⃣ Create Test Cases and log results
        ExtentTest test1 = extent.createTest("Login Test");
        test1.pass("Browser launched");
        test1.pass("Navigated to login page");
        test1.pass("Entered valid credentials");
        test1.pass("Clicked login button");
        test1.pass("Login successful ✅");

        ExtentTest test2 = extent.createTest("Search Test");
        test2.pass("Browser launched");
        test2.pass("Navigated to search page");
        test2.fail("Search button not clickable ❌");

        ExtentTest test3 = extent.createTest("Logout Test");
        test3.skip("Logout test skipped (dependency not met)");
        
     // 6️⃣ Flush → Writes the report to file
        extent.flush();

      //  System.out.println("✅ Report generated at: " + reportPath);

	}
	
}
